package org.globus.swift.data.policy;

import java.util.List;

import org.apache.log4j.Logger;
import org.globus.swift.data.Director;

public class External 
extends Policy {
    
    private static final Logger logger = 
        Logger.getLogger(External.class);
    
    /** 
       The name of the external program
     */
    String progname = null;
    
    public static void doExternal(String srcfile, String srcdir, 
                                  String desthost, String destdir) {
        logger.debug("doExternal: " + 
                     "srcfile: " + srcfile + 
                     "srcdir:  " + srcdir + 
                     "desthost: " + desthost + 
                     "destdir: " + destdir);
        
        Policy policy = Director.lookup(srcdir + "/" + srcfile);
        
        if (!(policy instanceof External))
            throw new RuntimeException
            ("doExternal called on non-EXTERNAL file!");
            
        External external = (External) policy;       
        external.callProgram(srcdir, srcfile, desthost, destdir);
    }
    
    void callProgram(String srcdir, String srcfile, 
                     String desthost, String destdir)
    {
        String[] cmdline = new String[] { progname, srcdir, srcfile, 
                                          desthost, destdir };
        Process process = null;
        try {
            process = Runtime.getRuntime().exec(cmdline);
            process.waitFor();
        }
        catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException
            ("Could not launch external broadcast");
        }
    }
    
    @Override
    public void settings(List<String> tokens) {
        try {
            progname = tokens.get(0);
        } 
        catch (Exception e) { 
            throw new RuntimeException
            ("Incorrect settings for EXTERNAL");
        }
    }
    
    public String toString() {
        return "EXTERNAL";
    }
}

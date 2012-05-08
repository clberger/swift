//----------------------------------------------------------------------
//This code is developed as part of the Java CoG Kit project
//The terms of the license can be found at http://www.cogkit.org/license
//This message may not be removed or altered.
//----------------------------------------------------------------------

/*
 * Created on Mar 27, 2009
 */
package org.griphyn.vdl.karajan.monitor.monitors.ansi;

import java.io.IOException;
import java.util.Iterator;

import org.globus.cog.abstraction.interfaces.FileOperationSpecification;
import org.globus.cog.abstraction.interfaces.FileTransferSpecification;
import org.globus.cog.abstraction.interfaces.JobSpecification;
import org.globus.cog.abstraction.interfaces.Task;
import org.griphyn.vdl.karajan.monitor.monitors.ansi.tui.ANSI;
import org.griphyn.vdl.karajan.monitor.monitors.ansi.tui.ANSIContext;
import org.griphyn.vdl.karajan.monitor.monitors.ansi.tui.Component;
import org.griphyn.vdl.karajan.monitor.monitors.ansi.tui.DefaultTableCellRenderer;
import org.griphyn.vdl.karajan.monitor.monitors.ansi.tui.Label;
import org.griphyn.vdl.karajan.monitor.monitors.ansi.tui.Table;

public class TaskCellRenderer extends DefaultTableCellRenderer {

    private TransferRenderer tr;
    
    public TaskCellRenderer() {
        tr = new TransferRenderer();
    }

    public Component getComponent(Table table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        if (column == 1 && value instanceof Task) {
            Task t = (Task) value;
            if (t.getType() == Task.JOB_SUBMISSION) {
                JobSpecification spec = (JobSpecification) t.getSpecification();
                String exec = "?", args = "?";
                Iterator i = spec.getArgumentsAsList().iterator();
                while (i.hasNext()) {
                    Object o = i.next();
                    if ("-e".equals(o)) {
                        exec = (String) i.next();
                    }
                    else if ("-a".equals(o)) {
                        StringBuffer sb = new StringBuffer();
                        while (i.hasNext()) {
                            sb.append(' ');
                            sb.append(i.next());
                        }
                        args = sb.toString();
                    }
                }
                return super.getComponent(table, exec + args, isSelected, hasFocus,
                    row, column);
            }
            else if (t.getType() == Task.FILE_OPERATION) {
                FileOperationSpecification spec = (FileOperationSpecification) t
                    .getSpecification();
                return super.getComponent(table, spec.getOperation() + " "
                        + spec.getArguments(), isSelected, hasFocus, row,
                    column);
            }
            else if (t.getType() == Task.FILE_TRANSFER) {
                FileTransferSpecification spec = (FileTransferSpecification) t
                    .getSpecification();
                tr.setText(spec.getSourceFile());
                Object crt = t.getAttribute("transferedBytes");
                Object tot = t.getAttribute("totalBytes");
                if (crt != null && tot != null) {
                    tr
                        .setProgress((int) (((Long) crt).longValue() * 100 / ((Long) tot)
                            .longValue()));
                }
                return tr;
            }
            else {
                return super.getComponent(table, value, isSelected, hasFocus,
                    row, column);
            }
        }
        else {
            return super.getComponent(table, value, isSelected, hasFocus, row,
                column);
        }
    }

    private class TransferRenderer extends Label {
        private int progress;

        public void setProgress(int p) {
            this.progress = p;
        }

        protected void draw(ANSIContext context) throws IOException {
            super.draw(context);
            int w = this.getWidth();
            int nc = progress * w / 100;
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < nc; i++) {
                sb.append(context.getChar(sx + i, sy));
            }
            context.moveTo(sx, sy);
            context.bgColor(ANSI.BLUE);
            context.text(sb.toString());
        }
    }
}

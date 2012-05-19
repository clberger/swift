/*
 * XML Type:  Call
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.Call
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language.impl;
/**
 * An XML Call(@http://ci.uchicago.edu/swift/2009/02/swiftscript).
 *
 * This is a complex type.
 */
public class CallImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.globus.swift.language.Call
{
    
    public CallImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OUTPUT$0 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "output");
    private static final javax.xml.namespace.QName INPUT$2 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "input");
    private static final javax.xml.namespace.QName PROC$4 = 
        new javax.xml.namespace.QName("", "proc");
    private static final javax.xml.namespace.QName SRC$6 = 
        new javax.xml.namespace.QName("", "src");
    
    
    /**
     * Gets array of all "output" elements
     */
    public org.globus.swift.language.ActualParameter[] getOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OUTPUT$0, targetList);
            org.globus.swift.language.ActualParameter[] result = new org.globus.swift.language.ActualParameter[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "output" element
     */
    public org.globus.swift.language.ActualParameter getOutputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.ActualParameter target = null;
            target = (org.globus.swift.language.ActualParameter)get_store().find_element_user(OUTPUT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "output" element
     */
    public int sizeOfOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTPUT$0);
        }
    }
    
    /**
     * Sets array of all "output" element
     */
    public void setOutputArray(org.globus.swift.language.ActualParameter[] outputArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(outputArray, OUTPUT$0);
        }
    }
    
    /**
     * Sets ith "output" element
     */
    public void setOutputArray(int i, org.globus.swift.language.ActualParameter output)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.ActualParameter target = null;
            target = (org.globus.swift.language.ActualParameter)get_store().find_element_user(OUTPUT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(output);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "output" element
     */
    public org.globus.swift.language.ActualParameter insertNewOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.ActualParameter target = null;
            target = (org.globus.swift.language.ActualParameter)get_store().insert_element_user(OUTPUT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "output" element
     */
    public org.globus.swift.language.ActualParameter addNewOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.ActualParameter target = null;
            target = (org.globus.swift.language.ActualParameter)get_store().add_element_user(OUTPUT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "output" element
     */
    public void removeOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTPUT$0, i);
        }
    }
    
    /**
     * Gets array of all "input" elements
     */
    public org.globus.swift.language.ActualParameter[] getInputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INPUT$2, targetList);
            org.globus.swift.language.ActualParameter[] result = new org.globus.swift.language.ActualParameter[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "input" element
     */
    public org.globus.swift.language.ActualParameter getInputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.ActualParameter target = null;
            target = (org.globus.swift.language.ActualParameter)get_store().find_element_user(INPUT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "input" element
     */
    public int sizeOfInputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INPUT$2);
        }
    }
    
    /**
     * Sets array of all "input" element
     */
    public void setInputArray(org.globus.swift.language.ActualParameter[] inputArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(inputArray, INPUT$2);
        }
    }
    
    /**
     * Sets ith "input" element
     */
    public void setInputArray(int i, org.globus.swift.language.ActualParameter input)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.ActualParameter target = null;
            target = (org.globus.swift.language.ActualParameter)get_store().find_element_user(INPUT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(input);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "input" element
     */
    public org.globus.swift.language.ActualParameter insertNewInput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.ActualParameter target = null;
            target = (org.globus.swift.language.ActualParameter)get_store().insert_element_user(INPUT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "input" element
     */
    public org.globus.swift.language.ActualParameter addNewInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.ActualParameter target = null;
            target = (org.globus.swift.language.ActualParameter)get_store().add_element_user(INPUT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "input" element
     */
    public void removeInput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INPUT$2, i);
        }
    }
    
    /**
     * Gets the "proc" attribute
     */
    public javax.xml.namespace.QName getProc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROC$4);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "proc" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetProc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PROC$4);
            return target;
        }
    }
    
    /**
     * Sets the "proc" attribute
     */
    public void setProc(javax.xml.namespace.QName proc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROC$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROC$4);
            }
            target.setQNameValue(proc);
        }
    }
    
    /**
     * Sets (as xml) the "proc" attribute
     */
    public void xsetProc(org.apache.xmlbeans.XmlQName proc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PROC$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(PROC$4);
            }
            target.set(proc);
        }
    }
    
    /**
     * Gets the "src" attribute
     */
    public java.lang.String getSrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRC$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "src" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SRC$6);
            return target;
        }
    }
    
    /**
     * True if has "src" attribute
     */
    public boolean isSetSrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SRC$6) != null;
        }
    }
    
    /**
     * Sets the "src" attribute
     */
    public void setSrc(java.lang.String src)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRC$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SRC$6);
            }
            target.setStringValue(src);
        }
    }
    
    /**
     * Sets (as xml) the "src" attribute
     */
    public void xsetSrc(org.apache.xmlbeans.XmlString src)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SRC$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SRC$6);
            }
            target.set(src);
        }
    }
    
    /**
     * Unsets the "src" attribute
     */
    public void unsetSrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SRC$6);
        }
    }
}

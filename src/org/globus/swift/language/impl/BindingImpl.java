/*
 * XML Type:  Binding
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.Binding
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language.impl;
/**
 * An XML Binding(@http://ci.uchicago.edu/swift/2009/02/swiftscript).
 *
 * This is a complex type.
 */
public class BindingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.globus.swift.language.Binding
{
    
    public BindingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPLICATION$0 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "application");
    
    
    /**
     * Gets the "application" element
     */
    public org.globus.swift.language.ApplicationBinding getApplication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.ApplicationBinding target = null;
            target = (org.globus.swift.language.ApplicationBinding)get_store().find_element_user(APPLICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "application" element
     */
    public void setApplication(org.globus.swift.language.ApplicationBinding application)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.ApplicationBinding target = null;
            target = (org.globus.swift.language.ApplicationBinding)get_store().find_element_user(APPLICATION$0, 0);
            if (target == null)
            {
                target = (org.globus.swift.language.ApplicationBinding)get_store().add_element_user(APPLICATION$0);
            }
            target.set(application);
        }
    }
    
    /**
     * Appends and returns a new empty "application" element
     */
    public org.globus.swift.language.ApplicationBinding addNewApplication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.ApplicationBinding target = null;
            target = (org.globus.swift.language.ApplicationBinding)get_store().add_element_user(APPLICATION$0);
            return target;
        }
    }
}

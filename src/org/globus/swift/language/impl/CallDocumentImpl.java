/*
 * An XML document type.
 * Localname: call
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.CallDocument
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language.impl;
/**
 * A document containing one call(@http://ci.uchicago.edu/swift/2009/02/swiftscript) element.
 *
 * This is a complex type.
 */
public class CallDocumentImpl extends org.globus.swift.language.impl.AbstractExpressionDocumentImpl implements org.globus.swift.language.CallDocument
{
    
    public CallDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALL$0 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "call");
    
    
    /**
     * Gets the "call" element
     */
    public org.globus.swift.language.Call getCall()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.Call target = null;
            target = (org.globus.swift.language.Call)get_store().find_element_user(CALL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "call" element
     */
    public void setCall(org.globus.swift.language.Call call)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.Call target = null;
            target = (org.globus.swift.language.Call)get_store().find_element_user(CALL$0, 0);
            if (target == null)
            {
                target = (org.globus.swift.language.Call)get_store().add_element_user(CALL$0);
            }
            target.set(call);
        }
    }
    
    /**
     * Appends and returns a new empty "call" element
     */
    public org.globus.swift.language.Call addNewCall()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.Call target = null;
            target = (org.globus.swift.language.Call)get_store().add_element_user(CALL$0);
            return target;
        }
    }
}

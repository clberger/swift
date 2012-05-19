/*
 * An XML document type.
 * Localname: function
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.FunctionDocument
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language.impl;
/**
 * A document containing one function(@http://ci.uchicago.edu/swift/2009/02/swiftscript) element.
 *
 * This is a complex type.
 */
public class FunctionDocumentImpl extends org.globus.swift.language.impl.AbstractExpressionDocumentImpl implements org.globus.swift.language.FunctionDocument
{
    
    public FunctionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FUNCTION$0 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "function");
    
    
    /**
     * Gets the "function" element
     */
    public org.globus.swift.language.Function getFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.Function target = null;
            target = (org.globus.swift.language.Function)get_store().find_element_user(FUNCTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "function" element
     */
    public void setFunction(org.globus.swift.language.Function function)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.Function target = null;
            target = (org.globus.swift.language.Function)get_store().find_element_user(FUNCTION$0, 0);
            if (target == null)
            {
                target = (org.globus.swift.language.Function)get_store().add_element_user(FUNCTION$0);
            }
            target.set(function);
        }
    }
    
    /**
     * Appends and returns a new empty "function" element
     */
    public org.globus.swift.language.Function addNewFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.Function target = null;
            target = (org.globus.swift.language.Function)get_store().add_element_user(FUNCTION$0);
            return target;
        }
    }
}

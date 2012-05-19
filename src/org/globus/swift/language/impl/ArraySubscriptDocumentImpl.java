/*
 * An XML document type.
 * Localname: arraySubscript
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.ArraySubscriptDocument
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language.impl;
/**
 * A document containing one arraySubscript(@http://ci.uchicago.edu/swift/2009/02/swiftscript) element.
 *
 * This is a complex type.
 */
public class ArraySubscriptDocumentImpl extends org.globus.swift.language.impl.AbstractExpressionDocumentImpl implements org.globus.swift.language.ArraySubscriptDocument
{
    
    public ArraySubscriptDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYSUBSCRIPT$0 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "arraySubscript");
    
    
    /**
     * Gets the "arraySubscript" element
     */
    public org.globus.swift.language.BinaryOperator getArraySubscript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.BinaryOperator target = null;
            target = (org.globus.swift.language.BinaryOperator)get_store().find_element_user(ARRAYSUBSCRIPT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "arraySubscript" element
     */
    public void setArraySubscript(org.globus.swift.language.BinaryOperator arraySubscript)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.BinaryOperator target = null;
            target = (org.globus.swift.language.BinaryOperator)get_store().find_element_user(ARRAYSUBSCRIPT$0, 0);
            if (target == null)
            {
                target = (org.globus.swift.language.BinaryOperator)get_store().add_element_user(ARRAYSUBSCRIPT$0);
            }
            target.set(arraySubscript);
        }
    }
    
    /**
     * Appends and returns a new empty "arraySubscript" element
     */
    public org.globus.swift.language.BinaryOperator addNewArraySubscript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.BinaryOperator target = null;
            target = (org.globus.swift.language.BinaryOperator)get_store().add_element_user(ARRAYSUBSCRIPT$0);
            return target;
        }
    }
}

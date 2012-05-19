/*
 * An XML document type.
 * Localname: and
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.AndDocument
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language.impl;
/**
 * A document containing one and(@http://ci.uchicago.edu/swift/2009/02/swiftscript) element.
 *
 * This is a complex type.
 */
public class AndDocumentImpl extends org.globus.swift.language.impl.AbstractExpressionDocumentImpl implements org.globus.swift.language.AndDocument
{
    
    public AndDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AND$0 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "and");
    
    
    /**
     * Gets the "and" element
     */
    public org.globus.swift.language.BinaryOperator getAnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.BinaryOperator target = null;
            target = (org.globus.swift.language.BinaryOperator)get_store().find_element_user(AND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "and" element
     */
    public void setAnd(org.globus.swift.language.BinaryOperator and)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.BinaryOperator target = null;
            target = (org.globus.swift.language.BinaryOperator)get_store().find_element_user(AND$0, 0);
            if (target == null)
            {
                target = (org.globus.swift.language.BinaryOperator)get_store().add_element_user(AND$0);
            }
            target.set(and);
        }
    }
    
    /**
     * Appends and returns a new empty "and" element
     */
    public org.globus.swift.language.BinaryOperator addNewAnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.BinaryOperator target = null;
            target = (org.globus.swift.language.BinaryOperator)get_store().add_element_user(AND$0);
            return target;
        }
    }
}

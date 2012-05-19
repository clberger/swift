/*
 * An XML document type.
 * Localname: or
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.OrDocument
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language.impl;
/**
 * A document containing one or(@http://ci.uchicago.edu/swift/2009/02/swiftscript) element.
 *
 * This is a complex type.
 */
public class OrDocumentImpl extends org.globus.swift.language.impl.AbstractExpressionDocumentImpl implements org.globus.swift.language.OrDocument
{
    
    public OrDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OR$0 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "or");
    
    
    /**
     * Gets the "or" element
     */
    public org.globus.swift.language.BinaryOperator getOr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.BinaryOperator target = null;
            target = (org.globus.swift.language.BinaryOperator)get_store().find_element_user(OR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "or" element
     */
    public void setOr(org.globus.swift.language.BinaryOperator or)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.BinaryOperator target = null;
            target = (org.globus.swift.language.BinaryOperator)get_store().find_element_user(OR$0, 0);
            if (target == null)
            {
                target = (org.globus.swift.language.BinaryOperator)get_store().add_element_user(OR$0);
            }
            target.set(or);
        }
    }
    
    /**
     * Appends and returns a new empty "or" element
     */
    public org.globus.swift.language.BinaryOperator addNewOr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.BinaryOperator target = null;
            target = (org.globus.swift.language.BinaryOperator)get_store().add_element_user(OR$0);
            return target;
        }
    }
}

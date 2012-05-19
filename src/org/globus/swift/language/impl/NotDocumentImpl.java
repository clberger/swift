/*
 * An XML document type.
 * Localname: not
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.NotDocument
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language.impl;
/**
 * A document containing one not(@http://ci.uchicago.edu/swift/2009/02/swiftscript) element.
 *
 * This is a complex type.
 */
public class NotDocumentImpl extends org.globus.swift.language.impl.AbstractExpressionDocumentImpl implements org.globus.swift.language.NotDocument
{
    
    public NotDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOT$0 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "not");
    
    
    /**
     * Gets the "not" element
     */
    public org.globus.swift.language.UnlabelledUnaryOperator getNot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.UnlabelledUnaryOperator target = null;
            target = (org.globus.swift.language.UnlabelledUnaryOperator)get_store().find_element_user(NOT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "not" element
     */
    public void setNot(org.globus.swift.language.UnlabelledUnaryOperator not)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.UnlabelledUnaryOperator target = null;
            target = (org.globus.swift.language.UnlabelledUnaryOperator)get_store().find_element_user(NOT$0, 0);
            if (target == null)
            {
                target = (org.globus.swift.language.UnlabelledUnaryOperator)get_store().add_element_user(NOT$0);
            }
            target.set(not);
        }
    }
    
    /**
     * Appends and returns a new empty "not" element
     */
    public org.globus.swift.language.UnlabelledUnaryOperator addNewNot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.UnlabelledUnaryOperator target = null;
            target = (org.globus.swift.language.UnlabelledUnaryOperator)get_store().add_element_user(NOT$0);
            return target;
        }
    }
}

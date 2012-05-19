/*
 * An XML document type.
 * Localname: cond
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.CondDocument
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language.impl;
/**
 * A document containing one cond(@http://ci.uchicago.edu/swift/2009/02/swiftscript) element.
 *
 * This is a complex type.
 */
public class CondDocumentImpl extends org.globus.swift.language.impl.AbstractExpressionDocumentImpl implements org.globus.swift.language.CondDocument
{
    
    public CondDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COND$0 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "cond");
    
    
    /**
     * Gets the "cond" element
     */
    public org.globus.swift.language.LabelledBinaryOperator getCond()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.LabelledBinaryOperator target = null;
            target = (org.globus.swift.language.LabelledBinaryOperator)get_store().find_element_user(COND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cond" element
     */
    public void setCond(org.globus.swift.language.LabelledBinaryOperator cond)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.LabelledBinaryOperator target = null;
            target = (org.globus.swift.language.LabelledBinaryOperator)get_store().find_element_user(COND$0, 0);
            if (target == null)
            {
                target = (org.globus.swift.language.LabelledBinaryOperator)get_store().add_element_user(COND$0);
            }
            target.set(cond);
        }
    }
    
    /**
     * Appends and returns a new empty "cond" element
     */
    public org.globus.swift.language.LabelledBinaryOperator addNewCond()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.LabelledBinaryOperator target = null;
            target = (org.globus.swift.language.LabelledBinaryOperator)get_store().add_element_user(COND$0);
            return target;
        }
    }
}

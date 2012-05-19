/*
 * An XML document type.
 * Localname: arith
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.ArithDocument
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language.impl;
/**
 * A document containing one arith(@http://ci.uchicago.edu/swift/2009/02/swiftscript) element.
 *
 * This is a complex type.
 */
public class ArithDocumentImpl extends org.globus.swift.language.impl.AbstractExpressionDocumentImpl implements org.globus.swift.language.ArithDocument
{
    
    public ArithDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARITH$0 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "arith");
    
    
    /**
     * Gets the "arith" element
     */
    public org.globus.swift.language.LabelledBinaryOperator getArith()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.LabelledBinaryOperator target = null;
            target = (org.globus.swift.language.LabelledBinaryOperator)get_store().find_element_user(ARITH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "arith" element
     */
    public void setArith(org.globus.swift.language.LabelledBinaryOperator arith)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.LabelledBinaryOperator target = null;
            target = (org.globus.swift.language.LabelledBinaryOperator)get_store().find_element_user(ARITH$0, 0);
            if (target == null)
            {
                target = (org.globus.swift.language.LabelledBinaryOperator)get_store().add_element_user(ARITH$0);
            }
            target.set(arith);
        }
    }
    
    /**
     * Appends and returns a new empty "arith" element
     */
    public org.globus.swift.language.LabelledBinaryOperator addNewArith()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.LabelledBinaryOperator target = null;
            target = (org.globus.swift.language.LabelledBinaryOperator)get_store().add_element_user(ARITH$0);
            return target;
        }
    }
}

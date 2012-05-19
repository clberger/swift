/*
 * An XML document type.
 * Localname: integerConstant
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.IntegerConstantDocument
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language.impl;
/**
 * A document containing one integerConstant(@http://ci.uchicago.edu/swift/2009/02/swiftscript) element.
 *
 * This is a complex type.
 */
public class IntegerConstantDocumentImpl extends org.globus.swift.language.impl.AbstractExpressionDocumentImpl implements org.globus.swift.language.IntegerConstantDocument
{
    
    public IntegerConstantDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTEGERCONSTANT$0 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "integerConstant");
    
    
    /**
     * Gets the "integerConstant" element
     */
    public int getIntegerConstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTEGERCONSTANT$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "integerConstant" element
     */
    public org.apache.xmlbeans.XmlInt xgetIntegerConstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INTEGERCONSTANT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "integerConstant" element
     */
    public void setIntegerConstant(int integerConstant)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTEGERCONSTANT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTEGERCONSTANT$0);
            }
            target.setIntValue(integerConstant);
        }
    }
    
    /**
     * Sets (as xml) the "integerConstant" element
     */
    public void xsetIntegerConstant(org.apache.xmlbeans.XmlInt integerConstant)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INTEGERCONSTANT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(INTEGERCONSTANT$0);
            }
            target.set(integerConstant);
        }
    }
}

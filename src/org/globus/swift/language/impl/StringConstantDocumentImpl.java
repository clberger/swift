/*
 * An XML document type.
 * Localname: stringConstant
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.StringConstantDocument
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language.impl;
/**
 * A document containing one stringConstant(@http://ci.uchicago.edu/swift/2009/02/swiftscript) element.
 *
 * This is a complex type.
 */
public class StringConstantDocumentImpl extends org.globus.swift.language.impl.AbstractExpressionDocumentImpl implements org.globus.swift.language.StringConstantDocument
{
    
    public StringConstantDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRINGCONSTANT$0 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "stringConstant");
    
    
    /**
     * Gets the "stringConstant" element
     */
    public java.lang.String getStringConstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRINGCONSTANT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "stringConstant" element
     */
    public org.apache.xmlbeans.XmlString xgetStringConstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRINGCONSTANT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "stringConstant" element
     */
    public void setStringConstant(java.lang.String stringConstant)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRINGCONSTANT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRINGCONSTANT$0);
            }
            target.setStringValue(stringConstant);
        }
    }
    
    /**
     * Sets (as xml) the "stringConstant" element
     */
    public void xsetStringConstant(org.apache.xmlbeans.XmlString stringConstant)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRINGCONSTANT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STRINGCONSTANT$0);
            }
            target.set(stringConstant);
        }
    }
}

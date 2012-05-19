/*
 * An XML document type.
 * Localname: booleanConstant
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.BooleanConstantDocument
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language.impl;
/**
 * A document containing one booleanConstant(@http://ci.uchicago.edu/swift/2009/02/swiftscript) element.
 *
 * This is a complex type.
 */
public class BooleanConstantDocumentImpl extends org.globus.swift.language.impl.AbstractExpressionDocumentImpl implements org.globus.swift.language.BooleanConstantDocument
{
    
    public BooleanConstantDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOOLEANCONSTANT$0 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "booleanConstant");
    
    
    /**
     * Gets the "booleanConstant" element
     */
    public boolean getBooleanConstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOLEANCONSTANT$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "booleanConstant" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetBooleanConstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BOOLEANCONSTANT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "booleanConstant" element
     */
    public void setBooleanConstant(boolean booleanConstant)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOLEANCONSTANT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOOLEANCONSTANT$0);
            }
            target.setBooleanValue(booleanConstant);
        }
    }
    
    /**
     * Sets (as xml) the "booleanConstant" element
     */
    public void xsetBooleanConstant(org.apache.xmlbeans.XmlBoolean booleanConstant)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BOOLEANCONSTANT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(BOOLEANCONSTANT$0);
            }
            target.set(booleanConstant);
        }
    }
}

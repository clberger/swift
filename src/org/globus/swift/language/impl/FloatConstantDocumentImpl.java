/*
 * An XML document type.
 * Localname: floatConstant
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.FloatConstantDocument
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language.impl;
/**
 * A document containing one floatConstant(@http://ci.uchicago.edu/swift/2009/02/swiftscript) element.
 *
 * This is a complex type.
 */
public class FloatConstantDocumentImpl extends org.globus.swift.language.impl.AbstractExpressionDocumentImpl implements org.globus.swift.language.FloatConstantDocument
{
    
    public FloatConstantDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FLOATCONSTANT$0 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "floatConstant");
    
    
    /**
     * Gets the "floatConstant" element
     */
    public float getFloatConstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLOATCONSTANT$0, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "floatConstant" element
     */
    public org.apache.xmlbeans.XmlFloat xgetFloatConstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(FLOATCONSTANT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "floatConstant" element
     */
    public void setFloatConstant(float floatConstant)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLOATCONSTANT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FLOATCONSTANT$0);
            }
            target.setFloatValue(floatConstant);
        }
    }
    
    /**
     * Sets (as xml) the "floatConstant" element
     */
    public void xsetFloatConstant(org.apache.xmlbeans.XmlFloat floatConstant)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(FLOATCONSTANT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(FLOATCONSTANT$0);
            }
            target.set(floatConstant);
        }
    }
}

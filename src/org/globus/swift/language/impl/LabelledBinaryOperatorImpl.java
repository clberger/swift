/*
 * XML Type:  LabelledBinaryOperator
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.LabelledBinaryOperator
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language.impl;
/**
 * An XML LabelledBinaryOperator(@http://ci.uchicago.edu/swift/2009/02/swiftscript).
 *
 * This is a complex type.
 */
public class LabelledBinaryOperatorImpl extends org.globus.swift.language.impl.BinaryOperatorImpl implements org.globus.swift.language.LabelledBinaryOperator
{
    
    public LabelledBinaryOperatorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OP$0 = 
        new javax.xml.namespace.QName("", "op");
    
    
    /**
     * Gets the "op" attribute
     */
    public java.lang.String getOp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OP$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "op" attribute
     */
    public org.apache.xmlbeans.XmlString xgetOp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OP$0);
            return target;
        }
    }
    
    /**
     * True if has "op" attribute
     */
    public boolean isSetOp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OP$0) != null;
        }
    }
    
    /**
     * Sets the "op" attribute
     */
    public void setOp(java.lang.String op)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OP$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OP$0);
            }
            target.setStringValue(op);
        }
    }
    
    /**
     * Sets (as xml) the "op" attribute
     */
    public void xsetOp(org.apache.xmlbeans.XmlString op)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OP$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OP$0);
            }
            target.set(op);
        }
    }
    
    /**
     * Unsets the "op" attribute
     */
    public void unsetOp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OP$0);
        }
    }
}

/*
 * An XML document type.
 * Localname: variableReference
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.VariableReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language.impl;
/**
 * A document containing one variableReference(@http://ci.uchicago.edu/swift/2009/02/swiftscript) element.
 *
 * This is a complex type.
 */
public class VariableReferenceDocumentImpl extends org.globus.swift.language.impl.AbstractExpressionDocumentImpl implements org.globus.swift.language.VariableReferenceDocument
{
    
    public VariableReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VARIABLEREFERENCE$0 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "variableReference");
    
    
    /**
     * Gets the "variableReference" element
     */
    public java.lang.String getVariableReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VARIABLEREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "variableReference" element
     */
    public org.apache.xmlbeans.XmlString xgetVariableReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VARIABLEREFERENCE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "variableReference" element
     */
    public void setVariableReference(java.lang.String variableReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VARIABLEREFERENCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VARIABLEREFERENCE$0);
            }
            target.setStringValue(variableReference);
        }
    }
    
    /**
     * Sets (as xml) the "variableReference" element
     */
    public void xsetVariableReference(org.apache.xmlbeans.XmlString variableReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VARIABLEREFERENCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VARIABLEREFERENCE$0);
            }
            target.set(variableReference);
        }
    }
}

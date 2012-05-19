/*
 * XML Type:  TypeRow
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.TypeRow
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language.impl;
/**
 * An XML TypeRow(@http://ci.uchicago.edu/swift/2009/02/swiftscript).
 *
 * This is a complex type.
 */
public class TypeRowImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.globus.swift.language.TypeRow
{
    
    public TypeRowImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEMBERNAME$0 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "membername");
    private static final javax.xml.namespace.QName MEMBERTYPE$2 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "membertype");
    
    
    /**
     * Gets the "membername" element
     */
    public java.lang.String getMembername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEMBERNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "membername" element
     */
    public org.apache.xmlbeans.XmlString xgetMembername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEMBERNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "membername" element
     */
    public void setMembername(java.lang.String membername)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEMBERNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEMBERNAME$0);
            }
            target.setStringValue(membername);
        }
    }
    
    /**
     * Sets (as xml) the "membername" element
     */
    public void xsetMembername(org.apache.xmlbeans.XmlString membername)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEMBERNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEMBERNAME$0);
            }
            target.set(membername);
        }
    }
    
    /**
     * Gets the "membertype" element
     */
    public java.lang.String getMembertype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEMBERTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "membertype" element
     */
    public org.apache.xmlbeans.XmlString xgetMembertype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEMBERTYPE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "membertype" element
     */
    public void setMembertype(java.lang.String membertype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEMBERTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEMBERTYPE$2);
            }
            target.setStringValue(membertype);
        }
    }
    
    /**
     * Sets (as xml) the "membertype" element
     */
    public void xsetMembertype(org.apache.xmlbeans.XmlString membertype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEMBERTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEMBERTYPE$2);
            }
            target.set(membertype);
        }
    }
}

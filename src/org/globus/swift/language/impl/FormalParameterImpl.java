/*
 * XML Type:  FormalParameter
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.FormalParameter
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language.impl;
/**
 * An XML FormalParameter(@http://ci.uchicago.edu/swift/2009/02/swiftscript).
 *
 * This is a complex type.
 */
public class FormalParameterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.globus.swift.language.FormalParameter
{
    
    public FormalParameterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTEXPRESSION$0 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "abstractExpression");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTEXPRESSION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "array"),
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "variableReference"),
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "arraySubscript"),
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "stringConstant"),
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "floatConstant"),
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "abstractExpression"),
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "unaryNegation"),
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "integerConstant"),
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "structureMember"),
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "not"),
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "function"),
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "and"),
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "cond"),
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "or"),
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "booleanConstant"),
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "range"),
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "call"),
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "arith"),
    });
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("", "type");
    
    
    /**
     * Gets the "abstractExpression" element
     */
    public org.apache.xmlbeans.XmlObject getAbstractExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ABSTRACTEXPRESSION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "abstractExpression" element
     */
    public void setAbstractExpression(org.apache.xmlbeans.XmlObject abstractExpression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ABSTRACTEXPRESSION$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ABSTRACTEXPRESSION$0);
            }
            target.set(abstractExpression);
        }
    }
    
    /**
     * Appends and returns a new empty "abstractExpression" element
     */
    public org.apache.xmlbeans.XmlObject addNewAbstractExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ABSTRACTEXPRESSION$0);
            return target;
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlNCName xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NAME$2);
            return target;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlNCName name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public javax.xml.namespace.QName getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(TYPE$4);
            return target;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(javax.xml.namespace.QName type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$4);
            }
            target.setQNameValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.apache.xmlbeans.XmlQName type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(TYPE$4);
            }
            target.set(type);
        }
    }
}

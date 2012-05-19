/*
 * XML Type:  ActualParameter
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.ActualParameter
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language.impl;
/**
 * An XML ActualParameter(@http://ci.uchicago.edu/swift/2009/02/swiftscript).
 *
 * This is a complex type.
 */
public class ActualParameterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.globus.swift.language.ActualParameter
{
    
    public ActualParameterImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName BIND$2 = 
        new javax.xml.namespace.QName("", "bind");
    
    
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
     * Gets the "bind" attribute
     */
    public java.lang.String getBind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BIND$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "bind" attribute
     */
    public org.apache.xmlbeans.XmlNMTOKEN xgetBind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(BIND$2);
            return target;
        }
    }
    
    /**
     * True if has "bind" attribute
     */
    public boolean isSetBind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BIND$2) != null;
        }
    }
    
    /**
     * Sets the "bind" attribute
     */
    public void setBind(java.lang.String bind)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BIND$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BIND$2);
            }
            target.setStringValue(bind);
        }
    }
    
    /**
     * Sets (as xml) the "bind" attribute
     */
    public void xsetBind(org.apache.xmlbeans.XmlNMTOKEN bind)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(BIND$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(BIND$2);
            }
            target.set(bind);
        }
    }
    
    /**
     * Unsets the "bind" attribute
     */
    public void unsetBind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BIND$2);
        }
    }
}

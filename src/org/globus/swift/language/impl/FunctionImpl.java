/*
 * XML Type:  Function
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.Function
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language.impl;
/**
 * An XML Function(@http://ci.uchicago.edu/swift/2009/02/swiftscript).
 *
 * This is a complex type.
 */
public class FunctionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.globus.swift.language.Function
{
    
    public FunctionImpl(org.apache.xmlbeans.SchemaType sType)
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
    
    
    /**
     * Gets array of all "abstractExpression" elements
     */
    public org.apache.xmlbeans.XmlObject[] getAbstractExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ABSTRACTEXPRESSION$1, targetList);
            org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "abstractExpression" element
     */
    public org.apache.xmlbeans.XmlObject getAbstractExpressionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ABSTRACTEXPRESSION$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "abstractExpression" element
     */
    public int sizeOfAbstractExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABSTRACTEXPRESSION$1);
        }
    }
    
    /**
     * Sets array of all "abstractExpression" element
     */
    public void setAbstractExpressionArray(org.apache.xmlbeans.XmlObject[] abstractExpressionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(abstractExpressionArray, ABSTRACTEXPRESSION$0, ABSTRACTEXPRESSION$1);
        }
    }
    
    /**
     * Sets ith "abstractExpression" element
     */
    public void setAbstractExpressionArray(int i, org.apache.xmlbeans.XmlObject abstractExpression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ABSTRACTEXPRESSION$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(abstractExpression);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "abstractExpression" element
     */
    public org.apache.xmlbeans.XmlObject insertNewAbstractExpression(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(ABSTRACTEXPRESSION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "abstractExpression" element
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
     * Removes the ith "abstractExpression" element
     */
    public void removeAbstractExpression(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABSTRACTEXPRESSION$1, i);
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
    public org.apache.xmlbeans.XmlNMTOKEN xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAME$2);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$2) != null;
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
    public void xsetName(org.apache.xmlbeans.XmlNMTOKEN name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$2);
        }
    }
}

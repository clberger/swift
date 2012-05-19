/*
 * XML Type:  Profile
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.Profile
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language.impl;
/**
 * An XML Profile(@http://ci.uchicago.edu/swift/2009/02/swiftscript).
 *
 * This is a complex type.
 */
public class ProfileImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.globus.swift.language.Profile
{
    
    public ProfileImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FUNCTION$0 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "function");
    private static final javax.xml.namespace.QName NAMESPACE$2 = 
        new javax.xml.namespace.QName("", "namespace");
    private static final javax.xml.namespace.QName KEY$4 = 
        new javax.xml.namespace.QName("", "key");
    
    
    /**
     * Gets array of all "function" elements
     */
    public org.globus.swift.language.Function[] getFunctionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FUNCTION$0, targetList);
            org.globus.swift.language.Function[] result = new org.globus.swift.language.Function[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "function" element
     */
    public org.globus.swift.language.Function getFunctionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.Function target = null;
            target = (org.globus.swift.language.Function)get_store().find_element_user(FUNCTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "function" element
     */
    public int sizeOfFunctionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FUNCTION$0);
        }
    }
    
    /**
     * Sets array of all "function" element
     */
    public void setFunctionArray(org.globus.swift.language.Function[] functionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(functionArray, FUNCTION$0);
        }
    }
    
    /**
     * Sets ith "function" element
     */
    public void setFunctionArray(int i, org.globus.swift.language.Function function)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.Function target = null;
            target = (org.globus.swift.language.Function)get_store().find_element_user(FUNCTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(function);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "function" element
     */
    public org.globus.swift.language.Function insertNewFunction(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.Function target = null;
            target = (org.globus.swift.language.Function)get_store().insert_element_user(FUNCTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "function" element
     */
    public org.globus.swift.language.Function addNewFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.Function target = null;
            target = (org.globus.swift.language.Function)get_store().add_element_user(FUNCTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "function" element
     */
    public void removeFunction(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FUNCTION$0, i);
        }
    }
    
    /**
     * Gets the "namespace" attribute
     */
    public java.lang.String getNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMESPACE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "namespace" attribute
     */
    public org.apache.xmlbeans.XmlNMTOKEN xgetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAMESPACE$2);
            return target;
        }
    }
    
    /**
     * True if has "namespace" attribute
     */
    public boolean isSetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAMESPACE$2) != null;
        }
    }
    
    /**
     * Sets the "namespace" attribute
     */
    public void setNamespace(java.lang.String namespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMESPACE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMESPACE$2);
            }
            target.setStringValue(namespace);
        }
    }
    
    /**
     * Sets (as xml) the "namespace" attribute
     */
    public void xsetNamespace(org.apache.xmlbeans.XmlNMTOKEN namespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAMESPACE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(NAMESPACE$2);
            }
            target.set(namespace);
        }
    }
    
    /**
     * Unsets the "namespace" attribute
     */
    public void unsetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAMESPACE$2);
        }
    }
    
    /**
     * Gets the "key" attribute
     */
    public java.lang.String getKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEY$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "key" attribute
     */
    public org.apache.xmlbeans.XmlNMTOKEN xgetKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(KEY$4);
            return target;
        }
    }
    
    /**
     * Sets the "key" attribute
     */
    public void setKey(java.lang.String key)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEY$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KEY$4);
            }
            target.setStringValue(key);
        }
    }
    
    /**
     * Sets (as xml) the "key" attribute
     */
    public void xsetKey(org.apache.xmlbeans.XmlNMTOKEN key)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(KEY$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(KEY$4);
            }
            target.set(key);
        }
    }
}

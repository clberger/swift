/*
 * An XML document type.
 * Localname: array
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.ArrayDocument
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language.impl;
/**
 * A document containing one array(@http://ci.uchicago.edu/swift/2009/02/swiftscript) element.
 *
 * This is a complex type.
 */
public class ArrayDocumentImpl extends org.globus.swift.language.impl.AbstractExpressionDocumentImpl implements org.globus.swift.language.ArrayDocument
{
    
    public ArrayDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAY$0 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "array");
    
    
    /**
     * Gets the "array" element
     */
    public org.globus.swift.language.Array getArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.Array target = null;
            target = (org.globus.swift.language.Array)get_store().find_element_user(ARRAY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "array" element
     */
    public void setArray(org.globus.swift.language.Array array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.Array target = null;
            target = (org.globus.swift.language.Array)get_store().find_element_user(ARRAY$0, 0);
            if (target == null)
            {
                target = (org.globus.swift.language.Array)get_store().add_element_user(ARRAY$0);
            }
            target.set(array);
        }
    }
    
    /**
     * Appends and returns a new empty "array" element
     */
    public org.globus.swift.language.Array addNewArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.Array target = null;
            target = (org.globus.swift.language.Array)get_store().add_element_user(ARRAY$0);
            return target;
        }
    }
}

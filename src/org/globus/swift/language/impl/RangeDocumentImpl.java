/*
 * An XML document type.
 * Localname: range
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.RangeDocument
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language.impl;
/**
 * A document containing one range(@http://ci.uchicago.edu/swift/2009/02/swiftscript) element.
 *
 * This is a complex type.
 */
public class RangeDocumentImpl extends org.globus.swift.language.impl.AbstractExpressionDocumentImpl implements org.globus.swift.language.RangeDocument
{
    
    public RangeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RANGE$0 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "range");
    
    
    /**
     * Gets the "range" element
     */
    public org.globus.swift.language.Range getRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.Range target = null;
            target = (org.globus.swift.language.Range)get_store().find_element_user(RANGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "range" element
     */
    public void setRange(org.globus.swift.language.Range range)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.Range target = null;
            target = (org.globus.swift.language.Range)get_store().find_element_user(RANGE$0, 0);
            if (target == null)
            {
                target = (org.globus.swift.language.Range)get_store().add_element_user(RANGE$0);
            }
            target.set(range);
        }
    }
    
    /**
     * Appends and returns a new empty "range" element
     */
    public org.globus.swift.language.Range addNewRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.Range target = null;
            target = (org.globus.swift.language.Range)get_store().add_element_user(RANGE$0);
            return target;
        }
    }
}

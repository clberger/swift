/*
 * An XML document type.
 * Localname: structureMember
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.StructureMemberDocument
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language.impl;
/**
 * A document containing one structureMember(@http://ci.uchicago.edu/swift/2009/02/swiftscript) element.
 *
 * This is a complex type.
 */
public class StructureMemberDocumentImpl extends org.globus.swift.language.impl.AbstractExpressionDocumentImpl implements org.globus.swift.language.StructureMemberDocument
{
    
    public StructureMemberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTUREMEMBER$0 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "structureMember");
    
    
    /**
     * Gets the "structureMember" element
     */
    public org.globus.swift.language.StructureMember getStructureMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.StructureMember target = null;
            target = (org.globus.swift.language.StructureMember)get_store().find_element_user(STRUCTUREMEMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "structureMember" element
     */
    public void setStructureMember(org.globus.swift.language.StructureMember structureMember)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.StructureMember target = null;
            target = (org.globus.swift.language.StructureMember)get_store().find_element_user(STRUCTUREMEMBER$0, 0);
            if (target == null)
            {
                target = (org.globus.swift.language.StructureMember)get_store().add_element_user(STRUCTUREMEMBER$0);
            }
            target.set(structureMember);
        }
    }
    
    /**
     * Appends and returns a new empty "structureMember" element
     */
    public org.globus.swift.language.StructureMember addNewStructureMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.StructureMember target = null;
            target = (org.globus.swift.language.StructureMember)get_store().add_element_user(STRUCTUREMEMBER$0);
            return target;
        }
    }
}

/*
 * XML Type:  TypeStructure
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.TypeStructure
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language.impl;
/**
 * An XML TypeStructure(@http://ci.uchicago.edu/swift/2009/02/swiftscript).
 *
 * This is a complex type.
 */
public class TypeStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.globus.swift.language.TypeStructure
{
    
    public TypeStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEMBER$0 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "member");
    
    
    /**
     * Gets array of all "member" elements
     */
    public org.globus.swift.language.TypeRow[] getMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MEMBER$0, targetList);
            org.globus.swift.language.TypeRow[] result = new org.globus.swift.language.TypeRow[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "member" element
     */
    public org.globus.swift.language.TypeRow getMemberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.TypeRow target = null;
            target = (org.globus.swift.language.TypeRow)get_store().find_element_user(MEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "member" element
     */
    public int sizeOfMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEMBER$0);
        }
    }
    
    /**
     * Sets array of all "member" element
     */
    public void setMemberArray(org.globus.swift.language.TypeRow[] memberArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(memberArray, MEMBER$0);
        }
    }
    
    /**
     * Sets ith "member" element
     */
    public void setMemberArray(int i, org.globus.swift.language.TypeRow member)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.TypeRow target = null;
            target = (org.globus.swift.language.TypeRow)get_store().find_element_user(MEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(member);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "member" element
     */
    public org.globus.swift.language.TypeRow insertNewMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.TypeRow target = null;
            target = (org.globus.swift.language.TypeRow)get_store().insert_element_user(MEMBER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "member" element
     */
    public org.globus.swift.language.TypeRow addNewMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.TypeRow target = null;
            target = (org.globus.swift.language.TypeRow)get_store().add_element_user(MEMBER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "member" element
     */
    public void removeMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEMBER$0, i);
        }
    }
}

/*
 * An XML document type.
 * Localname: types
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.TypesDocument
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language.impl;
/**
 * A document containing one types(@http://ci.uchicago.edu/swift/2009/02/swiftscript) element.
 *
 * This is a complex type.
 */
public class TypesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.globus.swift.language.TypesDocument
{
    
    public TypesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPES$0 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "types");
    
    
    /**
     * Gets the "types" element
     */
    public org.globus.swift.language.TypesDocument.Types getTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.TypesDocument.Types target = null;
            target = (org.globus.swift.language.TypesDocument.Types)get_store().find_element_user(TYPES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "types" element
     */
    public void setTypes(org.globus.swift.language.TypesDocument.Types types)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.TypesDocument.Types target = null;
            target = (org.globus.swift.language.TypesDocument.Types)get_store().find_element_user(TYPES$0, 0);
            if (target == null)
            {
                target = (org.globus.swift.language.TypesDocument.Types)get_store().add_element_user(TYPES$0);
            }
            target.set(types);
        }
    }
    
    /**
     * Appends and returns a new empty "types" element
     */
    public org.globus.swift.language.TypesDocument.Types addNewTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.TypesDocument.Types target = null;
            target = (org.globus.swift.language.TypesDocument.Types)get_store().add_element_user(TYPES$0);
            return target;
        }
    }
    /**
     * An XML types(@http://ci.uchicago.edu/swift/2009/02/swiftscript).
     *
     * This is a complex type.
     */
    public static class TypesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.globus.swift.language.TypesDocument.Types
    {
        
        public TypesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "type");
        
        
        /**
         * Gets array of all "type" elements
         */
        public org.globus.swift.language.TypesDocument.Types.Type[] getTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TYPE$0, targetList);
                org.globus.swift.language.TypesDocument.Types.Type[] result = new org.globus.swift.language.TypesDocument.Types.Type[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "type" element
         */
        public org.globus.swift.language.TypesDocument.Types.Type getTypeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.TypesDocument.Types.Type target = null;
                target = (org.globus.swift.language.TypesDocument.Types.Type)get_store().find_element_user(TYPE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "type" element
         */
        public int sizeOfTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TYPE$0);
            }
        }
        
        /**
         * Sets array of all "type" element
         */
        public void setTypeArray(org.globus.swift.language.TypesDocument.Types.Type[] typeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(typeArray, TYPE$0);
            }
        }
        
        /**
         * Sets ith "type" element
         */
        public void setTypeArray(int i, org.globus.swift.language.TypesDocument.Types.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.TypesDocument.Types.Type target = null;
                target = (org.globus.swift.language.TypesDocument.Types.Type)get_store().find_element_user(TYPE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(type);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "type" element
         */
        public org.globus.swift.language.TypesDocument.Types.Type insertNewType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.TypesDocument.Types.Type target = null;
                target = (org.globus.swift.language.TypesDocument.Types.Type)get_store().insert_element_user(TYPE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "type" element
         */
        public org.globus.swift.language.TypesDocument.Types.Type addNewType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.TypesDocument.Types.Type target = null;
                target = (org.globus.swift.language.TypesDocument.Types.Type)get_store().add_element_user(TYPE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "type" element
         */
        public void removeType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TYPE$0, i);
            }
        }
        /**
         * An XML type(@http://ci.uchicago.edu/swift/2009/02/swiftscript).
         *
         * This is a complex type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.globus.swift.language.TypesDocument.Types.Type
        {
            
            public TypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TYPENAME$0 = 
                new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "typename");
            private static final javax.xml.namespace.QName TYPEALIAS$2 = 
                new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "typealias");
            private static final javax.xml.namespace.QName TYPESTRUCTURE$4 = 
                new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "typestructure");
            
            
            /**
             * Gets the "typename" element
             */
            public java.lang.String getTypename()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPENAME$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "typename" element
             */
            public org.apache.xmlbeans.XmlString xgetTypename()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPENAME$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "typename" element
             */
            public void setTypename(java.lang.String typename)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPENAME$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPENAME$0);
                    }
                    target.setStringValue(typename);
                }
            }
            
            /**
             * Sets (as xml) the "typename" element
             */
            public void xsetTypename(org.apache.xmlbeans.XmlString typename)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPENAME$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPENAME$0);
                    }
                    target.set(typename);
                }
            }
            
            /**
             * Gets the "typealias" element
             */
            public java.lang.String getTypealias()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEALIAS$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "typealias" element
             */
            public org.apache.xmlbeans.XmlString xgetTypealias()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPEALIAS$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "typealias" element
             */
            public void setTypealias(java.lang.String typealias)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEALIAS$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPEALIAS$2);
                    }
                    target.setStringValue(typealias);
                }
            }
            
            /**
             * Sets (as xml) the "typealias" element
             */
            public void xsetTypealias(org.apache.xmlbeans.XmlString typealias)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPEALIAS$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPEALIAS$2);
                    }
                    target.set(typealias);
                }
            }
            
            /**
             * Gets the "typestructure" element
             */
            public org.globus.swift.language.TypeStructure getTypestructure()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.globus.swift.language.TypeStructure target = null;
                    target = (org.globus.swift.language.TypeStructure)get_store().find_element_user(TYPESTRUCTURE$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "typestructure" element
             */
            public void setTypestructure(org.globus.swift.language.TypeStructure typestructure)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.globus.swift.language.TypeStructure target = null;
                    target = (org.globus.swift.language.TypeStructure)get_store().find_element_user(TYPESTRUCTURE$4, 0);
                    if (target == null)
                    {
                      target = (org.globus.swift.language.TypeStructure)get_store().add_element_user(TYPESTRUCTURE$4);
                    }
                    target.set(typestructure);
                }
            }
            
            /**
             * Appends and returns a new empty "typestructure" element
             */
            public org.globus.swift.language.TypeStructure addNewTypestructure()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.globus.swift.language.TypeStructure target = null;
                    target = (org.globus.swift.language.TypeStructure)get_store().add_element_user(TYPESTRUCTURE$4);
                    return target;
                }
            }
        }
    }
}

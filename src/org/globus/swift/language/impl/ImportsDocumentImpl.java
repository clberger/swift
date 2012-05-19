/*
 * An XML document type.
 * Localname: imports
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.ImportsDocument
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language.impl;
/**
 * A document containing one imports(@http://ci.uchicago.edu/swift/2009/02/swiftscript) element.
 *
 * This is a complex type.
 */
public class ImportsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.globus.swift.language.ImportsDocument
{
    
    public ImportsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPORTS$0 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "imports");
    
    
    /**
     * Gets the "imports" element
     */
    public org.globus.swift.language.ImportsDocument.Imports getImports()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.ImportsDocument.Imports target = null;
            target = (org.globus.swift.language.ImportsDocument.Imports)get_store().find_element_user(IMPORTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "imports" element
     */
    public void setImports(org.globus.swift.language.ImportsDocument.Imports imports)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.ImportsDocument.Imports target = null;
            target = (org.globus.swift.language.ImportsDocument.Imports)get_store().find_element_user(IMPORTS$0, 0);
            if (target == null)
            {
                target = (org.globus.swift.language.ImportsDocument.Imports)get_store().add_element_user(IMPORTS$0);
            }
            target.set(imports);
        }
    }
    
    /**
     * Appends and returns a new empty "imports" element
     */
    public org.globus.swift.language.ImportsDocument.Imports addNewImports()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.ImportsDocument.Imports target = null;
            target = (org.globus.swift.language.ImportsDocument.Imports)get_store().add_element_user(IMPORTS$0);
            return target;
        }
    }
    /**
     * An XML imports(@http://ci.uchicago.edu/swift/2009/02/swiftscript).
     *
     * This is a complex type.
     */
    public static class ImportsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.globus.swift.language.ImportsDocument.Imports
    {
        
        public ImportsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IMPORT$0 = 
            new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "import");
        
        
        /**
         * Gets array of all "import" elements
         */
        public java.lang.String[] getImportArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(IMPORT$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "import" element
         */
        public java.lang.String getImportArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPORT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "import" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetImportArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(IMPORT$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "import" element
         */
        public org.apache.xmlbeans.XmlString xgetImportArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMPORT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "import" element
         */
        public int sizeOfImportArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IMPORT$0);
            }
        }
        
        /**
         * Sets array of all "import" element
         */
        public void setImportArray(java.lang.String[] ximportArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(ximportArray, IMPORT$0);
            }
        }
        
        /**
         * Sets ith "import" element
         */
        public void setImportArray(int i, java.lang.String ximport)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPORT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(ximport);
            }
        }
        
        /**
         * Sets (as xml) array of all "import" element
         */
        public void xsetImportArray(org.apache.xmlbeans.XmlString[]ximportArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(ximportArray, IMPORT$0);
            }
        }
        
        /**
         * Sets (as xml) ith "import" element
         */
        public void xsetImportArray(int i, org.apache.xmlbeans.XmlString ximport)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMPORT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(ximport);
            }
        }
        
        /**
         * Inserts the value as the ith "import" element
         */
        public void insertImport(int i, java.lang.String ximport)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(IMPORT$0, i);
                target.setStringValue(ximport);
            }
        }
        
        /**
         * Appends the value as the last "import" element
         */
        public void addImport(java.lang.String ximport)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMPORT$0);
                target.setStringValue(ximport);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "import" element
         */
        public org.apache.xmlbeans.XmlString insertNewImport(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(IMPORT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "import" element
         */
        public org.apache.xmlbeans.XmlString addNewImport()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IMPORT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "import" element
         */
        public void removeImport(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IMPORT$0, i);
            }
        }
    }
}

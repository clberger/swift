/*
 * XML Type:  Variable
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.Variable
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language.impl;
/**
 * An XML Variable(@http://ci.uchicago.edu/swift/2009/02/swiftscript).
 *
 * This is a complex type.
 */
public class VariableImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.globus.swift.language.Variable
{
    
    public VariableImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILE$0 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "file");
    private static final javax.xml.namespace.QName MAPPING$2 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "mapping");
    private static final javax.xml.namespace.QName NAME$4 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName TYPE$6 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName ISGLOBAL$8 = 
        new javax.xml.namespace.QName("", "isGlobal");
    
    
    /**
     * Gets the "file" element
     */
    public org.globus.swift.language.Variable.File getFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.Variable.File target = null;
            target = (org.globus.swift.language.Variable.File)get_store().find_element_user(FILE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "file" element
     */
    public boolean isSetFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILE$0) != 0;
        }
    }
    
    /**
     * Sets the "file" element
     */
    public void setFile(org.globus.swift.language.Variable.File file)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.Variable.File target = null;
            target = (org.globus.swift.language.Variable.File)get_store().find_element_user(FILE$0, 0);
            if (target == null)
            {
                target = (org.globus.swift.language.Variable.File)get_store().add_element_user(FILE$0);
            }
            target.set(file);
        }
    }
    
    /**
     * Appends and returns a new empty "file" element
     */
    public org.globus.swift.language.Variable.File addNewFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.Variable.File target = null;
            target = (org.globus.swift.language.Variable.File)get_store().add_element_user(FILE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "file" element
     */
    public void unsetFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILE$0, 0);
        }
    }
    
    /**
     * Gets the "mapping" element
     */
    public org.globus.swift.language.Variable.Mapping getMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.Variable.Mapping target = null;
            target = (org.globus.swift.language.Variable.Mapping)get_store().find_element_user(MAPPING$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "mapping" element
     */
    public boolean isSetMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAPPING$2) != 0;
        }
    }
    
    /**
     * Sets the "mapping" element
     */
    public void setMapping(org.globus.swift.language.Variable.Mapping mapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.Variable.Mapping target = null;
            target = (org.globus.swift.language.Variable.Mapping)get_store().find_element_user(MAPPING$2, 0);
            if (target == null)
            {
                target = (org.globus.swift.language.Variable.Mapping)get_store().add_element_user(MAPPING$2);
            }
            target.set(mapping);
        }
    }
    
    /**
     * Appends and returns a new empty "mapping" element
     */
    public org.globus.swift.language.Variable.Mapping addNewMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.Variable.Mapping target = null;
            target = (org.globus.swift.language.Variable.Mapping)get_store().add_element_user(MAPPING$2);
            return target;
        }
    }
    
    /**
     * Unsets the "mapping" element
     */
    public void unsetMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAPPING$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
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
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NAME$4);
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
            return get_store().find_attribute_user(NAME$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$4);
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
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(NAME$4);
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
            get_store().remove_attribute(NAME$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
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
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(TYPE$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$6);
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
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(TYPE$6);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "isGlobal" attribute
     */
    public boolean getIsGlobal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISGLOBAL$8);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isGlobal" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsGlobal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISGLOBAL$8);
            return target;
        }
    }
    
    /**
     * True if has "isGlobal" attribute
     */
    public boolean isSetIsGlobal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISGLOBAL$8) != null;
        }
    }
    
    /**
     * Sets the "isGlobal" attribute
     */
    public void setIsGlobal(boolean isGlobal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISGLOBAL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISGLOBAL$8);
            }
            target.setBooleanValue(isGlobal);
        }
    }
    
    /**
     * Sets (as xml) the "isGlobal" attribute
     */
    public void xsetIsGlobal(org.apache.xmlbeans.XmlBoolean isGlobal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISGLOBAL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISGLOBAL$8);
            }
            target.set(isGlobal);
        }
    }
    
    /**
     * Unsets the "isGlobal" attribute
     */
    public void unsetIsGlobal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISGLOBAL$8);
        }
    }
    /**
     * An XML file(@http://ci.uchicago.edu/swift/2009/02/swiftscript).
     *
     * This is a complex type.
     */
    public static class FileImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.globus.swift.language.Variable.File
    {
        
        public FileImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
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
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
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
                return get_store().find_attribute_user(NAME$0) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$0);
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
                get_store().remove_attribute(NAME$0);
            }
        }
    }
    /**
     * An XML mapping(@http://ci.uchicago.edu/swift/2009/02/swiftscript).
     *
     * This is a complex type.
     */
    public static class MappingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.globus.swift.language.Variable.Mapping
    {
        
        public MappingImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARAM$0 = 
            new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "param");
        private static final javax.xml.namespace.QName DESCRIPTOR$2 = 
            new javax.xml.namespace.QName("", "descriptor");
        
        
        /**
         * Gets array of all "param" elements
         */
        public org.globus.swift.language.Variable.Mapping.Param[] getParamArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PARAM$0, targetList);
                org.globus.swift.language.Variable.Mapping.Param[] result = new org.globus.swift.language.Variable.Mapping.Param[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "param" element
         */
        public org.globus.swift.language.Variable.Mapping.Param getParamArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.Variable.Mapping.Param target = null;
                target = (org.globus.swift.language.Variable.Mapping.Param)get_store().find_element_user(PARAM$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "param" element
         */
        public int sizeOfParamArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PARAM$0);
            }
        }
        
        /**
         * Sets array of all "param" element
         */
        public void setParamArray(org.globus.swift.language.Variable.Mapping.Param[] paramArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(paramArray, PARAM$0);
            }
        }
        
        /**
         * Sets ith "param" element
         */
        public void setParamArray(int i, org.globus.swift.language.Variable.Mapping.Param param)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.Variable.Mapping.Param target = null;
                target = (org.globus.swift.language.Variable.Mapping.Param)get_store().find_element_user(PARAM$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(param);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "param" element
         */
        public org.globus.swift.language.Variable.Mapping.Param insertNewParam(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.Variable.Mapping.Param target = null;
                target = (org.globus.swift.language.Variable.Mapping.Param)get_store().insert_element_user(PARAM$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "param" element
         */
        public org.globus.swift.language.Variable.Mapping.Param addNewParam()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.Variable.Mapping.Param target = null;
                target = (org.globus.swift.language.Variable.Mapping.Param)get_store().add_element_user(PARAM$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "param" element
         */
        public void removeParam(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PARAM$0, i);
            }
        }
        
        /**
         * Gets the "descriptor" attribute
         */
        public java.lang.String getDescriptor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTOR$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "descriptor" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDescriptor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTOR$2);
                return target;
            }
        }
        
        /**
         * Sets the "descriptor" attribute
         */
        public void setDescriptor(java.lang.String descriptor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTOR$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTOR$2);
                }
                target.setStringValue(descriptor);
            }
        }
        
        /**
         * Sets (as xml) the "descriptor" attribute
         */
        public void xsetDescriptor(org.apache.xmlbeans.XmlString descriptor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTOR$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESCRIPTOR$2);
                }
                target.set(descriptor);
            }
        }
        /**
         * An XML param(@http://ci.uchicago.edu/swift/2009/02/swiftscript).
         *
         * This is a complex type.
         */
        public static class ParamImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.globus.swift.language.Variable.Mapping.Param
        {
            
            public ParamImpl(org.apache.xmlbeans.SchemaType sType)
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
        }
    }
}

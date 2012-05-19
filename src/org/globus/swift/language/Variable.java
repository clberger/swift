/*
 * XML Type:  Variable
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.Variable
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language;


/**
 * An XML Variable(@http://ci.uchicago.edu/swift/2009/02/swiftscript).
 *
 * This is a complex type.
 */
public interface Variable extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Variable.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4846B13C10E24B6C12C8DCBE3348DA75").resolveHandle("variableb0fctype");
    
    /**
     * Gets the "file" element
     */
    org.globus.swift.language.Variable.File getFile();
    
    /**
     * True if has "file" element
     */
    boolean isSetFile();
    
    /**
     * Sets the "file" element
     */
    void setFile(org.globus.swift.language.Variable.File file);
    
    /**
     * Appends and returns a new empty "file" element
     */
    org.globus.swift.language.Variable.File addNewFile();
    
    /**
     * Unsets the "file" element
     */
    void unsetFile();
    
    /**
     * Gets the "mapping" element
     */
    org.globus.swift.language.Variable.Mapping getMapping();
    
    /**
     * True if has "mapping" element
     */
    boolean isSetMapping();
    
    /**
     * Sets the "mapping" element
     */
    void setMapping(org.globus.swift.language.Variable.Mapping mapping);
    
    /**
     * Appends and returns a new empty "mapping" element
     */
    org.globus.swift.language.Variable.Mapping addNewMapping();
    
    /**
     * Unsets the "mapping" element
     */
    void unsetMapping();
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlNCName xgetName();
    
    /**
     * True if has "name" attribute
     */
    boolean isSetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlNCName name);
    
    /**
     * Unsets the "name" attribute
     */
    void unsetName();
    
    /**
     * Gets the "type" attribute
     */
    javax.xml.namespace.QName getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.apache.xmlbeans.XmlQName xgetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(javax.xml.namespace.QName type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.apache.xmlbeans.XmlQName type);
    
    /**
     * Gets the "isGlobal" attribute
     */
    boolean getIsGlobal();
    
    /**
     * Gets (as xml) the "isGlobal" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsGlobal();
    
    /**
     * True if has "isGlobal" attribute
     */
    boolean isSetIsGlobal();
    
    /**
     * Sets the "isGlobal" attribute
     */
    void setIsGlobal(boolean isGlobal);
    
    /**
     * Sets (as xml) the "isGlobal" attribute
     */
    void xsetIsGlobal(org.apache.xmlbeans.XmlBoolean isGlobal);
    
    /**
     * Unsets the "isGlobal" attribute
     */
    void unsetIsGlobal();
    
    /**
     * An XML file(@http://ci.uchicago.edu/swift/2009/02/swiftscript).
     *
     * This is a complex type.
     */
    public interface File extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(File.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4846B13C10E24B6C12C8DCBE3348DA75").resolveHandle("fileaf14elemtype");
        
        /**
         * Gets the "name" attribute
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * True if has "name" attribute
         */
        boolean isSetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Unsets the "name" attribute
         */
        void unsetName();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.globus.swift.language.Variable.File newInstance() {
              return (org.globus.swift.language.Variable.File) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.globus.swift.language.Variable.File newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.globus.swift.language.Variable.File) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML mapping(@http://ci.uchicago.edu/swift/2009/02/swiftscript).
     *
     * This is a complex type.
     */
    public interface Mapping extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Mapping.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4846B13C10E24B6C12C8DCBE3348DA75").resolveHandle("mapping4336elemtype");
        
        /**
         * Gets array of all "param" elements
         */
        org.globus.swift.language.Variable.Mapping.Param[] getParamArray();
        
        /**
         * Gets ith "param" element
         */
        org.globus.swift.language.Variable.Mapping.Param getParamArray(int i);
        
        /**
         * Returns number of "param" element
         */
        int sizeOfParamArray();
        
        /**
         * Sets array of all "param" element
         */
        void setParamArray(org.globus.swift.language.Variable.Mapping.Param[] paramArray);
        
        /**
         * Sets ith "param" element
         */
        void setParamArray(int i, org.globus.swift.language.Variable.Mapping.Param param);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "param" element
         */
        org.globus.swift.language.Variable.Mapping.Param insertNewParam(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "param" element
         */
        org.globus.swift.language.Variable.Mapping.Param addNewParam();
        
        /**
         * Removes the ith "param" element
         */
        void removeParam(int i);
        
        /**
         * Gets the "descriptor" attribute
         */
        java.lang.String getDescriptor();
        
        /**
         * Gets (as xml) the "descriptor" attribute
         */
        org.apache.xmlbeans.XmlString xgetDescriptor();
        
        /**
         * Sets the "descriptor" attribute
         */
        void setDescriptor(java.lang.String descriptor);
        
        /**
         * Sets (as xml) the "descriptor" attribute
         */
        void xsetDescriptor(org.apache.xmlbeans.XmlString descriptor);
        
        /**
         * An XML param(@http://ci.uchicago.edu/swift/2009/02/swiftscript).
         *
         * This is a complex type.
         */
        public interface Param extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Param.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4846B13C10E24B6C12C8DCBE3348DA75").resolveHandle("paramcb6felemtype");
            
            /**
             * Gets the "abstractExpression" element
             */
            org.apache.xmlbeans.XmlObject getAbstractExpression();
            
            /**
             * Sets the "abstractExpression" element
             */
            void setAbstractExpression(org.apache.xmlbeans.XmlObject abstractExpression);
            
            /**
             * Appends and returns a new empty "abstractExpression" element
             */
            org.apache.xmlbeans.XmlObject addNewAbstractExpression();
            
            /**
             * Gets the "name" attribute
             */
            java.lang.String getName();
            
            /**
             * Gets (as xml) the "name" attribute
             */
            org.apache.xmlbeans.XmlNMTOKEN xgetName();
            
            /**
             * Sets the "name" attribute
             */
            void setName(java.lang.String name);
            
            /**
             * Sets (as xml) the "name" attribute
             */
            void xsetName(org.apache.xmlbeans.XmlNMTOKEN name);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.globus.swift.language.Variable.Mapping.Param newInstance() {
                  return (org.globus.swift.language.Variable.Mapping.Param) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.globus.swift.language.Variable.Mapping.Param newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.globus.swift.language.Variable.Mapping.Param) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.globus.swift.language.Variable.Mapping newInstance() {
              return (org.globus.swift.language.Variable.Mapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.globus.swift.language.Variable.Mapping newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.globus.swift.language.Variable.Mapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.globus.swift.language.Variable newInstance() {
          return (org.globus.swift.language.Variable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.globus.swift.language.Variable newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.globus.swift.language.Variable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.globus.swift.language.Variable parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.globus.swift.language.Variable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.globus.swift.language.Variable parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.globus.swift.language.Variable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.globus.swift.language.Variable parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.Variable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.globus.swift.language.Variable parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.Variable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.globus.swift.language.Variable parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.Variable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.globus.swift.language.Variable parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.Variable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.globus.swift.language.Variable parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.Variable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.globus.swift.language.Variable parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.Variable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.globus.swift.language.Variable parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.Variable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.globus.swift.language.Variable parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.Variable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.globus.swift.language.Variable parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.globus.swift.language.Variable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.globus.swift.language.Variable parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.globus.swift.language.Variable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.globus.swift.language.Variable parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.globus.swift.language.Variable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.globus.swift.language.Variable parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.globus.swift.language.Variable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.globus.swift.language.Variable parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.globus.swift.language.Variable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.globus.swift.language.Variable parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.globus.swift.language.Variable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

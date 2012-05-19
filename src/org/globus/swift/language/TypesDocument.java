/*
 * An XML document type.
 * Localname: types
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.TypesDocument
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language;


/**
 * A document containing one types(@http://ci.uchicago.edu/swift/2009/02/swiftscript) element.
 *
 * This is a complex type.
 */
public interface TypesDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TypesDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4846B13C10E24B6C12C8DCBE3348DA75").resolveHandle("typesbac1doctype");
    
    /**
     * Gets the "types" element
     */
    org.globus.swift.language.TypesDocument.Types getTypes();
    
    /**
     * Sets the "types" element
     */
    void setTypes(org.globus.swift.language.TypesDocument.Types types);
    
    /**
     * Appends and returns a new empty "types" element
     */
    org.globus.swift.language.TypesDocument.Types addNewTypes();
    
    /**
     * An XML types(@http://ci.uchicago.edu/swift/2009/02/swiftscript).
     *
     * This is a complex type.
     */
    public interface Types extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Types.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4846B13C10E24B6C12C8DCBE3348DA75").resolveHandle("types3b7celemtype");
        
        /**
         * Gets array of all "type" elements
         */
        org.globus.swift.language.TypesDocument.Types.Type[] getTypeArray();
        
        /**
         * Gets ith "type" element
         */
        org.globus.swift.language.TypesDocument.Types.Type getTypeArray(int i);
        
        /**
         * Returns number of "type" element
         */
        int sizeOfTypeArray();
        
        /**
         * Sets array of all "type" element
         */
        void setTypeArray(org.globus.swift.language.TypesDocument.Types.Type[] typeArray);
        
        /**
         * Sets ith "type" element
         */
        void setTypeArray(int i, org.globus.swift.language.TypesDocument.Types.Type type);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "type" element
         */
        org.globus.swift.language.TypesDocument.Types.Type insertNewType(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "type" element
         */
        org.globus.swift.language.TypesDocument.Types.Type addNewType();
        
        /**
         * Removes the ith "type" element
         */
        void removeType(int i);
        
        /**
         * An XML type(@http://ci.uchicago.edu/swift/2009/02/swiftscript).
         *
         * This is a complex type.
         */
        public interface Type extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4846B13C10E24B6C12C8DCBE3348DA75").resolveHandle("typeda66elemtype");
            
            /**
             * Gets the "typename" element
             */
            java.lang.String getTypename();
            
            /**
             * Gets (as xml) the "typename" element
             */
            org.apache.xmlbeans.XmlString xgetTypename();
            
            /**
             * Sets the "typename" element
             */
            void setTypename(java.lang.String typename);
            
            /**
             * Sets (as xml) the "typename" element
             */
            void xsetTypename(org.apache.xmlbeans.XmlString typename);
            
            /**
             * Gets the "typealias" element
             */
            java.lang.String getTypealias();
            
            /**
             * Gets (as xml) the "typealias" element
             */
            org.apache.xmlbeans.XmlString xgetTypealias();
            
            /**
             * Sets the "typealias" element
             */
            void setTypealias(java.lang.String typealias);
            
            /**
             * Sets (as xml) the "typealias" element
             */
            void xsetTypealias(org.apache.xmlbeans.XmlString typealias);
            
            /**
             * Gets the "typestructure" element
             */
            org.globus.swift.language.TypeStructure getTypestructure();
            
            /**
             * Sets the "typestructure" element
             */
            void setTypestructure(org.globus.swift.language.TypeStructure typestructure);
            
            /**
             * Appends and returns a new empty "typestructure" element
             */
            org.globus.swift.language.TypeStructure addNewTypestructure();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.globus.swift.language.TypesDocument.Types.Type newInstance() {
                  return (org.globus.swift.language.TypesDocument.Types.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.globus.swift.language.TypesDocument.Types.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.globus.swift.language.TypesDocument.Types.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.globus.swift.language.TypesDocument.Types newInstance() {
              return (org.globus.swift.language.TypesDocument.Types) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.globus.swift.language.TypesDocument.Types newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.globus.swift.language.TypesDocument.Types) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.globus.swift.language.TypesDocument newInstance() {
          return (org.globus.swift.language.TypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.globus.swift.language.TypesDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.globus.swift.language.TypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.globus.swift.language.TypesDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.globus.swift.language.TypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.globus.swift.language.TypesDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.globus.swift.language.TypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.globus.swift.language.TypesDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.TypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.globus.swift.language.TypesDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.TypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.globus.swift.language.TypesDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.TypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.globus.swift.language.TypesDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.TypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.globus.swift.language.TypesDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.TypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.globus.swift.language.TypesDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.TypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.globus.swift.language.TypesDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.TypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.globus.swift.language.TypesDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.TypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.globus.swift.language.TypesDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.globus.swift.language.TypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.globus.swift.language.TypesDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.globus.swift.language.TypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.globus.swift.language.TypesDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.globus.swift.language.TypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.globus.swift.language.TypesDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.globus.swift.language.TypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.globus.swift.language.TypesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.globus.swift.language.TypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.globus.swift.language.TypesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.globus.swift.language.TypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

/*
 * XML Type:  Profile
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.Profile
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language;


/**
 * An XML Profile(@http://ci.uchicago.edu/swift/2009/02/swiftscript).
 *
 * This is a complex type.
 */
public interface Profile extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Profile.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4846B13C10E24B6C12C8DCBE3348DA75").resolveHandle("profiledb61type");
    
    /**
     * Gets array of all "function" elements
     */
    org.globus.swift.language.Function[] getFunctionArray();
    
    /**
     * Gets ith "function" element
     */
    org.globus.swift.language.Function getFunctionArray(int i);
    
    /**
     * Returns number of "function" element
     */
    int sizeOfFunctionArray();
    
    /**
     * Sets array of all "function" element
     */
    void setFunctionArray(org.globus.swift.language.Function[] functionArray);
    
    /**
     * Sets ith "function" element
     */
    void setFunctionArray(int i, org.globus.swift.language.Function function);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "function" element
     */
    org.globus.swift.language.Function insertNewFunction(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "function" element
     */
    org.globus.swift.language.Function addNewFunction();
    
    /**
     * Removes the ith "function" element
     */
    void removeFunction(int i);
    
    /**
     * Gets the "namespace" attribute
     */
    java.lang.String getNamespace();
    
    /**
     * Gets (as xml) the "namespace" attribute
     */
    org.apache.xmlbeans.XmlNMTOKEN xgetNamespace();
    
    /**
     * True if has "namespace" attribute
     */
    boolean isSetNamespace();
    
    /**
     * Sets the "namespace" attribute
     */
    void setNamespace(java.lang.String namespace);
    
    /**
     * Sets (as xml) the "namespace" attribute
     */
    void xsetNamespace(org.apache.xmlbeans.XmlNMTOKEN namespace);
    
    /**
     * Unsets the "namespace" attribute
     */
    void unsetNamespace();
    
    /**
     * Gets the "key" attribute
     */
    java.lang.String getKey();
    
    /**
     * Gets (as xml) the "key" attribute
     */
    org.apache.xmlbeans.XmlNMTOKEN xgetKey();
    
    /**
     * Sets the "key" attribute
     */
    void setKey(java.lang.String key);
    
    /**
     * Sets (as xml) the "key" attribute
     */
    void xsetKey(org.apache.xmlbeans.XmlNMTOKEN key);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.globus.swift.language.Profile newInstance() {
          return (org.globus.swift.language.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.globus.swift.language.Profile newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.globus.swift.language.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.globus.swift.language.Profile parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.globus.swift.language.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.globus.swift.language.Profile parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.globus.swift.language.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.globus.swift.language.Profile parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.globus.swift.language.Profile parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.globus.swift.language.Profile parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.globus.swift.language.Profile parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.globus.swift.language.Profile parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.globus.swift.language.Profile parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.globus.swift.language.Profile parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.globus.swift.language.Profile parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.globus.swift.language.Profile parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.globus.swift.language.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.globus.swift.language.Profile parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.globus.swift.language.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.globus.swift.language.Profile parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.globus.swift.language.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.globus.swift.language.Profile parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.globus.swift.language.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.globus.swift.language.Profile parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.globus.swift.language.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.globus.swift.language.Profile parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.globus.swift.language.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

/*
 * XML Type:  Procedure
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.Procedure
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language;


/**
 * An XML Procedure(@http://ci.uchicago.edu/swift/2009/02/swiftscript).
 *
 * This is a complex type.
 */
public interface Procedure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Procedure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4846B13C10E24B6C12C8DCBE3348DA75").resolveHandle("procedure8537type");
    
    /**
     * Gets array of all "output" elements
     */
    org.globus.swift.language.FormalParameter[] getOutputArray();
    
    /**
     * Gets ith "output" element
     */
    org.globus.swift.language.FormalParameter getOutputArray(int i);
    
    /**
     * Tests for nil ith "output" element
     */
    boolean isNilOutputArray(int i);
    
    /**
     * Returns number of "output" element
     */
    int sizeOfOutputArray();
    
    /**
     * Sets array of all "output" element
     */
    void setOutputArray(org.globus.swift.language.FormalParameter[] outputArray);
    
    /**
     * Sets ith "output" element
     */
    void setOutputArray(int i, org.globus.swift.language.FormalParameter output);
    
    /**
     * Nils the ith "output" element
     */
    void setNilOutputArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "output" element
     */
    org.globus.swift.language.FormalParameter insertNewOutput(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "output" element
     */
    org.globus.swift.language.FormalParameter addNewOutput();
    
    /**
     * Removes the ith "output" element
     */
    void removeOutput(int i);
    
    /**
     * Gets array of all "input" elements
     */
    org.globus.swift.language.FormalParameter[] getInputArray();
    
    /**
     * Gets ith "input" element
     */
    org.globus.swift.language.FormalParameter getInputArray(int i);
    
    /**
     * Tests for nil ith "input" element
     */
    boolean isNilInputArray(int i);
    
    /**
     * Returns number of "input" element
     */
    int sizeOfInputArray();
    
    /**
     * Sets array of all "input" element
     */
    void setInputArray(org.globus.swift.language.FormalParameter[] inputArray);
    
    /**
     * Sets ith "input" element
     */
    void setInputArray(int i, org.globus.swift.language.FormalParameter input);
    
    /**
     * Nils the ith "input" element
     */
    void setNilInputArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "input" element
     */
    org.globus.swift.language.FormalParameter insertNewInput(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "input" element
     */
    org.globus.swift.language.FormalParameter addNewInput();
    
    /**
     * Removes the ith "input" element
     */
    void removeInput(int i);
    
    /**
     * Gets the "binding" element
     */
    org.globus.swift.language.Binding getBinding();
    
    /**
     * True if has "binding" element
     */
    boolean isSetBinding();
    
    /**
     * Sets the "binding" element
     */
    void setBinding(org.globus.swift.language.Binding binding);
    
    /**
     * Appends and returns a new empty "binding" element
     */
    org.globus.swift.language.Binding addNewBinding();
    
    /**
     * Unsets the "binding" element
     */
    void unsetBinding();
    
    /**
     * Gets array of all "variable" elements
     */
    org.globus.swift.language.Variable[] getVariableArray();
    
    /**
     * Gets ith "variable" element
     */
    org.globus.swift.language.Variable getVariableArray(int i);
    
    /**
     * Tests for nil ith "variable" element
     */
    boolean isNilVariableArray(int i);
    
    /**
     * Returns number of "variable" element
     */
    int sizeOfVariableArray();
    
    /**
     * Sets array of all "variable" element
     */
    void setVariableArray(org.globus.swift.language.Variable[] variableArray);
    
    /**
     * Sets ith "variable" element
     */
    void setVariableArray(int i, org.globus.swift.language.Variable variable);
    
    /**
     * Nils the ith "variable" element
     */
    void setNilVariableArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "variable" element
     */
    org.globus.swift.language.Variable insertNewVariable(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "variable" element
     */
    org.globus.swift.language.Variable addNewVariable();
    
    /**
     * Removes the ith "variable" element
     */
    void removeVariable(int i);
    
    /**
     * Gets array of all "assign" elements
     */
    org.globus.swift.language.Assign[] getAssignArray();
    
    /**
     * Gets ith "assign" element
     */
    org.globus.swift.language.Assign getAssignArray(int i);
    
    /**
     * Returns number of "assign" element
     */
    int sizeOfAssignArray();
    
    /**
     * Sets array of all "assign" element
     */
    void setAssignArray(org.globus.swift.language.Assign[] assignArray);
    
    /**
     * Sets ith "assign" element
     */
    void setAssignArray(int i, org.globus.swift.language.Assign assign);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "assign" element
     */
    org.globus.swift.language.Assign insertNewAssign(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "assign" element
     */
    org.globus.swift.language.Assign addNewAssign();
    
    /**
     * Removes the ith "assign" element
     */
    void removeAssign(int i);
    
    /**
     * Gets array of all "call" elements
     */
    org.globus.swift.language.Call[] getCallArray();
    
    /**
     * Gets ith "call" element
     */
    org.globus.swift.language.Call getCallArray(int i);
    
    /**
     * Returns number of "call" element
     */
    int sizeOfCallArray();
    
    /**
     * Sets array of all "call" element
     */
    void setCallArray(org.globus.swift.language.Call[] callArray);
    
    /**
     * Sets ith "call" element
     */
    void setCallArray(int i, org.globus.swift.language.Call call);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "call" element
     */
    org.globus.swift.language.Call insertNewCall(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "call" element
     */
    org.globus.swift.language.Call addNewCall();
    
    /**
     * Removes the ith "call" element
     */
    void removeCall(int i);
    
    /**
     * Gets array of all "foreach" elements
     */
    org.globus.swift.language.Foreach[] getForeachArray();
    
    /**
     * Gets ith "foreach" element
     */
    org.globus.swift.language.Foreach getForeachArray(int i);
    
    /**
     * Returns number of "foreach" element
     */
    int sizeOfForeachArray();
    
    /**
     * Sets array of all "foreach" element
     */
    void setForeachArray(org.globus.swift.language.Foreach[] foreachArray);
    
    /**
     * Sets ith "foreach" element
     */
    void setForeachArray(int i, org.globus.swift.language.Foreach foreach);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "foreach" element
     */
    org.globus.swift.language.Foreach insertNewForeach(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "foreach" element
     */
    org.globus.swift.language.Foreach addNewForeach();
    
    /**
     * Removes the ith "foreach" element
     */
    void removeForeach(int i);
    
    /**
     * Gets array of all "if" elements
     */
    org.globus.swift.language.If[] getIfArray();
    
    /**
     * Gets ith "if" element
     */
    org.globus.swift.language.If getIfArray(int i);
    
    /**
     * Returns number of "if" element
     */
    int sizeOfIfArray();
    
    /**
     * Sets array of all "if" element
     */
    void setIfArray(org.globus.swift.language.If[] xifArray);
    
    /**
     * Sets ith "if" element
     */
    void setIfArray(int i, org.globus.swift.language.If xif);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "if" element
     */
    org.globus.swift.language.If insertNewIf(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "if" element
     */
    org.globus.swift.language.If addNewIf();
    
    /**
     * Removes the ith "if" element
     */
    void removeIf(int i);
    
    /**
     * Gets array of all "switch" elements
     */
    org.globus.swift.language.Switch[] getSwitchArray();
    
    /**
     * Gets ith "switch" element
     */
    org.globus.swift.language.Switch getSwitchArray(int i);
    
    /**
     * Returns number of "switch" element
     */
    int sizeOfSwitchArray();
    
    /**
     * Sets array of all "switch" element
     */
    void setSwitchArray(org.globus.swift.language.Switch[] xswitchArray);
    
    /**
     * Sets ith "switch" element
     */
    void setSwitchArray(int i, org.globus.swift.language.Switch xswitch);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "switch" element
     */
    org.globus.swift.language.Switch insertNewSwitch(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "switch" element
     */
    org.globus.swift.language.Switch addNewSwitch();
    
    /**
     * Removes the ith "switch" element
     */
    void removeSwitch(int i);
    
    /**
     * Gets array of all "iterate" elements
     */
    org.globus.swift.language.Iterate[] getIterateArray();
    
    /**
     * Gets ith "iterate" element
     */
    org.globus.swift.language.Iterate getIterateArray(int i);
    
    /**
     * Returns number of "iterate" element
     */
    int sizeOfIterateArray();
    
    /**
     * Sets array of all "iterate" element
     */
    void setIterateArray(org.globus.swift.language.Iterate[] iterateArray);
    
    /**
     * Sets ith "iterate" element
     */
    void setIterateArray(int i, org.globus.swift.language.Iterate iterate);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "iterate" element
     */
    org.globus.swift.language.Iterate insertNewIterate(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "iterate" element
     */
    org.globus.swift.language.Iterate addNewIterate();
    
    /**
     * Removes the ith "iterate" element
     */
    void removeIterate(int i);
    
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
     * Gets the "src" attribute
     */
    java.lang.String getSrc();
    
    /**
     * Gets (as xml) the "src" attribute
     */
    org.apache.xmlbeans.XmlString xgetSrc();
    
    /**
     * True if has "src" attribute
     */
    boolean isSetSrc();
    
    /**
     * Sets the "src" attribute
     */
    void setSrc(java.lang.String src);
    
    /**
     * Sets (as xml) the "src" attribute
     */
    void xsetSrc(org.apache.xmlbeans.XmlString src);
    
    /**
     * Unsets the "src" attribute
     */
    void unsetSrc();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.globus.swift.language.Procedure newInstance() {
          return (org.globus.swift.language.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.globus.swift.language.Procedure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.globus.swift.language.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.globus.swift.language.Procedure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.globus.swift.language.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.globus.swift.language.Procedure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.globus.swift.language.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.globus.swift.language.Procedure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.globus.swift.language.Procedure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.globus.swift.language.Procedure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.globus.swift.language.Procedure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.globus.swift.language.Procedure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.globus.swift.language.Procedure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.globus.swift.language.Procedure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.globus.swift.language.Procedure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.globus.swift.language.Procedure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.globus.swift.language.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.globus.swift.language.Procedure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.globus.swift.language.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.globus.swift.language.Procedure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.globus.swift.language.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.globus.swift.language.Procedure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.globus.swift.language.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.globus.swift.language.Procedure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.globus.swift.language.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.globus.swift.language.Procedure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.globus.swift.language.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

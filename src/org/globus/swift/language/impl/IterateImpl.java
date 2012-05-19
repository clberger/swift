/*
 * XML Type:  Iterate
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.Iterate
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language.impl;
/**
 * An XML Iterate(@http://ci.uchicago.edu/swift/2009/02/swiftscript).
 *
 * This is a complex type.
 */
public class IterateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.globus.swift.language.Iterate
{
    
    public IterateImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BODY$0 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "body");
    private static final javax.xml.namespace.QName ABSTRACTEXPRESSION$2 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "abstractExpression");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTEXPRESSION$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
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
    private static final javax.xml.namespace.QName VAR$4 = 
        new javax.xml.namespace.QName("", "var");
    
    
    /**
     * Gets the "body" element
     */
    public org.globus.swift.language.Iterate.Body getBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.Iterate.Body target = null;
            target = (org.globus.swift.language.Iterate.Body)get_store().find_element_user(BODY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "body" element
     */
    public void setBody(org.globus.swift.language.Iterate.Body body)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.Iterate.Body target = null;
            target = (org.globus.swift.language.Iterate.Body)get_store().find_element_user(BODY$0, 0);
            if (target == null)
            {
                target = (org.globus.swift.language.Iterate.Body)get_store().add_element_user(BODY$0);
            }
            target.set(body);
        }
    }
    
    /**
     * Appends and returns a new empty "body" element
     */
    public org.globus.swift.language.Iterate.Body addNewBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.Iterate.Body target = null;
            target = (org.globus.swift.language.Iterate.Body)get_store().add_element_user(BODY$0);
            return target;
        }
    }
    
    /**
     * Gets the "abstractExpression" element
     */
    public org.apache.xmlbeans.XmlObject getAbstractExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ABSTRACTEXPRESSION$3, 0);
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
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ABSTRACTEXPRESSION$3, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ABSTRACTEXPRESSION$2);
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
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ABSTRACTEXPRESSION$2);
            return target;
        }
    }
    
    /**
     * Gets the "var" attribute
     */
    public java.lang.String getVar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VAR$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "var" attribute
     */
    public org.apache.xmlbeans.XmlNMTOKEN xgetVar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(VAR$4);
            return target;
        }
    }
    
    /**
     * True if has "var" attribute
     */
    public boolean isSetVar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VAR$4) != null;
        }
    }
    
    /**
     * Sets the "var" attribute
     */
    public void setVar(java.lang.String var)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VAR$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VAR$4);
            }
            target.setStringValue(var);
        }
    }
    
    /**
     * Sets (as xml) the "var" attribute
     */
    public void xsetVar(org.apache.xmlbeans.XmlNMTOKEN var)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(VAR$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(VAR$4);
            }
            target.set(var);
        }
    }
    
    /**
     * Unsets the "var" attribute
     */
    public void unsetVar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VAR$4);
        }
    }
    /**
     * An XML body(@http://ci.uchicago.edu/swift/2009/02/swiftscript).
     *
     * This is a complex type.
     */
    public static class BodyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.globus.swift.language.Iterate.Body
    {
        
        public BodyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VARIABLE$0 = 
            new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "variable");
        private static final javax.xml.namespace.QName ASSIGN$2 = 
            new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "assign");
        private static final javax.xml.namespace.QName CALL$4 = 
            new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "call");
        private static final javax.xml.namespace.QName FOREACH$6 = 
            new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "foreach");
        private static final javax.xml.namespace.QName IF$8 = 
            new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "if");
        private static final javax.xml.namespace.QName SWITCH$10 = 
            new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "switch");
        private static final javax.xml.namespace.QName ITERATE$12 = 
            new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "iterate");
        
        
        /**
         * Gets array of all "variable" elements
         */
        public org.globus.swift.language.Variable[] getVariableArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VARIABLE$0, targetList);
                org.globus.swift.language.Variable[] result = new org.globus.swift.language.Variable[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "variable" element
         */
        public org.globus.swift.language.Variable getVariableArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.Variable target = null;
                target = (org.globus.swift.language.Variable)get_store().find_element_user(VARIABLE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Tests for nil ith "variable" element
         */
        public boolean isNilVariableArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.Variable target = null;
                target = (org.globus.swift.language.Variable)get_store().find_element_user(VARIABLE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "variable" element
         */
        public int sizeOfVariableArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VARIABLE$0);
            }
        }
        
        /**
         * Sets array of all "variable" element
         */
        public void setVariableArray(org.globus.swift.language.Variable[] variableArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(variableArray, VARIABLE$0);
            }
        }
        
        /**
         * Sets ith "variable" element
         */
        public void setVariableArray(int i, org.globus.swift.language.Variable variable)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.Variable target = null;
                target = (org.globus.swift.language.Variable)get_store().find_element_user(VARIABLE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(variable);
            }
        }
        
        /**
         * Nils the ith "variable" element
         */
        public void setNilVariableArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.Variable target = null;
                target = (org.globus.swift.language.Variable)get_store().find_element_user(VARIABLE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "variable" element
         */
        public org.globus.swift.language.Variable insertNewVariable(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.Variable target = null;
                target = (org.globus.swift.language.Variable)get_store().insert_element_user(VARIABLE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "variable" element
         */
        public org.globus.swift.language.Variable addNewVariable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.Variable target = null;
                target = (org.globus.swift.language.Variable)get_store().add_element_user(VARIABLE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "variable" element
         */
        public void removeVariable(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VARIABLE$0, i);
            }
        }
        
        /**
         * Gets array of all "assign" elements
         */
        public org.globus.swift.language.Assign[] getAssignArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ASSIGN$2, targetList);
                org.globus.swift.language.Assign[] result = new org.globus.swift.language.Assign[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "assign" element
         */
        public org.globus.swift.language.Assign getAssignArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.Assign target = null;
                target = (org.globus.swift.language.Assign)get_store().find_element_user(ASSIGN$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "assign" element
         */
        public int sizeOfAssignArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ASSIGN$2);
            }
        }
        
        /**
         * Sets array of all "assign" element
         */
        public void setAssignArray(org.globus.swift.language.Assign[] assignArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(assignArray, ASSIGN$2);
            }
        }
        
        /**
         * Sets ith "assign" element
         */
        public void setAssignArray(int i, org.globus.swift.language.Assign assign)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.Assign target = null;
                target = (org.globus.swift.language.Assign)get_store().find_element_user(ASSIGN$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(assign);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "assign" element
         */
        public org.globus.swift.language.Assign insertNewAssign(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.Assign target = null;
                target = (org.globus.swift.language.Assign)get_store().insert_element_user(ASSIGN$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "assign" element
         */
        public org.globus.swift.language.Assign addNewAssign()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.Assign target = null;
                target = (org.globus.swift.language.Assign)get_store().add_element_user(ASSIGN$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "assign" element
         */
        public void removeAssign(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ASSIGN$2, i);
            }
        }
        
        /**
         * Gets array of all "call" elements
         */
        public org.globus.swift.language.Call[] getCallArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CALL$4, targetList);
                org.globus.swift.language.Call[] result = new org.globus.swift.language.Call[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "call" element
         */
        public org.globus.swift.language.Call getCallArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.Call target = null;
                target = (org.globus.swift.language.Call)get_store().find_element_user(CALL$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "call" element
         */
        public int sizeOfCallArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CALL$4);
            }
        }
        
        /**
         * Sets array of all "call" element
         */
        public void setCallArray(org.globus.swift.language.Call[] callArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(callArray, CALL$4);
            }
        }
        
        /**
         * Sets ith "call" element
         */
        public void setCallArray(int i, org.globus.swift.language.Call call)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.Call target = null;
                target = (org.globus.swift.language.Call)get_store().find_element_user(CALL$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(call);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "call" element
         */
        public org.globus.swift.language.Call insertNewCall(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.Call target = null;
                target = (org.globus.swift.language.Call)get_store().insert_element_user(CALL$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "call" element
         */
        public org.globus.swift.language.Call addNewCall()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.Call target = null;
                target = (org.globus.swift.language.Call)get_store().add_element_user(CALL$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "call" element
         */
        public void removeCall(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CALL$4, i);
            }
        }
        
        /**
         * Gets array of all "foreach" elements
         */
        public org.globus.swift.language.Foreach[] getForeachArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FOREACH$6, targetList);
                org.globus.swift.language.Foreach[] result = new org.globus.swift.language.Foreach[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "foreach" element
         */
        public org.globus.swift.language.Foreach getForeachArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.Foreach target = null;
                target = (org.globus.swift.language.Foreach)get_store().find_element_user(FOREACH$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "foreach" element
         */
        public int sizeOfForeachArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FOREACH$6);
            }
        }
        
        /**
         * Sets array of all "foreach" element
         */
        public void setForeachArray(org.globus.swift.language.Foreach[] foreachArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(foreachArray, FOREACH$6);
            }
        }
        
        /**
         * Sets ith "foreach" element
         */
        public void setForeachArray(int i, org.globus.swift.language.Foreach foreach)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.Foreach target = null;
                target = (org.globus.swift.language.Foreach)get_store().find_element_user(FOREACH$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(foreach);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "foreach" element
         */
        public org.globus.swift.language.Foreach insertNewForeach(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.Foreach target = null;
                target = (org.globus.swift.language.Foreach)get_store().insert_element_user(FOREACH$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "foreach" element
         */
        public org.globus.swift.language.Foreach addNewForeach()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.Foreach target = null;
                target = (org.globus.swift.language.Foreach)get_store().add_element_user(FOREACH$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "foreach" element
         */
        public void removeForeach(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FOREACH$6, i);
            }
        }
        
        /**
         * Gets array of all "if" elements
         */
        public org.globus.swift.language.If[] getIfArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(IF$8, targetList);
                org.globus.swift.language.If[] result = new org.globus.swift.language.If[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "if" element
         */
        public org.globus.swift.language.If getIfArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.If target = null;
                target = (org.globus.swift.language.If)get_store().find_element_user(IF$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "if" element
         */
        public int sizeOfIfArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IF$8);
            }
        }
        
        /**
         * Sets array of all "if" element
         */
        public void setIfArray(org.globus.swift.language.If[] xifArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(xifArray, IF$8);
            }
        }
        
        /**
         * Sets ith "if" element
         */
        public void setIfArray(int i, org.globus.swift.language.If xif)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.If target = null;
                target = (org.globus.swift.language.If)get_store().find_element_user(IF$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(xif);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "if" element
         */
        public org.globus.swift.language.If insertNewIf(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.If target = null;
                target = (org.globus.swift.language.If)get_store().insert_element_user(IF$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "if" element
         */
        public org.globus.swift.language.If addNewIf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.If target = null;
                target = (org.globus.swift.language.If)get_store().add_element_user(IF$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "if" element
         */
        public void removeIf(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IF$8, i);
            }
        }
        
        /**
         * Gets array of all "switch" elements
         */
        public org.globus.swift.language.Switch[] getSwitchArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SWITCH$10, targetList);
                org.globus.swift.language.Switch[] result = new org.globus.swift.language.Switch[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "switch" element
         */
        public org.globus.swift.language.Switch getSwitchArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.Switch target = null;
                target = (org.globus.swift.language.Switch)get_store().find_element_user(SWITCH$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "switch" element
         */
        public int sizeOfSwitchArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SWITCH$10);
            }
        }
        
        /**
         * Sets array of all "switch" element
         */
        public void setSwitchArray(org.globus.swift.language.Switch[] xswitchArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(xswitchArray, SWITCH$10);
            }
        }
        
        /**
         * Sets ith "switch" element
         */
        public void setSwitchArray(int i, org.globus.swift.language.Switch xswitch)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.Switch target = null;
                target = (org.globus.swift.language.Switch)get_store().find_element_user(SWITCH$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(xswitch);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "switch" element
         */
        public org.globus.swift.language.Switch insertNewSwitch(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.Switch target = null;
                target = (org.globus.swift.language.Switch)get_store().insert_element_user(SWITCH$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "switch" element
         */
        public org.globus.swift.language.Switch addNewSwitch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.Switch target = null;
                target = (org.globus.swift.language.Switch)get_store().add_element_user(SWITCH$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "switch" element
         */
        public void removeSwitch(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SWITCH$10, i);
            }
        }
        
        /**
         * Gets array of all "iterate" elements
         */
        public org.globus.swift.language.Iterate[] getIterateArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ITERATE$12, targetList);
                org.globus.swift.language.Iterate[] result = new org.globus.swift.language.Iterate[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "iterate" element
         */
        public org.globus.swift.language.Iterate getIterateArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.Iterate target = null;
                target = (org.globus.swift.language.Iterate)get_store().find_element_user(ITERATE$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "iterate" element
         */
        public int sizeOfIterateArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ITERATE$12);
            }
        }
        
        /**
         * Sets array of all "iterate" element
         */
        public void setIterateArray(org.globus.swift.language.Iterate[] iterateArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(iterateArray, ITERATE$12);
            }
        }
        
        /**
         * Sets ith "iterate" element
         */
        public void setIterateArray(int i, org.globus.swift.language.Iterate iterate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.Iterate target = null;
                target = (org.globus.swift.language.Iterate)get_store().find_element_user(ITERATE$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(iterate);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "iterate" element
         */
        public org.globus.swift.language.Iterate insertNewIterate(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.Iterate target = null;
                target = (org.globus.swift.language.Iterate)get_store().insert_element_user(ITERATE$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "iterate" element
         */
        public org.globus.swift.language.Iterate addNewIterate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.Iterate target = null;
                target = (org.globus.swift.language.Iterate)get_store().add_element_user(ITERATE$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "iterate" element
         */
        public void removeIterate(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ITERATE$12, i);
            }
        }
    }
}

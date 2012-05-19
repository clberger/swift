/*
 * An XML document type.
 * Localname: program
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.ProgramDocument
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language.impl;
/**
 * A document containing one program(@http://ci.uchicago.edu/swift/2009/02/swiftscript) element.
 *
 * This is a complex type.
 */
public class ProgramDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.globus.swift.language.ProgramDocument
{
    
    public ProgramDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROGRAM$0 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "program");
    
    
    /**
     * Gets the "program" element
     */
    public org.globus.swift.language.ProgramDocument.Program getProgram()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.ProgramDocument.Program target = null;
            target = (org.globus.swift.language.ProgramDocument.Program)get_store().find_element_user(PROGRAM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "program" element
     */
    public void setProgram(org.globus.swift.language.ProgramDocument.Program program)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.ProgramDocument.Program target = null;
            target = (org.globus.swift.language.ProgramDocument.Program)get_store().find_element_user(PROGRAM$0, 0);
            if (target == null)
            {
                target = (org.globus.swift.language.ProgramDocument.Program)get_store().add_element_user(PROGRAM$0);
            }
            target.set(program);
        }
    }
    
    /**
     * Appends and returns a new empty "program" element
     */
    public org.globus.swift.language.ProgramDocument.Program addNewProgram()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.ProgramDocument.Program target = null;
            target = (org.globus.swift.language.ProgramDocument.Program)get_store().add_element_user(PROGRAM$0);
            return target;
        }
    }
    /**
     * An XML program(@http://ci.uchicago.edu/swift/2009/02/swiftscript).
     *
     * This is a complex type.
     */
    public static class ProgramImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.globus.swift.language.ProgramDocument.Program
    {
        
        public ProgramImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IMPORTS$0 = 
            new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "imports");
        private static final javax.xml.namespace.QName TYPES$2 = 
            new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "types");
        private static final javax.xml.namespace.QName PROCEDURE$4 = 
            new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "procedure");
        private static final javax.xml.namespace.QName VARIABLE$6 = 
            new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "variable");
        private static final javax.xml.namespace.QName ASSIGN$8 = 
            new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "assign");
        private static final javax.xml.namespace.QName CALL$10 = 
            new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "call");
        private static final javax.xml.namespace.QName FOREACH$12 = 
            new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "foreach");
        private static final javax.xml.namespace.QName IF$14 = 
            new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "if");
        private static final javax.xml.namespace.QName SWITCH$16 = 
            new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "switch");
        private static final javax.xml.namespace.QName ITERATE$18 = 
            new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "iterate");
        private static final javax.xml.namespace.QName TARGETNAMESPACE$20 = 
            new javax.xml.namespace.QName("", "targetNamespace");
        
        
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
         * True if has "imports" element
         */
        public boolean isSetImports()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IMPORTS$0) != 0;
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
         * Unsets the "imports" element
         */
        public void unsetImports()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IMPORTS$0, 0);
            }
        }
        
        /**
         * Gets the "types" element
         */
        public org.globus.swift.language.TypesDocument.Types getTypes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.TypesDocument.Types target = null;
                target = (org.globus.swift.language.TypesDocument.Types)get_store().find_element_user(TYPES$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "types" element
         */
        public boolean isSetTypes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TYPES$2) != 0;
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
                target = (org.globus.swift.language.TypesDocument.Types)get_store().find_element_user(TYPES$2, 0);
                if (target == null)
                {
                    target = (org.globus.swift.language.TypesDocument.Types)get_store().add_element_user(TYPES$2);
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
                target = (org.globus.swift.language.TypesDocument.Types)get_store().add_element_user(TYPES$2);
                return target;
            }
        }
        
        /**
         * Unsets the "types" element
         */
        public void unsetTypes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TYPES$2, 0);
            }
        }
        
        /**
         * Gets array of all "procedure" elements
         */
        public org.globus.swift.language.Procedure[] getProcedureArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PROCEDURE$4, targetList);
                org.globus.swift.language.Procedure[] result = new org.globus.swift.language.Procedure[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "procedure" element
         */
        public org.globus.swift.language.Procedure getProcedureArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.Procedure target = null;
                target = (org.globus.swift.language.Procedure)get_store().find_element_user(PROCEDURE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "procedure" element
         */
        public int sizeOfProcedureArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROCEDURE$4);
            }
        }
        
        /**
         * Sets array of all "procedure" element
         */
        public void setProcedureArray(org.globus.swift.language.Procedure[] procedureArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(procedureArray, PROCEDURE$4);
            }
        }
        
        /**
         * Sets ith "procedure" element
         */
        public void setProcedureArray(int i, org.globus.swift.language.Procedure procedure)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.Procedure target = null;
                target = (org.globus.swift.language.Procedure)get_store().find_element_user(PROCEDURE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(procedure);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "procedure" element
         */
        public org.globus.swift.language.Procedure insertNewProcedure(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.Procedure target = null;
                target = (org.globus.swift.language.Procedure)get_store().insert_element_user(PROCEDURE$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "procedure" element
         */
        public org.globus.swift.language.Procedure addNewProcedure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.globus.swift.language.Procedure target = null;
                target = (org.globus.swift.language.Procedure)get_store().add_element_user(PROCEDURE$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "procedure" element
         */
        public void removeProcedure(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROCEDURE$4, i);
            }
        }
        
        /**
         * Gets array of all "variable" elements
         */
        public org.globus.swift.language.Variable[] getVariableArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VARIABLE$6, targetList);
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
                target = (org.globus.swift.language.Variable)get_store().find_element_user(VARIABLE$6, i);
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
                target = (org.globus.swift.language.Variable)get_store().find_element_user(VARIABLE$6, i);
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
                return get_store().count_elements(VARIABLE$6);
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
                arraySetterHelper(variableArray, VARIABLE$6);
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
                target = (org.globus.swift.language.Variable)get_store().find_element_user(VARIABLE$6, i);
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
                target = (org.globus.swift.language.Variable)get_store().find_element_user(VARIABLE$6, i);
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
                target = (org.globus.swift.language.Variable)get_store().insert_element_user(VARIABLE$6, i);
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
                target = (org.globus.swift.language.Variable)get_store().add_element_user(VARIABLE$6);
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
                get_store().remove_element(VARIABLE$6, i);
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
                get_store().find_all_element_users(ASSIGN$8, targetList);
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
                target = (org.globus.swift.language.Assign)get_store().find_element_user(ASSIGN$8, i);
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
                return get_store().count_elements(ASSIGN$8);
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
                arraySetterHelper(assignArray, ASSIGN$8);
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
                target = (org.globus.swift.language.Assign)get_store().find_element_user(ASSIGN$8, i);
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
                target = (org.globus.swift.language.Assign)get_store().insert_element_user(ASSIGN$8, i);
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
                target = (org.globus.swift.language.Assign)get_store().add_element_user(ASSIGN$8);
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
                get_store().remove_element(ASSIGN$8, i);
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
                get_store().find_all_element_users(CALL$10, targetList);
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
                target = (org.globus.swift.language.Call)get_store().find_element_user(CALL$10, i);
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
                return get_store().count_elements(CALL$10);
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
                arraySetterHelper(callArray, CALL$10);
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
                target = (org.globus.swift.language.Call)get_store().find_element_user(CALL$10, i);
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
                target = (org.globus.swift.language.Call)get_store().insert_element_user(CALL$10, i);
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
                target = (org.globus.swift.language.Call)get_store().add_element_user(CALL$10);
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
                get_store().remove_element(CALL$10, i);
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
                get_store().find_all_element_users(FOREACH$12, targetList);
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
                target = (org.globus.swift.language.Foreach)get_store().find_element_user(FOREACH$12, i);
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
                return get_store().count_elements(FOREACH$12);
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
                arraySetterHelper(foreachArray, FOREACH$12);
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
                target = (org.globus.swift.language.Foreach)get_store().find_element_user(FOREACH$12, i);
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
                target = (org.globus.swift.language.Foreach)get_store().insert_element_user(FOREACH$12, i);
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
                target = (org.globus.swift.language.Foreach)get_store().add_element_user(FOREACH$12);
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
                get_store().remove_element(FOREACH$12, i);
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
                get_store().find_all_element_users(IF$14, targetList);
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
                target = (org.globus.swift.language.If)get_store().find_element_user(IF$14, i);
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
                return get_store().count_elements(IF$14);
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
                arraySetterHelper(xifArray, IF$14);
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
                target = (org.globus.swift.language.If)get_store().find_element_user(IF$14, i);
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
                target = (org.globus.swift.language.If)get_store().insert_element_user(IF$14, i);
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
                target = (org.globus.swift.language.If)get_store().add_element_user(IF$14);
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
                get_store().remove_element(IF$14, i);
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
                get_store().find_all_element_users(SWITCH$16, targetList);
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
                target = (org.globus.swift.language.Switch)get_store().find_element_user(SWITCH$16, i);
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
                return get_store().count_elements(SWITCH$16);
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
                arraySetterHelper(xswitchArray, SWITCH$16);
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
                target = (org.globus.swift.language.Switch)get_store().find_element_user(SWITCH$16, i);
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
                target = (org.globus.swift.language.Switch)get_store().insert_element_user(SWITCH$16, i);
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
                target = (org.globus.swift.language.Switch)get_store().add_element_user(SWITCH$16);
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
                get_store().remove_element(SWITCH$16, i);
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
                get_store().find_all_element_users(ITERATE$18, targetList);
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
                target = (org.globus.swift.language.Iterate)get_store().find_element_user(ITERATE$18, i);
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
                return get_store().count_elements(ITERATE$18);
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
                arraySetterHelper(iterateArray, ITERATE$18);
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
                target = (org.globus.swift.language.Iterate)get_store().find_element_user(ITERATE$18, i);
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
                target = (org.globus.swift.language.Iterate)get_store().insert_element_user(ITERATE$18, i);
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
                target = (org.globus.swift.language.Iterate)get_store().add_element_user(ITERATE$18);
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
                get_store().remove_element(ITERATE$18, i);
            }
        }
        
        /**
         * Gets the "targetNamespace" attribute
         */
        public java.lang.String getTargetNamespace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETNAMESPACE$20);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "targetNamespace" attribute
         */
        public org.apache.xmlbeans.XmlAnyURI xgetTargetNamespace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(TARGETNAMESPACE$20);
                return target;
            }
        }
        
        /**
         * True if has "targetNamespace" attribute
         */
        public boolean isSetTargetNamespace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TARGETNAMESPACE$20) != null;
            }
        }
        
        /**
         * Sets the "targetNamespace" attribute
         */
        public void setTargetNamespace(java.lang.String targetNamespace)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETNAMESPACE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETNAMESPACE$20);
                }
                target.setStringValue(targetNamespace);
            }
        }
        
        /**
         * Sets (as xml) the "targetNamespace" attribute
         */
        public void xsetTargetNamespace(org.apache.xmlbeans.XmlAnyURI targetNamespace)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(TARGETNAMESPACE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(TARGETNAMESPACE$20);
                }
                target.set(targetNamespace);
            }
        }
        
        /**
         * Unsets the "targetNamespace" attribute
         */
        public void unsetTargetNamespace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TARGETNAMESPACE$20);
            }
        }
    }
}

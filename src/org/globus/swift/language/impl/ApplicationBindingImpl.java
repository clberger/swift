/*
 * XML Type:  ApplicationBinding
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.ApplicationBinding
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language.impl;
/**
 * An XML ApplicationBinding(@http://ci.uchicago.edu/swift/2009/02/swiftscript).
 *
 * This is a complex type.
 */
public class ApplicationBindingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.globus.swift.language.ApplicationBinding
{
    
    public ApplicationBindingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXECUTABLE$0 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "executable");
    private static final javax.xml.namespace.QName STDIN$2 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "stdin");
    private static final javax.xml.namespace.QName STDOUT$4 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "stdout");
    private static final javax.xml.namespace.QName STDERR$6 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "stderr");
    private static final javax.xml.namespace.QName ABSTRACTEXPRESSION$8 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "abstractExpression");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTEXPRESSION$9 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
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
    private static final javax.xml.namespace.QName SRC$10 = 
        new javax.xml.namespace.QName("", "src");
    
    
    /**
     * Gets the "executable" element
     */
    public java.lang.String getExecutable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXECUTABLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "executable" element
     */
    public org.apache.xmlbeans.XmlString xgetExecutable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXECUTABLE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "executable" element
     */
    public void setExecutable(java.lang.String executable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXECUTABLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXECUTABLE$0);
            }
            target.setStringValue(executable);
        }
    }
    
    /**
     * Sets (as xml) the "executable" element
     */
    public void xsetExecutable(org.apache.xmlbeans.XmlString executable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXECUTABLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXECUTABLE$0);
            }
            target.set(executable);
        }
    }
    
    /**
     * Gets the "stdin" element
     */
    public org.globus.swift.language.UnlabelledUnaryOperator getStdin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.UnlabelledUnaryOperator target = null;
            target = (org.globus.swift.language.UnlabelledUnaryOperator)get_store().find_element_user(STDIN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "stdin" element
     */
    public boolean isSetStdin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STDIN$2) != 0;
        }
    }
    
    /**
     * Sets the "stdin" element
     */
    public void setStdin(org.globus.swift.language.UnlabelledUnaryOperator stdin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.UnlabelledUnaryOperator target = null;
            target = (org.globus.swift.language.UnlabelledUnaryOperator)get_store().find_element_user(STDIN$2, 0);
            if (target == null)
            {
                target = (org.globus.swift.language.UnlabelledUnaryOperator)get_store().add_element_user(STDIN$2);
            }
            target.set(stdin);
        }
    }
    
    /**
     * Appends and returns a new empty "stdin" element
     */
    public org.globus.swift.language.UnlabelledUnaryOperator addNewStdin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.UnlabelledUnaryOperator target = null;
            target = (org.globus.swift.language.UnlabelledUnaryOperator)get_store().add_element_user(STDIN$2);
            return target;
        }
    }
    
    /**
     * Unsets the "stdin" element
     */
    public void unsetStdin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STDIN$2, 0);
        }
    }
    
    /**
     * Gets the "stdout" element
     */
    public org.globus.swift.language.UnlabelledUnaryOperator getStdout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.UnlabelledUnaryOperator target = null;
            target = (org.globus.swift.language.UnlabelledUnaryOperator)get_store().find_element_user(STDOUT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "stdout" element
     */
    public boolean isSetStdout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STDOUT$4) != 0;
        }
    }
    
    /**
     * Sets the "stdout" element
     */
    public void setStdout(org.globus.swift.language.UnlabelledUnaryOperator stdout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.UnlabelledUnaryOperator target = null;
            target = (org.globus.swift.language.UnlabelledUnaryOperator)get_store().find_element_user(STDOUT$4, 0);
            if (target == null)
            {
                target = (org.globus.swift.language.UnlabelledUnaryOperator)get_store().add_element_user(STDOUT$4);
            }
            target.set(stdout);
        }
    }
    
    /**
     * Appends and returns a new empty "stdout" element
     */
    public org.globus.swift.language.UnlabelledUnaryOperator addNewStdout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.UnlabelledUnaryOperator target = null;
            target = (org.globus.swift.language.UnlabelledUnaryOperator)get_store().add_element_user(STDOUT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "stdout" element
     */
    public void unsetStdout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STDOUT$4, 0);
        }
    }
    
    /**
     * Gets the "stderr" element
     */
    public org.globus.swift.language.UnlabelledUnaryOperator getStderr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.UnlabelledUnaryOperator target = null;
            target = (org.globus.swift.language.UnlabelledUnaryOperator)get_store().find_element_user(STDERR$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "stderr" element
     */
    public boolean isSetStderr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STDERR$6) != 0;
        }
    }
    
    /**
     * Sets the "stderr" element
     */
    public void setStderr(org.globus.swift.language.UnlabelledUnaryOperator stderr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.UnlabelledUnaryOperator target = null;
            target = (org.globus.swift.language.UnlabelledUnaryOperator)get_store().find_element_user(STDERR$6, 0);
            if (target == null)
            {
                target = (org.globus.swift.language.UnlabelledUnaryOperator)get_store().add_element_user(STDERR$6);
            }
            target.set(stderr);
        }
    }
    
    /**
     * Appends and returns a new empty "stderr" element
     */
    public org.globus.swift.language.UnlabelledUnaryOperator addNewStderr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.UnlabelledUnaryOperator target = null;
            target = (org.globus.swift.language.UnlabelledUnaryOperator)get_store().add_element_user(STDERR$6);
            return target;
        }
    }
    
    /**
     * Unsets the "stderr" element
     */
    public void unsetStderr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STDERR$6, 0);
        }
    }
    
    /**
     * Gets array of all "abstractExpression" elements
     */
    public org.apache.xmlbeans.XmlObject[] getAbstractExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ABSTRACTEXPRESSION$9, targetList);
            org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "abstractExpression" element
     */
    public org.apache.xmlbeans.XmlObject getAbstractExpressionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ABSTRACTEXPRESSION$9, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "abstractExpression" element
     */
    public int sizeOfAbstractExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABSTRACTEXPRESSION$9);
        }
    }
    
    /**
     * Sets array of all "abstractExpression" element
     */
    public void setAbstractExpressionArray(org.apache.xmlbeans.XmlObject[] abstractExpressionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(abstractExpressionArray, ABSTRACTEXPRESSION$8, ABSTRACTEXPRESSION$9);
        }
    }
    
    /**
     * Sets ith "abstractExpression" element
     */
    public void setAbstractExpressionArray(int i, org.apache.xmlbeans.XmlObject abstractExpression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ABSTRACTEXPRESSION$9, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(abstractExpression);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "abstractExpression" element
     */
    public org.apache.xmlbeans.XmlObject insertNewAbstractExpression(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(ABSTRACTEXPRESSION$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "abstractExpression" element
     */
    public org.apache.xmlbeans.XmlObject addNewAbstractExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ABSTRACTEXPRESSION$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "abstractExpression" element
     */
    public void removeAbstractExpression(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABSTRACTEXPRESSION$9, i);
        }
    }
    
    /**
     * Gets the "src" attribute
     */
    public java.lang.String getSrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRC$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "src" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SRC$10);
            return target;
        }
    }
    
    /**
     * True if has "src" attribute
     */
    public boolean isSetSrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SRC$10) != null;
        }
    }
    
    /**
     * Sets the "src" attribute
     */
    public void setSrc(java.lang.String src)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRC$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SRC$10);
            }
            target.setStringValue(src);
        }
    }
    
    /**
     * Sets (as xml) the "src" attribute
     */
    public void xsetSrc(org.apache.xmlbeans.XmlString src)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SRC$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SRC$10);
            }
            target.set(src);
        }
    }
    
    /**
     * Unsets the "src" attribute
     */
    public void unsetSrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SRC$10);
        }
    }
}

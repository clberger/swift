/*
 * An XML document type.
 * Localname: unaryNegation
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.UnaryNegationDocument
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language.impl;
/**
 * A document containing one unaryNegation(@http://ci.uchicago.edu/swift/2009/02/swiftscript) element.
 *
 * This is a complex type.
 */
public class UnaryNegationDocumentImpl extends org.globus.swift.language.impl.AbstractExpressionDocumentImpl implements org.globus.swift.language.UnaryNegationDocument
{
    
    public UnaryNegationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNARYNEGATION$0 = 
        new javax.xml.namespace.QName("http://ci.uchicago.edu/swift/2009/02/swiftscript", "unaryNegation");
    
    
    /**
     * Gets the "unaryNegation" element
     */
    public org.globus.swift.language.UnlabelledUnaryOperator getUnaryNegation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.UnlabelledUnaryOperator target = null;
            target = (org.globus.swift.language.UnlabelledUnaryOperator)get_store().find_element_user(UNARYNEGATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "unaryNegation" element
     */
    public void setUnaryNegation(org.globus.swift.language.UnlabelledUnaryOperator unaryNegation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.UnlabelledUnaryOperator target = null;
            target = (org.globus.swift.language.UnlabelledUnaryOperator)get_store().find_element_user(UNARYNEGATION$0, 0);
            if (target == null)
            {
                target = (org.globus.swift.language.UnlabelledUnaryOperator)get_store().add_element_user(UNARYNEGATION$0);
            }
            target.set(unaryNegation);
        }
    }
    
    /**
     * Appends and returns a new empty "unaryNegation" element
     */
    public org.globus.swift.language.UnlabelledUnaryOperator addNewUnaryNegation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.globus.swift.language.UnlabelledUnaryOperator target = null;
            target = (org.globus.swift.language.UnlabelledUnaryOperator)get_store().add_element_user(UNARYNEGATION$0);
            return target;
        }
    }
}

/*
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

/*
 *
 *
 *
 *
 *
 * Copyright (c) 2002 World Wide Web Consortium,
 * (Massachusetts Institute of Technology, Institut National de
 * Recherche en Informatique et en Automatique, Keio University). All
 * Rights Reserved. This program is distributed under the W3C's Software
 * Intellectual Property License. This program is distributed in the
 * hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 * PURPOSE.
 * See W3C License http://www.w3.org/Consortium/Legal/ for more details.
 */

package org.w3c.dom.xpath;

/**
 * A new exception has been created for exceptions specific to these XPath
 * interfaces.
 *
 * See also <a href='https://www.w3.org/TR/DOM-Level-3-XPath/'>
 * Document Object Model (DOM) Level 3 XPath Specification, Version 1.0,
 * W3C Working Group Note 26 February 2004</a>
 * Note that this class came from Document Object Model (DOM) Level 3 XPath
 * Specification, Working Draft 20 August 2002 where the values of
 * {@link #INVALID_EXPRESSION_ERR} and {@link #TYPE_ERR}
 * are 1 and 2 respectively (instead of 51 and 52 as in the 2004 version).
 */
public class XPathException extends RuntimeException {
    private static final long serialVersionUID = 3471034171575979943L;

    public XPathException(short code, String message) {
       super(message);
       this.code = code;
    }
    public short   code;
    // XPathExceptionCode
    /**
     * If the expression has a syntax error or otherwise is not a legal
     * expression according to the rules of the specific
     * <code>XPathEvaluator</code> or contains specialized extension
     * functions or variables not supported by this implementation.
     */
    public static final short INVALID_EXPRESSION_ERR    = 1;
    /**
     * If the expression cannot be converted to return the specified type.
     */
    public static final short TYPE_ERR                  = 2;

}

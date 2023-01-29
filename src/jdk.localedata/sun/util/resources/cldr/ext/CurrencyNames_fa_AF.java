/*
 * Copyright (c) 2012, 2022, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 * COPYRIGHT AND PERMISSION NOTICE
 *
 * Copyright (c) 1991-2020 Unicode, Inc. All rights reserved.
 * Distributed under the Terms of Use in https://www.unicode.org/copyright.html.
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of the Unicode data files and any associated documentation
 * (the "Data Files") or Unicode software and any associated documentation
 * (the "Software") to deal in the Data Files or Software
 * without restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, and/or sell copies of
 * the Data Files or Software, and to permit persons to whom the Data Files
 * or Software are furnished to do so, provided that either
 * (a) this copyright and permission notice appear with all copies
 * of the Data Files or Software, or
 * (b) this copyright and permission notice appear in associated
 * Documentation.
 *
 * THE DATA FILES AND SOFTWARE ARE PROVIDED "AS IS", WITHOUT WARRANTY OF
 * ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT OF THIRD PARTY RIGHTS.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR HOLDERS INCLUDED IN THIS
 * NOTICE BE LIABLE FOR ANY CLAIM, OR ANY SPECIAL INDIRECT OR CONSEQUENTIAL
 * DAMAGES, OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE,
 * DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER
 * TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
 * PERFORMANCE OF THE DATA FILES OR SOFTWARE.
 *
 * Except as contained in this notice, the name of a copyright holder
 * shall not be used in advertising or otherwise to promote the sale,
 * use or other dealings in these Data Files or Software without prior
 * written authorization of the copyright holder.
 */

package sun.util.resources.cldr.ext;

import sun.util.resources.OpenListResourceBundle;

public class CurrencyNames_fa_AF extends OpenListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "aud", "\u062f\u0627\u0644\u0631 \u0622\u0633\u062a\u0631\u0627\u0644\u06cc\u0627" },
            { "bnd", "\u062f\u0627\u0644\u0631 \u0628\u0631\u0648\u0646\u06cc" },
            { "byn", "\u0631\u0648\u0628\u0644 \u0631\u0648\u0633\u06cc\u0647\u0654 \u0633\u0641\u06cc\u062f" },
            { "byr", "\u0631\u0648\u0628\u0644 \u0631\u0648\u0633\u06cc\u0647\u0654 \u0633\u0641\u06cc\u062f (\u06f2\u06f0\u06f0\u06f0\u2013\u06f2\u06f0\u06f1\u06f6)" },
            { "cad", "\u062f\u0627\u0644\u0631 \u06a9\u0627\u0646\u0627\u062f\u0627" },
            { "chf", "\u0641\u0631\u0627\u0646\u06a9 \u0633\u0648\u06cc\u0633" },
            { "dkk", "\u06a9\u0631\u0648\u0646 \u062f\u0646\u0645\u0627\u0631\u06a9" },
            { "jpy", "\u06cc\u0646 \u062c\u0627\u067e\u0627\u0646" },
            { "mxn", "\u067e\u0632\u0648\u06cc \u0645\u06a9\u0633\u06cc\u06a9\u0648" },
            { "nlg", "\u06af\u06cc\u0644\u062f\u0631 \u0647\u0627\u0644\u0646\u062f" },
            { "nok", "\u06a9\u0631\u0648\u0646 \u0646\u0627\u0631\u0648\u06cc" },
            { "sek", "\u06a9\u0631\u0648\u0646 \u0633\u0648\u06cc\u062f\u0646" },
            { "sgd", "\u062f\u0627\u0644\u0631 \u0633\u06cc\u0646\u06af\u0627\u067e\u0648\u0631" },
            { "tjs", "\u0633\u0627\u0645\u0627\u0646\u06cc \u062a\u0627\u062c\u06a9\u0633\u062a\u0627\u0646" },
            { "usd", "\u062f\u0627\u0644\u0631 \u0627\u0645\u0631\u06cc\u06a9\u0627" },
        };
        return data;
    }
}

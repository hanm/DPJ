/* 
 * Copyright 2002 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
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
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 */

/*
 * @test
 * @bug 4524136
 * @summary Test to make sure label is used for inline links.
 * @author jamieh
 * @library ../lib/
 * @build JavadocTester
 * @build TestInlineLinkLabel
 * @run main TestInlineLinkLabel
 */

public class TestInlineLinkLabel extends JavadocTester {
    
    private static final String BUG_ID = "4524136";
    private static final String[][] TEST = {
        //Search for the label to the package link.
        {BUG_ID + FS + "pkg" + FS + "C1.html" , "<A HREF=\"../pkg/package-summary.html\"><CODE>Here is a link to a package</CODE></A>"},
        
        //Search for the label to the class link
        {BUG_ID + FS + "pkg" + FS + "C1.html" , "<A HREF=\"../pkg/C2.html\" title=\"class in pkg\"><CODE>Here is a link to a class</CODE></A>"}
    };
    private static final String[][] NEGATED_TEST = NO_TEST;
    private static final String[] ARGS =
        new String[] {
            "-d", BUG_ID, "-sourcepath", SRC_DIR, "pkg"};
    
    /**
     * The entry point of the test.
     * @param args the array of command line arguments.
     */
    public static void main(String[] args) {
        TestInlineLinkLabel tester = new TestInlineLinkLabel();
        run(tester, ARGS, TEST, NEGATED_TEST);
        tester.printSummary();
    }
    
    /**
     * {@inheritDoc}
     */
    public String getBugId() {
        return BUG_ID;
    }
    
    /**
     * {@inheritDoc}
     */
    public String getBugName() {
        return getClass().getName();
    }
}

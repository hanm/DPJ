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
 * test
 * @bug      0000000
 * @summary  <DESC>
 * @author   jamieh
 * @library  ../lib/
 * @ignore   This is a template for regression tests.
 * @build    JavadocTester
 * @build    <CLASS NAME>
 * @run main <CLASS NAME>
 */

public class TemplateComplete extends JavadocTester {
    
    //Test information.
    private static final String BUG_ID = "<BUG ID>";
    private static final String OUTPUT_DIR = "docs-" + BUG_ID;
    
    //Javadoc arguments.
    private static final String[] ARGS = new String[] {
        "-d", OUTPUT_DIR, "-sourcepath", SRC_DIR
    };
    
    //Input for string search tests.
    private static final String[][] TEST = NO_TEST;
    private static final String[][] NEGATED_TEST = NO_TEST;
    
    //Input for Javadoc return code test.
    private static final int EXPECTED_EXIT_CODE = 0;
    
    
    //Input for file diff test.
    private static final String[][] FILES_TO_DIFF = {};
    
    /**
     * The entry point of the test.
     * @param args the array of command line arguments.
     */
    public static void main(String[] args) {
        TemplateComplete tester = new TemplateComplete();
        int actualExitCode = run(tester, ARGS, TEST, NEGATED_TEST);
        tester.checkExitCode(EXPECTED_EXIT_CODE, actualExitCode);
        tester.runDiffs(FILES_TO_DIFF, false);
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

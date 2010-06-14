/*
 * Copyright 2006 Sun Microsystems, Inc.  All Rights Reserved.
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
 * @bug     6346453 
 * @summary directSupertypes should return empty list if arg has no supertypes
 * @author  Scott Seligman
 * @build   NoSupers
 * @compile -processor NoSupers -proc:only NoSupers.java
 */

import java.util.Set;
import javax.annotation.processing.*;
import javax.lang.model.element.*;
import javax.lang.model.type.*;
import javax.lang.model.util.*;

@SupportedAnnotationTypes("*")
public class NoSupers extends AbstractProcessor {

    Types types;

    public void init(ProcessingEnvironment penv) {
	super.init(penv);
	types = penv.getTypeUtils();
    }

    public boolean process(Set<? extends TypeElement> tes,
			   RoundEnvironment round) {
	if (round.processingOver()) return true;
	
	PrimitiveType intType = types.getPrimitiveType(TypeKind.INT);
	if (! types.directSupertypes(intType).isEmpty())
	    throw new AssertionError();
	return true;
    }
}

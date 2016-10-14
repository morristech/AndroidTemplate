package edu.umd.cs.findbugs.annotations;
/*
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
*
*  http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/

////findbugs annotations contains all jsr305 annotations in jar(need disable jsr305 to avoid duplicate) https://sourceforge.net/p/findbugs/bugs/1449/
//gradle not work because without jsr305 get Caused by: java.lang.ClassNotFoundException: javax.annotation.meta.When
//configurations.all*.exclude group: "com.google.code.findbugs", module: "jsr305"
//so i copy-paste annotation

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * Used to suppress FindBugs warnings. It should be used instead of SuppressWarnings to
 * avoid conflicts with SuppressWarnings.
 */
@Retention(value = CLASS)
public @interface SuppressFBWarnings {

    /**
     * The set of FindBugs warnings that are to be suppressed in annotated element.
     * The value can be a bug category, kind or pattern.
     */
    String[] value() default {};

    /**
     * Optional documentation of the reason why the warning is suppressed.
     */
    String justification() default "";
}

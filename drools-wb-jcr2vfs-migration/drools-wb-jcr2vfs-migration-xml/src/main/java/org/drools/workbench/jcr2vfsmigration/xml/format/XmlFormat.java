/*
 * Copyright 2014 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.drools.workbench.jcr2vfsmigration.xml.format;

import org.w3c.dom.Node;

public interface XmlFormat<T> {

    static final String LT = "<";
    static final String LT_SLASH = "</";
    static final String GT = ">";
    static final String SLASH_GT = "/>";
    static final String CDATA_OPEN = "<![CDATA[";
    static final String CDATA_CLOSE = "]]>";

    void format(StringBuilder sb, T t);

    T parse(Node node);

}

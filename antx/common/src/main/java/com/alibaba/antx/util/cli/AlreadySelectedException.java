/*
 * Copyright (c) 2002-2012 Alibaba Group Holding Limited.
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.antx.util.cli;

/**
 * <p>
 * Thrown when more than one option in an option group has been provided.
 * </p>
 *
 * @author John Keyes ( john at integralsource.com )
 * @see ParseException
 */
public class AlreadySelectedException extends ParseException {
    private static final long serialVersionUID = 3689067339866125104L;

    /**
     * <p>
     * Construct a new <code>AlreadySelectedException</code> with the specified
     * detail message.
     * </p>
     *
     * @param message the detail message
     */
    public AlreadySelectedException(String message) {
        super(message);
    }
}

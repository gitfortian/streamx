/*
 * Copyright (c) 2019 The StreamX Project
 * <p>
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.streamxhub.streamx.console.core.enums;

import java.io.Serializable;

/**
 * @author benjobs
 */
public enum AppExistsState implements Serializable {

    /**
     * 不存在
     */
    NO(0),

    /**
     * 表里存在
     */
    IN_DB(1),

    /**
     * 正在运行的yarn里存在
     */
    IN_YARN(2),

    /**
     * exists in remote kubernetes cluster.
     */
    IN_KUBERNETES(3),

    /**
     * job name invalid because of special utf-8 character
     *
     */
    INVALID(4);

    int value;

    AppExistsState(int value) {
        this.value = value;
    }

    public int get() {
        return this.value;
    }
}

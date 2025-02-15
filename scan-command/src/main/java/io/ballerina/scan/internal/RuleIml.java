/*
 *  Copyright (c) 2024, WSO2 LLC. (https://www.wso2.com).
 *
 *  WSO2 LLC. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied. See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package io.ballerina.scan.internal;

import io.ballerina.scan.Rule;
import io.ballerina.scan.Severity;

public class RuleIml implements Rule {

    private final String id;
    private final int numericId;
    private final String description;
    private final Severity severity;

    // For external rules
    RuleIml(String id, int numericId, String description, Severity severity) {
        this.id = id;
        this.numericId = numericId;
        this.description = description;
        this.severity = severity;
    }

    @Override
    public String id() {
        return id;
    }

    @Override
    public int numericId() {
        return numericId;
    }

    @Override
    public String description() {
        return description;
    }

    @Override
    public Severity severity() {
        return severity;
    }
}

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

public class ScanToolConstants {

    static final String SCAN_COMMAND = "scan";

    // Internal and external issues constants
    public static final String MAIN_BAL = "main.bal";

    // Report generation constants
    public static final String RESULTS_HTML_FILE = "index.html";
    public static final String PATH_SEPARATOR = "/";
    public static final String TARGET_DIR_NAME = "target";
    public static final String RESULTS_JSON_FILE = "scan_results.json";
    public static final String FILE_PROTOCOL = "file://";
    public static final String REPORT_DATA_PLACEHOLDER = "__data__";

    // Scan.toml constants
    public static final String SCAN_FILE = "Scan.toml";
    public static final String SCAN_TABLE = "scan";
    public static final String SCAN_FILE_FIELD = "configPath";
    public static final String PLATFORM_TABLE = "platform";
    public static final String ANALYZER_TABLE = "analyzer";
    public static final String RULES_TABLE = "rule";
    public static final String JAR_PREDICATE = ".jar";

    // Compiler Plugins Constants
    public static final String USE_IMPORT_AS_SERVICE = " as _;";
    public static final String CUSTOM_RULES_COMPILER_PLUGIN_VERSION_PATTERN = "^\\d+\\.\\d+\\.\\d+$";
    static final String BALLERINA_RULE_PREFIX = "B";

    static final String RULES_FILE = "rules.json";
    static final String IMPORT_GENERATOR_FILE = "scanFile";

    private ScanToolConstants() {
    }
}

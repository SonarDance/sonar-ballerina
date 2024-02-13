package org.wso2.ballerina.internal.utilities;

public class ScanToolConstants {
    // CommandLine constants
    public static final String PLATFORM_ARGS_PATTERN = "-PARG[\\w\\W]+=([\\w\\W]+)";

    // Internal issues constants
    public static final String CHECK_VIOLATION = "CHECK_VIOLATION";
    public static final String CODE_SMELL = "CODE_SMELL";
    public static final String BUG = "BUG";
    public static final String VULNERABILITY = "VULNERABILITY";
    public static final int SONARQUBE_RESERVED_RULES = 106;

    // External issues constants
    public static final String CUSTOM_CHECK_VIOLATION = "CUSTOM_CHECK_VIOLATION";

    // Report generation constants
    public static final String RESULTS_HTML_FILE = "index.html";
    public static final String PATH_SEPARATOR = "/";
    public static final String TARGET_DIR_NAME = "target";
    public static final String RESULTS_JSON_FILE = "scan_results.json";
    public static final String FILE_PROTOCOL = "file://";
    public static final String REPORT_DATA_PLACEHOLDER = "__data__";

    // Import generation constants
    public static final String USE_IMPORT_AS_SERVICE = " as _;";
}

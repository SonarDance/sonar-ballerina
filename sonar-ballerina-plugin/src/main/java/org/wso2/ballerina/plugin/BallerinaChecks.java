package org.wso2.ballerina.plugin;

import java.util.ArrayList;
import java.util.List;

public class BallerinaChecks {
    // List for default checks
    public static final List<String> DEFAULT_CHECKS = new ArrayList<>();

    // Populating default checks
    static {
        // NOTE: Rule numbers 001 - 106 is not valid
        DEFAULT_CHECKS.add("S107");
        DEFAULT_CHECKS.add("S108");
    }
}

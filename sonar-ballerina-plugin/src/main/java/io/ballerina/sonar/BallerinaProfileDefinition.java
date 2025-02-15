/*
 * Copyright (c) 2024, WSO2 LLC. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package io.ballerina.sonar;

import org.sonar.api.server.profile.BuiltInQualityProfilesDefinition;
import org.sonarsource.analyzer.commons.BuiltInQualityProfileJsonLoader;

import static io.ballerina.sonar.Constants.JSON_PROFILE_PATH;
import static io.ballerina.sonar.Constants.LANGUAGE_KEY;
import static io.ballerina.sonar.Constants.PROFILE_NAME;
import static io.ballerina.sonar.Constants.RULE_REPOSITORY_KEY;

public class BallerinaProfileDefinition implements BuiltInQualityProfilesDefinition {

    /**
     * <p> Define the quality profile for Ballerina. </p>
     *
     * <p>
     * Quality profiles are shown in the SonarQube dashboard. They are required to be activated for analysis issues to
     * be reported.
     * </p>
     *
     * @param context The quality profile definition context
     */
    @Override
    public void define(Context context) {
        // Create a new quality profile for Ballerina
        NewBuiltInQualityProfile ballerinaQualityProfile = context.createBuiltInQualityProfile(PROFILE_NAME,
                LANGUAGE_KEY);

        // Load the new quality profile
        BuiltInQualityProfileJsonLoader.load(ballerinaQualityProfile, RULE_REPOSITORY_KEY, JSON_PROFILE_PATH);

        // Signal that the new profile has been loaded to SonarQube
        ballerinaQualityProfile.done();
    }
}

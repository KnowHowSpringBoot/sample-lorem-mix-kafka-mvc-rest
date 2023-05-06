package org.ujar.lorem.shared.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ApplicationBuildInfoProperties.class)
public class BuildInfoConfig {
}

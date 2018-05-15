package com.fateking.nlp.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "key")
@Setter
@Getter
public class ApiConfig {

    private String accessKey;
    private String secretKey;

}

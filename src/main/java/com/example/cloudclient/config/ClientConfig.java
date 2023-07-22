package com.example.cloudclient.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@Setter
@Getter
@ConfigurationProperties("configtest")
@RefreshScope
@ToString
public class ClientConfig {

    private String x;
    private String profile;
    private String y;

}

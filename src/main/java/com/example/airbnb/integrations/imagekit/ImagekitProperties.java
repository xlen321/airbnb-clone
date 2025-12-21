package com.example.airbnb.integrations.imagekit;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "imagekit")
@Component
public class ImagekitProperties {
    private String publicKey;
    private String privateKey;
    private String urlEndpoint;
}

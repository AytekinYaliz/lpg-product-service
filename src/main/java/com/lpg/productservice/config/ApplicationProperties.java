package com.lpg.productservice.config;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
public class ApplicationProperties {
    private String fileName;
    private String env;
    private String secretKey;
    private Integer tokenExpireInMin;
    private List<String> securityExcludedUrls = new ArrayList<>();
}

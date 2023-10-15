package com.europhia.catalog.service.impl;

import com.europhia.catalog.config.ApplicationProperties;
import com.europhia.catalog.service.GreetingService;
import org.springframework.stereotype.Service;

import java.util.TimeZone;

@Service
public class GreetingServiceImpl implements GreetingService {

    private ApplicationProperties appProperties;

    public GreetingServiceImpl(ApplicationProperties appProperties) {
        this.appProperties = appProperties;
    }

    @Override
    public String sayGreeting() {
        TimeZone timezone = TimeZone.getTimeZone(appProperties.getTimezone());
        return appProperties.getWelcomeText()+", our timezone :"+timezone.getDisplayName()+", our currency :"+appProperties.getCurrency();
    }
}

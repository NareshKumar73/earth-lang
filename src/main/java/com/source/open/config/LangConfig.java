package com.source.open.config;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;

@Configuration
public class LangConfig {

    @Bean
    LocaleResolver localeResolver() {
        CookieLocaleResolver localeResolver = new CookieLocaleResolver("lang");
//        SessionLocaleResolver localeResolver = new SessionLocaleResolver();
        localeResolver.setDefaultLocale(Locale.ENGLISH);  // Set default locale (English)
        return localeResolver;
    }
}

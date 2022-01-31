package com.hcl.saravanan.springwebdemo1.controller;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import static springfox.documentation.builders.PathSelectors.regex;

public class SwaggerConfig {
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select().apis(RequestHandlerSelectors.basePackage("com.saran.controller"))
                .paths(regex("/api"))
                .build();
    }

    private ApiInfo metaData() {
        ApiInfo apiInfo = new ApiInfo("spring Boot REST API", "Spring Boot REST API for Product CRUD Operations", "1.0"
                , "Terms of service", new Contact("Saran","https://localhost:8282/products", "email@email.com"),
                "Product Version 2.0", "www.products.org");
        return apiInfo;
    }
}

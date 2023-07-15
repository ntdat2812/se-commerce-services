package com.secommerce.common.config;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springdoc.core.customizers.OpenApiCustomiser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi apiEndPointsInfo() {
        return GroupedOpenApi.builder()
                .group("secommerce")
                .packagesToScan("com.secommerce")
                .pathsToMatch("/**")
                .addOpenApiCustomiser(openApiCustomiser())
                .build();
    }

    private OpenApiCustomiser openApiCustomiser(){
        return openApi -> openApi.info(new Info().title("Silly Ecommerece").version("v1.0.0").description("Silly Ecommerce REST API").contact(new Contact().email("test@gmail.com").name("Dat Nguyen")));
    }
}

package com.meet.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {
    @Bean
    public OpenAPI expenseApi(){
        return new OpenAPI()
                .info(new Info().title("Food Delivery app API")
                        .description("Food Delivery API")
                        .version("v0.0.1")
                        .license(new License().name("Meet License Version 0.1").url("https://code-with-meet.web.app")))
                .externalDocs(new ExternalDocumentation()
                        .description("Expense Tracker Wiki Documentation")
                        .url("https://code-with-meet.web.app"));
    }
}

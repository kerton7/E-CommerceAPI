package com.alituran.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import io.swagger.v3.oas.models.OpenAPI;

import io.swagger.v3.oas.models.info.Info;


@Configuration
public class SwaggerConfiguration {
	
	
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("E-Commerce API")
                .version("1.0.0")
                .description("Object Oriented Programming Course – E-Commerce Application (2024-2025)")
            );
    }
}


	
	



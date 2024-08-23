package com.makersharks.suppliersearchapi.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@EnableWebMvc
@OpenAPIDefinition(
        info = @Info(
                title = "Supplier Search API",
                version = "1.0",
                description = "API for searching manufacturers based on location, nature of business, and manufacturing processes"
        )
)

public class SwaggerConfig {


}
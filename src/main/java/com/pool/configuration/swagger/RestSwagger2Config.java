package com.pool.configuration.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class RestSwagger2Config {
	@Bean
	public Docket DressCoolAppDocket() {
		 return new Docket(DocumentationType.SWAGGER_2)
	                .apiInfo(getApiInfo())
	                .select()
	                .apis(RequestHandlerSelectors.basePackage("com.pool.controller"))
	                .paths(PathSelectors.any())
	                .build();
	}
	
	private ApiInfo getApiInfo() {
        return new ApiInfoBuilder()
                	.title("USER PROFILE API ")
                	.description("This API used to maintain user profile informatiom")
                	.version("1.0.0")
                	.build();
    }
}

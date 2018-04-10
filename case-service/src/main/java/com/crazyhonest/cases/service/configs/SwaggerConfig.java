package com.crazyhonest.cases.service.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.crazyhonest.cases.service.controllers"))
				.paths(PathSelectors.any()).build().apiInfo(apiInfo());
	}

	public ApiInfo apiInfo() {
		ApiInfo apiInfo = new ApiInfoBuilder().title("Cases Service APIs").description("Cases Service APIs")
				.version("1.0").build();
		return apiInfo;
	}

}

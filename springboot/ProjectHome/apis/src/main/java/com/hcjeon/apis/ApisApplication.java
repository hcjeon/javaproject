package com.hcjeon.apis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.collect.Lists.newArrayList;

@SpringBootApplication
@EnableSwagger2

public class ApisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApisApplication.class, args);
	}

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.kyu.boot.controller"))
				.paths(PathSelectors.any())
				.build()
				.useDefaultResponseMessages(false)
				.globalResponseMessage(RequestMethod.GET
						, newArrayList(new ResponseMessageBuilder()
										.code(500)
										.message("Internal Server Error")
										.responseModel(new ModelRef("Error"))
										.build()
								, new ResponseMessageBuilder()
										.code(400)
										.message("Bad Request")
										.build()
								, new ResponseMessageBuilder()
										.code(404)
										.message("Not Found")
										.build()));
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("hcjeon swagger2")
				.description("hcjeon swagger starter")
				.build();
	}
}

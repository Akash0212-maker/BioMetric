package com.bio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableAutoConfiguration
@SpringBootApplication
@EnableSwagger2
public class Services1Application extends SpringBootServletInitializer {
	public static Logger _LOGGER = LoggerFactory.getLogger(Services1Application.class);
	public static void main(String[] args) {
		SpringApplication.run(Services1Application.class, args);
	}
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select().apis(RequestHandlerSelectors.basePackage("com.bio.services"))
				/* .paths(PathSelectors.ant("/service.*")) */
				.build();
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		_LOGGER.info("configure()");
        return application.sources(Services1Application.class);
    }
}

package com.example.swagger.swaggerdemo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("user-api")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.swagger.swaggerdemo"))
                .paths(PathSelectors.regex("/.*"))
                .build().apiInfo(apiEndPointsInfo());
    }
    private ApiInfo apiEndPointsInfo() {
        return new ApiInfoBuilder().title("Spring Boot Swagger Examples")
                .description("User Api Dokümantasyonu")
                .contact(new Contact("Erman Ozardic", "", "eozardic@gmail.com"))
                .license("Apache 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .version("1.12.3")
                .build();
    }
}

package br.com.chapter.livelo.demofeigncliente.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignClientInterceptorGenericConfigure {

    @Bean
    public RequestInterceptor bearerTokenRequestInterceptor() {
        return new RequestInterceptor() {
            @Override
            public void apply(RequestTemplate template) {
                System.err.println("@@@@@@@@@@@@@ -- DISPARA AÇÃO -- @@@@@@@@@@@@@@@");
                template.header("Authorization", String.format("Bearer %s", "bearer token aqui"));
            }
        };
    }
}

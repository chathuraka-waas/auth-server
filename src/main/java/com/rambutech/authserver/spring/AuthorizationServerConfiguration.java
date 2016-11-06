package com.rambutech.authserver.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * Created by Chathuraka on 10/25/16.
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfiguration extends AuthorizationServerConfigurerAdapter {

    public void configure(final ClientDetailsServiceConfigurer clients) throws Exception{
        clients.inMemory()
                .withClient("123456")
                .secret("123456789")
                .authorizedGrantTypes("client_credentials")
                .scopes("read","write")
                .accessTokenValiditySeconds(3600);
    }


}

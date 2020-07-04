package br.com.integracaofornecedor.security

import grails.plugin.springsecurity.rest.RestTokenCreationEvent
import org.springframework.context.ApplicationListener

class SecurityEventListener implements ApplicationListener<RestTokenCreationEvent> {

    void onApplicationEvent(RestTokenCreationEvent event) {
        println( "SecurityEventListener" )
        println( event )
    }
}

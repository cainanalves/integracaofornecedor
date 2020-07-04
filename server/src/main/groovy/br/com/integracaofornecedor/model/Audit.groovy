package br.com.integracaofornecedor.model

import grails.core.GrailsApplication
import grails.plugin.springsecurity.SpringSecurityService
import grails.plugins.orm.auditable.Auditable

abstract class Audit implements Auditable {

    Date creationDate
    Date changeDate
    String creationUser
    String changeUser

    static constraints = {
        creationDate nullable: true
        changeDate nullable: true
        creationUser nullable: true
        changeUser nullable: true
    }

    static mapping = {
        autowire true
    }

    static SpringSecurityService springSecurityService

    static transients = ['springSecurityService']

    void beforeInsert() {
        if( springSecurityService.principal?.hasProperty( "id" ) != null ) {
            User user = User.get( springSecurityService.principal?.id )
            this.changeUser = user?.username
            this.changeDate = new Date()
            this.creationUser = user?.username
            this.creationDate = new Date()
        } else {
            this.changeUser = User.USUARIO_NAO_LOGADO_OU_SISTEMA
            this.changeDate = new Date()
            this.creationUser = User.USUARIO_NAO_LOGADO_OU_SISTEMA
            this.creationDate = new Date()
        }
    }

    void beforeUpdate() {
        if( springSecurityService.principal?.hasProperty( "id" ) != null ) {
            User user = User.get( springSecurityService.principal?.id )
            this.changeUser = user?.username
            this.changeDate = new Date()
        } else {
            this.changeUser = User.USUARIO_NAO_LOGADO_OU_SISTEMA
            this.changeDate = new Date()
        }
    }

    static listAuditedClasses( GrailsApplication grailsApplication ) {
        def classes = grailsApplication.getArtefacts("Domain")*.clazz
        return classes?.findAll{ it.superclass == Audit.class }
    }

}

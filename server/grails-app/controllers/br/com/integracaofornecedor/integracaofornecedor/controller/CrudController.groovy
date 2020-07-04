package br.com.integracaofornecedor.integracaofornecedor.controller


import grails.converters.*
import grails.rest.RestfulController

class CrudController extends RestfulController{

    Class entity
    boolean readOnly

    CrudController( Class entity ) {
        super( entity )
        this.entity = entity
    }

    CrudController( Class entity, boolean readOnly ) {
        super( entity, readOnly )
        this.readOnly = readOnly
    }

    @Override
    def index() {
        render "${ entity }"
    }

    def save() {
        render "Save ${ entity }"
    }

    def delete() {
        render "Delete ${ entity }"
    }

    def show() {
        render "Show ${ entity }"
    }

    def update() {
        render "Update ${ entity }"
    }

    def patch() {
        render "Patch ${ entity }"
    }
}

package br.com.integracaofornecedor.integracaofornecedor.controller

import br.com.integracaofornecedor.model.User
import grails.rest.*
import grails.converters.*

class UserController extends CrudController {
	static responseFormats = ['json', 'xml']

    UserController() {
        super( User )
    }

}

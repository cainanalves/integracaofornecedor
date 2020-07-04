//grails.plugin.springsecurity.rest.token.storage.jwt.secret = ''
grails.plugin.springsecurity.rest.token.storage.jwt.expiration = 3600
grails.plugin.springsecurity.rest.token.validation.useBearerToken = false
grails.plugin.springsecurity.useSecurityEventListener = true


//grails.plugin.springsecurity.onRestTokenCreationEvent = { e, appCtx ->
//	// handle RestTokenCreationEvent
//}

//grails.plugin.springsecurity.userLookup.userDomainClassName = 'br.com.integracaofornecedor.model.User'
//grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'br.com.integracaofornecedor.model.UserRole'
//grails.plugin.springsecurity.authority.className = 'br.com.integracaofornecedor.model.Role'
//grails.plugin.springsecurity.requestMap.className = 'br.com.integracaofornecedor.model.Requestmap'
//grails.plugin.springsecurity.securityConfigType = 'Requestmap'
//grails.plugin.springsecurity.controllerAnnotations.staticRules = [
//	[pattern: '/',               access: ['permitAll']],
//	[pattern: '/error',          access: ['permitAll']],
//	[pattern: '/index',          access: ['permitAll']],
//	[pattern: '/index.gsp',      access: ['permitAll']],
//	[pattern: '/shutdown',       access: ['permitAll']],
//	[pattern: '/assets/**',      access: ['permitAll']],
//	[pattern: '/**/js/**',       access: ['permitAll']],
//	[pattern: '/**/css/**',      access: ['permitAll']],
//	[pattern: '/**/images/**',   access: ['permitAll']],
//	[pattern: '/**/favicon.ico', access: ['permitAll']]
//]

//grails.plugin.springsecurity.filterChain.chainMap = [
//	[pattern: '/assets/**',      filters: 'none'],
//	[pattern: '/**/js/**',       filters: 'none'],
//	[pattern: '/**/css/**',      filters: 'none'],
//	[pattern: '/**/images/**',   filters: 'none'],
//	[pattern: '/**/favicon.ico', filters: 'none'],
//	[pattern: '/**',             filters: 'JOINED_FILTERS']
//]


//grails.plugin.springsecurity.rememberMe.persistent = true
//grails.plugin.springsecurity.rememberMe.persistentToken.domainClassName = 'br.com.integracaofornecedor.model.PersistentLogin'


import br.com.integracaofornecedor.model.UserPasswordEncoderListener
import br.com.integracaofornecedor.security.SecurityEventListener
// Place your Spring DSL code here
beans = {
    securityEventListener(SecurityEventListener)
    userPasswordEncoderListener(UserPasswordEncoderListener, ref('hibernateDatastore'))
}

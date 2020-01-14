package main.java.com.algaworks.gestaofesta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Configuration
public class InMemorySecurityConfig {
@Autowired

public void configureGlobal(AuthenticationManagerBuilder builder)
throws Exception {
builder
.inMemoryAuthentication()
.withUser("aluno").password("123").roles("USER")
.and()
.withUser("estefane").password("123").roles("USER")
.and()
.withUser("ifal").password("123").roles("USER");
}
}
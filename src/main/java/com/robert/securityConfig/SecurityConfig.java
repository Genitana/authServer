package com.robert.securityConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Bean
    @Override
    protected UserDetailsService userDetailsService(){
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        // 创建两个 qq 用户
        manager.createUser(User.withUsername("test1").password("test1").authorities("USER").build());
        manager.createUser(User.withUsername("test2").password("test2").authorities("USER").build());
        return manager;
    }
//
//    @Autowired
//    public void globalConifg(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("250577914").password("123456").authorities("USER").and()
//                .withUser("920129126").password("123456").authorities("USER");
//    }

    /**
     *  需要配置这个支持password模式
     * @return
     * @throws Exception
     */
    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

//    @Bean
//    PasswordEncoder passwordEncoder(){
//        return NoOpPasswordEncoder.getInstance();
//    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        // @formatter:off
//        http
////                .requestMatchers().anyRequest()
////                .and()
//                .authorizeRequests()
////                .antMatchers("/", "/home","/login","/oauth/authorize").permitAll()
//                .antMatchers("/tokentest").permitAll()
//                .antMatchers("/oauth/token").permitAll()
//                .anyRequest().authenticated()
//                .and().anonymous()
//                .and()
//                .formLogin()  //默认的登录页
////                .loginPage("/login")
////                .and()
////                .httpBasic()
////                .disable()
////                .exceptionHandling()
////                .accessDeniedPage("/login?authorization_error=true")
//                .and()
//                // TODO: put CSRF protection back into this endpoint
//                .csrf()
////                .requireCsrfProtectionMatcher(new AntPathRequestMatcher("/oauth/authorize"))
//                .disable();
////                .loginPage("/login")
////                .failureUrl("/login?authentication_error=true")
////        .httpBasic();
//        // @formatter:on
//    }

}

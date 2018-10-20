package lk.ijse.maven.cotton.main;

import lk.ijse.maven.cotton.repository.CustomerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by Ireshika Chamini on 8/29/2018.
 */
@Configuration
@EnableWebMvc
@EnableJpaRepositories(basePackageClasses = CustomerRepository.class)
@ComponentScan("lk.ijse.maven.cotton")
@EnableTransactionManagement
public class WebAppConfig implements WebMvcConfigurer{
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }


}

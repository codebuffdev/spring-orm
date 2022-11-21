package ss.spring.orm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = "ss.spring.orm.service")
@EnableTransactionManagement
public class ServiceConfig {

}

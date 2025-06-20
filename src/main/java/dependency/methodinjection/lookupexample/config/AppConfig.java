package dependency.methodinjection.lookupexample.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "dependency.methodinjection.lookupexample.service")
public class AppConfig {

}

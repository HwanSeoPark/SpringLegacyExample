package dependency.methodinjection.lookup.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "dependency.methodinjection.lookup.model")
public class AppConfig {}

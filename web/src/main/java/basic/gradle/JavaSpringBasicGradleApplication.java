package basic.gradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Web module: controllers and templates 该模块主要包含控制器和view模板
 *
 * @SpringBootApplication 所扫描的package必须和module中包的路径一致，才能使用Application Web Context中注入的bean
 */
@SpringBootApplication
public class JavaSpringBasicGradleApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaSpringBasicGradleApplication.class, args);
    }
}

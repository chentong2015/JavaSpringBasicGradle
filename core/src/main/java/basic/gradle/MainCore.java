package basic.gradle;

/**
 * Core module: services, dao, repositories, entities 包含其他module所共享的类型和服务
 *
 * @SpringBootApplication 在该module中构架Spring Boot App
 * 会使得该模块下的bean被自动注入到当前Application Web Context中, 导致别的module无法引用其中的bean !!
 */
// @SpringBootApplication
public class MainCore {

//    public static void main(String[] args) {
//        System.out.println("Main Core module");
//        SpringApplication.run(MainCore.class, args);
//    }
}

package basic.gradle;

/**
 * Gradle: open-source build automation system, written in java and Groovy  ===> Groovy语言，单字符表示字符串 !!
 * 1. Use Groovy-based domain specific language (DSL)
 * 2. Design for multi-project builds, complex and large projects 更加快速的build时间，智能的更新build tree
 * 3. Gradle is the official build tool for Android               提供了更多的灵活性和扩展性
 * 4. Better with Unit Testing & Continuous Integration
 */
// TODO: 使用Spring Initializer构建, 只能构建root project, 无法构建module
// Gradle User Manual: https://docs.gradle.org/current/userguide/userguide.html
// Spring Boot Gradle Guide : https://docs.spring.io/spring-boot/docs/2.4.3/gradle-plugin/reference/htmlsingle/
public class BaseGradle {

    /**
     * Spring framework uses Gradle 使用插件 Spring Boot Gradle Plugin
     * 1. Projects 可以构建一个或者多个项目，一个项目可能是jar library或者web application
     * 2. Tasks    每个项目有多个tasks任务构成, each task represents an atomic piece of work  ==> 类似于maven goal
     * ---------------------------
     * Build phases and lifecycle
     * 1. Initialization 确定要build的项目
     * 2. Configuration  配置要build的项目
     * 3. Execution      确定并执行tasks
     */

    /**
     * Run Gradle tasks 在Gradle view运行需要的task > build archive file 第一次需要的时间比较长
     * 1. 需要借助Gradle Wrapper: script that invokes a declared version of Gradle, downloading it beforehand is necessary
     * 2. distributionUrl=...gradle-6.7-bin.zip Gradle的版本号声明 (这里的版本号需要和Java的版本号兼容)
     */

	 
	/**
	 * Run gradle in Terminal 可以在CMD命令提示行下运行命令
	 * > gradlew -stop  解决Cannot lock Java Compile cache, it has been locked by this process 由于启动后没有成功关闭而造成的lock
	 */
	 
    /**
     * Gradle构建的项目: 基本结构
     * build.gradle : build configuration script 定义项目和任务tasks
     * src
     * -- main
     * ----- java
     * ---------- com.ctong
     * ---------------- package
     * -------------------- Main.java
     * ----- resources
     * ---------- images
     * ----- webapp
     * ---------- WEB-INF
     * ---------------- web.xml
     * ---------- index.html
     * -- test
     * ----- java
     * ---------- com.ctong
     * ----- resources
     * ---------- images
     */
}

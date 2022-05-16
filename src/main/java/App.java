import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld beanHelloWorld1 = (HelloWorld) context.getBean("helloworld");
        HelloWorld beanHelloWorld2 = context.getBean("helloworld", HelloWorld.class);

        Cat beanCat1 = context.getBean("cat", Cat.class);
        Cat beanCat2 = context.getBean("cat", Cat.class);

        System.out.println(beanHelloWorld1 == beanHelloWorld2);
        System.out.println(beanCat1 == beanCat2);
    }
}
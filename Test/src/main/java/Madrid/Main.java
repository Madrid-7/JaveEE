package Madrid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applications.xml");

//        Duck duck1 = (Duck) context.getBean("duck1");
//        System.out.println(duck1);
//        Duck duck1_1 = (Duck) context.getBean("duck1");
//        System.out.println(duck1_1 == duck1);       //true:duck1默认scope为单例
//
//        Duck duck2 = (Duck) context.getBean("duck2");
//        System.out.println(duck2);
//        Duck duck2_2 = (Duck) context.getBean("duck2");
//        System.out.println(duck2_2 == duck2);       //false:duck2设置的scope为prototype,
//                                                    // getBean生成新的对象
//
//        DuckShop shop = (DuckShop) context.getBean("duckShop");
//        System.out.println(shop);
//
//        Person man = context.getBean(Person.class);
//        System.out.println(man);
//
//        Duck duck3 = (Duck) context.getBean("duck3");
//        System.out.println(duck3);
//
//        Duck duck4 = (Duck) context.getBean("duck4");
//        System.out.println(duck4);
    }
}

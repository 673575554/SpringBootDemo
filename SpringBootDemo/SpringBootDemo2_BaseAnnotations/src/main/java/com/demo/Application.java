package com.demo;

import ch.qos.logback.core.db.DBHelper;
import com.demo.bean.Pet;
import com.demo.bean.User;
import com.demo.config.Myconfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {

        //1、返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);

        //2、查看容器里面的组件
        String[] names = run.getBeanDefinitionNames();
        for (String name:names){
            System.out.println(name);
        }

        //3、从容器中获取组件
        Pet tom01 = run.getBean("tom", Pet.class);
        Pet tom02 = run.getBean("tom", Pet.class);

        System.out.println("组件："+(tom01==tom02));

        //4、com.demo.config.Myconfig$$EnhancerBySpringCGLIB$$cad481de@76304b46
        Myconfig bean = run.getBean(Myconfig.class);
        System.out.println(bean);

        //如果@Configuration(proxyBeanMethods = true)代理对象调用方法。SpringBoot总会检查这个组件是否在容器中有。
        //保持组件单实例
        User user = bean.user01();
        User user1 = bean.user01();
        System.out.println(user==user1);

        User user01 = run.getBean("user01",User.class);
        Pet pet = run.getBean("tom",Pet.class);
        System.out.println("用户的宠物："+(user01.getPet()==pet));

        //5、获取组件
        String[] beanNamesForType = run.getBeanNamesForType(User.class);
        System.out.println("===========");
        for (String s : beanNamesForType) {
            System.out.println(s);
        }

        DBHelper bean1 = run.getBean(DBHelper.class);
        System.out.println(bean1);
    }
}

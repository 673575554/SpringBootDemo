package com.demo.config;

import ch.qos.logback.core.db.DBHelper;
import com.demo.bean.Car;
import com.demo.bean.Pet;
import com.demo.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * 1、配置类里面使用@Bean标注在方法上给容器注册组件，默认是单实例的
 * 2、配置类本身也是一个组件
 * 3、proxyBeanMethods：代理Bean方法
 *      Full： 为true,全配置，可以实现单例模式，每次调用使用最开始的对象。
 *      Lite： 为false，轻量配置，容器中不会保存代理对象，每次调用会产生新对象。
 *      可以解决组件依赖问题
 * 4、@Import({User.class, DBHelper.class})
 *      给容器中自动创建出指定两个类型的组件，默认的组件名就是全类名
 *
 * */

@Import({User.class, DBHelper.class})
@Configuration(proxyBeanMethods = false)  //告诉SpringBoot这是一个配置类 == 配置文件
@ConditionalOnMissingBean(name = "tom2")  //容器里没有名字为tom2的组件才进行下面配置
@ImportResource("classpath:beans.xml")
@EnableConfigurationProperties(Car.class)
//1、开启Car配置绑定功能
//2、把Cae组件自动注册到容器中
public class Myconfig {

    /**
     * 外部无论对配置类中的组件注册方法调用多少次，其获取的都是注册前的单实例对象
     * */
    @Bean  //给容器中添加组件。以方法名为作为组件的id，返回类型就是组件类型。返回的值，就是组件在容器中的实例。
    public User user01(){
        User zhangsan = new User("zhangsan","18");
        // user组件依赖了Pet组件，如果proxyBeanMethods为false将报错。
        zhangsan.setPet(tomcat());
        return zhangsan;
    }

    @Bean("tom")
    public Pet tomcat(){
        return new Pet("tomcat");
    }
}

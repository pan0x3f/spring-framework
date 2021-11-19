package com.cherry;

import com.cherry.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : zhang pan
 * @date : 11:26 上午 2021/11/19
 * 描述：
 */
public class Application {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/Beans.xml");
		User user = ac.getBean("user", User.class);
		System.out.println(user.toString());
	}
}

package com.yijiupi.checkcode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Start {
	public static void main(String[] args) {
		/* SpringApplication.run(CheckCodeController.class, args); */
		new InvocationHandler() {

			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				method.invoke(proxy, args);
				return null;
			}
		};
	}
}

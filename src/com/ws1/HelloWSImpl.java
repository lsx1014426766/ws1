package com.ws1;

import javax.jws.WebService;


/**
 * 接口实现类  SEI的实现类
 * @author Administrator
 *
 */
@WebService
public class HelloWSImpl implements HelloWS {

	@Override
	public String sayHi(String name) {
		System.out.println("sayHi:"+name);
		return "hi:"+name;
	}

}

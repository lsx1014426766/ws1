package com.ws1;

import javax.jws.WebMethod;
import javax.jws.WebService;

/*
 * SEI Service Endpoint Interface 服务端终点接口
 * jdk的包
 * 服务器端
 */
@WebService
public interface HelloWS {
	@WebMethod
  public String sayHi(String name);
}

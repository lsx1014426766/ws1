package com.ws1;

import javax.jws.WebMethod;
import javax.jws.WebService;

/*
 * SEI Service Endpoint Interface ������յ�ӿ�
 * jdk�İ�
 * ��������
 */
@WebService
public interface HelloWS {
	@WebMethod
  public String sayHi(String name);
}

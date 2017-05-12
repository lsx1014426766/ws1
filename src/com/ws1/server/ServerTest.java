package com.ws1.server;

import javax.xml.ws.Endpoint;

import com.ws1.HelloWSImpl;

/**
 * 服务端  使用jdk的类和方法
 * 发布web service
 * @author Administrator
 * 要访问这个服务，通过暴露出去的地址，
 *   方式一：
               通过浏览器就可以访问：（前提是启动这个应用，运行当前的main方法即可发布应用）
 *   这里可以用eclipse自带的专门的web service explorer浏览器查看
 * web service explorer javaee 自带的工具 作用：快速测试这个WSDL地址是否通
 *   方式二：
 *   创建客户端应用编码方式访问
 *    借助jdk的wsimport.exe工具生成客户端代码 wsimport -keep url //url为wsdl文件的路径
 *    借助生成的代码编写请求代码
 */
public class ServerTest {
 public static void main(String[] args) {
	//EndPoint 终端  工具类  发布web service
	 String address="http://localhost:8080/ws1/hiws";
	 Endpoint.publish(address,new HelloWSImpl());
	 // Endpoint.publish(address, new HelloWSImpl());
	 System.out.println("发布成功");
}
}
/**
 * SOAP Request Envelope: 
 * <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:q0="http://ws1.com/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
- <soapenv:Body>
- <q0:sayHi>
  <arg0>tom</arg0> 
  </q0:sayHi>
  </soapenv:Body>
  </soapenv:Envelope>
  
  SOAP Response Envelope: 
  - <S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/">
- <S:Body>
- <ns2:sayHiResponse xmlns:ns2="http://ws1.com/">
  <return>hi:tom</return> 
  </ns2:sayHiResponse>
  </S:Body>
  </S:Envelope>
  
*/
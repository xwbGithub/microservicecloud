# microservicecloud
此项目集合了springcloud的大多数的模块实例。以对各个模块的说明以及他们之间的关联关系<br>
<span style="color:red;">包括的模块SpringCloud模块有:<font color=red>Eureka、Hystrix、actuator、Ribbon、Feign、config、zuul</font></span><br/>
&nbsp;&nbsp;<b>1、</b>sqlFIle此文件是使用到的sql文件,里面包含微服务运行所包含的所有数据,是mysql的，童鞋们在学习的过程中可以直接运行即可。<br>
&nbsp;&nbsp;<b>2、</b>microservicecloud-api:<br>
  为公共api方法，里面包含了实体类、公共的service方法。<br>
&nbsp;&nbsp;<b>3、</b>microservicecloud-eureka-7001、microservicecloud-eureka-7002、microservicecloud-eureka-7003<br>
  这三个模块是做eureka的集群模块，里面有设置单台eureka，也可以指定为eureka的集群方式。配置文件application.yml里面的service-url：defaultZone有具体的配置。<br>
&nbsp;&nbsp;<b>4、</b>microservicecloud-provider-dept-8001、microservicecloud-provider-dept-8002、microservicecloud-provider-dept-8003
  这三个模块是微服务提供者。其中包括mybatis、eureka、jdbc、info的基本信息。 实现的功能都相同,里面稍稍有些不同的是连接的是各自的数据库。<br>
&nbsp;&nbsp;<b>5、</b>microservicecloud-provider-dept-hystrix-8001
  服务熔断模块，可以指定 @HystrixCommand来对程序运行出错进行进一步的容错信息捕获。<br>
&nbsp;&nbsp;<b>6、</b>microservicecloud-consumer-hystrix-dashboard
  服务监控，具体的实现可以查看以下网址<a src="https://blog.csdn.net/www1056481167/article/details/81157409">https://blog.csdn.net/www1056481167/article/details/81157409</a><br>
&nbsp;&nbsp;<b>7、</b>microservicecloud-config-3344、microservicecloud-config-client-3355
  3344指定config的服务（其中指定远程config的远程git地址），而3355是调用3344的微服务锁指定的配置文件内容。<br>
&nbsp;&nbsp;<b>8、</b>microservicecloud-consumer-dept-80、microservicecloud-consumer-dept-feign
  其中80的朱启动类添加@RibbonClient(name = "MICROSERVICECLOUD-DEPT", configuration = MySelfRule.class)对MICROSERVICECLOUD-DEPT进行负载均衡，feign客户端调用的负载均衡算法，通过客户端的RestTemplate调用具体的微服务，可以看到具体使用那个服务进行负载均衡<br>
&nbsp;&nbsp;<b>9、</b>microservicecloud-zuul-gateway-9527
  为具体的路由网关，通过路由网关访问以上各个微服务。可以在路由网关出加一些访问限制,可以在添加zuul.xxx的一些路由映射规则。<br>

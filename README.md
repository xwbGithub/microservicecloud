# microservicecloud
此项目集合了springcloud的大多数的模块实例。以对各个模块的说明以及他们之间的关联关系
1、sqlFIle此文件是使用到的sql文件,里面包含微服务运行所包含的所有数据,是mysql的，童鞋们在学习的过程中可以直接运行即可。
2、microservicecloud-api：
  为公共api方法，里面包含了实体类、公共的service方法。
3、microservicecloud-eureka-7001、microservicecloud-eureka-7002、microservicecloud-eureka-7003
  这三个模块是做eureka的集群模块，里面有设置单台eureka，也可以指定为eureka的集群方式。配置文件application.yml里面的service-url：defaultZone有具体的配置。
4、microservicecloud-provider-dept-8001、microservicecloud-provider-dept-8002、microservicecloud-provider-dept-8003
  这三个模块是微服务提供者。其中包括mybatis、eureka、jdbc、info的基本信息。 实现的功能都相同,里面稍稍有些不同的是连接的是各自的数据库。
5、microservicecloud-provider-dept-hystrix-8001
  服务熔断模块，可以指定 @HystrixCommand来对程序运行出错进行进一步的容错信息捕获。
6、microservicecloud-consumer-hystrix-dashboard
  服务监控，具体的实现可以查看以下网址https://blog.csdn.net/www1056481167/article/details/81157409
7、microservicecloud-config-3344、microservicecloud-config-client-3355
  3344指定config的服务（其中指定远程config的远程git地址），而3355是调用3344的微服务锁指定的配置文件内容。
8、microservicecloud-consumer-dept-80、microservicecloud-consumer-dept-feign
  负载均衡微服务,80为具体的客户端，feign为具体的负载均衡算法，通过客户端的RestTemplate调用具体的微服务，可以看到具体使用那个服务进行负载均衡
9、microservicecloud-zuul-gateway-9527
  为具体的路由网关，通过路由网关访问以上各个微服务。可以在路由网关出加一些访问限制,可以在添加zuul.xxx的一些路由映射规则。

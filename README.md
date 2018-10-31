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
  

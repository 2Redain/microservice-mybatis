#########################################################
工程代码见 https://github.com/2Redain/microservice-mybatis
#########################################################

#########################################################
基本模块
discovery-eureka（提供eureka服务器，去发现服务）
provider-mybatis（提供User的数据库操作方法）
consumer-user   （消费provider-mybatis模块提供的代码，通过HTTP协议建立连接）
testFormicro    （这个没什么用，不用管，我是拿来备用的）    
#########################################################

#########################################################
基本思路是provide-mybatis提供方法给consumer-user消费
#########################################################

#########################################################
目前模糊的地方
1.RestTemplate的具体用法
2.HTTP协议中的POST,GET。。。。
3.mybatis目前放在单独的一个子模块中，其方法来提供给其他消息消费的模块来进行消费（也就是调用），每次调用都需要建立一次HTTP的连接，总感觉怪怪的。
#########################################################


#########################################################
集成方法
第一种方法：添加的是mybatis-spring-boot-starter依赖
第二种方法：添加mybatis依赖和mybatis-spring依赖

第一种方法是自动配置，第二种需要手动去配置

这次工程中，用的是第一种方法
学习的网址是http://www.mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/

第二种方法
详情见http://blog.csdn.net/isea533/article/details/50359390
#########################################################


#########################################################
编写SQL语句的方法
1.利用xml文件，比如UserMapper.xml
2.利用@Select，@Insert等注解
3.利用sqlsession（这个我不是特别清楚）

provider-mybatis用的是xml文件，文件名UserMapper.java UserMapper.xml

方法1 2 简单工程代码示例见
https://github.com/mybatis/spring-boot-starter/tree/master/mybatis-spring-boot-samples

方法3 不是特别的清楚，不过在http://www.mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/网站有提到过。（个人觉得网上大部分用的是第二种集成的方法）
#########################################################

#########################################################
applicaion.properties文件
mybatis的配置是单独在mybatis-config.xml中进行的，也可以在application.properties进行配置
由于已经在appliation.properties中配置了数据库等环境信息，mybatis-config中只需配置User类
所在的包和xml文件的地址

微服务那块的配置见
http://blog.didispace.com/categories/Spring-Cloud/page/2/
#########################################################







#########################################################
���̴���� https://github.com/2Redain/microservice-mybatis
#########################################################

#########################################################
����ģ��
discovery-eureka���ṩeureka��������ȥ���ַ���
provider-mybatis���ṩUser�����ݿ����������
consumer-user   ������provider-mybatisģ���ṩ�Ĵ��룬ͨ��HTTPЭ�齨�����ӣ�
testFormicro    �����ûʲô�ã����ùܣ������������õģ�    
#########################################################

#########################################################
����˼·��provide-mybatis�ṩ������consumer-user����
#########################################################

#########################################################
Ŀǰģ���ĵط�
1.RestTemplate�ľ����÷�
2.HTTPЭ���е�POST,GET��������
3.mybatisĿǰ���ڵ�����һ����ģ���У��䷽�����ṩ��������Ϣ���ѵ�ģ�����������ѣ�Ҳ���ǵ��ã���ÿ�ε��ö���Ҫ����һ��HTTP�����ӣ��ܸо��ֵֹġ�
#########################################################


#########################################################
���ɷ���
��һ�ַ�������ӵ���mybatis-spring-boot-starter����
�ڶ��ַ��������mybatis������mybatis-spring����

��һ�ַ������Զ����ã��ڶ�����Ҫ�ֶ�ȥ����

��ι����У��õ��ǵ�һ�ַ���
ѧϰ����ַ��http://www.mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/

�ڶ��ַ���
�����http://blog.csdn.net/isea533/article/details/50359390
#########################################################


#########################################################
��дSQL���ķ���
1.����xml�ļ�������UserMapper.xml
2.����@Select��@Insert��ע��
3.����sqlsession������Ҳ����ر������

provider-mybatis�õ���xml�ļ����ļ���UserMapper.java UserMapper.xml

����1 2 �򵥹��̴���ʾ����
https://github.com/mybatis/spring-boot-starter/tree/master/mybatis-spring-boot-samples

����3 �����ر�������������http://www.mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/��վ���ᵽ���������˾������ϴ󲿷��õ��ǵڶ��ּ��ɵķ�����
#########################################################

#########################################################
applicaion.properties�ļ�
mybatis�������ǵ�����mybatis-config.xml�н��еģ�Ҳ������application.properties��������
�����Ѿ���appliation.properties�����������ݿ�Ȼ�����Ϣ��mybatis-config��ֻ������User��
���ڵİ���xml�ļ��ĵ�ַ

΢�����ǿ�����ü�
http://blog.didispace.com/categories/Spring-Cloud/page/2/
#########################################################







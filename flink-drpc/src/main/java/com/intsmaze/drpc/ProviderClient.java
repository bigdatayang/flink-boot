package com.intsmaze.drpc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：intsmaze
 * @date ：Created in 2021/1/26 22:07
 * @description： https://www.cnblogs.com/intsmaze/
 * @modified By：
 */
public class ProviderClient {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-provider.xml"});
        context.start();
        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext(new String[]{"dubbo-provider.xml"});
        context1.start();
        System.in.read(); // 按任意键退出
    }
}
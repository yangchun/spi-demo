package com;

import com.spi.HelloInterface;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Created by Administrator on 2017/12/28 0028.
 */
//test
public class Test {
    public static void main(String[] args) {
        ServiceLoader<HelloInterface> serviceLoader=ServiceLoader.load(HelloInterface.class);
        Iterator<HelloInterface> it = serviceLoader.iterator();
        while (it!=null && it.hasNext()) {
            HelloInterface demoService = it.next();
            System.out.println("class:"+demoService.getClass().getName()+"***"+demoService.SayHello());
        }
    }
}

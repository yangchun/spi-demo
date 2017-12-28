package com.spiImpl;

import com.spi.HelloInterface;

/**
 * Created by Administrator on 2017/12/28 0028.
 */
public class ImageHelloInterface implements HelloInterface {
    public String SayHello() {
        System.out.println("Image Hello");
        return "Image";
    }
}

package Proxy;

/**
 * 待扩展的类，代理会在此基础上进行扩展
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}


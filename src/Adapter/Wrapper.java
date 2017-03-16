package Adapter;

/**
 * 创建抽象类，实现接口中的方法，以便其他类继承此类实现自己想要的方法
 */
public abstract class Wrapper implements Sourceable{
    @Override
    public void method1() {}

    @Override
    public void method2() {}
}

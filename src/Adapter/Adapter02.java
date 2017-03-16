package Adapter;

/**
 * 对象的适配器模式：
 * 不继承待扩展的类，直接持有其对象
 */
public class Adapter02 implements Targetable {
    private Source source;

    public Adapter02(Source source) {
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}

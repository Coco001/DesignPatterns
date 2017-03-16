package Adapter;

/**
 * 继承抽象类，实现自己需要的方法即可
 */
public class SourceSub1 extends Wrapper {
    @Override
    public void method1() {
        System.out.println("the sourceable interface's first Sub1!");
    }
}

package Decorator;

/**
 * Decorator类是一个装饰类，可以为Source类动态的添加一些功能
 */
public class Decorator implements Sourceable {
    private Sourceable sourceable;

    public Decorator(Sourceable sourceable) {
        this.sourceable = sourceable;
    }

    @Override
    public void method() {
        System.out.println("before decorator!");
        sourceable.method();
        System.out.println("after decorator!");

    }
}

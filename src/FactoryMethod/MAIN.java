package FactoryMethod;

/**
 * 工厂设计模式的三种实现
 */
public class MAIN {
    /**
     * 第一种实现：简单工厂模式
     * @param type
     * @return
     */
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }

    /**
     * 第二种实现：多种工厂模式
     */
    public class SendFactory02 {
        public Sender produceMail(){
            return new MailSender();
        }

        public Sender produceSms(){
            return new SmsSender();
        }
    }

}
/**
 * 第三种实现，静态工厂模式
 */
class SendFactory03 {
    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}

package AbstractFactory;

/**
 * 发送短信的工厂
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}

package AbstractFactory;

/**
 * 发送邮件的工厂
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}

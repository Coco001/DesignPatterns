package AbstractFactory;

/**
 * 发送邮件
 */
public class MailSender implements Sender{

    @Override
    public void Send() {
        System.out.println("发送邮件");
    }
}

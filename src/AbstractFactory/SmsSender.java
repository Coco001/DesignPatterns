package AbstractFactory;

/**
 * 发送短信
 */

public class SmsSender implements Sender{
    @Override
    public void Send() {
        System.out.println("发送短信");
    }
}
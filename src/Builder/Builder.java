package Builder;

import AbstractFactory.MailSender;
import AbstractFactory.SmsSender;
import AbstractFactory.Sender;

import java.util.ArrayList;
import java.util.List;

/**
 * 建造者模式：
 * 将各种产品集中起来进行管理，用来创建复合对象
 */
public class Builder {
    private List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int count){
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count){
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }

}

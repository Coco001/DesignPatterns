package Prototype;

/**
 * 原型模式：
 * 将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象
 */
public class Prototype implements Cloneable {//实现Cloneable接口
    public Object clone() throws CloneNotSupportedException {
        Prototype proto = (Prototype) super.clone();//重点是super.clone()这句话
        return proto;
    }
}


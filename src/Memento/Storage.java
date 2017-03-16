package Memento;

/**
 * Original类是原始类，里面有需要保存的属性value及创建一个备忘录类，用来保存value值。
 * Memento类是备忘录类，Storage类是存储备忘录的类，持有Memento类的实例
 */
public class Storage {
    private Memento memento;
    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

}

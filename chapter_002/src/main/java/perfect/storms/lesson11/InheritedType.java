package perfect.storms.lesson11;

import java.util.ArrayList;
import java.util.List;

public class InheritedType<T extends Number> {

    public List<? super SuperType> list = new ArrayList<>();
    private Object[] object;
    private int index;

    public InheritedType(int size) {
        this.object = new Object[size];
    }

    public void add(T t) {
        this.object[this.index++] = t;
    }

    public T get(int index) {
        if (index >= 0 && index <= this.index) {
           return (T) this.object[index];
        }
        return null;
    }

    public List<? super SuperType> getList() {
        return list;
    }
}

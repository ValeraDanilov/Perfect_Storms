package perfect.storms.lesson11;

import java.util.ArrayList;
import java.util.List;

public class Parameterized<T> {

    public List<T> addValue(T t) {
        List<T> list = new ArrayList<>();
        for (int index = 0; index < 10; index++) {
            list.add(t);
        }
        return list;
    }
}

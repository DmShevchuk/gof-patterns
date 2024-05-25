package momento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Originator.Memento> mementoList = new ArrayList<>();

    public void add(Originator.Memento state) {
        mementoList.add(state);
    }

    public Originator.Memento get(int index) {
        return mementoList.get(index);
    }
}

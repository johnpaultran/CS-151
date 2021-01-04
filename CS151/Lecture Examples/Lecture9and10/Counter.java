package Lecture9and10;

public class Counter {
    private int value;

    public int getValue() {
        return this.value;
    }

    public void click() {
        ++this.value;
    }

    public void reset() {
        this.value = 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Counter) {
            Counter c2 = (Counter) obj;
        }
        else {
            return false;
        }
        return super.equals(obj);
    }
}

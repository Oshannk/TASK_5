package lk.ac.kln.fct.learn.generics.core;

public class Entry<K, O> {
    private K key;
    private O value;

    public Entry(K key, O value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public O getValue() {
        return value;
    }

    public void setValue(O value) {
        this.value = value;
    }


}

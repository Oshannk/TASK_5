package lk.ac.kln.fct.learn.generics.core;

import java.util.ArrayList;

public class Inventory<K, O> {
    private ArrayList<Entry<K, O>> entries = new ArrayList<>();

    public void addToInventory(Entry<K, O> entry) {
        for (Entry<K, O> e : entries) {
            if (e.getKey().equals(entry.getKey())) {
                throw new IllegalArgumentException("Duplicate key found");
            }
        }
        entries.add(entry);
    }

    public ArrayList<Entry<K, O>> getInventory() {

        return entries;
    }

    public Entry<K, O> getEntryByIndex(int index) {

        return entries.get(index);
    }

    public Entry<K, O> getEntryByKey(K key) {

        for (Entry<K, O> e : entries) {
            if (e.getKey().equals(key)) {
                return e;
            }
        }
        return null;
    }

    public int getEntryIndex(Entry<K, O> entry) {
        return entries.indexOf(entry);
    }

    public boolean removeByEntry(Entry<K, O> entry) {

        return entries.remove(entry);
    }

    public Entry<K, O> removeByIndex(int index) {

        return entries.remove(index);
    }

    public void removeAll() {
        entries.removeAll(entries);
    }
}

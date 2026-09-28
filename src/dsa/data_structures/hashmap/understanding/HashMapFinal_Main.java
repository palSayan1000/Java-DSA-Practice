package dsa.data_structures.hashmap.understanding;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapFinal_Main {
    static void main() {
         // hashDemo();
        HashMapFinal<String, String> map = new HashMapFinal<>();

        map.put("Mango", "King Of Fruits!!");
        map.put("Sayan", "Best Coder");
        map.put("Apple", "A sweet red fruit");

        System.out.println(map.get("Apple"));
    }
}

class HashMapFinal<K, V> {

    ArrayList<LinkedList<Entity<K, V>>> list;

    private int size = 0;

    private float lf = 0.5f;

    public HashMapFinal() {
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }
    }

    public void put(K key, V value) {
        int hash = Math.abs(key.hashCode() % list.size());

        LinkedList<Entity<K, V>> entities = list.get(hash);

        for (Entity<K, V> entity : entities) {
            if (entity.key.equals(key)) {
                entity.value = value;
                return;
            }
        }

        if ((float)size / list.size() > lf) {
            reHash();
        }

        entities.add(new Entity<K, V>(key, value));
        size++;
    }

    private void reHash() {
        System.out.println("We are now Re-Hashing");

        ArrayList<LinkedList<Entity<K, V>>> old = list;
        list = new ArrayList<>();

        size = 0;

        for (int i = 0; i < old.size() * 2; i++) {
            list.add(new LinkedList<>());
        }

        for (LinkedList<Entity<K, V>> entries: old) {
            for (Entity<K, V> entry: entries) {
                put(entry.key, entry.value);
            }
        }
    }

    public V get(K key) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity<K, V>> entities = list.get(hash);

        for (Entity<K, V> entity : entities) {
            if (entity.key.equals(key)) {
                return entity.value;
            }
        }

        return null;
    }

    public void remove(K key) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity<K, V>> entities = list.get(hash);

        Entity<K, V> target = null;
        for (Entity<K, V> entity : entities) {
            if (entity.key.equals(key)) {
                target = entity;
                break;
            }
        }

        entities.remove(target);
        size--;
    }

    public boolean containsKey(K key) {
        return get(key) != null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");

        for (LinkedList<Entity<K, V>> entities: list) {
            for (Entity<K, V> entity: entities) {
                builder.append(entity.key);
                builder.append(" = ");
                builder.append(entity.value);
                builder.append(", ");
            }
        }

        builder.append("}");

        return builder.toString();
    }

    private static class Entity<K, V> {
        K key;
        V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
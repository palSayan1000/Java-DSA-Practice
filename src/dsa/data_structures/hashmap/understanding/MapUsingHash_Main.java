package dsa.data_structures.hashmap.understanding;

class MapUsingHash {

    private final Entity[] entities;

    public MapUsingHash() {
        entities = new Entity[100];
    }

    public void put(String key, String value) {
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, value);// overriding
    }

    public String get(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if (entities[hash] != null && entities[hash].key.equals(key)) {
            return entities[hash].value;
        }
        return null;
    }

    public void remove(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if (entities[hash] != null && entities[hash].key.equals(key)) {
            entities[hash] = null;
        }
    }

    private static class Entity {
        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}

public class MapUsingHash_Main {
    static void main() {
        // hashDemo();
        MapUsingHash map = new MapUsingHash();

        map.put("Mango", "King Of Fruits!!");
        map.put("Sayan", "Best Coder");
        map.put("Apple", "A sweet red fruit");

        System.out.println(map.get("Apple"));
    }
}
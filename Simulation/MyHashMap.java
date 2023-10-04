/*
 * 706. Design HashMap
 */

class MyHashMap {
    private List<Integer> keys;
    private List<Integer> values;

    public MyHashMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        int i = keys.indexOf(key);
        if(i == -1){
            keys.add(key);
            values.add(value);
        }
        else{
            values.set(i, value);
        }
    }
    
    public int get(int key) {
        int i = keys.indexOf(key);
        if( i == -1 ) return i;
        return values.get(i);
    }
    
    public void remove(int key) {
        int i = keys.indexOf(key);
        if ( i == -1 ) return;
        keys.remove(i);
        values.remove(i);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
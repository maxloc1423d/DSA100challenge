class MyHashMap {
    int x[];

    public MyHashMap() {
        x=new int[10000001];
        Arrays.fill(x,-1);
        
    }
    
    public void put(int key, int value) {
x[key]=value;
        
    }
    
    public int get(int key) {
        
        return x[key];
    }
    
    public void remove(int key) {
        
        x[key]=-1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */

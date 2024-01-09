class MyHashSet {

ArrayList<Integer>[] arr;

    public MyHashSet() {
        arr=new ArrayList[1000];
        Arrays.fill(arr,new ArrayList<>());
        
    }
    public int get_hash(int key){
        return (key%1000);
    }
    public void add(int key) {
        int hash =get_hash(key);
        for(int val:arr[hash]){
            if(val==key)
            return;
        }
        arr[hash].add(key);

        
    }
    
    public void remove(int key) {
        int hash =get_hash(key);
        if(arr[hash].contains(key)){
            arr[hash].remove(Integer.valueOf(key));
        }
        
    }
    
    public boolean contains(int key) {
        int hash=get_hash(key);
        return  arr[hash].contains(key);
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */

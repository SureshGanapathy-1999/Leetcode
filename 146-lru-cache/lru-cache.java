class LRUCache {

    class Node{
        int key;
        int value;
        Node next;
        Node prev;

        Node(int k , int v){
            key = k;
            value = v;
            next = null;
            prev = null;
        }
    }

    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1);

    HashMap<Integer, Node> hm = new HashMap<>();
    int cap = 0;

    public LRUCache(int capacity) {
        cap = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(hm.containsKey(key) == true){
            Node t = hm.get(key);
            delete(t);
            beforeTail(t);
            return t.value;
        }else{
            return -1;
        }
        
    }
    
    public void put(int key, int value) {
        if(hm.containsKey(key) == true){
            Node t = hm.get(key);
            t.value = value;
            delete(t);
            beforeTail(t);
            
        }else{
            if(hm.size() == cap){
                Node t = head.next;
                delete(t);
                hm.remove(t.key);
            }
                Node nn = new Node(key,value);
                beforeTail(nn);
                hm.put(key, nn);
        }
    }

    public void delete(Node temp){
        Node t1 = temp.prev;
        Node t2 = temp.next;
        t1.next = t2;
        t2.prev = t1;
        temp.next = null;
        temp.prev = null;
    }

    public void beforeTail(Node nn){
        Node t1 = tail.prev;
        tail.prev = nn;
        nn.prev = t1;
        t1.next = nn;
        nn.next = tail;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
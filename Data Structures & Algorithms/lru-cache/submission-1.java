class Node {
    int key, val;
    Node prev, next;

    Node(int key, int val) { 
        this.key = key; 
        this.val = val; 
    }
}

class LRUCache {
    Map<Integer, Node> lruMap;
    Node head;
    Node tail;
    int cap;

    public LRUCache(int capacity) {
        lruMap = new HashMap<>();
        head = new Node(-1, 0);
        tail = new Node(-1, 0);
        
        head.next = tail;
        head.prev = null;

        tail.prev = head;
        tail.next = null;

        cap = capacity;
    }
    
    public int get(int key) {
        Node target = lruMap.get(key);

        if(target == null){
            return -1;
        }

        //removes the node from spot
        target.prev.next = target.next;
        target.next.prev = target.prev;

        //adding it to the end
        tail.prev.next = target;
        target.prev = tail.prev;
        tail.prev = target;
        target.next = tail;

        return target.val;
    }
    
    public void put(int key, int value) {
        if(lruMap.get(key) == null){
            Node tempNode = new Node(key, value);
            lruMap.put(key, tempNode);

            tail.prev.next = tempNode;
            tempNode.prev = tail.prev;
            tail.prev = tempNode;
            tempNode.next = tail;
        } else {
            Node tempNode = lruMap.get(key);
            tempNode.val = value;
            lruMap.put(key, tempNode);
            
            tempNode.prev.next = tempNode.next;
            tempNode.next.prev = tempNode.prev;

            tail.prev.next = tempNode;
            tempNode.prev = tail.prev;
            tail.prev = tempNode;
            tempNode.next = tail;
        }

        if(lruMap.size() > cap){
            Node target = head.next;
            
            //remove
            head.next = target.next;
            target.next.prev = head;

            //take out hashmap
            lruMap.remove(target.key);
        }
    }
}

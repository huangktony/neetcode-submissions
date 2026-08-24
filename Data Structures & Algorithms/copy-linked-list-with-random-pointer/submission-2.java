/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return head;
        }

        Node headCur = head;
        Map<Node, Node> mapOfNodes = new HashMap<>();
        Node newList = mapOfNodes.computeIfAbsent(headCur, node -> new Node(node.val));
        Node newCur = newList;

        while(headCur != null){    
            
            if(headCur.random != null){
                Node randomCopy = mapOfNodes.computeIfAbsent(headCur.random, node -> new Node(node.val));
                newCur.random = randomCopy;
            }

            if(headCur.next != null){
                newCur.next = mapOfNodes.computeIfAbsent(headCur.next, node -> new Node(node.val));
            }

            newCur = newCur.next;
            headCur = headCur.next;
        }


        return mapOfNodes.get(head);
    }
}

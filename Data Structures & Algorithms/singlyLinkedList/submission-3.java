
 class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }

        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
}

class LinkedList {
     Node head;

    public LinkedList() {
        this.head = new Node(-1);
    }

    public int get(int index) {
        int i = 0;
        Node curr = head.next;

        while(curr != null){
            if(i == index){
                return curr.val;
            }
            i++;
            curr = curr.next;
        }

        return -1;
    }

    public void insertHead(int val) {
        Node new_node = new Node(val);
        new_node.next = head.next;
        head.next = new_node;
    }

    public void insertTail(int val) {
        Node curr = head;
        Node new_node = new Node(val);

        while(curr.next != null){
            curr = curr.next;
        }
         curr.next = new_node;
        }
  
    public boolean remove(int index) {
        if(index < 0){
            return false;
        }

        Node cur = head;
        int i = 0;

        while(cur.next != null && i < index){
            cur = cur.next;
            i++;

        }

        if(cur.next == null){
            return false;
        }

        cur.next = cur.next.next;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> values = new ArrayList<>();
        Node curr = head.next;

        while(curr != null){
            values.add(curr.val);
            curr = curr.next;
        }
        return values;
    }
}
   
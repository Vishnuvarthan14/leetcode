class MyLinkedList {
    Node head;
    Node tail;
    int size=0;
        class Node
        {
            Node next;
            int val;
            Node(int val)
            {
                this.val=val;
            }
        }
        
    // public MyLinkedList() {
        
    // }
    
    public int get(int index) {
            
        if(head==null||index<0||index>=size)
            return -1;

        Node temp=head;
        for(int i=0;i<index;i++)
        {
            temp=temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        
        if(head==null)
        {
            Node node = new Node(val);
            head=node;
            tail=node;
            size++;
            return;
        }

        Node node = new Node(val);
        node.next=head;
        head=node;
        size++;
    }
    
    public void addAtTail(int val) {
        if(head==null)
        {
            Node node = new Node(val);
            head=node;
            tail=node;
            size++;
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=tail.next;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size)
         return;
        if(index==0)
        {
            addAtHead(val);
            return;
        }
        if(index==size)
        {
            addAtTail(val);
            return;
        }

        Node temp=head;
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        Node node = new Node(val);
        node.next=temp.next;
        temp.next=node;
        size++;
    }
    
    public void deleteAtIndex(int index) {

          if (index < 0 || index >= size) return;

        if (index == 0) {
            head = head.next;
            if (head == null) tail = null; 
        } else {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (index == size - 1) { 
                tail = temp;
            }
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
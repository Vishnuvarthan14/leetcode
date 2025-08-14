class BrowserHistory {

        private Node head;
        private Node tail;
        class Node 
        {
            Node next;
            Node prev;
            String val;
            Node(String val)
            {
                this.val=val;
            }
        }
    public BrowserHistory(String homepage) {
        Node node = new Node(homepage);
        head =node;
        tail =node;

    }
    
    public void visit(String url) {
        Node node = new Node(url);

        node.prev=tail;
        tail.next=node;
        tail=node;
    }
    
    public String back(int steps) {
        while(steps>0 && tail.prev!=null)
           { tail=tail.prev;
           steps--;}
        return tail.val;
    }
    
    public String forward(int steps) {
        while(steps>0 && tail.next!=null)
          {  tail=tail.next;
          steps--;}
        return tail.val;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
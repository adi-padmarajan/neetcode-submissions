class MinStack {
    MinStack head;
    MinStack next;
    int value;
    int minValue;

    public MinStack() {
       head = null;
    }
    public MinStack(int value, int minValue){
        this.value = value;
        this.minValue = minValue;
        this.next = null;
    }

    public void push(int val) {
        if(head == null){
            head = new MinStack(val, val);
            return;
        }
        int newMin = Math.min(val, head.minValue);
        MinStack newNode = new MinStack(val, newMin);
        newNode.next = head;
        head = newNode;
    }
    
    public void pop() {
       head = head.next;
    }
    
    public int top() {
        return head.value;
    }
    
    public int getMin() {
        return head.minValue;
    }
}

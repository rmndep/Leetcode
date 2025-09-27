// class MinStack {
//     Stack<Integer> stack;
//     Stack<Integer> minstack;

//     public MinStack() {
//         stack=new Stack<>();
//         minstack=new Stack<>();

//     }
    
//     public void push(int val) {
//         stack.push(val);
//         if(minstack.isEmpty() || val<=minstack.peek()){
//             minstack.push(val);
//         }
//     }
    
//     public void pop() {
//         int popped=stack.pop();
//         if(popped==minstack.peek()){
//             minstack.pop();
//         }
//     }
    
//     public int top() {
//         return stack.peek();
//     }
    
//     public int getMin() {
//         return minstack.peek();
//     }
// }

// /**
//  * Your MinStack object will be instantiated and called as such:
//  * MinStack obj = new MinStack();
//  * obj.push(val);
//  * obj.pop();
//  * int param_3 = obj.top();
//  * int param_4 = obj.getMin();
//  */
class MinStack {
    private Node head;

    public MinStack() {
        
        

    }
    
    public void push(int val) {
      
      if(head==null){
        head =new Node(val,val,null);
      }else{
        head=new Node(val,Math.min(val,head.min),head);
      }
    }
    
    public void pop() {
       head=head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
    return head.min;
    }

    public class Node{
        int val;
        int min;
        Node next;

        Node(int val, int min, Node next){
            this.val=val;
            this.min=min;
            this.next=next;
        }
    }
}
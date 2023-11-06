class Node<T> 
{
    T val;
    Node<T> next;
    
    public Node(T val) {
      this.val = val;
      this.next = null;
    }
}
  
  class Source {
    public static <T> Node<T> reverseList(Node<T> head) {
      // Check if the list is empty or has just one node then return head.

      if (head == null || head.next == null)
      {
        return head;
      }
      
      // Initialize a pointer 
      Node<T> prev = null; // previous node
      Node<T> current = head; // current node
      Node<T> next; // next node

      
      // Iterate through the list until head is null
      while(current != null)
      {
        // store the next node as current
        next = current.next;
        // make the current node to the previous node
        current.next = prev;
        // move the previous and current pointers forward
        prev = current;
        current = next;
      }
      // made the head to the previous node
      head = prev;
      // return head
      return head;
    }
    
    public static void main(String[] args) 
    {
        Node<String> x = new Node<>("x");
        Node<String> y = new Node<>("y");
    
        x.next = y; // x -> y
    
       // reverseList(x); // y -> x

        // Printing solution
        Node<String> head = Source.reverseList(x);

        while (head != null) {
            System.out.println(head.val);
            head = head.next;            
        }
    }
  }
  
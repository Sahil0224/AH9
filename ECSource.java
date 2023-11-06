import java.util.HashSet;

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class ECSource {
  public static <T> boolean isUnivalueList(Node<T> head) {

    // initialize a HashSet to store the values
    HashSet<T> values = new HashSet<>();

    // loop through the list while head is not null
    while(head != null)
    {
      // add the current value to the set
      values.add(head.val);
      
      // move to the next node
      head = head.next;
    }

    // return true if size equals to 1
    return values.size() == 1;
  }

  public static void main(String[] args) {
        Node<String> z = new Node<>("z");
        // z
        // Printing solution
        System.out.println((ECSource.isUnivalueList(z)));

        Node<Integer> u = new Node<>(2);
    
        Node<Integer> v = new Node<>(2);
        Node<Integer> w = new Node<>(3);
        Node<Integer> x = new Node<>(3);
        Node<Integer> y = new Node<>(2);

        u.next = v;
        v.next = w;
        w.next = x;
        x.next = y;

        // 2 -> 2 -> 3 -> 3 -> 2

        System.out.println(ECSource.isUnivalueList(u));
    }
}

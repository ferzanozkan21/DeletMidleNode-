public class SinglyLinkedList {

    // Instance variable
    private Node head;

    // Constructor
    public SinglyLinkedList() {
        head = null;
    }

    // Add a node to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);

        // If the list is empty, set new node as head
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to the end of the list
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        // Link the last node to the new node
        current.next = newNode;
    }

    // Display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    // -------------------------------------------------------
    // Delete the middle node
    public void deleteMiddle() {
        // Case 1: Empty list
        if (head == null) {
            return;
        }

        // Case 2: Only 1 node in the list
        if (head.next == null) {
            head = null;
            return;
        }

        // Step 1: Count total number of nodes
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }

        // Step 2: Determine middle index (count / 2)
        int middleIndex = count / 2;

        // Step 3: Traverse to the node BEFORE the middle node (middleIndex - 1)
        current = head;
        for (int i = 0; i < middleIndex - 1; i++) {
            current = current.next;
        }

        // Step 4: Bypass the middle node
        current.next = current.next.next;
    }

    // Get the head
    public Node getHead() {
        return head;
    }
}
public class Main
{   
    static class Node {
        int data;
        Node next;
        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }
    
    static void addBack(int x, Node head) {
        // we have to traverse till the last node in LL 
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        // now create a new node for adding in the back 
        temp.next = new Node(x);
    }
    static Node addFront(int x, Node head) {
        Node newNode = new Node(x);
        newNode.next = head;
        return newNode;
    }

    static Node reverseLL(Node head) {
        Node prev = null;
        Node cur = head;
        Node front;

        while(cur != null) {
            front = cur.next;
            
            cur.next = prev;
            
            prev = cur;
            cur = front;
        }
        return prev;
    }
    
    static void PrintLL(Node head) {
        Node temp = head;
        System.out.print("Linked List is : ");
        while(temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
            if(temp != null) {  
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

    static void findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle element is : " + slow.data);
    }
    static void kthLast(int k, Node head) {
        Node slow = head;
        Node fast = head;

        // move fast ptr by k times 
        while(k > 0 && fast != null) {
            k--;
            fast = fast.next;
        }
        
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        System.out.println("Kth Last is " + slow.data);
    }



	public static void main(String[] args) {
		Node head = new Node(10);
		addBack(20,head);
		addBack(30,head);
		addBack(40,head);
        addBack(50,head);
        PrintLL(head);
        // head = addFront(5,head);
		// PrintLL(head);
        // head = reverseLL(head);
        // PrintLL(head);
        // findMiddle(head);
        kthLast(2,head);
	}
}
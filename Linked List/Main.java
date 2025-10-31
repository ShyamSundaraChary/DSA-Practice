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
    
    static void PrintLL(Node head) {
        Node temp = head;
        System.out.println("Linked List is : ");
        while(temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
            if(temp != null) {  
                System.out.print(" -> ");
            }
        }
    }
    
	public static void main(String[] args) {
		Node head = new Node(10);
		addBack(20,head);
		addBack(30,head);
		addBack(40,head);
        head = addFront(5,head);
		PrintLL(head);
	}
}
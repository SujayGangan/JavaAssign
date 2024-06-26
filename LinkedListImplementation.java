class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedListImplementation {
    private Node head;
    

    public LinkedListImplementation(){
        this.head = null;
    }


    public void display(LinkedListImplementation list){
        Node temp = list.head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }


    public void insert_start(int data){
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    public void insert_last(int data){
        Node n = new Node(data);

        if (head == null) {
            head = n;
        }
        else{
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }

    }

    public void delete(int data) {
        Node temp = head;
        Node prev = null;

        if (temp != null && temp.data == data) {
            head = temp.next;
            return;
        }
        
        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null)
            return;

        prev.next = temp.next;        
    }
    

    public static void main(String[] args) {
        LinkedListImplementation list = new LinkedListImplementation();

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        list.head = n1;

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        
        list.insert_start(5);
        list.insert_last(60);
        list.delete(40);

        list.display(list);
    }
    
}

public class DLL{
    class Node{
        int data;
        Node next;
        Node prev;
        public Node(int value){
            data = value;
            }    
    }
    
    Node head=null;
    Node tail=null;
    
    void insertValue(int value){
        Node newNode = new Node(value);
        if (head==null){
            head=tail=newNode;
            head.next=null;
            head.prev=null;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
            tail.next=null;
        }
    }
    
    void delete(){
        if (head==null) System.out.println("List is empty");
        else{
            head=head.next;
            if(head!=null) head.prev = null;
            else tail=null;
        }
    }
    
    void display(){
        if (head==null) System.out.println("List is empty");
        else{
            Node current=head;
            while(current != null){
                System.out.print(current.data+" ");
                current=current.next;
            }
            System.out.println("\n");
        }
    }
    
    public static void main(String[] args){
        DLL d = new DLL();
        d.insertValue(3);
        d.insertValue(1);
        d.insertValue(6);
        d.insertValue(4);
        d.insertValue(2);
        System.out.println("List elements: ");
        d.display();
        d.delete();
        System.out.println("List elements after deletion: ");
        d.display();
    }
}

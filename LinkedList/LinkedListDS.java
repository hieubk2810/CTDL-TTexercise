package LinkedList;

public class LinkedListDS {
    public static class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }
    public static void printLinkedList(Node head){
        if(head==null){
            System.out.println("List is empty!");
        }
        else {
            Node temp = head;
            while (temp != null ){
                System.out.println(temp.value);
                temp =temp.next;
                if (temp !=null){
                    System.out.print("->");
                }else {
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.next =n2;
        n2.next =n3;
        printLinkedList(n1);
    }

}

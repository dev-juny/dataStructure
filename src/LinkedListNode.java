/* 단반향 Linked List 1번째 값 제거 가능 */
class LinkedList {
    Node header;

    static class Node {
        int data;
        Node next = null;
    }

    LinkedList(){
        header = new Node();
    }

    void append(int d) {
        Node end = new Node();
        end.data = d;
        Node n = header;

        while (n.next != null) {
            n = n.next;
        }

        n.next = end;
    }

    void delete(int d) {
        Node n = header;
        while (n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next;
            } else {
                n = n.next;
            }
        }
    }

    void retrieve(){
        Node n = header.next;
        while(n.next != null){
            System.out.print(n.data + " => ");
            n = n.next;
        }

        System.out.println(n.data);
    }
}

public class LinkedListNode {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.append(2);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.retrieve();
        ll.retrieve();

    }
}

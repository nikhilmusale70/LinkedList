public class MyLinkedList {
    Node head;
    public void add(int key){
        Node node = new Node();
        node.key = key;
        node.next = null;

        if (head == null){
            head = node;
        }
        else{
            Node n = head;

            while (n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void append(int key, int value){
        Node node = head;
        while (node.key != key){
            node = node.next;
        }
        node.key = value;
    }

    public void show(){
        Node node = head;
        while(node.next != null){
            System.out.println(node.key);
            node = node.next;
        }
        System.out.println(node.key);
    }
}

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

    public void insertAtStart(int key){
        Node node = new Node();
        node.key = key;
        node.next = null;
    }

    public void insertInto(int index, int value){
        Node node = new Node();
        node.key = value;
        node.next = null;
        if (index==0){
            insertAtStart(value);
        }
        Node n = head;
        for (int i=0; i< index-1; i++){
            n = n.next;
        }
        node.next = n.next;
        n.next = node;
    }

    public void deleteAtFirst(){
        head = head.next;
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

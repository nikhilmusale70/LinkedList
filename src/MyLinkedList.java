public class MyLinkedList {
    Node head;
    int totalSize;
    static int nodeIndex;

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

    public void totalSize(){
        Node n = head;
        totalSize =0;

        while (n.next != null){
            n = n.next;
            totalSize++;
        }
        System.out.println("list have "+(totalSize+1)+ " nodes");
    }

    public void deleteAtLast(){
        Node n = head;
        Node n1 = null;
        totalSize();
        for(int i=0;i<totalSize-1;i++)
        {
            n = n.next;
        }
        n1 = n.next;
        n.next = n1.next;
        n1 = null;
    }

    public void deleteAt(int data)
    {
        Node n = head;
        Node n1 = null;
        while (n.key != data){
            if (n.next.key == data)
                break;
            n = n.next;
        }

        n1 = n.next;
        n.next= n1.next;
        n1 = null;
    }

    public int findNode(int data){
        nodeIndex = 0;
        Node node = head;
        while (node.key != data){
            node = node.next;
            nodeIndex++;
        }
        return nodeIndex;
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

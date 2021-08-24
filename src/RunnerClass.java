public class RunnerClass {
    public static void main(String[] args) {
        sortedLinkedList();
    }

    public static void sortedLinkedList(){

        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(56);
        linkedList.add(30);
        linkedList.add(35);
        linkedList.add(22);
        linkedList.add(11);
        linkedList.add(88);

        linkedList.show();

        System.out.println("\nSorted List\n");

        int totalSize = linkedList.totalSize();

        Node n;
        int tempData;
        Node n1 = linkedList.head;

        for (int i=0; i<totalSize-1; i++){
            n = linkedList.head;
            for (int j=0; j<totalSize-1; j++){

                if (n.key > n.next.key){
                    tempData = n.key;
                    n.key=n.next.key;
                    n.next.key = tempData;
                }
                n= n.next;
            }
        }

        linkedList.show();
    }
}

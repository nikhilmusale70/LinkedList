public class RunnerClass {
    public static void main(String[] args) {
        sortedLinkedList();
    }

    public static void sortedLinkedList(){

        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(56);
        linkedList.add(30);
        linkedList.add(70);
        linkedList.add(22);

        linkedList.show();
        System.out.println();
        System.out.println(linkedList.totalSize());
        System.out.println();

        int totalSize = linkedList.totalSize();

        Node n = linkedList.head;
        int tempData;

        for (int i=0; i<=totalSize; i++){
            for (int j=0; j<=totalSize; j++){

                if (n.key > n.next.key){
                    tempData = n.key;
                    n.key = n.next.key;
                    n.next.key = tempData;
                }
                n=n.next;
            }
        }

        linkedList.show();
    }
}

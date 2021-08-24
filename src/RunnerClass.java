public class RunnerClass {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(56);
        linkedList.add(30);
        linkedList.add(70);

        linkedList.show();
        System.out.println();

        int data =30;
        int nodeIndex = linkedList.findNode(data);
        linkedList.insertInto( (nodeIndex+1) , 40);
        linkedList.show();
        System.out.println();

        linkedList.deleteAt(40);
        linkedList.show();
        linkedList.totalSize();
    }
}

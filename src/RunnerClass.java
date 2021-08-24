public class RunnerClass {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(30);
        linkedList.add(56);
        linkedList.add(70);

        linkedList.show();
        System.out.println();

        linkedList.deleteAtLast();
        linkedList.show();

    }
}

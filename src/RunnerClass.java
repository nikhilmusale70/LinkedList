public class RunnerClass {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(30);
        linkedList.add(70);

        linkedList.show();
        System.out.println();

        linkedList.insertInto(0,56);
        linkedList.show();

    }
}

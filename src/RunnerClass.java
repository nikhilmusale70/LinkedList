public class RunnerClass {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(30);
        linkedList.add(56);
        linkedList.add(70);

        linkedList.show();

        linkedList.append(30,56);
        linkedList.append(70,30);

        linkedList.show();

    }
}

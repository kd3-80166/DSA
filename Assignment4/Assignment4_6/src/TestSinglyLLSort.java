public class TestSinglyLLSort {
        public static void main(String[] args) {
        SinglyLL list = new SinglyLL();

        list.addLast(5);
        list.addLast(2);
        list.addLast(4);

        list.displayList(); // List : 5 2 4

        SinglyLL.bubbleSort(list);

        list.displayList(); // List : 2 4 5
    }
}

public class LinkedListTest {

        public static void main(String[] args) {
            LinkedList list = new LinkedList();

            // Insert student records
            list.insertFirst(103, 75);
            list.insertFirst(101, 85);
            list.insertFirst(102, 90);

            System.out.println("List after insertions:");
            list.displayList();

            // Delete specific student record
            System.out.println("List after deleting ID 102:");
            list.delete(102);
            list.displayList();

            // Delete the first element
            System.out.println("List after deleting first element:");
            list.deleteFirst();
            list.displayList();
        }
    }


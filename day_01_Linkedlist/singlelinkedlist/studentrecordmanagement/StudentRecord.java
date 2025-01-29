public class StudentRecord {
    public static void main(String[] args) {
        StudentRecordManagement srm = new StudentRecordManagement();

        srm.addAtBeginning(1, "Alice", 20, "A");
        srm.addAtEnd(2, "Bob", 21, "B");
        srm.addAtPosition(2, 3, "Charlie", 19, "A+");

        System.out.println("All Student Records:");
        srm.displayAll();

        System.out.println("\nSearching for Roll Number 2:");
        srm.searchByRollNumber(2);

        System.out.println("\nUpdating Grade for Roll Number 3:");
        srm.updateGrade(3, "A");
        srm.displayAll();

        System.out.println("\nDeleting Roll Number 1:");
        srm.deleteByRollNumber(1);
        srm.displayAll();
    }
}
class LibraryManagement {
    Book head, tail;

    LibraryManagement() {
        head = tail = null;
    }

    // Add book at the beginning
    void addFirst(String t, String a, String g, int id, boolean av) {
        Book n = new Book(t, a, g, id, av);
        n.next = head;
        if (head != null) head.prev = n;
        head = n;
        if (tail == null) tail = n;
    }

    // Add book at the end
    void addLast(String t, String a, String g, int id, boolean av) {
        Book n = new Book(t, a, g, id, av);
        if (tail != null) {
            tail.next = n;
            n.prev = tail;
        }
        tail = n;
        if (head == null) head = n;
    }

    // Add book at a position
    void addAt(String t, String a, String g, int id, boolean av, int pos) {
        if (pos == 1) addFirst(t, a, g, id, av);
        else {
            Book curr = head;
            for (int i = 1; i < pos - 1 && curr != null; i++) curr = curr.next;
            if (curr == null) System.out.println("Invalid position");
            else {
                Book n = new Book(t, a, g, id, av);
                n.next = curr.next;
                n.prev = curr;
                if (curr.next != null) curr.next.prev = n;
                curr.next = n;
                if (curr == tail) tail = n;
            }
        }
    }

    // Remove book by ID
    void remove(int id) {
        Book curr = head;
        while (curr != null) {
            if (curr.bookId == id) {
                if (curr == head) head = curr.next;
                else curr.prev.next = curr.next;
                if (curr == tail) tail = curr.prev;
                else curr.next.prev = curr.prev;
                return;
            }
            curr = curr.next;
        }
        System.out.println("Book not found.");
    }

    // Search book by title
    void searchByTitle(String t) {
        Book curr = head;
        boolean found = false;
        System.out.println("Books with title '" + t + "':");
        while (curr != null) {
            if (curr.title.equals(t)) {
                System.out.println("Book ID: " + curr.bookId + ", Author: " + curr.author + ", Genre: " + curr.genre + ", Availability: " + (curr.available ? "Available" : "Not Available"));
                found = true;
            }
            curr = curr.next;
        }
        if (!found) System.out.println("No books found.");
    }

    // Search book by author
    void searchByAuthor(String a) {
        Book curr = head;
        boolean found = false;
        System.out.println("Books by author '" + a + "':");
        while (curr != null) {
            if (curr.author.equals(a)) {
                System.out.println("Book ID: " + curr.bookId + ", Title: " + curr.title + ", Genre: " + curr.genre + ", Availability: " + (curr.available ? "Available" : "Not Available"));
                found = true;
            }
            curr = curr.next;
        }
        if (!found) System.out.println("No books found.");
    }

    // Update book availability status
    void updateAvailability(int id, boolean av) {
        Book curr = head;
        while (curr != null) {
            if (curr.bookId == id) {
                curr.available = av;
                System.out.println("Availability updated.");
                return;
            }
            curr = curr.next;
        }
        System.out.println("Book not found.");
    }

    // Display all books (forward)
    void displayForward() {
        Book curr = head;
        System.out.println("Books (Forward):");
        while (curr != null) {
            System.out.println("Book ID: " + curr.bookId + ", Title: " + curr.title + ", Author: " + curr.author + ", Genre: " + curr.genre + ", Availability: " + (curr.available ? "Available" : "Not Available"));
            curr = curr.next;
        }
    }

    // Display all books (reverse)
    void displayReverse() {
        Book curr = tail;
        System.out.println("Books (Reverse):");
        while (curr != null) {
            System.out.println("Book ID: " + curr.bookId + ", Title: " + curr.title + ", Author: " + curr.author + ", Genre: " + curr.genre + ", Availability: " + (curr.available ? "Available" : "Not Available"));
            curr = curr.prev;
        }
    }

    // Count total number of books
    int countBooks() {
        Book curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    public static void main(String[] args) {
        LibraryManagement library = new LibraryManagement();
        library.addLast("The Lord of the Rings", "J.R.R. Tolkien", "Fantasy", 101, true);
        library.addFirst("To Kill a Mockingbird", "Harper Lee", "Classic", 102, true);
        library.addAt("The Alchemist", "Paulo Coelho", "Inspirational", 103, true, 2);

        library.displayForward();
        System.out.println();
        library.displayReverse();
        System.out.println();
        System.out.println("Total books: " + library.countBooks());
        System.out.println();

        library.searchByTitle("The Lord of the Rings");
        System.out.println();
        library.searchByAuthor("Harper Lee");
        System.out.println();

        library.updateAvailability(101, false);
        System.out.println();

        library.remove(102);
        System.out.println();

        library.displayForward();
    }
}
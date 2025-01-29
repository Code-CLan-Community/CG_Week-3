class MovieManagement {
    Movie head, tail;

    MovieManagement() { // Default constructor
        head = tail = null;
    }

    // Add movie at the beginning
    void addFirst(String t, String d, int y, float r) {
        Movie n = new Movie(t, d, y, r);
        n.next = head;
        if (head != null) head.prev = n;
        head = n;
        if (tail == null) tail = n;
    }

    // Add movie at the end
    void addLast(String t, String d, int y, float r) {
        Movie n = new Movie(t, d, y, r);
        if (tail != null) {
            tail.next = n;
            n.prev = tail;
        }
        tail = n;
        if (head == null) head = n;
    }

    // Add movie at a position
    void addAt(String t, String d, int y, float r, int pos) {
        if (pos == 1) addFirst(t, d, y, r);
        else {
            Movie curr = head;
            for (int i = 1; i < pos - 1 && curr != null; i++) curr = curr.next;
            if (curr == null) System.out.println("Invalid position");
            else {
                Movie n = new Movie(t, d, y, r);
                n.next = curr.next;
                n.prev = curr;
                if (curr.next != null) curr.next.prev = n;
                curr.next = n;
                if (curr == tail) tail = n;
            }
        }
    }

    // Remove movie by title
    void remove(String t) {
        Movie curr = head;
        while (curr != null) {
            if (curr.title.equals(t)) {
                if (curr == head) head = curr.next;
                else curr.prev.next = curr.next;
                if (curr == tail) tail = curr.prev;
                else curr.next.prev = curr.prev;
                return;
            }
            curr = curr.next;
        }
        System.out.println("Movie not found.");
    }

    // Search movie by director
    void searchByDir(String d) {
        Movie curr = head;
        boolean found = false;
        System.out.println("Movies directed by " + d + ":");
        while (curr != null) {
            if (curr.director.equals(d)) {
                System.out.println(curr.title + ", " + curr.year + ", " + curr.rating);
                found = true;
            }
            curr = curr.next;
        }
        if (!found) System.out.println("No movies found.");
    }

    // Search movie by rating
    void searchByRating(float r) {
        Movie curr = head;
        boolean found = false;
        System.out.println("Movies with rating " + r + ":");
        while (curr != null) {
            if (curr.rating == r) {
                System.out.println(curr.title + ", " + curr.director + ", " + curr.year);
                found = true;
            }
            curr = curr.next;
        }
        if (!found) System.out.println("No movies found.");
    }

    // Display all movies (forward)
    void displayForward() {
        Movie curr = head;
        System.out.println("Movies (Forward):");
        while (curr != null) {
            System.out.println(curr.title + ", " + curr.director + ", " + curr.year + ", " + curr.rating);
            curr = curr.next;
        }
    }

    // Display all movies (reverse)
    void displayReverse() {
        Movie curr = tail;
        System.out.println("Movies (Reverse):");
        while (curr != null) {
            System.out.println(curr.title + ", " + curr.director + ", " + curr.year + ", " + curr.rating);
            curr = curr.prev;
        }
    }

    // Update movie rating
    void updateRating(String t, float r) {
        Movie curr = head;
        while (curr != null) {
            if (curr.title.equals(t)) {
                curr.rating = r;
                System.out.println("Rating updated.");
                return;
            }
            curr = curr.next;
        }
        System.out.println("Movie not found.");
    }

    public static void main(String[] args) {
        MovieManagement m = new MovieManagement();
        m.addLast("The Shawshank Redemption", "Frank Darabont", 1994, 9.3f);
        m.addFirst("The Godfather", "Francis Ford Coppola", 1972, 9.2f);
        m.addAt("The Dark Knight", "Christopher Nolan", 2008, 9.0f, 2);
        m.displayForward();
        System.out.println();
        m.displayReverse();
        System.out.println();
        m.searchByDir("Christopher Nolan");
        System.out.println();
        m.searchByRating(9.2f);
        System.out.println();
        m.remove("The Godfather");
        System.out.println();
        m.updateRating("The Shawshank Redemption", 9.4f);
        System.out.println();
        m.displayForward();
    }
}
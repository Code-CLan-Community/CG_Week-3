class Book {
    String title, author, genre;
    int bookId;
    boolean available;
    Book next, prev;

    Book(String t, String a, String g, int id, boolean av) {
        title = t;
        author = a;
        genre = g;
        bookId = id;
        available = av;
    }
}
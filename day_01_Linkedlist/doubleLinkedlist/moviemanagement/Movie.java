class Movie {
    String title, director;
    int year;
    float rating;
    Movie next, prev;

    Movie(String t, String d, int y, float r) { // Constructor
        title = t; director = d; year = y; rating = r;
    }
}

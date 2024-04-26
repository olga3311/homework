package lesson20.classwork.example03;

public class Book {
    private int id;
    private String title;
    private String authorName;
    private String genre;
    private  int pagesAmount;
    private int yearPublished;
    private boolean available;

    public Book(int id, String title, String authorName, String genre, int pagesAmount, int yearPublished, boolean available) {
        this.id = id;
        this.title = title;
        this.authorName = authorName;
        this.genre = genre;
        this.pagesAmount = pagesAmount;
        this.yearPublished = yearPublished;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getGenre() {
        return genre;
    }

    public int getPagesAmount() {
        return pagesAmount;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPagesAmount(int pagesAmount) {
        this.pagesAmount = pagesAmount;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

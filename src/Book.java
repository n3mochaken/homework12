public class Book {
    private Author author;
    private String title;
    private int year;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Название книги - " + title + ". Автор - " + author + ". Год печати- " + year;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(title, author, year);
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass() || other == null) {
            return false;
        }
        Book c2 = (Book) other;
        return title.equals(c2.title) && author.equals(c2.author);
    }
}
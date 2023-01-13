public class Book {
    private final Author author;
    private final String bookName;
    private int publishingYear;

    public Book(Author author, String bookName, int publishingYear) {
        this.author = author;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public String getAuthor() {
        return author.getAuthorFirstName() + author.getAuthorSecondName();
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book c2 = (Book) other;
        if (getPublishingYear() != c2.getPublishingYear()) {
            return false;
        }
        if (!author.equals(c2.author)){
            return false;
        }
        return getBookName().equals(c2.getBookName());
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookName);
    }

    @Override
    public String toString() {
        return "Автор - " +  this.author + ", Название -  " + this.bookName + ", Год -  " + this.publishingYear;
    }

}

public class Author {
    private final String authorFirstName;
    private final String authorSecondName;

    public Author (String authorFirstName, String authorSecondName) {
        this.authorFirstName = authorFirstName;
        this.authorSecondName = authorSecondName;
    }

    public String getAuthorFirstName() {
        return this.authorFirstName;
    }
    public String getAuthorSecondName() {
        return this.authorSecondName;
    }
    @Override
    public String toString() {
        return this.authorFirstName + this.authorSecondName;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return authorSecondName.equals(c2.authorSecondName);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(authorSecondName);
    }
}

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName() {
        return firstName;
    }
    public String getSecondName() {
        return lastName;
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName,lastName);
    }
    @Override
    public String toString(){
        return firstName+" "+ lastName;
    }
    @Override
    public boolean equals(Object other) {
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return lastName.equals(c2.lastName) && firstName.equals(c2.firstName);
    }


}

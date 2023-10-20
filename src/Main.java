public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Joe","Smith");
        Author author2 = new Author("Jim","Beam");
        Author author3 = new Author("Igor","Petrov");
        Book one = new Book("Book1", author1, 2012);
        Book two = new Book("Book2", author2, 2222);
        //System.out.println("Название книги - "+one.getTitle()+". Автор книги - "+one.getAuthor().getName()+" "+one.getAuthor().getSecondName()+". Год публикации - "+one.getYear());
        System.out.println(one);
        System.out.println(two);
        System.out.println(new Book("Book3", author3, 2211));
        System.out.println(one.equals(two));
        System.out.println(author1.equals(author2));


    }
}
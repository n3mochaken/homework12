public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("","");
        Author author2 = new Author("","");
        Author author3 = new Author("","");
        Book one = new Book("", author1, 2);
        Book two = new Book("", author1, 2);
        //System.out.println("Название книги - "+one.getTitle()+". Автор книги - "+one.getAuthor().getName()+" "+one.getAuthor().getSecondName()+". Год публикации - "+one.getYear());
//        System.out.println(one);
//        System.out.println(two);
//        System.out.println(new Book("Book3", author3, 2211));
        System.out.println(one.equals(null));
        System.out.println(author1.equals(null));


    }
}
// --------------------------------------------------------------
// Assignment 1
// Question: (include question/part number, if applicable)
// Explanation of the program: 
// Written by: Botao Yang (40213554)
// --------------------------------------------------------------

public class Assignment0 {
    public static void main(String[] args) throws Exception {

        
        System.out.println(Book.findNumberOfCreatedBooks());
        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 9780007525546L, 29.99);
        Book book2 = new Book("A","b",123,1);
        System.out.println(Book.findNumberOfCreatedBooks());

        Book book3 = new Book();
        Book book4 = new Book();
        System.out.println(Book.findNumberOfCreatedBooks());

    }
}

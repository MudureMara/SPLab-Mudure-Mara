public class Main {

    public static void main(String[] args) {

        Book book = new Book();

        Author author1 = new Author("Ion", "Popescu");
        Author author2 = new Author("Maria", "Ionescu");

        book.addAuthor(author1);
        book.addAuthor(author2);

        Section chapter1 = new Section("Capitolul 1");

        Paragraph p1 = new Paragraph("Paragraph 1");
        Paragraph p2 = new Paragraph("Paragraph 2");
        Paragraph p3 = new Paragraph("Paragraph 3");

        chapter1.add(p1);
        chapter1.add(p2);
        chapter1.add(p3);

        Image image = new Image("image.jpg");
        Table table = new Table("Table 1");

        book.addElement(chapter1);
        book.addElement(image);
        book.addElement(table);

        book.print();
    }
}
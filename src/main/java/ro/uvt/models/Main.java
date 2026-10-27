
package ro.uvt.models;

public class Main {

    public static void main(String[] args) {

        Book book = new Book("Design Patterns");

        Author author = new Author("Mara", "Mudure");
        book.addAuthor(author);

        Section cap1 = new Section("Chapter 1");

        Paragraph p1 = new Paragraph("Paragraph 1");
        Paragraph p2 = new Paragraph("Paragraph 2");

        cap1.add(p1);
        cap1.add(p2);

        cap1.add(new ImageProxy("ImageOne"));

        book.addContent(cap1);

        System.out.println("Book: " + book.getTitle());
        System.out.println("Chapter: " + cap1.getTitle());

        book.render();
        cap1.render();
        p1.render();
        p2.render();
    }
}

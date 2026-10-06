import java.util.ArrayList;
import java.util.List;

public class Book {

    private String title;
    private List<Element> content;
    private List<Author> authors;

    public Book(String title) {
        this.title = title;
        this.content = new ArrayList<>();
        this.authors = new ArrayList<>();
    }

    public void addContent(Element element) {
        content.add(element);
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void print() {
        System.out.println("Book: " + title);

        for (Element element : content) {
            element.print();
        }
    }
}
import java.util.ArrayList;
import java.util.List;

public class Book {

    private List<Element> elements;
    private List<Author> authors;

    public Book() {
        this.elements = new ArrayList<>();
        this.authors = new ArrayList<>();
    }

    public void addElement(Element element) {
        elements.add(element);
    }

    public void removeElement(Element element) {
        elements.remove(element);
    }

    public Element getElement(int index) {
        return elements.get(index);
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void removeAuthor(Author author) {
        authors.remove(author);
    }

    public void print() {
        System.out.println("Book");

        System.out.println("Authors:");
        for (Author author : authors) {
            author.print();
        }

        System.out.println("Elements:");
        for (Element element : elements) {
            element.print();
        }
    }
}
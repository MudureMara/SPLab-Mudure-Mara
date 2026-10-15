
import java.util.ArrayList;
import java.util.List;

public class Book implements Element {

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

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

        for (Element element : content) {
            element.accept(visitor);
        }
    }

    @Override
    public void render() {
        System.out.println("Book: " + title);
    }

    @Override
    public void add(Element element) {
        content.add(element);
    }

    @Override
    public void remove(Element element) {
        content.remove(element);
    }

    @Override
    public Element get(int index) {
        return content.get(index);
    }
}

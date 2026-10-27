package ro.uvt.models;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Book implements Element {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    @OneToMany(
            targetEntity = BaseElement.class,
            cascade = CascadeType.ALL
    )
    private List<Element> content = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Author> authors = new ArrayList<>();

    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<Element> getContent() {
        return content;
    }

    public List<Author> getAuthors() {
        return authors;
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
        System.out.println("ro.uvt.models.Book: " + title);
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

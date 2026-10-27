package ro.uvt.models;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Section extends BaseElement {

    private String title;

    @OneToMany(
            targetEntity = BaseElement.class,
            cascade = CascadeType.ALL
    )
    private List<Element> children = new ArrayList<>();

    public Section() {
    }

    public Section(String title) {
        this.title = title;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

        for (Element element : children) {
            element.accept(visitor);
        }
    }

    @Override
    public void render() {
        System.out.println(title);
    }

    public String getTitle() {
        return title;
    }

    public List<Element> getChildren() {
        return children;
    }

    @Override
    public void add(Element element) {
        children.add(element);
    }

    @Override
    public void remove(Element element) {
        children.remove(element);
    }

    @Override
    public Element get(int index) {
        return children.get(index);
    }
}

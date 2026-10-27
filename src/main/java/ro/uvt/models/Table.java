package ro.uvt.models;

import jakarta.persistence.*;

@Entity
public class Table extends BaseElement {

    private String something;

    public Table() {
        this.something = "";
    }

    public Table(String something) {
        this.something = something;
    }

    public String getSomething() {
        return something;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void render() {
        System.out.println(something);
    }

    @Override
    public void add(Element element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Element element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Element get(int index) {
        throw new UnsupportedOperationException();
    }
}

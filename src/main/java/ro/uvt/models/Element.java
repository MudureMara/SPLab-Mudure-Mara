package ro.uvt.models;

public interface Element {

    void accept(Visitor visitor);

    void render();

    void add(Element element);

    void remove(Element element);

    Element get(int index);
}
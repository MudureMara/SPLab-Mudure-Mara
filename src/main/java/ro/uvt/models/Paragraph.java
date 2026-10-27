package ro.uvt.models;

import jakarta.persistence.*;

@Entity
public class Paragraph extends BaseElement {

    private String text;

    @Transient
    private AlignStrategy textAlignment;

    public Paragraph() {
    }

    public Paragraph(String text) {
        this.text = text;
        this.textAlignment = null;
    }

    public String getText() {
        return text;
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.textAlignment = alignStrategy;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void render() {
        if (textAlignment == null) {
            System.out.println(text);
        } else {
            Context context = new Context();
            textAlignment.render(this, context);
        }
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

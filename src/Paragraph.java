
public class Paragraph implements Element {

    private String text;
    private AlignStrategy textAlignment;

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

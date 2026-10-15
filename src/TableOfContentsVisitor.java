
import java.util.ArrayList;
import java.util.List;

public class TableOfContentsVisitor implements Visitor {

    private List<String> entries = new ArrayList<>();

    @Override
    public void visit(Book book) {
    }

    @Override
    public void visit(Section section) {
        entries.add(section.getTitle());
    }

    @Override
    public void visit(Paragraph paragraph) {
    }

    @Override
    public void visit(Image image) {
    }

    @Override
    public void visit(ImageProxy imageProxy) {
    }

    @Override
    public void visit(Table table) {
    }

    @Override
    public void visit(TableOfContents tableOfContents) {
    }

    public void printTableOfContents() {
        System.out.println("Table of Contents:");

        for (String entry : entries) {
            System.out.println(entry);
        }
    }
}

package ro.uvt.models;

public class AlignRight implements AlignStrategy {

    @Override
    public void render(Paragraph paragraph, Context context) {

        int spaces = Math.max(
                0,
                context.getLineWidth() - paragraph.getText().length()
        );

        System.out.println(" ".repeat(spaces) + paragraph.getText());
    }
}
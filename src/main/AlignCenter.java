public class AlignCenter implements AlignStrategy {

    @Override
    public void render(Paragraph paragraph, Context context) {

        int spaces = Math.max(
                0,
                (context.getLineWidth() - paragraph.getText().length()) / 2
        );

        System.out.println(" ".repeat(spaces) + paragraph.getText());
    }
}
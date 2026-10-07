public class ImageProxy implements Element {

    private String imageName;
    private Image realImage;

    public ImageProxy(String imageName) {
        this.imageName = imageName;
        this.realImage = null;
    }

    @Override
    public void print() {

        if (realImage == null) {
            realImage = new Image(imageName);
        }

        realImage.print();
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
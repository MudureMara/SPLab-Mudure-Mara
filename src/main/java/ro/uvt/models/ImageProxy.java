package ro.uvt.models;

import jakarta.persistence.*;

@Entity
public class ImageProxy extends BaseElement {

    private String imageName;

    @Transient
    private Image realImage;

    public ImageProxy() {
    }

    public ImageProxy(String imageName) {
        this.imageName = imageName;
        this.realImage = null;
    }

    public String getImageName() {
        return imageName;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void render() {
        if (realImage == null) {
            realImage = new Image(imageName);
        }

        realImage.render();
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

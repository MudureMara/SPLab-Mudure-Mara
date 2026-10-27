package ro.uvt.models;

import jakarta.persistence.*;
import java.util.concurrent.TimeUnit;

@Entity
public class Image extends BaseElement {

    private String imageName;

    public Image() {
    }

    public Image(String name) {
        this.imageName = name;

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
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
        System.out.println("ro.uvt.models.Image: " + imageName);
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

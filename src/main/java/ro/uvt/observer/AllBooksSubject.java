
package ro.uvt.observer;

import org.springframework.stereotype.Component;
import ro.uvt.models.Book;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class AllBooksSubject implements Subject {

    private final List<Observer> observers =
            new CopyOnWriteArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void add(Book book) {
        notifyObservers(book);
    }

    private void notifyObservers(Book book) {
        for (Observer observer : observers) {
            observer.update(book);
        }
    }
}

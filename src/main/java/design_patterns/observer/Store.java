package design_patterns.observer;

import design_patterns.observer.Observable.IphoneObservableImpl;
import design_patterns.observer.Observable.StocksObservable;
import design_patterns.observer.Observer.EmailAlertObserverImpl;
import design_patterns.observer.Observer.MobileAlertObserverImpl;
import design_patterns.observer.Observer.NotificationAlertObserver;

import javax.management.NotificationFilter;

public class Store {
    public static void main(String[] args) {
        StocksObservable iPhoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("adi17082001@gmail.com", iPhoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("adityabhosale1708@gmail.com", iPhoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("aditya", iPhoneStockObservable);
        NotificationAlertObserver observer4 = new MobileAlertObserverImpl("bhosale", iPhoneStockObservable);

        iPhoneStockObservable.add(observer1);
        iPhoneStockObservable.add(observer2);
        iPhoneStockObservable.add(observer3);
        iPhoneStockObservable.add(observer4);

        iPhoneStockObservable.setStockCount(10);
        // iPhoneStockObservable.setStockCount(-10);  // here I am reducing the stock count to 0, why -10? look at the method.
        // iPhoneStockObservable.setStockCount(10);  // here, it was 0, and we are adding 10, so it will notify
    }
}

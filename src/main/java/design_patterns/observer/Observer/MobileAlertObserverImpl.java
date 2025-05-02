package design_patterns.observer.Observer;

import design_patterns.observer.Observable.StocksObservable;
import design_patterns.observer.Observer.NotificationAlertObserver;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String username;
    StocksObservable observable;

    public MobileAlertObserverImpl(String username, StocksObservable observable){
        this.username = username;
        this.observable  = observable;
    }

    @Override
    public void update(){
        sendMsgOnMobile(username, "product is in stock, hurry up!");
    }

    public void sendMsgOnMobile(String username, String msg){
        System.out.println("Dear " + username + " " + msg);
    }
}

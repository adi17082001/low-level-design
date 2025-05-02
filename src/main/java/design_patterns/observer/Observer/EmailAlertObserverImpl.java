package design_patterns.observer.Observer;

import design_patterns.observer.Observable.StocksObservable;

public class EmailAlertObserverImpl implements  NotificationAlertObserver{
    String emailId;
    StocksObservable observable;

    public EmailAlertObserverImpl(String emailId, StocksObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(emailId, "product is in stock, hurry up!");
    }

    public void sendEmail(String emailId, String msg){
        System.out.println(msg + " mail sent to email address: " + emailId);
    }
}

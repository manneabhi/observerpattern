/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

/**
 * Deliver Notification System
 * This application is used to deliver the notification of current location to the seller and user.
 * For this purpose, we apply the  observer pattern on it.
 * User and seller are the observers.  
 */
public class ObserverPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DeliverData data = new DeliverData();
        Observer ob1 = new User();
        Observer ob2 = new Seller();
        Observer ob3 = new Seller();
 
        // register user and seller in the system
        data.register(ob1);
        data.register(ob2);
        data.register(ob3);
        // change location of deliver data
        String loc1 = "xPlace";
        data.changeLoc(loc1);
        // unregister seller 
        data.unregister(ob3);
        // again change the location of user
        String loc2 = "yPlace";
        data.changeLoc(loc2);
    }
    
}

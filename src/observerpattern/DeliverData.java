/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * DeliverData is the main class which manage the observers. 
 * This class is used to register and unregister the observers.
 * This class is also used to tell the current location to the observers.
 * If the location change, it notify the observers about the location.
 * @author Dell
 */
public class DeliverData implements Subject{
    
    // the list is used to store the data of the observers
    private List<Observer> obs;
    private String loc;
    
    public DeliverData()
    {
        this.obs = new ArrayList<>();
    }
    // This function is used to register the observers
    @Override
    public void register(Observer ob)
    {
        obs.add(ob);
    }
    // This function is used to unregister the observers
    @Override
    public void unregister(Observer ob){
        obs.remove(ob);
    }
    // This function is used to notify the location
    @Override
    public void noticeObservers(){
        for(Observer ob : obs){
            ob.update(loc);
        }
    }
    // This function is used to change the location 
    public void changeLoc(String loc)
    {
        this.loc = loc;
        noticeObservers();
    }
    
}

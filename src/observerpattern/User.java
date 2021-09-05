/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

/**
 * This class is used to create the user as observer 
 * @author Dell
 */
public class User implements Observer{
    
    private String loc;
    // This function is used to update the location of user
    @Override
    public void update(String Loc)
    {
        this.loc = Loc;
        displayLocation();
    }
    // This function is used to display the current location of the user
    public void displayLocation()    
    {
        System.out.println("User Current Location is: " + loc);
    }
}

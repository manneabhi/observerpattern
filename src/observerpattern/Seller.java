/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

/**
 * This class is used to create the seller as observer 
 * @author Dell
 */
public class Seller implements Observer{
    private String loc;
    // This function is used to update the location of seller
    @Override
    public void update(String Loc)
    {
        this.loc = Loc;
        displayLocation();
    }
    // This function is used to display the current location of the seller
    public void displayLocation()    
    {
        System.out.println("Seller Current Location is: " + loc);
    } 
}

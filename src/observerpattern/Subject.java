package observerpattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Here , we make the interface of Subject
 * @author Dell
 */
public interface Subject {
    void register(Observer ob);
    void unregister(Observer ob);
    void noticeObservers();

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controller.*;
import Entity.*;

/**
 *
 * @author nguye
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sender sender = new Sender();
        Receiver receiver = new Receiver();
        Transfer transfeR = new Transfer();
        Queue message = new Queue(50);
        Stack memory = new Stack(50);
        
        System.out.println("-----Send message-----");
        sender.send(message);
        transfeR.transfer(message, memory);
        System.out.println("-----Read message-----");
        receiver.read(memory);
        
    }
    
}

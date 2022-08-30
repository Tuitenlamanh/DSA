/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controller.Receiver;
import Controller.Sender;
import Controller.Transmission;
import Entity.Queue;
import Entity.Stack;
import java.util.Scanner;

/**
 *
 * @author manhchelsea
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sender sender = new Sender();
        Receiver receiver = new Receiver();
        Transmission transfeR = new Transmission();
        Queue message = new Queue(50);
        Stack memory = new Stack(50);
        Scanner s = new Scanner(System.in);
        boolean Menu = true;
        while(Menu){
            System.out.println("============ Send Message System ============");
            System.out.println("|            1. Send Message                |");
            System.out.println("|            2. Read Message                |");
            System.out.println("|            3. Exit                        |");
            System.out.println("=============================================");
            System.out.print("Please choose a function: ");
            int choose = s.nextInt();
            switch(choose){
            case 1:{
                System.out.println("-----Send message-----");
                sender.send(message);
                transfeR.transfer(message, memory);
                break;
            }
            case 2:{
                System.out.println("-----Read message-----");
                receiver.read(memory);
                break;
            }
            case 3:{
                Menu = false;
                break;
            }
            default:{
                System.out.println("There are no suitable options");
            }
        }
    }
}
}

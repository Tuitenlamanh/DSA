/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Queue;
import Interface.ActionSender;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author manhchelsea
 */
public class Sender implements ActionSender<Queue> {
    

    @Override
    public void send(Queue items) {
        boolean check = true;
        String mess = null;
        Scanner s = new Scanner(System.in);
        while(check){
            System.out.print("Enter a message : ");
            mess = s.nextLine();
            if(mess.equals("")){
                System.out.println("You have not entered anything. Please enter a message before sending!");
            }
            else if(mess.length()<=250){
                if(mess.equalsIgnoreCase("Exit")){
                check = false;
                }else{
                //khai báo đối tượng current thuộc class LocalDateTime
                LocalDateTime current = LocalDateTime.now();
                //sử dụng class DateTimeFormatter để định dạng ngày giờ theo kiểu pattern
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
                //sử dụng phương thức format() để định dạng ngày giờ hiện tại rồi gán cho chuỗi formatted
                String formatted = current.format(formatter);
                items.enqueue(mess+" Sent at "+formatted);
                }
            }else{
                System.out.println("Your message is over 250 characters. Please enter shorter.");   
            }
        }
    }
    
}
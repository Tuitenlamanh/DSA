/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Queue;
import Entity.Stack;
import Interface.ActionTransfer;

/**
 *
 * @author H
 */
public class Transfer implements ActionTransfer<Queue,Stack>{

    @Override
    public void transfer(Queue a, Stack b) {
        String str = null;
        while((str = a.dequeue()) != null) {
            b.push(str);
        }
    }
    
}

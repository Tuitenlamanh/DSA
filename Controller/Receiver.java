/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Stack;
import Interface.ActionReceiver;

/**
 *
 * @author nguye
 */
public class Receiver implements ActionReceiver<Stack>  {

    @Override
    public void read(Stack a) {
        a.show();
    }

}
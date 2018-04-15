
package com.sistemas.controllers;

import com.sistemas.views.GimView;


public class GimController {

    public static void main(String[] args) {
        // TODO code application logic here
        GimView gimView = new GimView();
        MotorController motorController = new MotorController();        
        EventHandler eventController = new EventHandler(gimView);
        
        gimView.setMotorController(motorController);
        
        motorController.addEscuchador(eventController);
        
        motorController.ejecutar();
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

import java.util.ArrayList;


/**
 *
 * @author Asad
 */
public class Circuit {
    private ArrayList <Resistor> resistors;
    private static Circuit instance = null;
    public static Circuit getInstance() {
    if (instance == null) {
    instance = new Circuit();
    }
    return instance;
    }
    private Circuit() {
        resistors = new ArrayList <Resistor>();
    }
    
    void add(Resistor r){
       resistors.add(r);
    }
    
    @Override
    public String toString(){
        String totalResistors = "";
        int i=0;
        while (i<resistors.size()){
            totalResistors +=  resistors.get(i) + " ";
            i ++;
        }
        return totalResistors;
    } 
    
}

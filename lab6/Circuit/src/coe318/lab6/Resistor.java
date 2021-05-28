/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

/**
 *
 * @author Asad
 */
public class Resistor {
    int id;
    double resistance;
    int resistorCount = 1;
    Node node1,node2;
    
    
    
    public Resistor(double resistance, Node node1, Node node2){
        if (resistance < 0)
            throw new IllegalArgumentException("Resistance can't be negative");
        this.node1 = node1;
        this.node2 = node2;
        this.resistance = resistance;
        id =  resistorCount;
        resistorCount ++;
    }
    
    public Node [] getNodes(){
        Node []nodes = {node1,node2};
        return nodes;
    }
    
    @Override
    public String toString(){
        return "R" + id + " " + node1 + " " + node2 + " " + resistance;
    }
    
    
}

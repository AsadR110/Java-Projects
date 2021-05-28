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



public class Node {
    private int id;
    static int nodeCount = 0;
    public Node(){
        this.id = nodeCount;
        nodeCount ++;
    }
//@Override
public String toString(){
    return ("" + this.id);
}
    
}



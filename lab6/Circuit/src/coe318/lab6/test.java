/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

public class test {
    public static void main(String[] args){
        Circuit cir = Circuit.getInstance();
        Node n1, n2, n3, n4, n5, n6;
        n1 = new Node();
        n2 = new Node();
        n3 = new Node();
        n4 = new Node();
        n5 = new Node();
        Resistor r1, r2, r3;
        r1 = new Resistor(100,n1,n2);
        r2 = new Resistor(50, n2,n3);
        r3 = new Resistor(2000,n3,n4);
        cir.add(r1);
        cir.add(r2);
        cir.add(r3);
        System.out.println(cir.toString());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.locadora.telas;

import java.util.Calendar;

/**
 *
 * @author fabri
 */
public class NewClass {

    public static void main(String[] args) {
        
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DAY_OF_MONTH, 7);
        c.getTimeInMillis();
        System.out.println(c);
    }
}

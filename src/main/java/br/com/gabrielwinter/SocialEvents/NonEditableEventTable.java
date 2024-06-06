/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gabrielwinter.SocialEvents;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Winter
 */
public class NonEditableEventTable extends DefaultTableModel{
    
     @Override
    public boolean isCellEditable(int row, int column) {
        return false; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}

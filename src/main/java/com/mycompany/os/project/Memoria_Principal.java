/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.os.project;

import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Alison
 */
public class Memoria_Principal extends Threads{
    private int so;
    private int quantum;
    public List procesos;
    private int size;
    private int activador;
    private int disponible;
    

    public int getSo() {
        return so;
    }

    public void setSo(int so) {
        this.so = so;
    }

    public int getQuantum() {
        return quantum;
    }

    public void setQuantum(int quantum) {
        this.quantum = quantum;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void ReservedSpace(int size, int activador, int so){
        this.size = size;
        this.activador = activador;
        this.so = so;
        this.disponible = size - activador - so;
    }
    
    public void QuantumTime(){
        Random random = new Random();
        this.quantum = (int) Math.floor(Math.random()*(4-9+1)+9);
    }
    
    public void AddProcess(){
        Process process  = new Process();
        process.NewProcess(process);
        if(process.getProcess_instructions() < disponible){
            this.size = size + process.getProcess_instructions();
            procesos.add(process);
        
        }else{
            JOptionPane.showMessageDialog(null, "No hay suficiente espacio para agregar el proceso", "Error", JOptionPane.ERROR_MESSAGE);
        }        
    
    }
}

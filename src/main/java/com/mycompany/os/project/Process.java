package com.mycompany.os.project;

import java.util.Random;

public class Process extends Thread{

    //-------------------CREACION DE VARIABLES---------------------
    private int process_id;
    private int process_priority;
    private String process_name;
    private int start_time;
    private int process_time;
    private int missing_time;
    private boolean process_status;
    private int instructions;
    //---------------------CONSTRUCTOR, GETTERS Y SETTERS
    public Process(int start_time, int process_time, int missing_time, int process_id,String process_name, int process_priority, boolean process_status){
        this.start_time = start_time;
        this.process_time = process_time;
        this.missing_time = missing_time;
        this.process_id = process_id;
        this.process_name = process_name;
        this.process_priority = process_priority;
        this.process_status = process_status;
    }
    public Process(){
        
    }

    public void setProcess_status(boolean process_status) {
        this.process_status = process_status;
    }
    public void setMissing_time(int missing_time) {
        this.missing_time = missing_time;
    }
    public void setProcess_priority(int process_priority) {
        this.process_priority = process_priority;
    }
    public void setProcess_name(String process_name) {
        this.process_name = process_name;
    }
    public void setProcess_id(int process_id) {
        this.process_id = process_id;
    }
    public void setStart_time(int start_time) {
        this.start_time = start_time;
    }
    public void setProcess_time(int process_time){
        this.process_time = process_time;
    }

    public String getProcess_name() {
        return process_name;
    }
    public int getMissing_time() {
        return missing_time;
    }
    public int getProcess_priority() {
        return process_priority;
    }
    public int getProcess_id() {
        return process_id;
    }
    public int getStart_time(){
        return  this.start_time;
    }
    public int getProcess_time(){
        return this.process_time;
    }
    public boolean getProcess_status(){
        return process_status;
    }
    public int getProcess_instructions(){
        return instructions;
    }
    //----------------------------METODO RUN-----------------------------
    @Override
    public void run(){
        int i = 0;
        for (i = 0; i <= missing_time; i++){
            System.out.println("Process => " + process_name + " id => " + process_id + "Running, Time running => " + i);
        }
        missing_time = missing_time - i;
    }
    
    public void NewProcess(Process p){
        Random random = new Random();
        p.process_time = (int) Math.floor(Math.random()*(2-10+1)+10);
        p.instructions = p.process_time;

    }



}

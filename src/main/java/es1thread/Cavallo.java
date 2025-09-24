package es1thread;

import java.util.Random;

public class Cavallo extends Thread{

    private static final Random durataGara = new Random();
    private long tArrivo;
    private String nome;

    public Cavallo(String nome){
        this.nome = nome;
    }

    public long gettArrivo() {
        return tArrivo;
    }

    public String getNome(){
        return nome;
    }

    public void run(){
       tArrivo = durataGara.nextInt(10) + 1;
    }
}
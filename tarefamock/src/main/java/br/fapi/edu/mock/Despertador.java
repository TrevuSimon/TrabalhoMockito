package br.fapi.edu.mock;

import java.util.Date;

public class Despertador {
    private Date time;

    public Despertador(Date time) {
        this.time = new Date();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public boolean passouDoTempo(Date agora){
        if(this.time.after(agora)){
            return true;
        }
        return false;
    }

    public boolean antesDoTempo(Date agora){
        if(this.time.before(agora)){
            return true;
        }
        return false;
    }

    public String trocarTempo(Date novo){
        this.time = novo;
        return "trocado com sucesso";
    }
}

package com.example.lista;

public class No {
    int numeroNo;
    No proximo;


    public No(int numeroNo) {
        this.numeroNo = numeroNo;
        this.proximo = null;
    }

    public int getNumeroNo() {
        return numeroNo;
    }
    
    public No getProximo() {
        return proximo;
    }
    public void setProximo(No proximo) {
        this.proximo = proximo;

    }
}

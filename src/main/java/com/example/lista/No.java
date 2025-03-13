package com.example.lista;

public class No {
    int numeroNo;
    No proximo;
    public No(int numeroNo) {
        this.numeroNo = numeroNo;
    }

    public int getNumeroNo() {
        return numeroNo;
    }
    public void setNumeroNo(int numeroNo) {
        this.numeroNo = numeroNo;
    }
    public No getProximo() {
        return proximo;
    }
    public void setProximo(No proximo) {
        this.proximo = proximo;

    }
}

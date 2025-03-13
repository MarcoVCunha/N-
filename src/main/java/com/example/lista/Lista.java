package com.example.lista;

import javax.swing.*;
import java.util.*;
import java.util.ArrayList;

public class Lista {
    No primeiroNo;
    No ultimoNo;
    No novoNo;

    public Lista() {
    }

    public No getPrimeiroNo() {
        return primeiroNo;
    }
    public void setPrimeiroNo(No primeiroNo) {
        this.primeiroNo = primeiroNo;
    }
    public No getUltimoNo() {
        return ultimoNo;
    }
    public void setUltimoNo(No ultimoNo) {
        this.ultimoNo = ultimoNo;
    }
    public No getNovoNo() {
        return novoNo;
    }
    public void setNovoNo(No novoNo) {
        this.novoNo = novoNo;
    }

    public void adicionarNo(int novo){
        No novoNo = new No(novo);
        if (primeiroNo == null){
            primeiroNo = novoNo;
        } else {
            ultimoNo = novoNo;
        }
    }

    public void imprimirLista() {
        No atual = primeiroNo;
        while (atual != null) {
            System.out.println(atual.getNumeroNo());
            atual.getProximo().setProximo(atual);
            break;
        }
    }

    public void removeNo(No novo){

    }
}

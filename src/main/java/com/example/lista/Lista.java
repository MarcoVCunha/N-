package com.example.lista;

import javax.swing.*;
import java.util.*;
import java.util.ArrayList;

public class Lista {
    No primeiroNo;
    No ultimoNo;

    public Lista() {
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public void adicionarNo(int numero){
        No novoNo = new No(numero);
        if (primeiroNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        } else {
            ultimoNo.setProximo(novoNo);
            ultimoNo = novoNo;
        }
    }

    public void removeNo(int numero){
        if(primeiroNo == null){
            System.out.println("A lista esta vazia!");
            return;
        }
        if (primeiroNo.getNumeroNo() == numero) {
            primeiroNo = primeiroNo.getProximo();
            if (primeiroNo == null) {
                ultimoNo = null;
            }
            return;
        }
        No atual = primeiroNo;
        No anterior = null;

        while (atual != null && atual.getNumeroNo() != numero) {
            anterior = atual;
            atual = atual.getProximo();
        }
        if (atual == null) {
            System.out.println("Número não encontrado na lista.");
            return;
        }
        anterior.setProximo(atual.getProximo());
        if (atual == ultimoNo) {
            ultimoNo = anterior;
        }
    }
    public void exibirLista(){
        No atual = primeiroNo;
        while (atual != null) {
            System.out.println(atual.getNumeroNo() + " -> ");
            atual = atual.getProximo();
        }
        System.out.println("null");
    }
    public void exibirProximoNo (int numero){
        No atual = primeiroNo;
        while (atual != null) {
                if (atual.getNumeroNo() == numero) {
                    if (atual.getProximo() != null) {
                        System.out.println("O proximo Nó de " +numero+ " é " + atual.getProximo().getNumeroNo());
                    }else{
                        System.out.println("O nó " +numero+ "é o ultimo da lista.");
                    }
                    return;
                }
                atual = atual.getProximo();
        }
        System.out.println("Número não encontrado na lista");
    }
    public No getPrimeNo(){
        return primeiroNo;
    }
    public No getUltimoNo(){
        return ultimoNo;
    }
}

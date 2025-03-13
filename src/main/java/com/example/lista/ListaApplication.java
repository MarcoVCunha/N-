package com.example.lista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class ListaApplication {

    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.adicionarNo(10);
        lista.adicionarNo(20);
        lista.adicionarNo(30);
        lista.adicionarNo(40);

        System.out.println("Lista antes da remoçao");
        lista.exibirLista();

        lista.removeNo(20);
        System.out.println("\nLista após remover 20:");
        lista.exibirLista();

        System.out.println("\nPróximo nó de 10:");
        lista.exibirProximoNo(10);

        System.out.println("\nPróximo nó de 30:");
        lista.exibirProximoNo(30);

        System.out.println("\nPróximo nó de 40:");
        lista.exibirProximoNo(40);

        System.out.println(
                "\nPrimeiro Nó: " + (lista.getPrimeNo() != null ? lista.getPrimeNo().getNumeroNo() : "Lista vazia"));
        System.out.println(
                "Ultimo Nó: " + (lista.getUltimoNo() != null ? lista.getUltimoNo().getNumeroNo() : "Lista vazia"));
    }
}
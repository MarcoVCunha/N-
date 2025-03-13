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
        lista.imprimirLista();
    }
}
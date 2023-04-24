package main;

import modelo.Produto;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mercado {
    Scanner entrada = new Scanner(System.in);
    static ArrayList<Produto> produtos;
    static Map<Produto, Integer> carrinho;

    public static void main(String[] args) {
        produtos = new ArrayList<>();
        carrinho = new HashMap<>();

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("  //*********************************//\n // BEM-VINDO AO MERCADO ARAÚJO     //" +
                "\n//*********************************//");

        System.out.println("\n");
        System.out.println("\n");

        int opcao = 0;
        while (opcao != 4) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                    Olá quem é você?
                    1 - Cliente 
                    2 - Trabalhador
                    3 - Listar Produtos
                    4 - EXIT
                    """));
            switch (opcao) {
                case 1 -> {
                    System.out.println("\n");
                    System.out.println("\n");
                    System.out.println("  //*********************************//\n // BEM-VINDO CLIENTE               //" +
                            "\n//*********************************//");


                }

            }
        }
    }
}
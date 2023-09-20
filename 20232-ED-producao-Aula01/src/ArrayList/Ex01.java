/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Davi
 */
public class Ex01 {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        lista.add("Davi");
        lista.add("Daniel");
        lista.add("Lucas");
        lista.add("Rafael");
        lista.add("Alberto");

        for (String x : lista) {
            System.out.println("Lista: " + x);
        }
        System.out.println("====");

        lista.remove("Davi");
        for (String x : lista) {
            System.out.println("Lista: " + x);
        }
        System.out.println("=====");
        lista.add(1, "João");
        for (String x : lista) {
            System.out.println("Lista: " + x);
        }
        System.out.println("======");
        lista.set(1, "João Henrique");
        for (String x : lista) {
            System.out.println("Lista: " + x);
        }
        System.out.println("=====");
        Collections.sort(lista);
        for (String x : lista) {
            System.out.println("Lista: " + x);
        }
        System.out.println("=============");
        System.out.println(lista);
    }

}

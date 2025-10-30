package semana5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class questao4 {
    public static void main(String[] args) {
        int numElementos = 100_000;

        List<Integer> arrayList = new ArrayList<>();
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < numElementos; i++) {
            arrayList.add(0, i);
        }
        long fim = System.currentTimeMillis();
        System.out.println("Tempo ArrayList: " + (fim - inicio) + " ms");

        List<Integer> linkedList = new LinkedList<>();
        inicio = System.currentTimeMillis();
        for (int i = 0; i < numElementos; i++) {
            linkedList.add(0, i);
        }
        fim = System.currentTimeMillis();
        System.out.println("Tempo LinkedList: " + (fim - inicio) + " ms");
    }
}
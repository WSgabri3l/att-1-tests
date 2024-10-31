package com.integerlist;

public class Main {
    public static void main(String[] args) {

        IntegerListManipulation integerListManipulation = new IntegerListManipulation();
        IntegerListOperations integerListOperations = new IntegerListOperations();

        int[] testList = {1, 2, 3};

        System.out.println("\nLista Inicial: ");
        integerListManipulation.loop(testList);

        testList = integerListManipulation.add(testList, 4);
        testList = integerListManipulation.add(testList, 5);
        testList = integerListManipulation.add(testList, 6);

        System.out.println("\nLista Após Adicionar Valores (4, 5 e 6): ");
        integerListManipulation.loop(testList);

        testList = integerListManipulation.remove(testList, 0);
        testList = integerListManipulation.remove(testList, 2);

        System.out.println("\nLista Após Remover Valores (1 e 3): ");
        integerListManipulation.loop(testList);

        System.out.println("\nLista Somada: ");
        System.out.println(integerListOperations.sum(testList));

        System.out.println("\nLista Tamanho: ");
        System.out.println(integerListOperations.length(testList));
    }
}
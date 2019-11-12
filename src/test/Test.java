package test;

import control.UpdateProduit;

public class Test {
    public static void main(String[] args) {
        try {
            new UpdateProduit();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

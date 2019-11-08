package test;

import control.ConnexionBDD;

public class Test {
    public static void main(String[] args) {
        try {
            new ConnexionBDD();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

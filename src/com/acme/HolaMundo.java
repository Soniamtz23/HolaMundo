package com.acme;

public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("hola Mundo");
        Mensaje msg = new Mensaje();
        String nombre = msg.solictaDatos("Escribe tu nombre: ");
        msg.saludar(nombre);
    }
}

package org.clases.clasecinco.cs;

public class Main {
    public static void main(String[] args) {
        UsuarioJuego usuario=new UsuarioJuego("jugador1","12345");
        System.out.println("El usuario " + usuario.getNombre() + "nivel " +
                usuario.getNivel() + "puntaje " + usuario.getPuntaje());
        usuario.aumentarPuntaje();
        usuario.aumentarPuntaje();
        usuario.subirNivel();
        System.out.println("El usuario " + usuario.getNombre() + "nivel " +
                usuario.getNivel() + "puntaje " + usuario.getPuntaje());
        usuario.bonus(100);
        System.out.println("El usuario " + usuario.getNombre() + "nivel " +
                usuario.getNivel() + "puntaje " + usuario.getPuntaje());
    }
}

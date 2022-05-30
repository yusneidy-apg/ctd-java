package org.clases.clasecinco.cs;

public class UsuarioJuego {

        private String nombre;
        private String clave;
        private int puntaje;
        private int nivel;
        public UsuarioJuego(String nombre, String clave)
        {
            this.nombre=nombre;
            this.clave=clave;
            puntaje=0;
            nivel=0;
        }
        public String getNombre() {
            return nombre;
        }
        public int getPuntaje() {
            return puntaje;
        }
        public int getNivel() {
            return nivel;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public void setPuntaje(int puntaje) {
            this.puntaje = puntaje;
        }
        public void setNivel(int nivel) {
            this.nivel = nivel;
        }
        public void aumentarPuntaje(){
            puntaje++;
        }
        public void subirNivel(){
            nivel++;
        }
        public void bonus(int cantidad){
            puntaje+=cantidad;
        }
    }

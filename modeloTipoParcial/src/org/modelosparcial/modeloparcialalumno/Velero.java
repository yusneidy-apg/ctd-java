package org.modelosparcial.modeloparcialalumno;


    public class Velero extends Embarcacion{

        private Integer cantidadMastil;

        public Velero(Double precioBase, Double valorAdicional, Integer anioFabricacion, Integer eslora, Capitan capitan, Integer cantidadMastil) {
            super(precioBase, valorAdicional, anioFabricacion, eslora, capitan);
            this.cantidadMastil = cantidadMastil;
        }

        public Integer getCantidadMastil() {
            return cantidadMastil;
        }

        public void setCantidadMastil(Integer cantidadMastil) {
            this.cantidadMastil = cantidadMastil;
        }

        public boolean evaluarTamanio(){
            return cantidadMastil > 4;
        }
    }


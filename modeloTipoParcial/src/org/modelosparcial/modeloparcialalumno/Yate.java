package org.modelosparcial.modeloparcialalumno;


    public class Yate extends Embarcacion implements Comparable<Yate>{

        private Integer numeroCamatores;

        public Yate(Double precioBase, Double valorAdicional, Integer anioFabricacion, Integer eslora, Capitan capitan, Integer numeroCamatores) {
            super(precioBase, valorAdicional, anioFabricacion, eslora, capitan);
            this.numeroCamatores = numeroCamatores;
        }

        public Integer getNumeroCamatores() {
            return numeroCamatores;
        }

        public void setNumeroCamatores(Integer numeroCamatores) {
            this.numeroCamatores = numeroCamatores;
        }

        //Primera forma
/*    @Override
    public int compareTo(Yate o) {
        int respuesta = 0;
        if(this.numeroCamatores > o.numeroCamatores){
            respuesta = 1;
        }
        if(this.numeroCamatores < o.numeroCamatores){
            respuesta = -1;
        }
        return respuesta;
    }*/

        //Forma 2
        @Override
        public int compareTo(Yate o) {
            return this.numeroCamatores - o.numeroCamatores;
        }
    }

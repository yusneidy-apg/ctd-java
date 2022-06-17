package org.modelosparcial.modeloparcialalumno;


public abstract class Embarcacion {
        private Double precioBase;
        private Double valorAdicional;
        private Integer anioFabricacion;
        private Integer eslora;
        private Capitan capitan;



        public Embarcacion(Double precioBase, Double valorAdicional, Integer anioFabricacion, Integer eslora, Capitan capitan) {
            this.precioBase = precioBase;
            this.valorAdicional = valorAdicional;
            this.anioFabricacion = anioFabricacion;
            this.eslora = eslora;
            this.capitan = capitan;
        }

        public Double getPrecioBase() {
            return precioBase;
        }

        public void setPrecioBase(Double precioBase) {
            this.precioBase = precioBase;
        }

        public Double getValorAdicional() {
            return valorAdicional;
        }

        public void setValorAdicional(Double valorAdicional) {
            this.valorAdicional = valorAdicional;
        }

        public Integer getAnioFabricacion() {
            return anioFabricacion;
        }

        public void setAnioFabricacion(Integer anioFabricacion) {
            this.anioFabricacion = anioFabricacion;
        }

        public Integer getEslora() {
            return eslora;
        }

        public void setEslora(Integer eslora) {
            this.eslora = eslora;
        }

        public Capitan getCapitan() {
            return capitan;
        }

        public void setCapitan(Capitan capitan) {
            this.capitan = capitan;
        }

        public Double calcularAlquiler(){
            if(anioFabricacion > 2020){
                precioBase += valorAdicional;
            }
            return precioBase;
        }

        @Override
        public String toString() {
            return  "capitan =" + capitan +
                    ",precioBase =" + precioBase +
                    ", valorAdicional =" + valorAdicional +
                    ", anioFabricacion =" + anioFabricacion +
                    ", eslora =" + eslora;
        }
    }


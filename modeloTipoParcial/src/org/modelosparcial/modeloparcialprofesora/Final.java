package org.modelosparcial.modeloparcialprofesora;

public class Final extends Examen implements Comparable<Final>{  //le colocamos final para que compare con la clase final

    private double notaOral;
    private String descripcionTema;
    private double promedio;

    public Final(Alumno alumno, String descripcionTema)
    {
        super(alumno);
        this.descripcionTema = descripcionTema;
    }
    @Override
    public boolean estaAprobado()
    {
        if(getNota()>=4 && notaOral >=4)
            return true;
        else
            return false;
    }

    @Override
    public int compareTo(Final o) {
        if (promedio()>o.promedio);
        return 0;
    }
    private double promedio(){
        return (getNota() + notaOral)/2;
    }

}

package modelo;
public class FechaDetallada extends Fecha{

    //---Atributos---
    //Array meses
    private final String [] MESES = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "nomviembre", "diciembre"};


    //---Metodos---
    public FechaDetallada(String fecha){
        super(fecha);
    }

    public FechaDetallada(int dia, int mes, int anio){
        super(dia, mes, anio);
    }

    @Override
    public String toString() {
        return getDia() + " de " + MESES[getMes()-1] + " de " + getAnio();
    }
}

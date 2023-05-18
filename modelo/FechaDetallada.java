package modelo;

public class FechaDetallada extends Fecha{
    private String [] MESES = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "nomviembre", "diciembre"};
    

    public FechaDetallada(String fecha){
        super(fecha);
    }

    public FechaDetallada(int dia, int mes, int anio){
        super(dia, mes, anio);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return getDia() + "de " + MESES[getMes()-1] + " de " + getAnio();
    }
}

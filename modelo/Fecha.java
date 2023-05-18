package modelo;
public class Fecha
{
    //---Atributos---
    private int dia;
    private int mes;
    private int anio;

    //---Metodos---

    //Constructor
    public Fecha()
    {

    }
    public Fecha(int dia, int mes, int anio)
    {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Fecha(String s)
    {
        int pos1 = s.indexOf("/");
        int pos2 = s.lastIndexOf("/");

        dia = Integer.parseInt(s.substring(0, pos1));
        mes = Integer.parseInt(s.substring(pos1 + 1, pos2));
        anio = Integer.parseInt(s.substring(pos2 + 1));

    }
    //Metodos de acceso
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    //---Metodo toString
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }

    @Override
    public boolean equals(Object obj) {
        Fecha otra = (Fecha)obj;
        return (dia == otra.getDia()) && (mes == otra.getMes()) && (anio == otra.getAnio());
    }


    


}
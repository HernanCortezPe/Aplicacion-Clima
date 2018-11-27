package com.example.itlm.a1.forescastModels;

public class headerForecas {
    String Fecha,Promedio,Temperatura,Icono,ProbLluvia,Viento,Humedad;

    public headerForecas(String fecha, String promedio, String temperatura, String icono, String probLluvia, String viento, String humedad) {
        Fecha = fecha;
        Promedio = promedio;
        Temperatura = temperatura;
        Icono = icono;
        ProbLluvia = probLluvia;
        Viento = viento;
        Humedad = humedad;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public String getPromedio() {
        return Promedio;
    }

    public void setPromedio(String promedio) {
        Promedio = promedio;
    }

    public String getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(String temperatura) {
        Temperatura = temperatura;
    }

    public String getIcono() {
        return Icono;
    }

    public void setIcono(String icono) {
        Icono = icono;
    }

    public String getProbLluvia() {
        return ProbLluvia;
    }

    public void setProbLluvia(String probLluvia) {
        ProbLluvia = probLluvia;
    }

    public String getViento() {
        return Viento;
    }

    public void setViento(String viento) {
        Viento = viento;
    }

    public String getHumedad() {
        return Humedad;
    }

    public void setHumedad(String humedad) {
        Humedad = humedad;
    }
}

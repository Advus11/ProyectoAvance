import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Vehiculo {
    private String color;
    private String marca;
    private String patente;
    public String tipoVehiculo;
    private String horaLlegada;

    public Vehiculo(String color, String marca, String patente, String tipoVehiculo, String horaLlegada) {
        this.color = color;
        this.marca = marca;
        this.patente = patente;
        this.tipoVehiculo = tipoVehiculo;
        this.horaLlegada = horaLlegada;
    }

    // Getters y setters

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }
}
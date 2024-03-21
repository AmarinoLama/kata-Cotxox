package edu.badpals.Cotxox.carrera;

import edu.badpals.Cotxox.conductores.Conductor;
import edu.badpals.Cotxox.conductores.PoolConductores;
import edu.badpals.Cotxox.tarifa.Tarifa;

public class Carrera {

    private String tarjetaCredito;
    private String origen;
    private String destino;
    private double distancia;
    private int tiempoEsperado;
    private int tiempoCarrera;
    private double costeTotal;
    private int propina;

    private Conductor conductor;

    public Carrera(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public int getTiempoEsperado() {
        return tiempoEsperado;
    }

    public int getTiempoCarrera() {
        return tiempoCarrera;
    }

    public double getCosteTotal() {
        return costeTotal;
    }

    public int getPropina() {
        return propina;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setTiempoEsperado(int tiempoEsperado) {
        this.tiempoEsperado = tiempoEsperado;
    }

    public void setTiempoCarrera(int tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public double getCosteEsperado() {
        return Tarifa.getCosteTotalEsperado(this);
    }
    public void asignarConductor(PoolConductores conductores) {
        setConductor(conductores.asignarConductor());
    }

    public void realizarPago(double pago) {
        this.costeTotal = pago;
    }

    public void recibirPropina(int propina) {
        this.propina = propina;
    }

    public void liberarConductor() {
        getConductor().setOcupado(false);
    }
}

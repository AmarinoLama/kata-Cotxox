package edu.badpals.Cotxox.tarifa;

import edu.badpals.Cotxox.carrera.Carrera;

public class Tarifa {
    final static double COSTA_MILLA = 1.35;
    final static double COSTE_MINUTO = 0.35;
    final static double COSTE_MINIMO = 5.0;
    final static byte PORCENTAJE_COMISION = 20;

    public Tarifa() {
    }

    public static double getCosteDistancia(double distancia) {
        return distancia * COSTA_MILLA;
    }

    public static double getCosteTiempo(int tiempo) {
        return tiempo * COSTE_MINUTO;
    }

    public static double getCosteTotalEsperado(Carrera carrera) {
        double costeTotal = getCosteDistancia(carrera.getDistancia()) + getCosteTiempo(carrera.getTiempoEsperado());
        return costeTotal > COSTE_MINIMO ? costeTotal : COSTE_MINIMO;
    }
}

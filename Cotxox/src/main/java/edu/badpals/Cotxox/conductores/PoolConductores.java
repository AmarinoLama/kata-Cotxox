package edu.badpals.Cotxox.conductores;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PoolConductores {

    private List<Conductor> poolConductores = new ArrayList<Conductor>();


    public PoolConductores(List<Conductor> poolConductores) {
        this.poolConductores = poolConductores;
    }

    public List<Conductor> getPoolConductores() {
        return poolConductores;
    }

    public Conductor asignarConductor() {
        Conductor conductor = new Conductor();
        for (Conductor posicion : getPoolConductores()) {
            if (!posicion.isOcupado()) {
                conductor.setOcupado(true);
                break;
            }
        }
        return conductor;
    }
}

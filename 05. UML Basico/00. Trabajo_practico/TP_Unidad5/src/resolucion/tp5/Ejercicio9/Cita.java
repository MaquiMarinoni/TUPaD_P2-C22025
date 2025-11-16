/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resolucion.tp5.Ejercicio9;

import java.time.LocalDateTime;

/**
 *
 * @author marinon
 */
// Cita conoce Paciente y Profesional (asociaciones unidireccionales)
public class Cita {
    private final LocalDateTime fechaHora;
    private final Paciente paciente;
    private final Profesional profesional;
    private final String motivo;

    public Cita(LocalDateTime fechaHora, Paciente paciente, Profesional profesional, String motivo) {
        this.fechaHora = fechaHora;
        this.paciente = paciente;
        this.profesional = profesional;
        this.motivo = motivo;
    }

    @Override
    public String toString() {
        return "Cita{fechaHora=" + fechaHora + ", paciente=" + paciente +
               ", profesional=" + profesional + ", motivo='" + motivo + "'}";
    }

}
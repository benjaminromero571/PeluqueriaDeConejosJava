
package com.mycompany.jpaprueba.logica;

import com.mycompany.jpaprueba.persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMaco, String raza, String color, String observaciones, String nomDuenio, String celDuenio, String alergico, String atenEsp) {
        
        Duenio duenio = new Duenio();
        duenio.setNombre(nomDuenio);
        duenio.setCelDuenio(celDuenio);
        
        Mascota masco = new Mascota();
        masco.setNombre(nombreMaco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEsp);
        masco.setObservaciones(observaciones);
        masco.setUnduenio(duenio);
        
        controlPersis.guardad(duenio,masco);
        
        
        
    }
    
    
}

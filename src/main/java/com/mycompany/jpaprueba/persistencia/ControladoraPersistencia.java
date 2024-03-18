package com.mycompany.jpaprueba.persistencia;

import com.mycompany.jpaprueba.logica.Duenio;
import com.mycompany.jpaprueba.logica.Mascota;

public class ControladoraPersistencia {
    
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void guardad(Duenio duenio, Mascota masco) {
        
        //Creando en la BD el dueño
        duenioJpa.create(duenio);
        
        //Creando en la BD la mascota
        mascoJpa.create(masco);
    }
    
    
}
 
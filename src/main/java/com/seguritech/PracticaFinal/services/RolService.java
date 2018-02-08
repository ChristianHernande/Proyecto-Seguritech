/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguritech.PracticaFinal.services;

import com.seguritech.PracticaFinal.domain.Rol;
import java.util.List;

/**
 *
 * @author Seguritech2
 */
  
    public interface RolService {

    List<Rol> findAll();

    Rol findOne(Long id);

    List<Rol> findByDescripcion(String descripcion);

    void save(Rol rol);

    void delete(Long id);
}
   

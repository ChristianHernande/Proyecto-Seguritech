/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguritech.PracticaFinal.repositories;

import com.seguritech.PracticaFinal.domain.Rol;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Seguritech2
 */
public interface RolRepository extends JpaRepository<Rol, Long>{
    
    List<Rol> findByDescripcion(String descripcion);
}

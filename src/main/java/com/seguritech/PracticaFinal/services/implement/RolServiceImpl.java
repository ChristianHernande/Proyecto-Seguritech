/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguritech.PracticaFinal.services.implement;

import com.seguritech.PracticaFinal.domain.Rol;
import com.seguritech.PracticaFinal.repositories.RolRepository;
import com.seguritech.PracticaFinal.services.RolService;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Seguritech2
 */
@Service
@Transactional
public class RolServiceImpl implements RolService{

    private final RolRepository rolRepository;

    public RolServiceImpl(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    @Override
    public List<Rol> findAll() {
        return rolRepository.findAll();
    }

    @Override
    public Rol findOne(Long id) {
        return rolRepository.findOne(id);
    }

    @Override
    public List<Rol> findByDescripcion(String descripcion) {
        return rolRepository.findByDescripcion(descripcion);
    }
    
    @Override
    public void save(Rol rol) {
        rolRepository.save(rol);
    }

    @Override
    public void delete(Long id) {
        rolRepository.delete(id);
    }

}
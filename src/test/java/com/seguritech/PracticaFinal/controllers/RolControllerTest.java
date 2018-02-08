/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguritech.PracticaFinal.controllers;

import com.seguritech.PracticaFinal.domain.Rol;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author Seguritech2
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RolControllerTest {
    
    @Autowired
    RolController rolController;
    
    public RolControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testListAll_0args() {
        System.out.println("listAll");
        List<Rol> listAll = rolController.listAll();
        assertEquals(2,listAll.size());
    }

//    @Test
//    public void testGetRol() {
//        System.out.println("getRol");
//        Long id = null;
//        RolController instance = new RolController();
//        ResponseEntity<Rol> expResult = null;
//        ResponseEntity<Rol> result = instance.getRol(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testListAll_String() {
//        System.out.println("listAll");
//        String descripcion = "";
//        RolController instance = new RolController();
//        List<Rol> expResult = null;
//        List<Rol> result = instance.listAll(descripcion);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testCreate() throws Exception {
//        System.out.println("create");
//        Rol rol = null;
//        RolController instance = new RolController();
//        ResponseEntity<Rol> expResult = null;
//        ResponseEntity<Rol> result = instance.create(rol);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testUpdate() throws Exception {
//        System.out.println("update");
//        Rol rol = null;
//        RolController instance = new RolController();
//        ResponseEntity<Rol> expResult = null;
//        ResponseEntity<Rol> result = instance.update(rol);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testDeleteRol() {
//        System.out.println("deleteRol");
//        Long id = null;
//        RolController instance = new RolController();
//        ResponseEntity<Rol> expResult = null;
//        ResponseEntity<Rol> result = instance.deleteRol(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}

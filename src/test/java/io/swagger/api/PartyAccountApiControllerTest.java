///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package io.swagger.api;
//
//import io.swagger.model.PartyAccountCreate;
//import io.swagger.model.PartyAccountUpdate;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//import org.springframework.http.ResponseEntity;
//
///**
// *
// * @author ergi
// */
//public class PartyAccountApiControllerTest {
//    
//    public PartyAccountApiControllerTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of createPartyAccount method, of class PartyAccountApiController.
//     */
//    @Test
//    public void testCreatePartyAccount() {
//        System.out.println("createPartyAccount");
//        PartyAccountCreate partyAccount = null;
//        PartyAccountApiController instance = new PartyAccountApiController(null, null);;
//        ResponseEntity<Object> expResult = null;
//        ResponseEntity<Object> result = instance.createPartyAccount(partyAccount);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of deletePartyAccount method, of class PartyAccountApiController.
//     */
//    @Test
//    public void testDeletePartyAccount() {
//        System.out.println("deletePartyAccount");
//        String id = "";
//        PartyAccountApiController instance = new PartyAccountApiController(null, null);;
//        ResponseEntity<Void> expResult = null;
//        ResponseEntity<Void> result = instance.deletePartyAccount(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listPartyAccount method, of class PartyAccountApiController.
//     */
//    @Test
//    public void testListPartyAccount() {
//        System.out.println("listPartyAccount");
//        String userId = "";
//        String fields = "";
//        Integer offset = null;
//        Integer limit = null;
//        PartyAccountApiController instance = new PartyAccountApiController(null, null);;
//        ResponseEntity<Object> expResult = null;
//        ResponseEntity<Object> result = instance.listPartyAccount(userId, fields, offset, limit);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of patchPartyAccount method, of class PartyAccountApiController.
//     */
//    @Test
//    public void testPatchPartyAccount() {
//        System.out.println("patchPartyAccount");
//        String id = "";
//        PartyAccountUpdate partyAccount = null;
//        PartyAccountApiController instance = new PartyAccountApiController(null, null);;
//        ResponseEntity<Object> expResult = null;
//        ResponseEntity<Object> result = instance.patchPartyAccount(id, partyAccount);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of retrievePartyAccount method, of class PartyAccountApiController.
//     */
//    @Test
//    public void testRetrievePartyAccount() {
//        System.out.println("retrievePartyAccount");
//        String id = "ED5AAE78-5102-4101-9495-3099643151501";
//        String fields = "";
//        PartyAccountApiController instance = new PartyAccountApiController(null, null);
//        ResponseEntity<Object> expResult = null;
//        ResponseEntity<Object> result = instance.retrievePartyAccount(id, fields);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
//}
/*
 * ClienteTest.java
 * JUnit based test
 *
 * Created on 25 de septiembre de 2007, 15:11
 */

package vete.Entidad;

import junit.framework.TestCase;

/**
 *
 * @author Lisandro
 */
public class ClienteTest extends TestCase {
    
    public ClienteTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGetUid() {
        System.out.println("getUid");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getUid();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    } /* Test of getUid method, of class Cliente. */

    public void testSetUid() {
        System.out.println("setUid");
        String uid = "";
        Cliente instance = new Cliente();
        instance.setUid(uid);
        fail("The test case is a prototype.");
    } /* Test of setUid method, of class Cliente. */

    public void testGenerarUid() {
        System.out.println("generarUid");
        Cliente instance = new Cliente();
        instance.generarUid();
        fail("The test case is a prototype.");
    } /* Test of generarUid method, of class Cliente. */

    public void testGetCodigo() {
        System.out.println("getCodigo");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getCodigo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    } /* Test of getCodigo method, of class Cliente. */

    public void testSetCodigo() {
        System.out.println("setCodigo");
        String codigo = "";
        Cliente instance = new Cliente();
        instance.setCodigo(codigo);
        fail("The test case is a prototype.");
    } /* Test of setCodigo method, of class Cliente. */

    public void testGetNombre() {
        System.out.println("getNombre");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    } /* Test of getNombre method, of class Cliente. */

    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Cliente instance = new Cliente();
        instance.setNombre(nombre);
        fail("The test case is a prototype.");
    } /* Test of setNombre method, of class Cliente. */

    public void testGetCuit() {
        System.out.println("getCuit");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getCuit();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    } /* Test of getCuit method, of class Cliente. */

    public void testSetCuit() {
        System.out.println("setCuit");
        String cuit = "";
        Cliente instance = new Cliente();
        instance.setCuit(cuit);
        fail("The test case is a prototype.");
    } /* Test of setCuit method, of class Cliente. */

    public void testGetMail() {
        System.out.println("getMail");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getMail();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    } /* Test of getMail method, of class Cliente. */

    public void testSetMail() {
        System.out.println("setMail");
        String mail = "";
        Cliente instance = new Cliente();
        instance.setMail(mail);
        fail("The test case is a prototype.");
    } /* Test of setMail method, of class Cliente. */

    public void testGetEstado() {
        System.out.println("getEstado");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getEstado();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    } /* Test of getEstado method, of class Cliente. */

    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        Cliente instance = new Cliente();
        instance.setEstado(estado);
        fail("The test case is a prototype.");
    } /* Test of setEstado method, of class Cliente. */

    public void testGetDescuento() {
        System.out.println("getDescuento");
        Cliente instance = new Cliente();
        Double expResult = null;
        Double result = instance.getDescuento();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    } /* Test of getDescuento method, of class Cliente. */

    public void testSetDescuento() {
        System.out.println("setDescuento");
        Double descuento = null;
        Cliente instance = new Cliente();
        instance.setDescuento(descuento);
        fail("The test case is a prototype.");
    } /* Test of setDescuento method, of class Cliente. */

    public void testGetCondicionIva() {
        System.out.println("getCondicionIva");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getCondicionIva();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    } /* Test of getCondicionIva method, of class Cliente. */

    public void testSetCondicionIva() {
        System.out.println("setCondicionIva");
        String condicionIva = "";
        Cliente instance = new Cliente();
        instance.setCondicionIva(condicionIva);
        fail("The test case is a prototype.");
    } /* Test of setCondicionIva method, of class Cliente. */
    
}

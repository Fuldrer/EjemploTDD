/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd.demo;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Carlos Molina
 */
public class EvaluadorTest {
    //Primer Requerimiento
    public void testTrue() {
        EvaluadorBoleano evaluador = new EvaluadorBoleano();
        assert evaluador.eval("verdadero") == true;
    }
    
    //Requerimiento de segundo ciclo
    /*public void testFalse() {
        EvaluadorBoleano evaluador = new EvaluadorBoleano();
        assert evaluador.eval("falso") == false;
    }*/
}

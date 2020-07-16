/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Thiago
 */
public class Somar implements IOperador{

    @Override
    public String resultado(float n1, float n2) {
        float r=n1+n2;
        return String.valueOf(r);
    }
    
}

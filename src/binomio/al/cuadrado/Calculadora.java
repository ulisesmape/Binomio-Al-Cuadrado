/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binomio.al.cuadrado;

/**
 *
 * @author Alumno
 */
class Calculadora {

  int num1, num2, resultado;
    String procedimiento;

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    String Procedimiento() {
        procedimiento=num1 + "^2" + "+ " + "2(" + num1 + "*" + num2 + ")" + "+" + num2 + "^2";
        
        return procedimiento;
        
    }
    
    int Resultado() {
        
        resultado=(num1*num1 + 2*num1*num2 + num2*num2);
        
        return resultado;
        
    }
}


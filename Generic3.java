/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasGeneric;

/**
 *
 * @author Respus
 * generik yang tidak memiliki parameter
 */
public class Generic3 <T> {
    private T type;
    
    public T getType(){
        return type;
    }
    
    public void setType(T type){
        this.type = type;
    }

    
    private static <M> void motor() {
        System.out.println();
    }
    
    public static void main (String[] args) {
        motor();
    }
}

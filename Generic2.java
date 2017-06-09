/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasGeneric;

/**
 *
 * @author Respus
 * method generik lebih dari 1 tipe
 */
public class Generic2 <T> {
    private T type;
    
    public T getType(){
        return type;
    }
    
    public void setType(T type) {
        this.type = type;
    }
    
    private static <N,T> void bebas (N suka, T shuka) {
        System.out.println(suka);
        System.out.println(shuka);
    }
        
        public static void main(String [] args ) {
        bebas (21,"Generic");
    }
}
        

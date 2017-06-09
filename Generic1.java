/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasGeneric;

/**
 *
 * @author Respus
 * Array 2 tipe
 */
public class Generic1 {
    private static <T> void printArray(T[] a)
    {
        for (Object o : a) {
            System.out.println(o);
        }
    }
    public static void main(String[] args) {
        Double dArr[] = new Double[3];
         dArr[0] = 20.01;
         dArr[1] = 30.02;
         dArr[2] = 40.03;
         printArray(dArr);
         
         Character cArr[] = new Character[3];
         cArr[0] = 'a';
         cArr[1] = 'b';
         cArr[2] = 'c';
         printArray(cArr);
    }
}

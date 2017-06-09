/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasGeneric;

/**
 *
 * @author Respus
 * kelas konkret berisi 1 variable get-set dan method generik
 */
public class Generic4 {
    String kendaraan;
    
    public String getKendaraan(){
      return kendaraan;  
    }
    public void setKendaraan (String kd) {
        this.kendaraan= kd;
        
    }
    private static <T> void Kendaraanbaru (T bebas){
        System.out.println(bebas);
    }
    public static void main (String[] args) {
        Generic4 kd = new Generic4();
        
        Kendaraanbaru("Kendaraan");
        kd.setKendaraan("Mobil");
        System.out.println(kd.getKendaraan());
        
    }
    
}

package pert702;

/**
 *
 * @author 20103207 Mita Diani
 */
public class Pert702 {

    public static void main(String[] args) {
        buah B = new buah();
        B.setNAMA("Anggur");
        B.setWARNA("Unggu");
        B.setHARGA(15000);
        B.TampilInfo();
        
        apel A = new apel();
        A.setNAMA("Apel Merah");
        A.setWARNA("Merah");
        A.setHARGA(3500);
        A.TampilInfo();
        
    }
}
package pert702;

/**
 *
 * @author 20103207 Mita Diani
 */
public class apel extends buah {
    
    @Override
    public void TampilInfo(){
        System.out.println("Informasi Data Harga Buah Apel");
        System.out.println("Nama Buah   : "+this.getNAMA() );
        System.out.println("Harga       : "+this.getHARGA() );
        System.out.println("Warna       : "+this.getWARNA() );
        
    }
}
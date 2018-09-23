/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan6.kambingstatic;

/*
 * 
 * @author
 * Nama     : Eka Widyantoro
 * Kelas    : IF-3 / PBO3
 * NIM      : 10117113
 * Deskripsi Program : Program menambah kambing dengan dua class
 */
public class KambingStatic {
    // NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak "
                            + Mamalia.jumlahKambing );
    }
}

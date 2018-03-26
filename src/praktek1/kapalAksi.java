/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek1;

/**
 *
 * @author TWINCOM
 */
public class kapalAksi {
    public static void main(String[] args) {
        kapal A = new kapal();
        kapal B = new kapal();
        kapal C = new kapal();
        
        A.Jenis_kapal="kapal perang";
        A.Bentuk_kapal="besar";
        A.Warna_kapal="hitam";
        A.Tempat_duduk="kelas ekonomi";
        A.Pelampung="ban";
        
        B.Jenis_kapal="kapal pesiar";
        B.Bentuk_kapal="kecil";
        B.Warna_kapal="putih";
        B.Tempat_duduk="kelas bisnis";
        B.Pelampung="baju";
        
        C.Jenis_kapal="kapal feri";
        C.Bentuk_kapal="sedang";
        C.Warna_kapal="campuran";
        C.Tempat_duduk="kelas VVIP";
        C.Pelampung="perahu karet";
        
        A.cetakInfo();
        System.out.println();
        B.cetakInfo();
        System.out.println();
        C.cetakInfo();
        System.out.println();
    }
   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan43.GajiPegawai;

/**
 *
 * @author 
 * NAMA    : Abraham Rumayara
 * KELAS   : PBO10K
 * NIM     : 10119905
 * Deskripsi Program : Program Gaji Pegawai
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        GajiPegawai objGajiPegawai = new GajiPegawai();
        objGajiPegawai.setNama("Rizki Adam Kurniawan");
        objGajiPegawai.setAlamat("Jalan Semar dalam 4 No, 72/66");
        objGajiPegawai.uangTransport(250000);
        objGajiPegawai.uangTunjangan(300000);
        objGajiPegawai.gajiPokok(4500000);
        objGajiPegawai.totalGaji(objGajiPegawai.uangTunjangan(),objGajiPegawai.uangTransport() , objGajiPegawai.gajiPokok());
        objGajiPegawai.tampilData(objGajiPegawai.getNama(), objGajiPegawai.getAlamat(), objGajiPegawai.uangTransport(), objGajiPegawai.uangTunjangan(), objGajiPegawai.gajiPokok(), objGajiPegawai.totalGaji());
    
        
    }
    
}

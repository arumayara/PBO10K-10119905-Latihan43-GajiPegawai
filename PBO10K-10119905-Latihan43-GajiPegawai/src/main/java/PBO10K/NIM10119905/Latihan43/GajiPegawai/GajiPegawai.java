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
public class GajiPegawai {
    private String nama;
    private String alamat;
    private int uangTransport;
    private int uangTunjangan;
    private int gajiPokok;
    private int totalGaji;
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public int uangTransport(){
        return uangTransport;
    }
    
    public void uangTransport (int uangTransport){
        this.uangTransport= uangTransport;
    }
    
    public int uangTunjangan(){
        return uangTunjangan;
    }
    
    public void uangTunjangan(int uangTunjangan){
        this.uangTunjangan = uangTunjangan;
    }
    
    public int gajiPokok(){
        return gajiPokok;
    }
    
    public void gajiPokok(int gajiPokok){
        this.gajiPokok=gajiPokok;
    }
    
    public int totalGaji(){
        return totalGaji;
    }
    
    public void totalGaji (int totalGaji){
        this.totalGaji= totalGaji;
    }
    
    public int totalGaji(int uangTunjangan, int uangTransport , int gajiPokok ){
       return totalGaji=uangTunjangan + uangTransport + gajiPokok;
    }
    
    public void tampilData(String nama, String alamat , int uangTransport, int uangTunjangan, int gajiPokok, int totalGaji){
        System.out.println("Nama Karyawan : "+nama);
        System.out.println("Alamat : "+ alamat);
        System.out.println("Uang Transport : Rp,"+ uangTransport);
        System.out.println("Uang Tunjangan : Rp."+ uangTunjangan);
        System.out.println("Gaji Pokok : Rp."+ gajiPokok);
        System.out.println("Total Gaji : Rp."+ totalGaji);
        
                
    }
}

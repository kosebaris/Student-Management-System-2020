/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;



/* Baris Kose 190503059 */


import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class LVA {

    private String ders_adi = " ";
    private String ogrenci_sayisi = " ";
    private String ogretmen_ismi = " ";
    private String ders_kredi = " ";
    private String dersilk = " ";
    private String dersson = " ";
    int kontrol = 0;
    int bulunan = 0;
    int ogrSayisi = 0;
    int hocaSayisi = 0;
    

    private Vector<LVA> dersler = new Vector<LVA>();

    ArrayList kayitliOgrenciler = new ArrayList();

    ArrayList kayitliHocalar = new ArrayList();


    public LVA (String ders_adi, String ders_kredi) {

        this.ders_kredi = ders_kredi;
        this.ders_adi = ders_adi;
        



    }


    public void addLVA(String ders_adi, String ders_kredi) {

        if(ders_adi.length() == 6) {
            String dersilk = ders_adi.substring(0, 3);
            String dersson = ders_adi.substring(3);
            if(this.dersKoduKontrol(dersilk, dersson)) {

                LVA d = new LVA(ders_adi, ders_kredi);

                this.dersler.addElement(d);
                System.out.println("LVA wurde erfolgreich hinzugefuegt.\n");
                ogrSayisi = 0;
                hocaSayisi = 0;
                kontrol = 1;


            }else{
                LVAolusturmaHataMesaji();
                kontrol = 0;
            }
        }else{
            LVAolusturmaHataMesaji();
            kontrol = 0;
        }

    }


    public void printKayitliOgrenciler(String dersismi){


        for(int k=0;k<dersler.size();k++) {

            if(dersler.get(k).equals(dersismi)){

                bulunan = k;

                System.out.println(dersler.get(bulunan).kayitliOgrenciler);

            }
        }


    }

    public void printKayitliHocalar(String dersismi){


        for(int k=0;k<dersler.size();k++) {

            if(dersler.get(k).equals(dersismi)){

                bulunan = k;

                System.out.println(dersler.get(bulunan).kayitliHocalar);

            }
        }


    }


    public void derseOgrenciEkle(String dersismi, String adsoyad) {


        for (int k = 0; k < dersler.size(); k++) {

            if (dersler.get(k).equals(dersismi)) {

                bulunan = k;

                dersler.get(bulunan).kayitliOgrenciler.add(adsoyad);

            }


        }
    }

    public void derseHocaEkle(String dersismi, String adsoyad) {


        for (int k = 0; k < dersler.size(); k++) {

            if (dersler.get(k).equals(dersismi)) {

                bulunan = k;

                dersler.get(bulunan).kayitliHocalar.add(adsoyad);

            }


        }
    }


    public void derstenOgrenciSil(String dersismi, String adsoyad) {


        for (int k = 0; k < dersler.size(); k++) {

            if (dersler.get(k).equals(dersismi)) {

                bulunan = k;

                dersler.get(bulunan).kayitliOgrenciler.remove(adsoyad);

            }


        }
    }

    public void derstenHocaSil(String dersismi, String adsoyad) {


        for (int k = 0; k < dersler.size(); k++) {

            if (dersler.get(k).equals(dersismi)) {

                bulunan = k;

                dersler.get(bulunan).kayitliHocalar.remove(adsoyad);

            }


        }
    }



    public void LVAolusturmaHataMesaji(){

        System.out.println("Die Abkuerzung des Kurses muss in Grossbuchstaben eingegeben werden.");
        System.out.println("Der Code des Kurses muss 3-stellig sein.");

    }



    public void printLVAs() {


        for (int i=0; i < dersler.size(); i++) {
            LVA s = dersler.get(i);
            System.out.println(s.toString());
        }

    }
    
    public LVA dersObjesi(String dersismi){

        for (int k = 0; k < dersler.size(); k++) {

            if (dersler.get(k).equals(dersismi)) {

                bulunan = k;

            }
        }

        return dersler.get(bulunan);

    }



    public boolean dersMevcutMu(String gelen) {

        for(int k=0;k<dersler.size();k++) {

            if(dersler.get(k).equals(gelen)){

                bulunan = k;

                return true;
            }
        }
        return false;
    }



    public void printDers(String gelen) {

        if(dersMevcutMu(gelen)){
            System.out.println(dersler.get(bulunan).toString());
        }else{
            System.out.println("LVA existiert nicht.\n");

        }

    }



    public void deleteLVA (String gelen){

        if(!this.dersMevcutMu(gelen)){

            System.out.println("LVA existiert nicht.\n");
        }
        else {
            for (int k = 0; k < dersler.size(); k++) {

                if (dersler.get(k).equals(gelen)) {

                    dersler.removeElementAt(k);

                    System.out.println("LVA registrierung wurde geloescht.\n");
                }
            }
        }

    }
    
    public int dersSayisi(){
        
        return dersler.size();
        
    }
    
    public void OgrArttir(){
        
        this.ogrSayisi++;
        
    }
    public void OgrAzalt(){
        
        this.ogrSayisi--;
        
    }
    
    public void HocaArttir(){
        
        this.hocaSayisi++;
        
    }
    
    public void HocaAzalt(){
        
        this.hocaSayisi--;
        
    }

    
    public String dersleriVer(int k){
        
        
        
        LVA dersismi = dersler.get(k);
        
        return dersismi.toString();
    }
    
    
    public String getDersismi(){

        return ders_adi;

    }
    public String getKredi(){

        return ders_kredi;
    }
    
    public int getOgrsayisi(){

        return ogrSayisi;
    }
    
    public int getHocasayisi(){

        return hocaSayisi;
    }
    
    

    ////////////////////////////////

    public void setDersismi(String s){

        ders_adi = s;

    }
    public void setKredi(String s){

        ders_kredi = s;

    }
    
    public void setOgrsayisi (int s){

        ogrSayisi = s;

    }
    
    public void setHocasayisi (int s){

        hocaSayisi = s;

    }



    public String toString() {

        return ders_adi;

    }


    public boolean dersKoduKontrol (String gelen1, String gelen2){

        if(gelen1.toUpperCase() == gelen1 && Integer.parseInt(gelen2) < 1000 && Integer.parseInt(gelen2) > 99) {
            return true;
        }else {
            return false;
        }

    }

    public boolean equals(Object o) {
        if(this.ders_adi.contentEquals((String)o)) {
            return true;
        }
        return false;
    }

}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;



/* Baris Kose 190503059 */


import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Student extends Person {


    private String ogrnumarasi = " ";
    private String sinif = " ";
    private String bolum = " ";
    private String donem = " ";
    
    
    int bulunan = 0;


    private Vector<Student> ogrenciler = new Vector<Student>();

    ArrayList<String> kayitlidersler = new ArrayList();



    public Student (String isim, String soyisim, String ogrnumarasi) {

        this.setIsim(isim);
        this.setSoyisim(soyisim);
        this.setOgrnumarasi(ogrnumarasi);
        

    }

    public Student(String ogrnumarasi){

        this.setOgrnumarasi(ogrnumarasi);

    }

    public void derseKaydet(String numara, String dersismi){


        if(ogrenciNumaraMevcutMu(numara)){

            ogrenciler.get(bulunan).kayitlidersler.add(dersismi);

            System.out.println("Der Student wurde erfolgreich in den Kurs eingeschrieben.");

        }else{
            System.out.println("Student existiert nicht.");
        }

    }



    public void derstenSil(String numara, String dersismi){

        if(ogrenciNumaraMevcutMu(numara)){

            ogrenciler.get(bulunan).kayitlidersler.remove(dersismi);

            System.out.println("Der Student wurde erfolgreich im Kurs abgemeldet.");

        }else{
            System.out.println("Student existiert nicht.");
        }

    }
    
    public void addDigerBilgiler(String numara, String anneadi, String babaadi, String email, String yas, String cinsiyet, String adres, String bolum){
        
        if(ogrenciNumaraMevcutMu(numara)){
            
            

            ogrenciler.get(bulunan).setAnneadi(anneadi);
            ogrenciler.get(bulunan).setBabaadi(babaadi);
            ogrenciler.get(bulunan).setEmail(email);
            ogrenciler.get(bulunan).setYas(yas);
            ogrenciler.get(bulunan).setCinsiyet(cinsiyet);
            ogrenciler.get(bulunan).setAdres(adres);
            ogrenciler.get(bulunan).setBolum(bolum);

            

        }else{
            System.out.println("Student existiert nicht.");
        }
        
        
    }



    public void printKayitliDersler(String gelen){

        if(ogrenciNumaraMevcutMu(gelen)){
            System.out.println(ogrenciler.get(bulunan).kayitlidersler);
        }else{
            System.out.println("Student existiert nicht.\n");
        }

    }



    public void printOgrenci(String gelen) {

            if(ogrenciNumaraMevcutMu(gelen)){
                System.out.println(ogrenciler.get(bulunan).toString());
            }else{
                System.out.println("Student existiert nicht.\n");
            }

    }



    public void addOgrenci(String isim,String soyisim,String ogrnumarasi){

        if(this.ogrenciNumaraMevcutMu(ogrnumarasi)){ //boyle bir ogrenci numarasi mevcutsa hata mesaji gosterilir
            System.out.println("Ein Student mit dieser Matrikelnummer existiert bereits.\n");
            bulunan = 2;
        } else {
            if (!this.ogrenciVeriKontrol(isim,soyisim,ogrnumarasi)){ // ogrenci bilgileri kurallara uyuyor mu kontrol edilir
                ogrenciOlusturmaHataMesaji();
                bulunan = 0;

            }else { // kontrollerden gecerse ogrenci olusturulur
                Student s = new Student(isim,soyisim,ogrnumarasi);
                this.ogrenciler.addElement(s);
                System.out.println("Student wurde erfolgreich hinzugefuegt.\n");
                bulunan = 1;
                
            }
        }

    }
    
    



    public void ogrenciOlusturmaHataMesaji(){

        System.out.println("Student konnte nicht hinzugefuegt werden.\n" +
                "Der Student Registrierung kann erstellt werden, wenn er den folgenden Regeln entspricht.\n" +
                "Matrikelnummern duerfen nur aus Ziffern bestehen.\n" +
                "Die Lange einer Matrikelnummern muss 7 sein.\n" +
                "Die erste Ziffer einer Matrikelnummer darf nicht 0 sein.\n" +
                "Vor- und Nachname duerfen nicht leer bleiben.\n");

    }



    public static boolean ogrenciVeriKontrol (String isim,String soyisim,String ogrnumarasi){

        if(ogrnumarasi.contentEquals("")
                || isim.contentEquals("")
                || soyisim.contentEquals("")
                || !ogrnumarasi.matches("[-+]?\\d*\\.?\\d+")
                || Integer.parseInt(ogrnumarasi) < 1000000
                || Integer.parseInt(ogrnumarasi) > 10000000) {

            return false;

        }else {
            return true;
        }

    }



    public boolean ogrenciNumaraMevcutMu(String ogrnumarasi) {

        for(int k=0;k<ogrenciler.size();k++) {

                if(ogrenciler.get(k).equals(ogrnumarasi)){

                    bulunan = k;

                    return true;
                }
        }
        return false;
    }


    public Student ogrenciObjesi(String ogrnumarasi){

        for (int k = 0; k < ogrenciler.size(); k++) {

            if (ogrenciler.get(k).equals(ogrnumarasi)) {

                bulunan = k;

            }
        }

        return ogrenciler.get(bulunan);

    }
    
    boolean ogrSilindi;

    public void deleteOgrenci (String ogrnumarasi){

        if(!this.ogrenciNumaraMevcutMu(ogrnumarasi)){

            System.out.println("Student existiert nicht.\n");
            ogrSilindi = false;
        }
        else {
            for (int k = 0; k < ogrenciler.size(); k++) {

                if (ogrenciler.get(k).equals(ogrnumarasi)) {

                    ogrenciler.removeElementAt(k);

                    System.out.println("Studentenregistrierung wurde geloescht.\n");
                    ogrSilindi = true;
                    
                }
            }
        }

    }
    
    



    public void printOgrenciler() {

        for (int i=0; i < ogrenciler.size(); i++) {
            Student s = ogrenciler.get(i);
            System.out.println(s.toString());
            
        }
    }
    
    


    public String getOgrnumarasi() {

        return ogrnumarasi;

    }
    public String getSinif(){

        return sinif;

    }
    public String getBolum(){

        return bolum;

    }
    public String getDonem(){

        return donem;
    }

    ////////////////////////////////

    public void setOgrnumarasi(String s){

        ogrnumarasi = s;

    }
    public void setSinif(String s){

        sinif = s;

    }
    public void setBolum(String s){

        bolum = s;

    }
    public void setDonem(String s){

        donem = s;
    }
    



    public String toString() {

        return ogrnumarasi + ", " + isim + " " + soyisim.toUpperCase();

    }

    public boolean equals(Object o) {
        if(this.getOgrnumarasi().contentEquals((String)o)) {
            return true;
        }
        return false;
    }

}

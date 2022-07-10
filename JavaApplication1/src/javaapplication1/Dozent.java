/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;



/* Baris Kose 190503059 */


import java.util.ArrayList;
import java.util.Vector;

public class Dozent extends Person {

    private String unvan = " ";
    int bulunan = 0;



    ArrayList<String> kayitlidersler = new ArrayList();

    private Vector<Dozent> dozentvektor = new Vector<Dozent>();


    public Dozent (String isim, String soyisim, String unvan, String tcno) {

        this.isim = isim;
        this.soyisim = soyisim;
        this.unvan = unvan;
        this.tcno = tcno;


    }



    public void addDozent(String isim, String soyisim, String unvan, String tcno) {

        if(!dozentMevcutMu(tcno)){
        if (!this.kontrolDozentverigiris(isim, soyisim, unvan, tcno)) {
            dozentOlusturmaHataMesaji();
            bulunan = 0;
        } else {
            Dozent d = new Dozent(isim, soyisim, unvan, tcno);
            this.dozentvektor.addElement(d);
            System.out.println("Dozent wurde erfolgreich hinzugefuegt.\n");
            bulunan = 1;
        }
        }else{
            bulunan = 2;
        }

    }


    public void derseKaydet(String numara, String dersismi){


        if(dozentMevcutMu(numara)){

            dozentvektor.get(bulunan).kayitlidersler.add(dersismi);

            System.out.println("Der Dozent wurde erfolgreich in den Kurs zugewiesen.");

        }else{
            System.out.println("Dozent existiert nicht.");
        }

    }



    public void derstenSil(String numara, String dersismi){

        if(dozentMevcutMu(numara)){

            dozentvektor.get(bulunan).kayitlidersler.remove(dersismi);

            System.out.println("Der Dozent wurde erfolgreich im Kurs abgemeldet.");

        }else{
            System.out.println("Dozent existiert nicht.");
        }

    }


    public void printKayitliDersler(String gelen){

        if(dozentMevcutMu(gelen)){
            System.out.println(dozentvektor.get(bulunan).kayitlidersler);
        }else{
            System.out.println("Dozent existiert nicht.\n");
        }

    }


    public void printDozent(String gelen) {

        if(dozentMevcutMu(gelen)){
            System.out.println(dozentvektor.get(bulunan).toString());
        }else{
            System.out.println("Dozent existiert nicht.\n");
        }

    }
    
    public void addDigerBilgiler(String numara, String anneadi, String babaadi, String email, String yas, String cinsiyet, String adres){
        
        if(dozentMevcutMu(numara)){
            
            

            dozentvektor.get(bulunan).setAnneadi(anneadi);
            dozentvektor.get(bulunan).setBabaadi(babaadi);
            dozentvektor.get(bulunan).setEmail(email);
            dozentvektor.get(bulunan).setYas(yas);
            dozentvektor.get(bulunan).setCinsiyet(cinsiyet);
            dozentvektor.get(bulunan).setAdres(adres);
            

            

        }else{
            System.out.println("Dozent existiert nicht.");
        }
        
        
    }
    
    
    
    
    

    public boolean dozentMevcutMu(String tcno) {

        for(int k=0;k<dozentvektor.size();k++) {

            if(dozentvektor.get(k).equals(tcno)){

                bulunan = k;

                return true;
                
            }
        }
        return false;
    }
    
    boolean dozentSilindi;


    public void deleteDozent (String tcno){

        if(!this.dozentMevcutMu(tcno)){

            System.out.println("Dozent existiert nicht.\n");
            dozentSilindi = false;
        }
        else {
            for (int k = 0; k < dozentvektor.size(); k++) {

                if (dozentvektor.get(k).equals(tcno)) {

                    dozentvektor.removeElementAt(k);

                    System.out.println("Dozentenregistrierung wurde geloescht.\n");
                    dozentSilindi = true;
                }
            }
        }

    }



    public void printDozenten() {

        for (int i=0; i < dozentvektor.size(); i++) {
            Dozent d = dozentvektor.get(i);
            System.out.println(d.toString());

        }
    }




    public static boolean kontrolDozentverigiris(String isim, String soyisim, String unvan, String tcno){
        if(tcno.contentEquals("")
                || isim.contentEquals("")
                || soyisim.contentEquals("")
                || !tcno.matches("[-+]?\\d*\\.?\\d+")
                || Long.parseLong(tcno) < 10000000000L
                || Long.parseLong(tcno) > 100000000000L) {

            return false;

        }else {
            return true;
        }

    }




    public void dozentOlusturmaHataMesaji(){

        System.out.println("Dozent konnte nicht hinzugefuegt werden.\n" +
                "Der Dozent Registrierung kann erstellt werden, wenn er den folgenden Regeln entspricht.\n" +
                "ID duerfen nur aus Ziffern bestehen.\n" +
                "Die Lange einer ID muss 11 sein.\n" +
                "Die erste Ziffer einer ID darf nicht 0 sein.\n" +
                "Vor- und Nachname duerfen nicht leer bleiben.\n");

    }



    public static boolean tcnoKontrol(long tcno){

        if(tcno > 99999999999L || tcno < 10000000000L)
            return false;
        else
            return true;


    }

    public Dozent hocaObjesi(String ogrnumarasi){

        for (int k = 0; k < dozentvektor.size(); k++) {

            if (dozentvektor.get(k).equals(ogrnumarasi)) {

                bulunan = k;

            }
        }

        return dozentvektor.get(bulunan);

    }




    public String getUnvan() {

        return unvan;

    }

    public void setUnvan(String s){

        unvan = s;

    }



    public String toString() {

        return tcno + ", " + unvan + " " + isim + " " + soyisim.toUpperCase();

    }

    public boolean equals(Object o) {
        if(this.getTcno().contentEquals((String)o)) {
            return true;
        }
        return false;
    }


}


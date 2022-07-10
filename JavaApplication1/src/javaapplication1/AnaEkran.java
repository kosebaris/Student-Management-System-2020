package javaapplication1;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import java.awt.*;
import javax.swing.table.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


/* Baris Kose 190503059 */


public class AnaEkran extends javax.swing.JFrame {
    public AnaEkran() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        panel_Ana.setVisible(true);
        panel_Ogrenci.setVisible(false);
        panel_genelislemler_secim.setVisible(false);
        panel_ogrLVA_islem.setVisible(false);
        panel_LVA.setVisible(false);
        jButton2.setVisible(false);
        panel_derskayit_secim.setVisible(false);
        panel_dozent_genel.setVisible(false);
        panel_dozent_LVAislem.setVisible(false);
        jLabel5.setVisible(false);
        tf_ogrLVA_lvaname.setVisible(false);
        jLabel19.setVisible(false);
        tf_dozentLVA_lvaname.setVisible(false);
        tf_bos.setVisible(false);
        panel_diger_bilgiler_ekrani.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        panel_Ana = new javax.swing.JPanel();
        btn_ana_genel_islemler = new javax.swing.JButton();
        btn_ana_ders_islemleri = new javax.swing.JButton();
        btn_ana_lvas = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btn_help = new javax.swing.JButton();
        panel_Ogrenci = new javax.swing.JPanel();
        soyisimTextField = new javax.swing.JTextField();
        ogrnumarasiTextField = new javax.swing.JTextField();
        btn_ogr_ogrenciSil = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableStudenten = new javax.swing.JTable();
        btn_ogr_guncelle = new javax.swing.JButton();
        btn_ogr_zuruck = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        isimTextField = new javax.swing.JTextField();
        btn_ogrenciEkle = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btn_ogr_mainMenu = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        combo_ogr_cinsiyet = new javax.swing.JComboBox<>();
        tf_ogr_email = new javax.swing.JTextField();
        tf_ogr_yas = new javax.swing.JTextField();
        tf_ogr_adres = new javax.swing.JTextField();
        tf_ogr_anneadi = new javax.swing.JTextField();
        tf_ogr_babaadi = new javax.swing.JTextField();
        tf_ogr_bolum = new javax.swing.JTextField();
        btn_ogr_diger_bilgiler = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        panel_LVA = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tf_LVAname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_LVAkredi = new javax.swing.JTextField();
        btn_LVAkaydet = new javax.swing.JButton();
        buton_LVA_kayitliogr = new javax.swing.JButton();
        buton_LVA_kayitliHoca = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        buton_LVA_anamenu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_LVA = new javax.swing.JTable();
        buton_LVA_sil = new javax.swing.JButton();
        buton_LVA_dersleriGoster = new javax.swing.JButton();
        buton_LVA_guncelle = new javax.swing.JButton();
        panel_dozent_genel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_dozent_genel = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tf_dozent_genel_name = new javax.swing.JTextField();
        tf_dozent_genel_soyisim = new javax.swing.JTextField();
        tf_dozent_genel_titel = new javax.swing.JTextField();
        tf_dozent_genel_id = new javax.swing.JTextField();
        buton_dozent_genel_kaydet = new javax.swing.JButton();
        buton_dozent_genel_sil = new javax.swing.JButton();
        buton_dozent_genel_guncelle = new javax.swing.JButton();
        buton_dozent_genel_geri = new javax.swing.JButton();
        buton_dozent_genel_anasayfa = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        combo_dozent_cinsiyet = new javax.swing.JComboBox<>();
        tf_dozent_email = new javax.swing.JTextField();
        tf_dozent_yas = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        tf_dozent_adres = new javax.swing.JTextField();
        tf_dozent_anneadi = new javax.swing.JTextField();
        tf_dozent_babaadi = new javax.swing.JTextField();
        btn_dozent_diger_bilgiler = new javax.swing.JButton();
        panel_ogrLVA_islem = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tf_ogrLVA_matrikel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_ogrLVA_lvaname = new javax.swing.JTextField();
        btn_derseKaydet = new javax.swing.JButton();
        btn_dersleriGoster = new javax.swing.JButton();
        btn_ogrLVA_anamenu = new javax.swing.JButton();
        buton_lva_islem_zuruck = new javax.swing.JButton();
        buton_ogrLVA_derstenSil = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_ogrLVA_name = new javax.swing.JTextField();
        combo_LVAsec = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        tf_bos = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        table_ogrLVA = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_ogrKayitliDersler = new javax.swing.JTable();
        panel_dozent_LVAislem = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        table_dozentKayitliDersler = new javax.swing.JTable();
        buton_lva_islem_zuruck1 = new javax.swing.JButton();
        buton_dozent_derstensil = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        tf_dozentLVA_id = new javax.swing.JTextField();
        tf_dozentLVA_lvaname = new javax.swing.JTextField();
        buton_dozent_dersekaydet = new javax.swing.JButton();
        buton_dozent_dersleriGoster = new javax.swing.JButton();
        btn_ogrLVA_anamenu1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        table_dozentLVA = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        tf_dozentLVAislem_name = new javax.swing.JTextField();
        combo_dozentLVA = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        panel_derskayit_secim = new javax.swing.JPanel();
        btn_ogr_mainMenu2 = new javax.swing.JButton();
        btn_derskayit_secim_dozent = new javax.swing.JButton();
        btn_derskayit_secim_ogr = new javax.swing.JButton();
        panel_genelislemler_secim = new javax.swing.JPanel();
        btn_genelislemler_dozent = new javax.swing.JButton();
        btn_genelislemler_ogr = new javax.swing.JButton();
        btn_ogr_mainMenu1 = new javax.swing.JButton();
        panel_diger_bilgiler_ekrani = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        label_email = new javax.swing.JLabel();
        label_yas = new javax.swing.JLabel();
        label_adres = new javax.swing.JLabel();
        label_cinsiyet = new javax.swing.JLabel();
        label_anne = new javax.swing.JLabel();
        label_baba = new javax.swing.JLabel();
        label_bolum = new javax.swing.JLabel();
        label_diger_bilgiler_isim_soyisim = new javax.swing.JLabel();
        btn_diger_bilgiler_zuruck = new javax.swing.JButton();
        btn_diger_bilgiler_hauptmenu = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        label_ogrnumarasi = new javax.swing.JLabel();

        jButton8.setText("jButton1");

        jButton9.setText("jButton1");

        jButton10.setText("jButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(35, 35, 35))
        );

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(743, 550));

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 743, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Managament System");
        setSize(new java.awt.Dimension(800, 475));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        btn_ana_genel_islemler.setText("Allgemeine Operationen");
        btn_ana_genel_islemler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ana_genel_islemlerActionPerformed(evt);
            }
        });

        btn_ana_ders_islemleri.setText("LVA Registrierung Operationen");
        btn_ana_ders_islemleri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ana_ders_islemleriActionPerformed(evt);
            }
        });

        btn_ana_lvas.setText("LVA Operationen");
        btn_ana_lvas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ana_lvasActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/5566_4_th.png"))); // NOI18N

        btn_help.setText("Hilfe");
        btn_help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_helpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_AnaLayout = new javax.swing.GroupLayout(panel_Ana);
        panel_Ana.setLayout(panel_AnaLayout);
        panel_AnaLayout.setHorizontalGroup(
            panel_AnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_AnaLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(panel_AnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_ana_lvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ana_ders_islemleri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ana_genel_islemler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_AnaLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addComponent(btn_help, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(142, 142, 142))
        );
        panel_AnaLayout.setVerticalGroup(
            panel_AnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_AnaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_ana_genel_islemler, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_ana_ders_islemleri, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_ana_lvas, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(panel_AnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(btn_help))
                .addContainerGap())
        );

        panel_Ogrenci.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_OgrenciMouseClicked(evt);
            }
        });

        btn_ogr_ogrenciSil.setBackground(java.awt.Color.red);
        btn_ogr_ogrenciSil.setText("Loeschen");
        btn_ogr_ogrenciSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ogr_ogrenciSilActionPerformed(evt);
            }
        });

        tableStudenten.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Nachname", "Matrikelnummer"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableStudenten.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableStudenten.setShowGrid(true);
        tableStudenten.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableStudentenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableStudenten);

        btn_ogr_guncelle.setText("Aktualisieren");
        btn_ogr_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ogr_guncelleActionPerformed(evt);
            }
        });

        btn_ogr_zuruck.setText("Zurueck");
        btn_ogr_zuruck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ogr_zuruckActionPerformed(evt);
            }
        });

        jLabel1.setText("Name:");

        btn_ogrenciEkle.setBackground(java.awt.Color.green);
        btn_ogrenciEkle.setText("Hinzufuegen");
        btn_ogrenciEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ogrenciEkleActionPerformed(evt);
            }
        });

        jLabel2.setText("Nachname:");

        jLabel3.setText("Matrikelnummer:");

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btn_ogr_mainMenu.setText("Hauptmenu");
        btn_ogr_mainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ogr_mainMenuActionPerformed(evt);
            }
        });

        jLabel22.setText("E-mail:");

        jLabel23.setText("Alter:");

        jLabel24.setText("Geburtsort:");

        jLabel28.setText("Geschlecht:");

        combo_ogr_cinsiyet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mann", "Frau" }));

        tf_ogr_anneadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ogr_anneadiActionPerformed(evt);
            }
        });

        btn_ogr_diger_bilgiler.setText("Student suchen");
        btn_ogr_diger_bilgiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ogr_diger_bilgilerActionPerformed(evt);
            }
        });

        jLabel25.setText("Name der Mutter:");

        jLabel26.setText("Name der Vater:");

        jLabel27.setText("Studienrichtung:");

        javax.swing.GroupLayout panel_OgrenciLayout = new javax.swing.GroupLayout(panel_Ogrenci);
        panel_Ogrenci.setLayout(panel_OgrenciLayout);
        panel_OgrenciLayout.setHorizontalGroup(
            panel_OgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_OgrenciLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(panel_OgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(panel_OgrenciLayout.createSequentialGroup()
                        .addGroup(panel_OgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_OgrenciLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(panel_OgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_OgrenciLayout.createSequentialGroup()
                                        .addGroup(panel_OgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel23)
                                            .addComponent(jLabel24)
                                            .addComponent(jLabel28)
                                            .addComponent(jLabel22))
                                        .addGap(62, 62, 62)
                                        .addGroup(panel_OgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_ogr_yas, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panel_OgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(tf_ogr_adres)
                                                .addComponent(tf_ogr_email)
                                                .addComponent(combo_ogr_cinsiyet, 0, 164, Short.MAX_VALUE))))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_OgrenciLayout.createSequentialGroup()
                                .addComponent(btn_ogr_zuruck, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_ogr_mainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_ogr_diger_bilgiler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                        .addGroup(panel_OgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_OgrenciLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(panel_OgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel25))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel_OgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_ogr_bolum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_ogr_babaadi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_ogr_anneadi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel_OgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(isimTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel_OgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_ogrenciEkle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_ogr_guncelle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_ogr_ogrenciSil, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(ogrnumarasiTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soyisimTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(73, 73, 73))
        );
        panel_OgrenciLayout.setVerticalGroup(
            panel_OgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_OgrenciLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(panel_OgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(isimTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_OgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_OgrenciLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(17, 17, 17)
                        .addGroup(panel_OgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(tf_ogr_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_OgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_ogr_yas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_OgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(tf_ogr_adres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_OgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(combo_ogr_cinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(btn_ogr_diger_bilgiler)
                        .addGap(18, 18, 18)
                        .addGroup(panel_OgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_ogr_mainMenu)
                            .addComponent(jButton2)
                            .addComponent(btn_ogr_zuruck)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_OgrenciLayout.createSequentialGroup()
                        .addGroup(panel_OgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(soyisimTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ogrnumarasiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addGroup(panel_OgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_ogr_anneadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_OgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(tf_ogr_babaadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_OgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_ogr_bolum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addGap(37, 37, 37)
                        .addComponent(btn_ogrenciEkle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ogr_ogrenciSil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ogr_guncelle)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        panel_LVA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_LVAMouseClicked(evt);
            }
        });

        jLabel6.setText("LVA Name:");

        tf_LVAname.setToolTipText("");
        tf_LVAname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_LVAnameActionPerformed(evt);
            }
        });

        jLabel7.setText("Guthaben:");

        tf_LVAkredi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_LVAkrediActionPerformed(evt);
            }
        });

        btn_LVAkaydet.setBackground(java.awt.Color.green);
        btn_LVAkaydet.setText("Speichern");
        btn_LVAkaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LVAkaydetActionPerformed(evt);
            }
        });

        buton_LVA_kayitliogr.setText("Angemeldeten Studenten");
        buton_LVA_kayitliogr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_LVA_kayitliogrActionPerformed(evt);
            }
        });

        buton_LVA_kayitliHoca.setText("Verantwortlichen Dozenten");
        buton_LVA_kayitliHoca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_LVA_kayitliHocaActionPerformed(evt);
            }
        });

        jLabel8.setText("Auflisten:");

        buton_LVA_anamenu.setText("Hauptmenu");
        buton_LVA_anamenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_LVA_anamenuActionPerformed(evt);
            }
        });

        table_LVA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LVA"
            }
        ));
        table_LVA.setToolTipText("");
        table_LVA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_LVAMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_LVA);

        buton_LVA_sil.setBackground(java.awt.Color.red);
        buton_LVA_sil.setText("Loeschen");
        buton_LVA_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_LVA_silActionPerformed(evt);
            }
        });

        buton_LVA_dersleriGoster.setText("LVAs auflisten");
        buton_LVA_dersleriGoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_LVA_dersleriGosterActionPerformed(evt);
            }
        });

        buton_LVA_guncelle.setText("Aktualisieren");
        buton_LVA_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_LVA_guncelleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_LVALayout = new javax.swing.GroupLayout(panel_LVA);
        panel_LVA.setLayout(panel_LVALayout);
        panel_LVALayout.setHorizontalGroup(
            panel_LVALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_LVALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_LVALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(buton_LVA_anamenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(panel_LVALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buton_LVA_dersleriGoster, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_LVALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_LVALayout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel8))
                        .addGroup(panel_LVALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buton_LVA_kayitliHoca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buton_LVA_kayitliogr, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_LVALayout.createSequentialGroup()
                        .addGroup(panel_LVALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(35, 35, 35)
                        .addGroup(panel_LVALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buton_LVA_sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_LVAkaydet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_LVAkredi, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(tf_LVAname, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(buton_LVA_guncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panel_LVALayout.setVerticalGroup(
            panel_LVALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_LVALayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel_LVALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_LVALayout.createSequentialGroup()
                        .addGap(0, 27, Short.MAX_VALUE)
                        .addGroup(panel_LVALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_LVAname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_LVALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tf_LVAkredi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_LVAkaydet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buton_LVA_sil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buton_LVA_guncelle)
                        .addGap(11, 11, 11)
                        .addComponent(buton_LVA_dersleriGoster)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel8))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_LVALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_LVALayout.createSequentialGroup()
                        .addComponent(buton_LVA_kayitliogr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buton_LVA_kayitliHoca))
                    .addComponent(buton_LVA_anamenu, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(36, 36, 36))
        );

        panel_dozent_genel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_dozent_genelMouseClicked(evt);
            }
        });

        table_dozent_genel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titel", "Name", "Nachname", "ID"
            }
        ));
        table_dozent_genel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_dozent_genelMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table_dozent_genel);

        jLabel12.setText("Name:");

        jLabel13.setText("Nachname:");

        jLabel14.setText("Titel:");

        jLabel15.setText("ID:");

        tf_dozent_genel_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_dozent_genel_nameActionPerformed(evt);
            }
        });

        tf_dozent_genel_titel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_dozent_genel_titelActionPerformed(evt);
            }
        });

        buton_dozent_genel_kaydet.setBackground(java.awt.Color.green);
        buton_dozent_genel_kaydet.setText("Hinzufuegen");
        buton_dozent_genel_kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_dozent_genel_kaydetActionPerformed(evt);
            }
        });

        buton_dozent_genel_sil.setBackground(java.awt.Color.red);
        buton_dozent_genel_sil.setText("Loeschen");
        buton_dozent_genel_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_dozent_genel_silActionPerformed(evt);
            }
        });

        buton_dozent_genel_guncelle.setText("Aktualisieren");
        buton_dozent_genel_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_dozent_genel_guncelleActionPerformed(evt);
            }
        });

        buton_dozent_genel_geri.setText("Zurueck");
        buton_dozent_genel_geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_dozent_genel_geriActionPerformed(evt);
            }
        });

        buton_dozent_genel_anasayfa.setText("Hauptmenu");
        buton_dozent_genel_anasayfa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_dozent_genel_anasayfaActionPerformed(evt);
            }
        });

        jLabel37.setText("E-mail:");

        jLabel38.setText("Alter:");

        jLabel39.setText("Geburtsort:");

        jLabel40.setText("Geschlecht:");

        combo_dozent_cinsiyet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mann", "Frau" }));

        jLabel41.setText("Name der Mutter:");

        jLabel42.setText("Name der Vater:");

        tf_dozent_anneadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_dozent_anneadiActionPerformed(evt);
            }
        });

        btn_dozent_diger_bilgiler.setText("Dozent suchen");
        btn_dozent_diger_bilgiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dozent_diger_bilgilerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_dozent_genelLayout = new javax.swing.GroupLayout(panel_dozent_genel);
        panel_dozent_genel.setLayout(panel_dozent_genelLayout);
        panel_dozent_genelLayout.setHorizontalGroup(
            panel_dozent_genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dozent_genelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_dozent_genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addGroup(panel_dozent_genelLayout.createSequentialGroup()
                        .addGroup(panel_dozent_genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_dozent_genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_dozent_genel_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                            .addComponent(tf_dozent_genel_titel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_dozent_genel_soyisim, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_dozent_genel_name, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_dozent_genelLayout.createSequentialGroup()
                        .addGroup(panel_dozent_genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_dozent_genelLayout.createSequentialGroup()
                                .addComponent(buton_dozent_genel_geri, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buton_dozent_genel_anasayfa, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_dozent_diger_bilgiler, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_dozent_genelLayout.createSequentialGroup()
                                .addGroup(panel_dozent_genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel37))
                                .addGap(53, 53, 53)
                                .addGroup(panel_dozent_genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_dozent_yas, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_dozent_adres)
                                    .addComponent(tf_dozent_email)
                                    .addComponent(combo_dozent_cinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                        .addGroup(panel_dozent_genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_dozent_genelLayout.createSequentialGroup()
                                .addGroup(panel_dozent_genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel41))
                                .addGap(57, 57, 57)
                                .addGroup(panel_dozent_genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_dozent_babaadi, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_dozent_anneadi, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(buton_dozent_genel_kaydet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buton_dozent_genel_sil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buton_dozent_genel_guncelle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panel_dozent_genelLayout.setVerticalGroup(
            panel_dozent_genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dozent_genelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_dozent_genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tf_dozent_genel_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_dozent_genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_dozent_genel_soyisim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_dozent_genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_dozent_genel_titel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_dozent_genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tf_dozent_genel_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panel_dozent_genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_dozent_genelLayout.createSequentialGroup()
                        .addGroup(panel_dozent_genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_dozent_anneadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_dozent_genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(tf_dozent_babaadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(buton_dozent_genel_kaydet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buton_dozent_genel_sil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buton_dozent_genel_guncelle))
                    .addGroup(panel_dozent_genelLayout.createSequentialGroup()
                        .addGroup(panel_dozent_genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(tf_dozent_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_dozent_genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_dozent_yas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_dozent_genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(tf_dozent_adres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_dozent_genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(combo_dozent_cinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(btn_dozent_diger_bilgiler)))
                .addGap(18, 18, 18)
                .addGroup(panel_dozent_genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buton_dozent_genel_geri)
                    .addComponent(buton_dozent_genel_anasayfa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_ogrLVA_islem.setPreferredSize(new java.awt.Dimension(600, 600));
        panel_ogrLVA_islem.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panel_ogrLVA_islemMouseMoved(evt);
            }
        });
        panel_ogrLVA_islem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_ogrLVA_islemMouseClicked(evt);
            }
        });

        jLabel4.setText("Matrikelnummer:");

        tf_ogrLVA_matrikel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ogrLVA_matrikelActionPerformed(evt);
            }
        });

        jLabel5.setText("LVA Name:");

        tf_ogrLVA_lvaname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_ogrLVA_lvanameMouseClicked(evt);
            }
        });
        tf_ogrLVA_lvaname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ogrLVA_lvanameActionPerformed(evt);
            }
        });

        btn_derseKaydet.setBackground(java.awt.Color.green);
        btn_derseKaydet.setText("Zum Kurs hinzufuegen");
        btn_derseKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_derseKaydetActionPerformed(evt);
            }
        });

        btn_dersleriGoster.setText("Students LVAs auflisten");
        btn_dersleriGoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dersleriGosterActionPerformed(evt);
            }
        });

        btn_ogrLVA_anamenu.setText("Hauptmenu");
        btn_ogrLVA_anamenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ogrLVA_anamenuActionPerformed(evt);
            }
        });

        buton_lva_islem_zuruck.setText("Zurueck");
        buton_lva_islem_zuruck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_lva_islem_zuruckActionPerformed(evt);
            }
        });

        buton_ogrLVA_derstenSil.setBackground(java.awt.Color.red);
        buton_ogrLVA_derstenSil.setText("aus LVA loeschen");
        buton_ogrLVA_derstenSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_ogrLVA_derstenSilActionPerformed(evt);
            }
        });

        jLabel11.setText("Student:");

        tf_ogrLVA_name.setEnabled(false);

        combo_LVAsec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combo_LVAsecMouseClicked(evt);
            }
        });
        combo_LVAsec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_LVAsecActionPerformed(evt);
            }
        });

        jLabel20.setText("Wahle LVA:");

        table_ogrLVA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Nachname", "Matrikelnummer"
            }
        ));
        table_ogrLVA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_ogrLVAMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(table_ogrLVA);

        table_ogrKayitliDersler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LVAs"
            }
        ));
        table_ogrKayitliDersler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_ogrKayitliDerslerMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(table_ogrKayitliDersler);

        javax.swing.GroupLayout panel_ogrLVA_islemLayout = new javax.swing.GroupLayout(panel_ogrLVA_islem);
        panel_ogrLVA_islem.setLayout(panel_ogrLVA_islemLayout);
        panel_ogrLVA_islemLayout.setHorizontalGroup(
            panel_ogrLVA_islemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ogrLVA_islemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_ogrLVA_islemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ogrLVA_islemLayout.createSequentialGroup()
                        .addGroup(panel_ogrLVA_islemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel11)
                            .addComponent(jLabel20)
                            .addComponent(buton_lva_islem_zuruck)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_ogrLVA_islemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                            .addGroup(panel_ogrLVA_islemLayout.createSequentialGroup()
                                .addComponent(btn_ogrLVA_anamenu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(tf_bos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(tf_ogrLVA_lvaname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panel_ogrLVA_islemLayout.createSequentialGroup()
                                .addGroup(panel_ogrLVA_islemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_ogrLVA_matrikel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo_LVAsec, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_ogrLVA_name, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel_ogrLVA_islemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ogrLVA_islemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btn_derseKaydet, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                        .addComponent(buton_ogrLVA_derstenSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(btn_dersleriGoster, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ogrLVA_islemLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(10, 10, 10))))
        );
        panel_ogrLVA_islemLayout.setVerticalGroup(
            panel_ogrLVA_islemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ogrLVA_islemLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(panel_ogrLVA_islemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_ogrLVA_islemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_ogrLVA_matrikel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btn_derseKaydet))
                .addGap(8, 8, 8)
                .addGroup(panel_ogrLVA_islemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_ogrLVA_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(buton_ogrLVA_derstenSil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_ogrLVA_islemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(combo_LVAsec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_dersleriGoster))
                .addGap(38, 38, 38)
                .addGroup(panel_ogrLVA_islemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_bos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ogrLVA_lvaname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ogrLVA_anamenu)
                    .addComponent(buton_lva_islem_zuruck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        panel_dozent_LVAislem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_dozent_LVAislemMouseClicked(evt);
            }
        });

        table_dozentKayitliDersler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LVAs"
            }
        ));
        table_dozentKayitliDersler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_dozentKayitliDerslerMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(table_dozentKayitliDersler);

        buton_lva_islem_zuruck1.setText("Zurueck");
        buton_lva_islem_zuruck1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_lva_islem_zuruck1ActionPerformed(evt);
            }
        });

        buton_dozent_derstensil.setBackground(java.awt.Color.red);
        buton_dozent_derstensil.setText("aus LVA loeschen");
        buton_dozent_derstensil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_dozent_derstensilActionPerformed(evt);
            }
        });

        jLabel17.setText("ID:");

        tf_dozentLVA_lvaname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_dozentLVA_lvanameMouseClicked(evt);
            }
        });
        tf_dozentLVA_lvaname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_dozentLVA_lvanameActionPerformed(evt);
            }
        });

        buton_dozent_dersekaydet.setBackground(java.awt.Color.green);
        buton_dozent_dersekaydet.setText("Zum Kurs hinzufuegen");
        buton_dozent_dersekaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_dozent_dersekaydetActionPerformed(evt);
            }
        });

        buton_dozent_dersleriGoster.setText("LVAs von Dozent zeigen");
        buton_dozent_dersleriGoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_dozent_dersleriGosterActionPerformed(evt);
            }
        });

        btn_ogrLVA_anamenu1.setText("Hauptmenu");
        btn_ogrLVA_anamenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ogrLVA_anamenu1ActionPerformed(evt);
            }
        });

        table_dozentLVA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titel", "Name", "Nachname", "ID"
            }
        ));
        table_dozentLVA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_dozentLVAMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(table_dozentLVA);

        jLabel16.setText("Name:");

        tf_dozentLVAislem_name.setEnabled(false);

        jLabel21.setText("Wahle LVA:");

        javax.swing.GroupLayout panel_dozent_LVAislemLayout = new javax.swing.GroupLayout(panel_dozent_LVAislem);
        panel_dozent_LVAislem.setLayout(panel_dozent_LVAislemLayout);
        panel_dozent_LVAislemLayout.setHorizontalGroup(
            panel_dozent_LVAislemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dozent_LVAislemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_dozent_LVAislemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jLabel21)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buton_lva_islem_zuruck1))
                .addGap(10, 10, 10)
                .addGroup(panel_dozent_LVAislemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_dozent_LVAislemLayout.createSequentialGroup()
                        .addComponent(btn_ogrLVA_anamenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_dozentLVA_lvaname, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(panel_dozent_LVAislemLayout.createSequentialGroup()
                        .addGroup(panel_dozent_LVAislemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_dozentLVAislem_name, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_dozentLVA, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_dozentLVA_id, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_dozent_LVAislemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buton_dozent_dersleriGoster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buton_dozent_derstensil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buton_dozent_dersekaydet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel19))
        );
        panel_dozent_LVAislemLayout.setVerticalGroup(
            panel_dozent_LVAislemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dozent_LVAislemLayout.createSequentialGroup()
                .addGroup(panel_dozent_LVAislemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_dozent_LVAislemLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel19))
                    .addGroup(panel_dozent_LVAislemLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(panel_dozent_LVAislemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_dozent_LVAislemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_dozent_LVAislemLayout.createSequentialGroup()
                        .addGroup(panel_dozent_LVAislemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_dozentLVA_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_dozent_LVAislemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_dozentLVAislem_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_dozent_LVAislemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combo_dozentLVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(panel_dozent_LVAislemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buton_lva_islem_zuruck1)
                            .addComponent(btn_ogrLVA_anamenu1)
                            .addComponent(tf_dozentLVA_lvaname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_dozent_LVAislemLayout.createSequentialGroup()
                        .addComponent(buton_dozent_dersekaydet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buton_dozent_derstensil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buton_dozent_dersleriGoster)
                        .addGap(0, 53, Short.MAX_VALUE)))
                .addContainerGap())
        );

        btn_ogr_mainMenu2.setText("Hauptmenu");
        btn_ogr_mainMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ogr_mainMenu2ActionPerformed(evt);
            }
        });

        btn_derskayit_secim_dozent.setText("Dozent LVA-Operationen");
        btn_derskayit_secim_dozent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_derskayit_secim_dozentActionPerformed(evt);
            }
        });

        btn_derskayit_secim_ogr.setText("Student LVA-Operationen");
        btn_derskayit_secim_ogr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_derskayit_secim_ogrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_derskayit_secimLayout = new javax.swing.GroupLayout(panel_derskayit_secim);
        panel_derskayit_secim.setLayout(panel_derskayit_secimLayout);
        panel_derskayit_secimLayout.setHorizontalGroup(
            panel_derskayit_secimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_derskayit_secimLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_derskayit_secimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_derskayit_secimLayout.createSequentialGroup()
                        .addComponent(btn_ogr_mainMenu2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_derskayit_secim_ogr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                    .addComponent(btn_derskayit_secim_dozent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_derskayit_secimLayout.setVerticalGroup(
            panel_derskayit_secimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_derskayit_secimLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_derskayit_secim_ogr, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_derskayit_secim_dozent, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(btn_ogr_mainMenu2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_genelislemler_dozent.setText("Dozent Registrierung Operationen");
        btn_genelislemler_dozent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_genelislemler_dozentActionPerformed(evt);
            }
        });

        btn_genelislemler_ogr.setText("Student Registrierung Operationen");
        btn_genelislemler_ogr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_genelislemler_ogrActionPerformed(evt);
            }
        });

        btn_ogr_mainMenu1.setText("Hauptmenu");
        btn_ogr_mainMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ogr_mainMenu1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_genelislemler_secimLayout = new javax.swing.GroupLayout(panel_genelislemler_secim);
        panel_genelislemler_secim.setLayout(panel_genelislemler_secimLayout);
        panel_genelislemler_secimLayout.setHorizontalGroup(
            panel_genelislemler_secimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_genelislemler_secimLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_genelislemler_secimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_genelislemler_secimLayout.createSequentialGroup()
                        .addComponent(btn_ogr_mainMenu1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_genelislemler_ogr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(btn_genelislemler_dozent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_genelislemler_secimLayout.setVerticalGroup(
            panel_genelislemler_secimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_genelislemler_secimLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_genelislemler_ogr, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_genelislemler_dozent, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_ogr_mainMenu1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel29.setText("Name der Vater:");

        jLabel30.setText("Studienrichtung:");

        jLabel31.setText("Geschlecht:");

        jLabel32.setText("E-mail:");

        jLabel33.setText("Alter:");

        jLabel34.setText("Geburtsort:");

        jLabel35.setText("Name der Mutter:");

        label_email.setText("nicht definiert");

        label_yas.setText("nicht definiert");

        label_adres.setText("nicht definiert");

        label_cinsiyet.setText("nicht definiert");

        label_anne.setText("nicht definiert");

        label_baba.setText("nicht definiert");

        label_bolum.setText("nicht definiert");

        label_diger_bilgiler_isim_soyisim.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_diger_bilgiler_isim_soyisim.setText("isim_soyisim");

        btn_diger_bilgiler_zuruck.setText("Zuruck");
        btn_diger_bilgiler_zuruck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_diger_bilgiler_zuruckActionPerformed(evt);
            }
        });

        btn_diger_bilgiler_hauptmenu.setText("Hauptmenu");
        btn_diger_bilgiler_hauptmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_diger_bilgiler_hauptmenuActionPerformed(evt);
            }
        });

        jLabel36.setText("Matrikelnummer:");

        label_ogrnumarasi.setText("nicht definiert");

        javax.swing.GroupLayout panel_diger_bilgiler_ekraniLayout = new javax.swing.GroupLayout(panel_diger_bilgiler_ekrani);
        panel_diger_bilgiler_ekrani.setLayout(panel_diger_bilgiler_ekraniLayout);
        panel_diger_bilgiler_ekraniLayout.setHorizontalGroup(
            panel_diger_bilgiler_ekraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_diger_bilgiler_ekraniLayout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addGroup(panel_diger_bilgiler_ekraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_diger_bilgiler_isim_soyisim)
                    .addGroup(panel_diger_bilgiler_ekraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panel_diger_bilgiler_ekraniLayout.createSequentialGroup()
                            .addComponent(btn_diger_bilgiler_zuruck, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_diger_bilgiler_hauptmenu))
                        .addGroup(panel_diger_bilgiler_ekraniLayout.createSequentialGroup()
                            .addGroup(panel_diger_bilgiler_ekraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel36)
                                .addComponent(jLabel32)
                                .addComponent(jLabel33)
                                .addComponent(jLabel34)
                                .addComponent(jLabel35)
                                .addComponent(jLabel29)
                                .addComponent(jLabel30)
                                .addComponent(jLabel31))
                            .addGap(61, 61, 61)
                            .addGroup(panel_diger_bilgiler_ekraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(label_ogrnumarasi, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_bolum, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_anne, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_cinsiyet, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_adres, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_yas, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_baba, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_email, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addGap(0, 144, Short.MAX_VALUE))
        );
        panel_diger_bilgiler_ekraniLayout.setVerticalGroup(
            panel_diger_bilgiler_ekraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_diger_bilgiler_ekraniLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(label_diger_bilgiler_isim_soyisim)
                .addGap(57, 57, 57)
                .addGroup(panel_diger_bilgiler_ekraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(label_ogrnumarasi))
                .addGap(18, 18, 18)
                .addGroup(panel_diger_bilgiler_ekraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(label_email))
                .addGap(18, 18, 18)
                .addGroup(panel_diger_bilgiler_ekraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(label_yas))
                .addGap(18, 18, 18)
                .addGroup(panel_diger_bilgiler_ekraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(label_adres))
                .addGap(18, 18, 18)
                .addGroup(panel_diger_bilgiler_ekraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(label_cinsiyet))
                .addGap(18, 18, 18)
                .addGroup(panel_diger_bilgiler_ekraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(label_anne))
                .addGap(18, 18, 18)
                .addGroup(panel_diger_bilgiler_ekraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(label_baba))
                .addGap(18, 18, 18)
                .addGroup(panel_diger_bilgiler_ekraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(label_bolum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(panel_diger_bilgiler_ekraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_diger_bilgiler_hauptmenu)
                    .addComponent(btn_diger_bilgiler_zuruck))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel_Ana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel_Ogrenci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 237, Short.MAX_VALUE)
                    .addComponent(panel_LVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 237, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 63, Short.MAX_VALUE)
                    .addComponent(panel_dozent_genel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 64, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 146, Short.MAX_VALUE)
                    .addComponent(panel_ogrLVA_islem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 147, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 128, Short.MAX_VALUE)
                    .addComponent(panel_dozent_LVAislem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 129, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 296, Short.MAX_VALUE)
                    .addComponent(panel_derskayit_secim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 296, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 296, Short.MAX_VALUE)
                    .addComponent(panel_genelislemler_secim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 297, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 189, Short.MAX_VALUE)
                    .addComponent(panel_diger_bilgiler_ekrani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 189, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 101, Short.MAX_VALUE)
                    .addComponent(panel_Ana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 102, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 9, Short.MAX_VALUE)
                    .addComponent(panel_Ogrenci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 10, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 108, Short.MAX_VALUE)
                    .addComponent(panel_LVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 109, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 26, Short.MAX_VALUE)
                    .addComponent(panel_dozent_genel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 27, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel_ogrLVA_islem, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 96, Short.MAX_VALUE)
                    .addComponent(panel_dozent_LVAislem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 96, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 139, Short.MAX_VALUE)
                    .addComponent(panel_derskayit_secim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 140, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 142, Short.MAX_VALUE)
                    .addComponent(panel_genelislemler_secim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 142, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 41, Short.MAX_VALUE)
                    .addComponent(panel_diger_bilgiler_ekrani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 42, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        
        isimTextField.setText("");
        soyisimTextField.setText("");
        ogrnumarasiTextField.setText("");
        tf_ogr_anneadi.setText("");
        tf_ogr_babaadi.setText("");
        tf_ogr_email.setText("");
        tf_ogr_adres.setText("");
        tf_ogr_yas.setText("");
        tf_ogr_bolum.setText("");
        
        
    }//GEN-LAST:event_formMouseClicked

    private void btn_ana_lvasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ana_lvasActionPerformed
        // TODO add your handling code here:
        panel_Ana.setVisible(false);
        panel_LVA.setVisible(true);
        
        tf_LVAname.setText("");
        tf_LVAkredi.setText("");
        
        
        DefaultTableModel dtm = (DefaultTableModel) table_LVA.getModel();
        dtm.getDataVector().removeAllElements();
        l.printLVAs();
        
        int derssayisi = l.dersSayisi();
        int k = 0;
        
        for (k = 0; k < derssayisi ; k++){
        dtm.addRow(new Object[] { String.valueOf(l.dersleriVer(k)) });
        }
        
        
        
    }//GEN-LAST:event_btn_ana_lvasActionPerformed

    
    
    
    private void btn_ana_genel_islemlerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ana_genel_islemlerActionPerformed
        // TODO add your handling code here:
        
        panel_Ana.setVisible(false);
        panel_genelislemler_secim.setVisible(true);
        
    }//GEN-LAST:event_btn_ana_genel_islemlerActionPerformed

    private void btn_ana_ders_islemleriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ana_ders_islemleriActionPerformed
        // TODO add your handling code here:
        
        panel_Ana.setVisible(false);
        panel_derskayit_secim.setVisible(true);
        
    }//GEN-LAST:event_btn_ana_ders_islemleriActionPerformed

    private void btn_genelislemler_ogrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_genelislemler_ogrActionPerformed
        // TODO add your handling code here:
        
        panel_genelislemler_secim.setVisible(false);
        panel_Ogrenci.setVisible(true);
        
    }//GEN-LAST:event_btn_genelislemler_ogrActionPerformed

    private void btn_ogr_mainMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ogr_mainMenu1ActionPerformed
        // TODO add your handling code here:
        
        panel_genelislemler_secim.setVisible(false);
        panel_Ana.setVisible(true);
        
    }//GEN-LAST:event_btn_ogr_mainMenu1ActionPerformed

    private void btn_derseKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_derseKaydetActionPerformed
        // TODO add your handling code here:
        if(combo_LVAsec.getItemCount() > 0){
        dersismi = combo_LVAsec.getSelectedItem().toString();
        boolean zaten = false;
        for(int p = 0; p < s.ogrenciObjesi(ogrnumarasi).kayitlidersler.size(); p++){
           if(s.ogrenciObjesi(ogrnumarasi).kayitlidersler.get(p) == dersismi){
               zaten = true;
               JOptionPane.showMessageDialog(rootPane, "Der Student ist bereits im Kurs eingeschrieben.");
           }else
               zaten = false;
               }
            System.out.println("dersismi = " + dersismi); 
        if(!tf_ogrLVA_matrikel.getText().isEmpty()){
        ogrnumarasi = tf_ogrLVA_matrikel.getText();
       // dersismi = tf_ogrLVA_lvaname.getText();
       
        if(l.dersMevcutMu(dersismi) && !zaten) {
                        
                        s.derseKaydet(ogrnumarasi, dersismi);
                        l.dersObjesi(dersismi).OgrArttir();
                        l.derseOgrenciEkle(dersismi, s.ogrenciObjesi(ogrnumarasi).isim + " " + s.ogrenciObjesi(ogrnumarasi).soyisim);
                    }else if(!l.dersMevcutMu(dersismi)){
                        JOptionPane.showMessageDialog(rootPane, "LVA existiert nicht.");
                    }
                        
                        
        DefaultTableModel dtm = (DefaultTableModel) table_ogrKayitliDersler.getModel();
        
        dtm.getDataVector().removeAllElements();
        
        ogrnumarasi = tf_ogrLVA_matrikel.getText();
        
        if(s.ogrenciNumaraMevcutMu(ogrnumarasi)){
            
       
            for (int i = 0; i < (s.ogrenciObjesi(ogrnumarasi).kayitlidersler.size()); i++) {
                    dtm.addRow(new Object[] { String.valueOf(s.ogrenciObjesi(ogrnumarasi).kayitlidersler.get(i)) });
                  
            }
           
        }else{
            JOptionPane.showMessageDialog(rootPane, "Student existiert nicht.");
        }
        
        s.printKayitliDersler(ogrnumarasi);
        
        
        }else
            System.out.println("javaapplication1.AnaEkran.btn_derseKaydetActionPerformed()");
        }
        
       
    }//GEN-LAST:event_btn_derseKaydetActionPerformed

    private void btn_genelislemler_dozentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_genelislemler_dozentActionPerformed
        // TODO add your handling code here:
        panel_genelislemler_secim.setVisible(false);
        panel_dozent_genel.setVisible(true);
        

        
    }//GEN-LAST:event_btn_genelislemler_dozentActionPerformed

    private void tf_LVAnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_LVAnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_LVAnameActionPerformed

    private void tf_LVAkrediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_LVAkrediActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_LVAkrediActionPerformed

    private void btn_LVAkaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LVAkaydetActionPerformed
        // TODO add your handling code here:
        
        
        String ders_adi = tf_LVAname.getText();
        String ders_kredi = tf_LVAkredi.getText();
        if(!l.dersMevcutMu(ders_adi)){
        l.addLVA(ders_adi, ders_kredi);
        DefaultTableModel dtm = (DefaultTableModel) table_LVA.getModel();
        dtm.getDataVector().removeAllElements();
        l.printLVAs();
        
        int derssayisi = l.dersSayisi();
        int k = 0;
        
        for (k = 0; k < derssayisi ; k++){
        dtm.addRow(new Object[] { String.valueOf(l.dersleriVer(k)) });
        
        }
        
        if(l.kontrol == 0){
            JOptionPane.showMessageDialog(rootPane, "Die Abkuerzung des Kurses muss in Grossbuchstaben eingegeben werden.\n" +
        "Der Code des Kurses muss 3-stellig sein.");
        }else{
            tf_LVAname.setText("");
            tf_LVAkredi.setText("");
        }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Ein LVA existiert mit dieser Name bereits.");
        }
        
    }//GEN-LAST:event_btn_LVAkaydetActionPerformed

    private void btn_ogrLVA_anamenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ogrLVA_anamenuActionPerformed
        // TODO add your handling code here:
        
        panel_ogrLVA_islem.setVisible(false);
        panel_Ana.setVisible(true);
        
    }//GEN-LAST:event_btn_ogrLVA_anamenuActionPerformed

    private void buton_LVA_anamenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_LVA_anamenuActionPerformed
        // TODO add your handling code here:
        
        panel_LVA.setVisible(false);
        panel_Ana.setVisible(true);
    }//GEN-LAST:event_buton_LVA_anamenuActionPerformed

    private void btn_dersleriGosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dersleriGosterActionPerformed
        // TODO add your handling code here:
        
        
        DefaultTableModel dtm = (DefaultTableModel) table_ogrKayitliDersler.getModel();
        
        int k = table_ogrKayitliDersler.getRowCount();
        
        for(int j = 0 ; j < k ; j++)
            dtm.removeRow(0);
        
        ogrnumarasi = tf_ogrLVA_matrikel.getText();
        
        if(s.ogrenciNumaraMevcutMu(ogrnumarasi)){
            
       
            for (int i = 0; i < (s.ogrenciObjesi(ogrnumarasi).kayitlidersler.size()); i++) {
                    dtm.addRow(new Object[] { String.valueOf(s.ogrenciObjesi(ogrnumarasi).kayitlidersler.get(i)) });
                  
            }
           
        }else{
            JOptionPane.showMessageDialog(rootPane, "Student existiert nicht.");
        }
        
        s.printKayitliDersler(ogrnumarasi);
        
        
    }//GEN-LAST:event_btn_dersleriGosterActionPerformed

    private void panel_ogrLVA_islemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_ogrLVA_islemMouseClicked
        // TODO add your handling code here:
        
        tf_ogrLVA_matrikel.setText("");
        tf_ogrLVA_lvaname.setText("");
        jLabel10.setText("");
        jLabel10.setVisible(false);
        tf_ogrLVA_name.setText(jLabel10.getText());
        
        DefaultTableModel dtm = (DefaultTableModel) table_ogrKayitliDersler.getModel();
        dtm.getDataVector().removeAllElements();
                
    }//GEN-LAST:event_panel_ogrLVA_islemMouseClicked

    private void buton_lva_islem_zuruckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_lva_islem_zuruckActionPerformed
        // TODO add your handling code here:
        
        panel_ogrLVA_islem.setVisible(false);
        panel_derskayit_secim.setVisible(true);
        
    }//GEN-LAST:event_buton_lva_islem_zuruckActionPerformed

    private void buton_LVA_kayitliogrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_LVA_kayitliogrActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel dtm = (DefaultTableModel) table_LVA.getModel();
        
        dtm.getDataVector().removeAllElements();
        
         int k = table_LVA.getRowCount();
        System.out.println(k);

        for(int j = 0 ; j < k ; j++){
            dtm.removeRow(0);
        } 
        
        String dersismi = tf_LVAname.getText();
        int i = 0;
        
                if(l.dersMevcutMu(dersismi)){
            for (i = 0; i < (l.dersObjesi(dersismi).kayitliOgrenciler.size()); i++) {
                    dtm.addRow(new Object[] { String.valueOf(l.dersObjesi(dersismi).kayitliOgrenciler.get(i)) });
                        }
            
            if(i == 0){
                JOptionPane.showMessageDialog(rootPane, "In diesem Kurs sind keine Studenten eingeschrieben.");
            dtm.getDataVector().removeAllElements();
        
        l.printLVAs();
        
        int derssayisi = l.dersSayisi();
        int p = 0;
        
        for (p = 0; p < derssayisi ; p++){
        dtm.addRow(new Object[] { String.valueOf(l.dersleriVer(p)) });
        }
            
            }
            
                }
                
                else{
                    JOptionPane.showMessageDialog(rootPane, "LVA existiert nicht.");
                    

                    dtm.getDataVector().removeAllElements();

                    l.printLVAs();

                    int derssayisi = l.dersSayisi();
                    int p = 0;

                    for (p = 0; p < derssayisi ; p++){
                    dtm.addRow(new Object[] { String.valueOf(l.dersleriVer(p)) });
                    }
             }
                

    }//GEN-LAST:event_buton_LVA_kayitliogrActionPerformed

    private void buton_ogrLVA_derstenSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_ogrLVA_derstenSilActionPerformed
        // TODO add your handling code here:
        
        int row = table_ogrKayitliDersler.getSelectedRow();
        if(row >= 0){
        dersismi = table_ogrKayitliDersler.getValueAt(row, 0).toString();

        if(!tf_ogrLVA_matrikel.getText().isEmpty()){
        ogrnumarasi = tf_ogrLVA_matrikel.getText();
        //dersismi = tf_ogrLVA_lvaname.getText();
 
        //dersismi = combo_LVAsec.getSelectedItem().toString();
        
        if(l.dersMevcutMu(dersismi)) {
                        s.derstenSil(ogrnumarasi, dersismi);
                        l.dersObjesi(dersismi).OgrAzalt();
                        l.derstenOgrenciSil(dersismi, s.ogrenciObjesi(ogrnumarasi).isim + " " + s.ogrenciObjesi(ogrnumarasi).soyisim);
                    }else
                        JOptionPane.showMessageDialog(rootPane, "LVA existiert nicht.");
        
        
        DefaultTableModel dtm = (DefaultTableModel) table_ogrKayitliDersler.getModel();
        
        
        ogrnumarasi = tf_ogrLVA_matrikel.getText();
        
        int i = 0;
                    for (int j = 0; j<table_ogrKayitliDersler.getRowCount(); j++){
                        if(table_ogrKayitliDersler.getValueAt(i,0).equals(table_ogrKayitliDersler.getValueAt(row, 0).toString())){
                    
                    dtm.removeRow(i);
                        }
                        i++;
                    System.out.println(i);
                    }
           
        
        
        s.printKayitliDersler(ogrnumarasi);
        
        
        
        }else
            JOptionPane.showMessageDialog(rootPane, "Student existiert nicht.");
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Bitte wahlen Sie eine LVA aus der Tabelle.");
        
    }//GEN-LAST:event_buton_ogrLVA_derstenSilActionPerformed

    private void table_LVAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_LVAMouseClicked
        // TODO add your handling code here:
        
        int i = table_LVA.getSelectedRow();
        System.out.println(i);
        if(i >= 0){
            
            tf_LVAname.setText(table_LVA.getValueAt(table_LVA.getSelectedRow(),0).toString());
            tf_LVAkredi.setText(l.dersObjesi(table_LVA.getValueAt(table_LVA.getSelectedRow(),0).toString()).getKredi());
            
        }
        
    }//GEN-LAST:event_table_LVAMouseClicked

    private void buton_LVA_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_LVA_silActionPerformed
        // TODO add your handling code here:
        int k = table_LVA.getSelectedRow();
          if(k >= 0){
            
        String ders_adi = tf_LVAname.getText();

       // ogrSayisi = l.dersObjesi(ders_adi).getOgrsayisi();
       // hocaSayisi = l.dersObjesi(ders_adi).getHocasayisi();
        
        DefaultTableModel dtm = (DefaultTableModel) table_LVA.getModel();
        
        l.printLVAs();
        
        int i = 0;
        
        if(ders_adi.isEmpty())
            JOptionPane.showMessageDialog(rootPane, "LVA existiert nicht.");
        
        System.out.println(ogrSayisi+"|"+hocaSayisi);
        System.out.println(l.dersObjesi(table_LVA.getValueAt(k, 0).toString()).kayitliOgrenciler.size());
        
        
        
        if(l.dersObjesi(table_LVA.getValueAt(k, 0).toString()).kayitliOgrenciler.size() == 0 && l.dersObjesi(table_LVA.getValueAt(k, 0).toString()).kayitliHocalar.size() == 0){
                    for (int j = 0; j<table_LVA.getRowCount(); j++){
                        if(table_LVA.getValueAt(i,0).equals(tf_LVAname.getText())){
                    l.deleteLVA(ders_adi);
                    dtm.removeRow(i);
                    
                    tf_LVAname.setText("");
                    tf_LVAkredi.setText("");
                    
                        }
                        i++;
                    System.out.println(i);
                    }
                    
        }else{
            JOptionPane.showMessageDialog(rootPane, "Der Kurs kann nicht geloescht werden, da Schuler oder Lehrer am Kurs teilnehmen.");
        }    
                    
        }
        /* int derssayisi = l.dersSayisi();
        int k = 0;
        
        for (k = 0; k < derssayisi ; k++){
        dtm.addRow(new Object[] { String.valueOf(l.dersleriVer(k)) });
        } */
        
    }//GEN-LAST:event_buton_LVA_silActionPerformed

    private void buton_LVA_dersleriGosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_LVA_dersleriGosterActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) table_LVA.getModel();
        
        dtm.getDataVector().removeAllElements();
        
        l.printLVAs();
        
        int derssayisi = l.dersSayisi();
        int k = 0;
        
        for (k = 0; k < derssayisi ; k++){
        dtm.addRow(new Object[] { String.valueOf(l.dersleriVer(k)) });
        }
        
        
    }//GEN-LAST:event_buton_LVA_dersleriGosterActionPerformed

    private void btn_ogr_mainMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ogr_mainMenu2ActionPerformed
        // TODO add your handling code here:
        
        panel_derskayit_secim.setVisible(false);
        panel_Ana.setVisible(true);
        
        
    }//GEN-LAST:event_btn_ogr_mainMenu2ActionPerformed

    private void btn_derskayit_secim_dozentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_derskayit_secim_dozentActionPerformed
        // TODO add your handling code here:
        panel_derskayit_secim.setVisible(false);
        panel_dozent_LVAislem.setVisible(true);
        
        int i = table_dozent_genel.getRowCount();
        
        DefaultTableModel dtm = (DefaultTableModel) table_dozentLVA.getModel();
        dtm.getDataVector().removeAllElements();
        
        
        for(int j = 0; j < i ; j++){
            
            String[] ss = new String[4];
            ss[0] = table_dozent_genel.getValueAt(j, 0).toString();
            ss[1] = table_dozent_genel.getValueAt(j, 1).toString();
            ss[2] = table_dozent_genel.getValueAt(j, 2).toString();
            ss[3] = table_dozent_genel.getValueAt(j, 3).toString();
            
            dtm.addRow(ss);
            
        
        }
        
        combo_dozentLVA.removeAllItems();
        
        int derssayisi = l.dersSayisi();
        int k = 0;
        
        for (k = 0; k < derssayisi ; k++){
        combo_dozentLVA.addItem(l.dersleriVer(k));
        }
        
        

    }//GEN-LAST:event_btn_derskayit_secim_dozentActionPerformed

    private void btn_derskayit_secim_ogrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_derskayit_secim_ogrActionPerformed
        // TODO add your handling code here:
        
        panel_derskayit_secim.setVisible(false);
        panel_ogrLVA_islem.setVisible(true);
        
        int i = tableStudenten.getRowCount();
        
        DefaultTableModel dtm = (DefaultTableModel) table_ogrLVA.getModel();
        dtm.getDataVector().removeAllElements();
        
        
        for(int j = 0; j < i ; j++){
            
            String[] ss = new String[3];
            ss[0] = tableStudenten.getValueAt(j, 0).toString();
            ss[1] = tableStudenten.getValueAt(j, 1).toString();
            ss[2] = tableStudenten.getValueAt(j, 2).toString();

            
            dtm.addRow(ss);
            
        
        }
        
        combo_LVAsec.removeAllItems();
        
        int derssayisi = l.dersSayisi();
        int k = 0;
        
        for (k = 0; k < derssayisi ; k++){
        combo_LVAsec.addItem(l.dersleriVer(k));
        }
        
    }//GEN-LAST:event_btn_derskayit_secim_ogrActionPerformed

    private void tf_dozent_genel_titelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_dozent_genel_titelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_dozent_genel_titelActionPerformed

    private void tf_dozent_genel_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_dozent_genel_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_dozent_genel_nameActionPerformed

    private void buton_dozent_genel_geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_dozent_genel_geriActionPerformed
        // TODO add your handling code here:
        panel_dozent_genel.setVisible(false);
        panel_genelislemler_secim.setVisible(true);
        
    }//GEN-LAST:event_buton_dozent_genel_geriActionPerformed

    private void buton_dozent_genel_anasayfaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_dozent_genel_anasayfaActionPerformed
        // TODO add your handling code here:
        panel_dozent_genel.setVisible(false);
        panel_Ana.setVisible(true);
        
    }//GEN-LAST:event_buton_dozent_genel_anasayfaActionPerformed

    private void buton_dozent_genel_kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_dozent_genel_kaydetActionPerformed
        // TODO add your handling code here:
        
        isim = tf_dozent_genel_name.getText();
        soyisim = tf_dozent_genel_soyisim.getText();
        String tcno = tf_dozent_genel_id.getText();
        String unvan = tf_dozent_genel_titel.getText();
        
        anneadi = tf_dozent_anneadi.getText();
        babaadi = tf_dozent_babaadi.getText();
        email = tf_dozent_email.getText();
        yas = tf_dozent_yas.getText();
        adres = tf_dozent_adres.getText();

        if (combo_dozent_cinsiyet.getSelectedItem().toString() == "Mann"){
            cinsiyet = "0";
        }else{
            cinsiyet = "1";
        }
        
        

        d.addDozent(isim,soyisim,unvan,tcno);

        if(d.bulunan == 1){

            String[] ss = new String[4];
            ss[0] = tf_dozent_genel_titel.getText();
            ss[1] = tf_dozent_genel_name.getText();
            ss[2] = tf_dozent_genel_soyisim.getText();
            ss[3] = tf_dozent_genel_id.getText();
            

            DefaultTableModel dtm = (DefaultTableModel) table_dozent_genel.getModel();
            dtm.addRow(ss);
            
            d.addDigerBilgiler(tcno, anneadi, babaadi, email, yas, cinsiyet, adres);
            
            hocaSayisi++;

            tf_dozent_genel_name.setText("");
            tf_dozent_genel_soyisim.setText("");
            tf_dozent_genel_id.setText("");
            tf_dozent_genel_titel.setText("");
            tf_dozent_genel_id.setText("");
            tf_dozent_anneadi.setText("");
            tf_dozent_babaadi.setText("");
            tf_dozent_email.setText("");
            tf_dozent_adres.setText("");
            tf_dozent_yas.setText("");

        }else if(d.bulunan == 0){
            JOptionPane.showMessageDialog(rootPane, "Dozent konnte nicht hinzugefuegt werden.\n" +
                "Der Dozent Registrierung kann erstellt werden, wenn er den folgenden Regeln entspricht.\n" +
                "ID duerfen nur aus Ziffern bestehen.\n" +
                "Die Lange einer ID muss 11 sein.\n" +
                "Die erste Ziffer einer ID darf nicht 0 sein.\n" +
                "Vor- und Nachname duerfen nicht leer bleiben.\n");
        }
        else if(d.bulunan == 2){
            JOptionPane.showMessageDialog(rootPane, "Ein Dozent mit dieser ID existiert bereits.");
        }
        
    }//GEN-LAST:event_buton_dozent_genel_kaydetActionPerformed

    private void buton_dozent_genel_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_dozent_genel_silActionPerformed
        // TODO add your handling code here:
        int k = table_dozent_genel.getSelectedRow();
        if(k >= 0){
            
            if(d.hocaObjesi(table_dozent_genel.getValueAt(k, 3).toString()).kayitlidersler.size() == 0){
        String tcno = tf_dozent_genel_id.getText();
                d.deleteDozent(tcno);
                int i = 0;
                    for (int j = 0; j<table_dozent_genel.getRowCount(); j++){
                        if(table_dozent_genel.getValueAt(i,3).equals(tf_dozent_genel_id.getText())){
                    DefaultTableModel dtm = (DefaultTableModel) table_dozent_genel.getModel();
                    dtm.removeRow(i);
                    hocaSayisi--;
                    tf_dozent_genel_name.setText("");
                    tf_dozent_genel_soyisim.setText("");
                    tf_dozent_genel_titel.setText("");
                    tf_dozent_genel_id.setText("");
                    tf_dozent_anneadi.setText("");
                    tf_dozent_babaadi.setText("");
                    tf_dozent_email.setText("");
                    tf_dozent_adres.setText("");
                    tf_dozent_yas.setText("");
                        }
                        i++;
                    System.out.println(i);
                    }
           
        if(!d.dozentSilindi)
            JOptionPane.showMessageDialog(rootPane, "Dozent existiert nicht.");
            }
            else
                JOptionPane.showMessageDialog(rootPane, "Um die Lehrerinformationen zu loeschen, darf der Lehrer keinen registrierten Kurs haben.");
                
        }
        /*
        
        int i = table_dozent_genel.getSelectedRow();
        if(i >= 0){
            if(table_dozent_genel.getValueAt(i,3).equals(tf_dozent_genel_id.getText())){
            d.deleteDozent(table_dozent_genel.getValueAt(i,3).toString());
            DefaultTableModel dtm = (DefaultTableModel) table_dozent_genel.getModel();
            dtm.removeRow(i);
            
            tf_dozent_genel_name.setText("");
            tf_dozent_genel_soyisim.setText("");
            tf_dozent_genel_id.setText("");
            tf_dozent_genel_titel.setText("");
            
            }else{
                String tcno = tf_dozent_genel_id.getText();
                d.deleteDozent(tcno);
                i = 0;
                    for (int j = 0; j<table_dozent_genel.getRowCount(); j++){
                        if(table_dozent_genel.getValueAt(i,3).equals(tf_dozent_genel_id.getText())){
                    DefaultTableModel dtm = (DefaultTableModel) table_dozent_genel.getModel();
                    dtm.removeRow(i);
                        }
                        i++;
                    System.out.println(i);
                    }
            }
        }
        
        if(!d.dozentSilindi){
            JOptionPane.showMessageDialog(rootPane, "Dozent existiert nicht.");
            
        }
        
        */
        
        
        
    }//GEN-LAST:event_buton_dozent_genel_silActionPerformed

    private void buton_dozent_genel_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_dozent_genel_guncelleActionPerformed
        // TODO add your handling code here:
        
        int i = table_dozent_genel.getSelectedRow();
        if(i >= 0){
            
            if(d.hocaObjesi(table_dozent_genel.getValueAt(i, 3).toString()).kayitlidersler.size() == 0){

            d.hocaObjesi(table_dozent_genel.getValueAt(i, 3).toString()).setIsim(tf_dozent_genel_name.getText());
            d.hocaObjesi(table_dozent_genel.getValueAt(i, 3).toString()).setSoyisim(tf_dozent_genel_soyisim.getText());
            d.hocaObjesi(table_dozent_genel.getValueAt(i, 3).toString()).setTcno(tf_dozent_genel_id.getText());
            d.hocaObjesi(table_dozent_genel.getValueAt(i, 3).toString()).setUnvan(tf_dozent_genel_titel.getText());
            
                d.hocaObjesi(table_dozent_genel.getValueAt(i, 3).toString()).setAdres(tf_dozent_adres.getText());
                d.hocaObjesi(table_dozent_genel.getValueAt(i, 3).toString()).setAnneadi(tf_dozent_anneadi.getText());
                d.hocaObjesi(table_dozent_genel.getValueAt(i, 3).toString()).setBabaadi(tf_dozent_babaadi.getText());
                d.hocaObjesi(table_dozent_genel.getValueAt(i, 3).toString()).setEmail(tf_dozent_email.getText());
                d.hocaObjesi(table_dozent_genel.getValueAt(i, 3).toString()).setYas(tf_dozent_yas.getText());
                if (combo_dozent_cinsiyet.getSelectedItem().toString() == "Mann"){
                    cinsiyet = "0";
                }else{
                    cinsiyet = "1";
                }
                d.hocaObjesi(table_dozent_genel.getValueAt(i, 3).toString()).setCinsiyet(cinsiyet);
            
            
            
            
            table_dozent_genel.setValueAt(tf_dozent_genel_titel.getText(), i, 0);
            table_dozent_genel.setValueAt(tf_dozent_genel_name.getText(), i, 1);
            table_dozent_genel.setValueAt(tf_dozent_genel_soyisim.getText(), i, 2);
            table_dozent_genel.setValueAt(tf_dozent_genel_id.getText(), i, 3);
            
            }else{
                JOptionPane.showMessageDialog(rootPane, "Um die Lehrerinformationen zu aktualisieren, darf der Lehrer keinen registrierten Kurs haben.");
            }
            
        }
        
    }//GEN-LAST:event_buton_dozent_genel_guncelleActionPerformed

    private void table_dozent_genelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_dozent_genelMouseClicked
        // TODO add your handling code here:
        
        int i = table_dozent_genel.getSelectedRow();
        if(i >= 0){
            tf_dozent_genel_titel.setText(table_dozent_genel.getValueAt(i,0).toString());
            tf_dozent_genel_name.setText(table_dozent_genel.getValueAt(i,1).toString());
            tf_dozent_genel_soyisim.setText(table_dozent_genel.getValueAt(i,2).toString());
            tf_dozent_genel_id.setText(table_dozent_genel.getValueAt(i,3).toString());
            
            
            tf_dozent_anneadi.setText(d.hocaObjesi(tf_dozent_genel_id.getText()).getAnneadi());
            tf_dozent_babaadi.setText(d.hocaObjesi(tf_dozent_genel_id.getText()).getBabaadi());
            tf_dozent_email.setText(d.hocaObjesi(tf_dozent_genel_id.getText()).getEmail());
            tf_dozent_adres.setText(d.hocaObjesi(tf_dozent_genel_id.getText()).getAdres());
            tf_dozent_yas.setText(d.hocaObjesi(tf_dozent_genel_id.getText()).getYas());
            combo_dozent_cinsiyet.setSelectedIndex(Integer.parseInt(d.hocaObjesi(tf_dozent_genel_id.getText()).getCinsiyet()));
            
            
            
        }
        
        
    }//GEN-LAST:event_table_dozent_genelMouseClicked

    private void buton_lva_islem_zuruck1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_lva_islem_zuruck1ActionPerformed
        // TODO add your handling code here:
        
        panel_dozent_LVAislem.setVisible(false);
        panel_derskayit_secim.setVisible(true);
    }//GEN-LAST:event_buton_lva_islem_zuruck1ActionPerformed

    private void buton_dozent_derstensilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_dozent_derstensilActionPerformed
        // TODO add your handling code here:
        int row = table_dozentKayitliDersler.getSelectedRow();
        if(row >= 0){
        if(!tf_dozentLVA_id.getText().isEmpty()){
        String tcno = tf_dozentLVA_id.getText();
        //dersismi = tf_dozentLVA_lvaname.getText();
        
        
        dersismi = table_dozentKayitliDersler.getValueAt(row, 0).toString();
        //dersismi = combo_dozentLVA.getSelectedItem().toString();
        if(row >= 0){
        if(l.dersMevcutMu(dersismi)) {
   
                        d.derstenSil(tcno, dersismi);
                        l.dersObjesi(dersismi).HocaAzalt();
                        l.derstenHocaSil(dersismi, d.hocaObjesi(tcno).getUnvan() + " " + d.hocaObjesi(tcno).isim + " " + d.hocaObjesi(tcno).soyisim);
                    }else
                        JOptionPane.showMessageDialog(rootPane, "LVA existiert nicht.");
        
        DefaultTableModel dtm = (DefaultTableModel) table_dozentKayitliDersler.getModel();
        
        
        
        tcno = tf_dozentLVA_id.getText();
        
        int i = 0;
                    for (int j = 0; j<table_dozentKayitliDersler.getRowCount(); j++){
                        if(table_dozentKayitliDersler.getValueAt(i,0).equals(table_dozentKayitliDersler.getValueAt(row, 0).toString())){
                    
                    dtm.removeRow(i);
                        }
                        i++;
                    System.out.println(i);
                    }
        
        d.printKayitliDersler(tcno);
        
        
        }else
            JOptionPane.showMessageDialog(rootPane, "Dozent existiert nicht.");
        }
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Bitte wahlen Sie eine LVA aus der Tabelle.");
    }//GEN-LAST:event_buton_dozent_derstensilActionPerformed

    private void tf_dozentLVA_lvanameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_dozentLVA_lvanameMouseClicked
        // TODO add your handling code here:
        
        if(d.dozentMevcutMu(tf_dozentLVA_id.getText()))
        jLabel19.setText(d.hocaObjesi(tf_dozentLVA_id.getText()).getUnvan() + " " + d.hocaObjesi(tf_dozentLVA_id.getText()).getIsim() + " " + d.hocaObjesi(tf_dozentLVA_id.getText()).getSoyisim());
            else
                jLabel19.setText("");
        
    }//GEN-LAST:event_tf_dozentLVA_lvanameMouseClicked

    private void tf_dozentLVA_lvanameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_dozentLVA_lvanameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_dozentLVA_lvanameActionPerformed

    private void buton_dozent_dersekaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_dozent_dersekaydetActionPerformed
        // TODO add your handling code here:
        
        if(!tf_dozentLVA_id.getText().isEmpty()){
        String tcno = tf_dozentLVA_id.getText();
        //dersismi = tf_dozentLVA_lvaname.getText();
        dersismi = combo_dozentLVA.getSelectedItem().toString();
        
        boolean zaten = false;
        for(int p = 0; p < d.hocaObjesi(tcno).kayitlidersler.size(); p++){
           if(d.hocaObjesi(tcno).kayitlidersler.get(p) == dersismi){
               zaten = true;
               JOptionPane.showMessageDialog(rootPane, "Der Dozent ist bereits im Kurs eingeschrieben.");
           }else
               zaten = false;
               }
        
        if(l.dersMevcutMu(dersismi) && !zaten) {
   
                        d.derseKaydet(tcno, dersismi);
                        l.dersObjesi(dersismi).HocaArttir();
                        l.derseHocaEkle(dersismi, d.hocaObjesi(tcno).getUnvan() + " " + d.hocaObjesi(tcno).isim + " " + d.hocaObjesi(tcno).soyisim);
                    }else if(!l.dersMevcutMu(dersismi)){
                        JOptionPane.showMessageDialog(rootPane, "LVA existiert nicht.");
                    }
                        
        DefaultTableModel dtm = (DefaultTableModel) table_dozentKayitliDersler.getModel();
        
        dtm.getDataVector().removeAllElements();
        
        tcno = tf_dozentLVA_id.getText();
        
        if(d.dozentMevcutMu(tcno)){
            
       
            for (int i = 0; i < (d.hocaObjesi(tcno).kayitlidersler.size()); i++) {
                    dtm.addRow(new Object[] { String.valueOf(d.hocaObjesi(tcno).kayitlidersler.get(i)) });
                  
            }
           
        }else{
            JOptionPane.showMessageDialog(rootPane, "Dozent existiert nicht.");
        }
        
        d.printKayitliDersler(tcno);
        }
    }//GEN-LAST:event_buton_dozent_dersekaydetActionPerformed

    
    
    private void buton_dozent_dersleriGosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_dozent_dersleriGosterActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel dtm = (DefaultTableModel) table_dozentKayitliDersler.getModel();
        
        int k = table_dozentKayitliDersler.getRowCount();
        
        for(int j = 0 ; j < k ; j++)
            dtm.removeRow(0);
        
        String tcno = tf_dozentLVA_id.getText();
        
        if(d.dozentMevcutMu(tcno)){
            
       
            for (int i = 0; i < (d.hocaObjesi(tcno).kayitlidersler.size()); i++) {
                    dtm.addRow(new Object[] { String.valueOf(d.hocaObjesi(tcno).kayitlidersler.get(i)) });
                  
            }
           
        }else{
            JOptionPane.showMessageDialog(rootPane, "Dozent existiert nicht.");
        }
        
        d.printKayitliDersler(tcno);
        
        
        
        
    }//GEN-LAST:event_buton_dozent_dersleriGosterActionPerformed

    private void btn_ogrLVA_anamenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ogrLVA_anamenu1ActionPerformed
        // TODO add your handling code here:
        
        panel_dozent_LVAislem.setVisible(false);
        panel_Ana.setVisible(true);
        
    }//GEN-LAST:event_btn_ogrLVA_anamenu1ActionPerformed

    private void panel_dozent_genelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_dozent_genelMouseClicked
        // TODO add your handling code here:
        
            tf_dozent_genel_name.setText("");
            tf_dozent_genel_soyisim.setText("");
            tf_dozent_genel_id.setText("");
            tf_dozent_genel_titel.setText("");
            tf_dozent_genel_id.setText("");
            tf_dozent_anneadi.setText("");
            tf_dozent_babaadi.setText("");
            tf_dozent_email.setText("");
            tf_dozent_adres.setText("");
            tf_dozent_yas.setText("");
        
    }//GEN-LAST:event_panel_dozent_genelMouseClicked

    private void panel_dozent_LVAislemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_dozent_LVAislemMouseClicked
        // TODO add your handling code here:
        
        tf_dozentLVA_id.setText("");
        tf_dozentLVA_lvaname.setText("");
        jLabel19.setText("");
        tf_dozentLVAislem_name.setText("");
        
        DefaultTableModel dtm = (DefaultTableModel) table_ogrKayitliDersler.getModel();
        dtm.getDataVector().removeAllElements();
        
    }//GEN-LAST:event_panel_dozent_LVAislemMouseClicked

    private void buton_LVA_kayitliHocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_LVA_kayitliHocaActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel dtm = (DefaultTableModel) table_LVA.getModel();
        
        dtm.getDataVector().removeAllElements();
        
         int k = table_LVA.getRowCount();
        
        for(int j = 0 ; j < k ; j++)
            dtm.removeRow(0);
        
        String dersismi = tf_LVAname.getText();
        int i = 0;
        
                if(l.dersMevcutMu(dersismi)){
            for (i = 0; i < (l.dersObjesi(dersismi).kayitliHocalar.size()); i++) {
                    dtm.addRow(new Object[] { String.valueOf(l.dersObjesi(dersismi).kayitliHocalar.get(i)) });
                        }
            
            if(i == 0){
                JOptionPane.showMessageDialog(rootPane, "In diesem Kurs sind keine Dozenten eingeschrieben.");
            
            dtm.getDataVector().removeAllElements();
        
        l.printLVAs();
        
        int derssayisi = l.dersSayisi();
        int p = 0;
        
        for (p = 0; p < derssayisi ; p++){
        dtm.addRow(new Object[] { String.valueOf(l.dersleriVer(p)) });
        }
            }
                }
                
                else{
                    JOptionPane.showMessageDialog(rootPane, "LVA existiert nicht.");
                    
                    dtm.getDataVector().removeAllElements();

                    l.printLVAs();

                    int derssayisi = l.dersSayisi();
                    int p = 0;

                    for (p = 0; p < derssayisi ; p++){
                    dtm.addRow(new Object[] { String.valueOf(l.dersleriVer(p)) });
                    }
                    
                }
        
    }//GEN-LAST:event_buton_LVA_kayitliHocaActionPerformed

    private void table_ogrKayitliDerslerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_ogrKayitliDerslerMouseClicked
        // TODO add your handling code here:
        
        int i = table_ogrKayitliDersler.getSelectedRow();
        if(i >= 0){
            tf_ogrLVA_lvaname.setText(table_ogrKayitliDersler.getValueAt(i,0).toString());
            
        }
        
    }//GEN-LAST:event_table_ogrKayitliDerslerMouseClicked

    private void table_dozentKayitliDerslerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_dozentKayitliDerslerMouseClicked
        // TODO add your handling code here:
        
        int i = table_dozentKayitliDersler.getSelectedRow();
        if(i >= 0){
            tf_dozentLVA_lvaname.setText(table_dozentKayitliDersler.getValueAt(i,0).toString());
            
        }
        
    }//GEN-LAST:event_table_dozentKayitliDerslerMouseClicked

    private void panel_LVAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_LVAMouseClicked
        // TODO add your handling code here:
        
        tf_LVAname.setText("");
        tf_LVAkredi.setText("");

        DefaultTableModel dtm = (DefaultTableModel) table_LVA.getModel();
        int k = table_LVA.getRowCount();
        
        
        
        
        
    }//GEN-LAST:event_panel_LVAMouseClicked

    private void table_ogrLVAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_ogrLVAMouseClicked
        // TODO add your handling code here:
        
        int i = table_ogrLVA.getSelectedRow();
        if(i >= 0){
            tf_ogrLVA_name.setText(tableStudenten.getValueAt(i,0).toString() + " " + tableStudenten.getValueAt(i,1).toString());
            tf_ogrLVA_matrikel.setText(tableStudenten.getValueAt(i,2).toString());
        }
        
        
        DefaultTableModel dtm = (DefaultTableModel) table_ogrKayitliDersler.getModel();
        
        
        
        int k = table_ogrKayitliDersler.getRowCount();
        for(int j = 0 ; j < k ; j++){
            dtm.removeRow(0);
        }
        
        
        //System.out.println("k=" + k);
       /* for(int j = 0 ; j < k ; j++){
            table_ogrKayitliDersler.setValueAt(tf_bos.getText(), j, 0);
            //System.out.println("j=" + j);
        }
        
        //System.out.println("k=" + k);
        for(int j = 0 ; j < k ; j++){
            
            if(table_ogrKayitliDersler.getValueAt(0, 0).equals(""))
                dtm.removeRow(0);
            
            //table_ogrKayitliDersler.setValueAt(tf_bos.getText(), j, 0);
            //System.out.println("j=" + j);
        }*/
        
        

        ogrnumarasi = tf_ogrLVA_matrikel.getText();
        
        if(s.ogrenciNumaraMevcutMu(ogrnumarasi)){
            
       
            for (int p = 0; p < (s.ogrenciObjesi(ogrnumarasi).kayitlidersler.size()); p++) {
                    dtm.addRow(new Object[] { String.valueOf(s.ogrenciObjesi(ogrnumarasi).kayitlidersler.get(p)) });
                  
            }
           
        }else{
            JOptionPane.showMessageDialog(rootPane, "Student existiert nicht.");
        }
        
        s.printKayitliDersler(ogrnumarasi);
        
        
        tf_ogrLVA_lvaname.setText("");
        
        
    }//GEN-LAST:event_table_ogrLVAMouseClicked

    private void combo_LVAsecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_LVAsecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_LVAsecActionPerformed

    private void combo_LVAsecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_LVAsecMouseClicked
        // TODO add your handling code here:
        
       // tf_ogrLVA_lvaname.setText(combo_LVAsec.getSelectedItem().toString());
        
    }//GEN-LAST:event_combo_LVAsecMouseClicked

    private void panel_ogrLVA_islemMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_ogrLVA_islemMouseMoved
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_panel_ogrLVA_islemMouseMoved

    private void buton_LVA_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_LVA_guncelleActionPerformed
        // TODO add your handling code here:
        
        /*int p = table_LVA.getSelectedRow();
        if(p >= 0){

            l.dersObjesi(table_LVA.getValueAt(p, 0).toString()).setDersismi(tf_LVAname.getText());
            l.dersObjesi(table_LVA.getValueAt(p, 0).toString()).setKredi(tf_LVAkredi.getText());
            
            table_LVA.setValueAt(tf_LVAname.getText(), p, 0);
            
        }*/
        
        String ders_adi = tf_LVAname.getText();
        
        
        //ogrSayisi = l.dersObjesi(ders_adi).getOgrsayisi();
        //hocaSayisi = l.dersObjesi(ders_adi).getHocasayisi();
        
        DefaultTableModel dtm = (DefaultTableModel) table_LVA.getModel();
        
        l.printLVAs();
        
        if(ders_adi.isEmpty())
            JOptionPane.showMessageDialog(rootPane, "LVA existiert nicht.");
        
        int i = 0;
        int p = table_LVA.getSelectedRow();
        System.out.println(ogrSayisi+"|"+hocaSayisi);
        
        int k = table_LVA.getSelectedRow();
        if(k >= 0){
        if(l.dersObjesi(table_LVA.getValueAt(k, 0).toString()).kayitliOgrenciler.size() == 0 && l.dersObjesi(table_LVA.getValueAt(k, 0).toString()).kayitliHocalar.size() == 0){
                    
                if(p >= 0){

            l.dersObjesi(table_LVA.getValueAt(p, 0).toString()).setDersismi(tf_LVAname.getText());
            l.dersObjesi(table_LVA.getValueAt(p, 0).toString()).setKredi(tf_LVAkredi.getText());
            
            table_LVA.setValueAt(tf_LVAname.getText(), p, 0);
            
        }
                    
        }else{
            JOptionPane.showMessageDialog(rootPane, "Der Kurs kann nicht aktualisiert werden, da Schuler oder Lehrer am Kurs teilnehmen.");
        }
        
        }
        
    }//GEN-LAST:event_buton_LVA_guncelleActionPerformed

    private void table_dozentLVAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_dozentLVAMouseClicked
        // TODO add your handling code here:
        
        int i = table_dozentLVA.getSelectedRow();
        if(i >= 0){
            tf_dozentLVAislem_name.setText(table_dozent_genel.getValueAt(i,0).toString() + " " + table_dozent_genel.getValueAt(i,1).toString()+ " " + table_dozent_genel.getValueAt(i,2).toString());
            tf_dozentLVA_id.setText(table_dozent_genel.getValueAt(i,3).toString());
        }
        
        
        DefaultTableModel dtm = (DefaultTableModel) table_dozentKayitliDersler.getModel();
        
        int k = table_dozentKayitliDersler.getRowCount();
        
        for(int j = 0 ; j < k ; j++)
            dtm.removeRow(0);
        dtm.getDataVector().removeAllElements();
        
        String tcno = tf_dozentLVA_id.getText();
        
        if(d.dozentMevcutMu(tcno)){
            
       
            for (int p = 0; p < (d.hocaObjesi(tcno).kayitlidersler.size()); p++) {
                    dtm.addRow(new Object[] { String.valueOf(d.hocaObjesi(tcno).kayitlidersler.get(p)) });
                  
            }
           
        }else{
            JOptionPane.showMessageDialog(rootPane, "Dozent existiert nicht.");
        }
        
        d.printKayitliDersler(tcno);
        
        
        // tf_ogrLVA_lvaname.setText("");
        
        
    }//GEN-LAST:event_table_dozentLVAMouseClicked

    private void btn_helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_helpActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(rootPane, "Willkommen im Studentenmanagementsystem.\n\n" +
                                                "Verwenden Sie die button \"Allgemeine Operationen\", um den Schuler oder Lehrer zu registrieren.\n\n" +
                                                "Verwenden Sie die button \"LVA Registierung Operationen\", um den Schueler oder Lehrer fur die Lektion zu registrieren.\n\n" +
                                                "Verwenden Sie die button \"LVA Operationen\" für den Kursbetrieb.");
        
    }//GEN-LAST:event_btn_helpActionPerformed

    private void btn_diger_bilgiler_zuruckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_diger_bilgiler_zuruckActionPerformed
        // TODO add your handling code here:
        
        panel_diger_bilgiler_ekrani.setVisible(false);
        
            if(gecis == 0)
                panel_Ogrenci.setVisible(true);
            else
                panel_dozent_genel.setVisible(true);
    }//GEN-LAST:event_btn_diger_bilgiler_zuruckActionPerformed

    private void btn_diger_bilgiler_hauptmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_diger_bilgiler_hauptmenuActionPerformed
        // TODO add your handling code here:
        panel_diger_bilgiler_ekrani.setVisible(false);
        panel_Ana.setVisible(true);
    }//GEN-LAST:event_btn_diger_bilgiler_hauptmenuActionPerformed

    private void tf_ogrLVA_matrikelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ogrLVA_matrikelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ogrLVA_matrikelActionPerformed

    private void panel_OgrenciMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_OgrenciMouseClicked
        // TODO add your handling code here:
        isimTextField.setText("");
        soyisimTextField.setText("");
        ogrnumarasiTextField.setText("");
        tf_ogr_anneadi.setText("");
        tf_ogr_babaadi.setText("");
        tf_ogr_email.setText("");
        tf_ogr_adres.setText("");
        tf_ogr_yas.setText("");
        tf_ogr_bolum.setText("");
    }//GEN-LAST:event_panel_OgrenciMouseClicked

    private void btn_ogr_diger_bilgilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ogr_diger_bilgilerActionPerformed
        // TODO add your handling code here:

        if(s.ogrenciNumaraMevcutMu(ogrnumarasiTextField.getText())){

            label_diger_bilgiler_isim_soyisim.setText(s.ogrenciObjesi(ogrnumarasiTextField.getText()).getIsim() + " " + s.ogrenciObjesi(ogrnumarasiTextField.getText()).getSoyisim());
            label_adres.setText(s.ogrenciObjesi(ogrnumarasiTextField.getText()).getAdres());
            label_anne.setText(s.ogrenciObjesi(ogrnumarasiTextField.getText()).getAnneadi());
            label_baba.setText(s.ogrenciObjesi(ogrnumarasiTextField.getText()).getBabaadi());
            label_bolum.setText(s.ogrenciObjesi(ogrnumarasiTextField.getText()).getBolum());
            label_yas.setText(s.ogrenciObjesi(ogrnumarasiTextField.getText()).getYas());
            label_email.setText(s.ogrenciObjesi(ogrnumarasiTextField.getText()).getEmail());
            label_ogrnumarasi.setText(s.ogrenciObjesi(ogrnumarasiTextField.getText()).getOgrnumarasi());
            if (s.ogrenciObjesi(ogrnumarasiTextField.getText()).getCinsiyet() == "0"){
                label_cinsiyet.setText("Mann");
              }else{
                label_cinsiyet.setText("Frau");
              }
            
            jLabel36.setText("Matrikelnummer:");
            jLabel30.setText("Studienrichtung:");
            
            gecis = 0;
            
            panel_Ogrenci.setVisible(false);
            panel_diger_bilgiler_ekrani.setVisible(true);
        }else
        JOptionPane.showMessageDialog(rootPane, "Student existiert nicht.");

    }//GEN-LAST:event_btn_ogr_diger_bilgilerActionPerformed

    private void tf_ogr_anneadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ogr_anneadiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ogr_anneadiActionPerformed

    private void btn_ogr_mainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ogr_mainMenuActionPerformed
        // TODO add your handling code here:

        panel_Ogrenci.setVisible(false);
        panel_Ana.setVisible(true);

    }//GEN-LAST:event_btn_ogr_mainMenuActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        s.printOgrenciler();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_ogrenciEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ogrenciEkleActionPerformed
        // TODO add your handling code here:

        isim = isimTextField.getText();
        soyisim = soyisimTextField.getText();
        ogrnumarasi = ogrnumarasiTextField.getText();

        anneadi = tf_ogr_anneadi.getText();
        babaadi = tf_ogr_babaadi.getText();
        email = tf_ogr_email.getText();
        yas = tf_ogr_yas.getText();
        adres = tf_ogr_adres.getText();
        bolum = tf_ogr_bolum.getText();

        if (combo_ogr_cinsiyet.getSelectedItem().toString() == "Mann"){
            cinsiyet = "0";
        }else{
            cinsiyet = "1";
        }

        s.addOgrenci(isim,soyisim,ogrnumarasi);

        if(s.bulunan == 1){

            String[] ss = new String[3];
            ss[0] = isimTextField.getText();
            ss[1] = soyisimTextField.getText();
            ss[2] = ogrnumarasiTextField.getText();

            DefaultTableModel dtm = (DefaultTableModel) tableStudenten.getModel();
            dtm.addRow(ss);
            s.addDigerBilgiler(ogrnumarasi, anneadi, babaadi, email, yas, cinsiyet, adres, bolum);

            ogrSayisi++;
            isimTextField.setText("");
            soyisimTextField.setText("");
            ogrnumarasiTextField.setText("");
            tf_ogr_anneadi.setText("");
            tf_ogr_babaadi.setText("");
            tf_ogr_email.setText("");
            tf_ogr_adres.setText("");
            tf_ogr_yas.setText("");
            tf_ogr_bolum.setText("");

        }else if(s.bulunan == 0){
            JOptionPane.showMessageDialog(rootPane, "Student konnte nicht hinzugefuegt werden.\n" +
                "Der Student Registrierung kann erstellt werden, wenn er den folgenden Regeln entspricht.\n" +
                "Matrikelnummern duerfen nur aus Ziffern bestehen.\n" +
                "Die Lange einer Matrikelnummern muss 7 sein.\n" +
                "Die erste Ziffer einer Matrikelnummer darf nicht 0 sein.\n" +
                "Vor- und Nachname duerfen nicht leer bleiben.");
        }
        else if(s.bulunan == 2){
            JOptionPane.showMessageDialog(rootPane, "Ein Student mit dieser Matrikelnummer existiert bereits.");
        }
    }//GEN-LAST:event_btn_ogrenciEkleActionPerformed

    private void btn_ogr_zuruckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ogr_zuruckActionPerformed
        // TODO add your handling code here:

        panel_Ogrenci.setVisible(false);
        panel_genelislemler_secim.setVisible(true);

    }//GEN-LAST:event_btn_ogr_zuruckActionPerformed

    private void btn_ogr_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ogr_guncelleActionPerformed
        // TODO add your handling code here:

        int i = tableStudenten.getSelectedRow();
        if(i >= 0){

            if(s.ogrenciObjesi(tableStudenten.getValueAt(i, 2).toString()).kayitlidersler.size() == 0){

                s.ogrenciObjesi(tableStudenten.getValueAt(i, 2).toString()).setIsim(isimTextField.getText());
                s.ogrenciObjesi(tableStudenten.getValueAt(i, 2).toString()).setSoyisim(soyisimTextField.getText());
                s.ogrenciObjesi(tableStudenten.getValueAt(i, 2).toString()).setOgrnumarasi(ogrnumarasiTextField.getText());
                s.ogrenciObjesi(tableStudenten.getValueAt(i, 2).toString()).setAdres(tf_ogr_adres.getText());
                s.ogrenciObjesi(tableStudenten.getValueAt(i, 2).toString()).setAnneadi(tf_ogr_anneadi.getText());
                s.ogrenciObjesi(tableStudenten.getValueAt(i, 2).toString()).setBabaadi(tf_ogr_babaadi.getText());
                s.ogrenciObjesi(tableStudenten.getValueAt(i, 2).toString()).setEmail(tf_ogr_email.getText());
                s.ogrenciObjesi(tableStudenten.getValueAt(i, 2).toString()).setBolum(tf_ogr_bolum.getText());
                s.ogrenciObjesi(tableStudenten.getValueAt(i, 2).toString()).setYas(tf_ogr_yas.getText());
                if (combo_ogr_cinsiyet.getSelectedItem().toString() == "Mann"){
                    cinsiyet = "0";
                }else{
                    cinsiyet = "1";
                }
                s.ogrenciObjesi(tableStudenten.getValueAt(i, 2).toString()).setCinsiyet(cinsiyet);

                tableStudenten.setValueAt(isimTextField.getText(), i, 0);
                tableStudenten.setValueAt(soyisimTextField.getText(), i, 1);
                tableStudenten.setValueAt(ogrnumarasiTextField.getText(), i, 2);

            }else{
                JOptionPane.showMessageDialog(rootPane, "Um die Schulerinformationen zu aktualisieren, darf der Schuler keinen registrierten Kurs haben.");
            }

        }

    }//GEN-LAST:event_btn_ogr_guncelleActionPerformed

    private void tableStudentenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableStudentenMouseClicked
        // TODO add your handling code here:

        int i = tableStudenten.getSelectedRow();
        if(i >= 0){
            isimTextField.setText(tableStudenten.getValueAt(i,0).toString());
            soyisimTextField.setText(tableStudenten.getValueAt(i,1).toString());
            ogrnumarasiTextField.setText(tableStudenten.getValueAt(i,2).toString());
            tf_ogr_anneadi.setText(s.ogrenciObjesi(ogrnumarasiTextField.getText()).getAnneadi());
            tf_ogr_babaadi.setText(s.ogrenciObjesi(ogrnumarasiTextField.getText()).getBabaadi());
            tf_ogr_email.setText(s.ogrenciObjesi(ogrnumarasiTextField.getText()).getEmail());
            tf_ogr_adres.setText(s.ogrenciObjesi(ogrnumarasiTextField.getText()).getAdres());
            tf_ogr_yas.setText(s.ogrenciObjesi(ogrnumarasiTextField.getText()).getYas());
            tf_ogr_bolum.setText(s.ogrenciObjesi(ogrnumarasiTextField.getText()).getBolum());
            combo_ogr_cinsiyet.setSelectedIndex(Integer.parseInt(s.ogrenciObjesi(ogrnumarasiTextField.getText()).getCinsiyet()));

        }
    }//GEN-LAST:event_tableStudentenMouseClicked

    private void btn_ogr_ogrenciSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ogr_ogrenciSilActionPerformed
        // TODO add your handling code here:
        int k = tableStudenten.getSelectedRow();
        //s.deleteOgrenci(ogrnumarasiTextField.getText());
        if(k >= 0){
            if(s.ogrenciObjesi(tableStudenten.getValueAt(k, 2).toString()).kayitlidersler.size() == 0){
                ogrnumarasi = ogrnumarasiTextField.getText();
                s.deleteOgrenci(ogrnumarasi);
                int i = 0;
                for (int j = 0; j<tableStudenten.getRowCount(); j++){
                    if(tableStudenten.getValueAt(i,2).equals(ogrnumarasiTextField.getText())){
                        DefaultTableModel dtm = (DefaultTableModel) tableStudenten.getModel();
                        dtm.removeRow(i);

                        ogrSayisi--;
                        isimTextField.setText("");
                        soyisimTextField.setText("");
                        ogrnumarasiTextField.setText("");
                        tf_ogr_anneadi.setText("");
                        tf_ogr_babaadi.setText("");
                        tf_ogr_email.setText("");
                        tf_ogr_adres.setText("");
                        tf_ogr_yas.setText("");
                        tf_ogr_bolum.setText("");
                    }
                    i++;
                    System.out.println(i);
                }

                if(!s.ogrSilindi)
                JOptionPane.showMessageDialog(rootPane, "Student existiert nicht.");
            }else
            JOptionPane.showMessageDialog(rootPane, "Um die Schulerinformationen zu loeschen, darf der Schuler keinen registrierten Kurs haben.");
        }else
        JOptionPane.showMessageDialog(rootPane, "Student existiert nicht.");
    }//GEN-LAST:event_btn_ogr_ogrenciSilActionPerformed

    private void tf_ogrLVA_lvanameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ogrLVA_lvanameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ogrLVA_lvanameActionPerformed

    private void tf_ogrLVA_lvanameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_ogrLVA_lvanameMouseClicked
        // TODO add your handling code here:

        if(s.ogrenciNumaraMevcutMu(tf_ogrLVA_matrikel.getText()))
        jLabel10.setText(s.ogrenciObjesi(tf_ogrLVA_matrikel.getText()).getIsim() + " " + s.ogrenciObjesi(tf_ogrLVA_matrikel.getText()).getSoyisim());
        else
        jLabel10.setText("");
        jLabel10.setVisible(false);
        tf_ogrLVA_name.setText(jLabel10.getText());
    }//GEN-LAST:event_tf_ogrLVA_lvanameMouseClicked

    private void tf_dozent_anneadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_dozent_anneadiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_dozent_anneadiActionPerformed

    private void btn_dozent_diger_bilgilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dozent_diger_bilgilerActionPerformed
        // TODO add your handling code here:
        
        if(d.dozentMevcutMu(tf_dozent_genel_id.getText())){

            label_diger_bilgiler_isim_soyisim.setText(d.hocaObjesi(tf_dozent_genel_id.getText()).getUnvan()+ " " + d.hocaObjesi(tf_dozent_genel_id.getText()).getIsim() + " " + d.hocaObjesi(tf_dozent_genel_id.getText()).getSoyisim());
            label_adres.setText(d.hocaObjesi(tf_dozent_genel_id.getText()).getAdres());
            label_anne.setText(d.hocaObjesi(tf_dozent_genel_id.getText()).getAnneadi());
            label_baba.setText(d.hocaObjesi(tf_dozent_genel_id.getText()).getBabaadi());
            label_yas.setText(d.hocaObjesi(tf_dozent_genel_id.getText()).getYas());
            label_email.setText(d.hocaObjesi(tf_dozent_genel_id.getText()).getEmail());
            label_ogrnumarasi.setText(d.hocaObjesi(tf_dozent_genel_id.getText()).getTcno());
            if (d.hocaObjesi(tf_dozent_genel_id.getText()).getCinsiyet() == "0"){
                label_cinsiyet.setText("Mann");
              }else{
                label_cinsiyet.setText("Frau");
              }
            
            jLabel36.setText("ID:");
            jLabel30.setText("");
            label_bolum.setText("");
            
            gecis = 1;
            
            panel_dozent_genel.setVisible(false);
            panel_diger_bilgiler_ekrani.setVisible(true);
        }else
        JOptionPane.showMessageDialog(rootPane, "Dozent existiert nicht.");
        
    }//GEN-LAST:event_btn_dozent_diger_bilgilerActionPerformed

    
  
    public static void main(String args[]) {
        
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaEkran().setVisible(true);
            }
        });  
    }
        Universitaet uni = new Universitaet("Turkisch Deutsche Universitaet");
        Student s = new Student("0000000");
        Dozent d = new Dozent("","","","");
        LVA l = new LVA("","");
        String isim = "";
        String soyisim = "";
        String dersismi = "";
        String ogrnumarasi = "";
        String anneadi = " ";
        String babaadi = " ";
        String email = " ";
        String yas = " ";
        String adres = " ";
        String cinsiyet = " ";
        String bolum = " ";
        int ogrSayisi = 0;
        int hocaSayisi = 0;
        int gecis;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_LVAkaydet;
    private javax.swing.JButton btn_ana_ders_islemleri;
    private javax.swing.JButton btn_ana_genel_islemler;
    private javax.swing.JButton btn_ana_lvas;
    private javax.swing.JButton btn_derseKaydet;
    private javax.swing.JButton btn_derskayit_secim_dozent;
    private javax.swing.JButton btn_derskayit_secim_ogr;
    private javax.swing.JButton btn_dersleriGoster;
    private javax.swing.JButton btn_diger_bilgiler_hauptmenu;
    private javax.swing.JButton btn_diger_bilgiler_zuruck;
    private javax.swing.JButton btn_dozent_diger_bilgiler;
    private javax.swing.JButton btn_genelislemler_dozent;
    private javax.swing.JButton btn_genelislemler_ogr;
    private javax.swing.JButton btn_help;
    private javax.swing.JButton btn_ogrLVA_anamenu;
    private javax.swing.JButton btn_ogrLVA_anamenu1;
    private javax.swing.JButton btn_ogr_diger_bilgiler;
    private javax.swing.JButton btn_ogr_guncelle;
    private javax.swing.JButton btn_ogr_mainMenu;
    private javax.swing.JButton btn_ogr_mainMenu1;
    private javax.swing.JButton btn_ogr_mainMenu2;
    private javax.swing.JButton btn_ogr_ogrenciSil;
    private javax.swing.JButton btn_ogr_zuruck;
    private javax.swing.JButton btn_ogrenciEkle;
    private javax.swing.JButton buton_LVA_anamenu;
    private javax.swing.JButton buton_LVA_dersleriGoster;
    private javax.swing.JButton buton_LVA_guncelle;
    private javax.swing.JButton buton_LVA_kayitliHoca;
    private javax.swing.JButton buton_LVA_kayitliogr;
    private javax.swing.JButton buton_LVA_sil;
    private javax.swing.JButton buton_dozent_dersekaydet;
    private javax.swing.JButton buton_dozent_dersleriGoster;
    private javax.swing.JButton buton_dozent_derstensil;
    private javax.swing.JButton buton_dozent_genel_anasayfa;
    private javax.swing.JButton buton_dozent_genel_geri;
    private javax.swing.JButton buton_dozent_genel_guncelle;
    private javax.swing.JButton buton_dozent_genel_kaydet;
    private javax.swing.JButton buton_dozent_genel_sil;
    private javax.swing.JButton buton_lva_islem_zuruck;
    private javax.swing.JButton buton_lva_islem_zuruck1;
    private javax.swing.JButton buton_ogrLVA_derstenSil;
    private javax.swing.JComboBox<String> combo_LVAsec;
    private javax.swing.JComboBox<String> combo_dozentLVA;
    private javax.swing.JComboBox<String> combo_dozent_cinsiyet;
    private javax.swing.JComboBox<String> combo_ogr_cinsiyet;
    private javax.swing.JTextField isimTextField;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel label_adres;
    private javax.swing.JLabel label_anne;
    private javax.swing.JLabel label_baba;
    private javax.swing.JLabel label_bolum;
    private javax.swing.JLabel label_cinsiyet;
    private javax.swing.JLabel label_diger_bilgiler_isim_soyisim;
    private javax.swing.JLabel label_email;
    private javax.swing.JLabel label_ogrnumarasi;
    private javax.swing.JLabel label_yas;
    private javax.swing.JTextField ogrnumarasiTextField;
    private javax.swing.JPanel panel_Ana;
    private javax.swing.JPanel panel_LVA;
    private javax.swing.JPanel panel_Ogrenci;
    private javax.swing.JPanel panel_derskayit_secim;
    private javax.swing.JPanel panel_diger_bilgiler_ekrani;
    private javax.swing.JPanel panel_dozent_LVAislem;
    private javax.swing.JPanel panel_dozent_genel;
    private javax.swing.JPanel panel_genelislemler_secim;
    private javax.swing.JPanel panel_ogrLVA_islem;
    private javax.swing.JTextField soyisimTextField;
    private javax.swing.JTable tableStudenten;
    private javax.swing.JTable table_LVA;
    private javax.swing.JTable table_dozentKayitliDersler;
    private javax.swing.JTable table_dozentLVA;
    private javax.swing.JTable table_dozent_genel;
    private javax.swing.JTable table_ogrKayitliDersler;
    private javax.swing.JTable table_ogrLVA;
    private javax.swing.JTextField tf_LVAkredi;
    private javax.swing.JTextField tf_LVAname;
    private javax.swing.JTextField tf_bos;
    private javax.swing.JTextField tf_dozentLVA_id;
    private javax.swing.JTextField tf_dozentLVA_lvaname;
    private javax.swing.JTextField tf_dozentLVAislem_name;
    private javax.swing.JTextField tf_dozent_adres;
    private javax.swing.JTextField tf_dozent_anneadi;
    private javax.swing.JTextField tf_dozent_babaadi;
    private javax.swing.JTextField tf_dozent_email;
    private javax.swing.JTextField tf_dozent_genel_id;
    private javax.swing.JTextField tf_dozent_genel_name;
    private javax.swing.JTextField tf_dozent_genel_soyisim;
    private javax.swing.JTextField tf_dozent_genel_titel;
    private javax.swing.JTextField tf_dozent_yas;
    private javax.swing.JTextField tf_ogrLVA_lvaname;
    private javax.swing.JTextField tf_ogrLVA_matrikel;
    private javax.swing.JTextField tf_ogrLVA_name;
    private javax.swing.JTextField tf_ogr_adres;
    private javax.swing.JTextField tf_ogr_anneadi;
    private javax.swing.JTextField tf_ogr_babaadi;
    private javax.swing.JTextField tf_ogr_bolum;
    private javax.swing.JTextField tf_ogr_email;
    private javax.swing.JTextField tf_ogr_yas;
    // End of variables declaration//GEN-END:variables

    
}

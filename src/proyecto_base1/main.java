/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_base1;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import datechooser.beans.DateChooserPanel;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author alex
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Crear_cuenta_cliente = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Crear_cuenta_cliente_NombreCompleto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Crear_cuenta_cliente_ComboBox = new javax.swing.JComboBox<>();
        Crear_cuenta_cliente_BotonAgregar = new javax.swing.JButton();
        Crear_cuenta_cliente_Direccion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Crear_cuenta_cliente_CorreoElectronico = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Crear_cuenta_cliente_BotonCrear = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        Crear_cuenta_cliente_Contraseña = new javax.swing.JTextField();
        Crear_cuenta_cliente_numeros = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        Crear_cita = new javax.swing.JDialog();
        jLabel26 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        dateChooserPanel1 = new datechooser.beans.DateChooserPanel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel31 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        Crear_cita_Combobox = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Agregar_Carro = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Agregar_Carro_Placa = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Agregar_Carro_Modelo = new javax.swing.JTextField();
        Agregar_Carro_NumeroMotor = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Agregar_Carro_BotonListo = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        Crear_cuenta_AsesorMecánico = new javax.swing.JDialog();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Crear_cuenta_AsesorMecánico_NombreCompleto = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        Crear_cuenta_AsesorMecánico_NumeroTelefonoAsignado = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        Crear_cuenta_AsesorMecánico_Tipo = new javax.swing.JComboBox<>();
        Crear_cuenta_AsesorMecánico_BotonCrear = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        Crear_cuenta_AsesorMecánico_Contraseña = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Menu = new javax.swing.JDialog();
        jLabel25 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        login_botonEntrar = new javax.swing.JButton();
        login_usuario = new javax.swing.JTextField();
        login_contraseña = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();

        Crear_cuenta_cliente.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Números de teléfono:");
        Crear_cuenta_cliente.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Crear Cuenta");
        Crear_cuenta_cliente.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, -1));
        Crear_cuenta_cliente.getContentPane().add(Crear_cuenta_cliente_NombreCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 350, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nombre Completo:");
        Crear_cuenta_cliente.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        Crear_cuenta_cliente.getContentPane().add(Crear_cuenta_cliente_ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 270, -1));

        Crear_cuenta_cliente_BotonAgregar.setText("Agregar");
        Crear_cuenta_cliente_BotonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crear_cuenta_cliente_BotonAgregarActionPerformed(evt);
            }
        });
        Crear_cuenta_cliente.getContentPane().add(Crear_cuenta_cliente_BotonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, -1));
        Crear_cuenta_cliente.getContentPane().add(Crear_cuenta_cliente_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 350, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Dirección:");
        Crear_cuenta_cliente.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, -1));
        Crear_cuenta_cliente.getContentPane().add(Crear_cuenta_cliente_CorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 350, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Correo electrónico:");
        Crear_cuenta_cliente.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, -1));

        Crear_cuenta_cliente_BotonCrear.setText("Crear");
        Crear_cuenta_cliente_BotonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crear_cuenta_cliente_BotonCrearActionPerformed(evt);
            }
        });
        Crear_cuenta_cliente.getContentPane().add(Crear_cuenta_cliente_BotonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 100, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Contraseña:");
        Crear_cuenta_cliente.getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, -1, -1));
        Crear_cuenta_cliente.getContentPane().add(Crear_cuenta_cliente_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 350, -1));

        Crear_cuenta_cliente_numeros.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####-####"))));
        Crear_cuenta_cliente.getContentPane().add(Crear_cuenta_cliente_numeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 270, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_base1/black-wallpaper-png-scaled-1000.jpg"))); // NOI18N
        Crear_cuenta_cliente.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, -1));

        Crear_cita.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Crear Cita");
        Crear_cita.getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mantenimiento", "Reparación" }));
        Crear_cita.getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 160, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("ID:");
        Crear_cita.getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Fecha:");
        Crear_cita.getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));
        Crear_cita.getContentPane().add(dateChooserPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 320, 210));
        Crear_cita.getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 160, 40, -1));
        Crear_cita.getContentPane().add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 40, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText(":");
        Crear_cita.getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 160, 20, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));
        Crear_cita.getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 160, -1, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Hora:");
        Crear_cita.getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, -1, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Teléfono de contacto:");
        Crear_cita.getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, -1, -1));

        Crear_cita.getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, 160, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Tipo:");
        Crear_cita.getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, -1, -1));

        Crear_cita.getContentPane().add(Crear_cita_Combobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 320, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Modelo:");
        Crear_cita.getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Cliente:");
        Crear_cita.getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));
        Crear_cita.getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 60, 10));
        Crear_cita.getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 60, 10));

        jButton2.setText("Crear");
        Crear_cita.getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, -1, -1));

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Placa del carro:");
        Crear_cita.getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));
        Crear_cita.getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 280, -1));
        Crear_cita.getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 280, -1));

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Número de motor:");
        Crear_cita.getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_base1/black-wallpaper-png-scaled-1000.jpg"))); // NOI18N
        Crear_cita.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1001, 555));

        Agregar_Carro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Agregar automóvil");
        Agregar_Carro.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Placa");
        Agregar_Carro.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));
        Agregar_Carro.getContentPane().add(Agregar_Carro_Placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 280, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Modelo");
        Agregar_Carro.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));
        Agregar_Carro.getContentPane().add(Agregar_Carro_Modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 280, -1));
        Agregar_Carro.getContentPane().add(Agregar_Carro_NumeroMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 280, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Número de motor");
        Agregar_Carro.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        Agregar_Carro_BotonListo.setText("Listo");
        Agregar_Carro.getContentPane().add(Agregar_Carro_BotonListo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_base1/abstract-black-geometric-line-pattern-34-iphone-7-plus-wallpaper-576x1024.jpg"))); // NOI18N
        Agregar_Carro.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 600));

        Crear_cuenta_AsesorMecánico.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Crear Cuenta");
        Crear_cuenta_AsesorMecánico.getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Nombre completo:");
        Crear_cuenta_AsesorMecánico.getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));
        Crear_cuenta_AsesorMecánico.getContentPane().add(Crear_cuenta_AsesorMecánico_NombreCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 350, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Número de teléfono asignado:");
        Crear_cuenta_AsesorMecánico.getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, -1));
        Crear_cuenta_AsesorMecánico.getContentPane().add(Crear_cuenta_AsesorMecánico_NumeroTelefonoAsignado, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 350, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Tipo:");
        Crear_cuenta_AsesorMecánico.getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));

        Crear_cuenta_AsesorMecánico_Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Asesor", "Mecánico" }));
        Crear_cuenta_AsesorMecánico.getContentPane().add(Crear_cuenta_AsesorMecánico_Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 110, -1));

        Crear_cuenta_AsesorMecánico_BotonCrear.setText("Crear");
        Crear_cuenta_AsesorMecánico_BotonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crear_cuenta_AsesorMecánico_BotonCrearActionPerformed(evt);
            }
        });
        Crear_cuenta_AsesorMecánico.getContentPane().add(Crear_cuenta_AsesorMecánico_BotonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Contraseña:");
        Crear_cuenta_AsesorMecánico.getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        Crear_cuenta_AsesorMecánico_Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crear_cuenta_AsesorMecánico_ContraseñaActionPerformed(evt);
            }
        });
        Crear_cuenta_AsesorMecánico.getContentPane().add(Crear_cuenta_AsesorMecánico_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 350, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_base1/black-wallpaper-png-scaled-1000.jpg"))); // NOI18N
        Crear_cuenta_AsesorMecánico.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Menu.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Menu");
        Menu.getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        jButton1.setText("Modificar mi cuenta");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        Menu.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_base1/abstract-black-geometric-line-pattern-34-iphone-7-plus-wallpaper-576x1024.jpg"))); // NOI18N
        Menu.getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 365, 633));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGIN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 90, -1));

        login_botonEntrar.setText("ENTRAR");
        login_botonEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_botonEntrarMouseClicked(evt);
            }
        });
        login_botonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_botonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(login_botonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));
        getContentPane().add(login_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 280, -1));
        getContentPane().add(login_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 280, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jToggleButton1.setText("Crear cuenta");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_base1/IMG-13.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login_botonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_botonEntrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_botonEntrarActionPerformed
    PreparedStatement ps;
    private void Crear_cuenta_cliente_BotonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crear_cuenta_cliente_BotonCrearActionPerformed
        try {
            if (this.Crear_cuenta_cliente_BotonCrear.getText().equals("Crear")) {
//                Connection miConexion;
//                miConexion = Conectar.GetConnetion();
                String datos = (String) Crear_cuenta_cliente_ComboBox.getSelectedItem();
                String insertar = "insert into cliente (ID_Cliente,Nombre,Telefono,Direccion,Correo,Contrasena) values (?,?,?,?,?,?)";
                try {
                    ps = (PreparedStatement) cn.prepareCall(insertar);
                    ps.setString(1, null);
                    ps.setString(2, Crear_cuenta_cliente_NombreCompleto.getText());
                    ps.setString(3, datos);
                    ps.setString(4, Crear_cuenta_cliente_Direccion.getText());
                    ps.setString(5, Crear_cuenta_cliente_CorreoElectronico.getText());
                    ps.setString(6, Crear_cuenta_cliente_Contraseña.getText());
                    int registrar = ps.executeUpdate();
                    if (registrar > 0) {
                        Crear_cuenta_cliente_NombreCompleto.setText("");
                        Crear_cuenta_cliente_Direccion.setText("");
                        Crear_cuenta_cliente_CorreoElectronico.setText("");
                        Crear_cuenta_cliente_Contraseña.setText("");
                        this.Crear_cuenta_cliente_numeros.setText("");
                        numeros=new ArrayList();
                        this.Crear_cuenta_cliente_ComboBox.setModel(new DefaultComboBoxModel());
                        this.Crear_cuenta_cliente.setVisible(false);
                        JOptionPane.showMessageDialog(null, "Cuenta creada exitosamente");
                        this.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "La cuenta NO FUE REGISTRADA, FAVOR VER CODIGO");
                    }
                } catch (Exception e) {
                }

                /*INSERT INTO `cliente` (`ID_Cliente`, `Nombre`, `Telefono`, `Direccion`, `Correo`, `Contrasena
                `) VALUES(NULL, 'asd', '32132', 'asd', 'asd', 'asd'
                );*/
                //java.sql.PreparedStatement pst = cn.prepareStatement("INSERT INTO cliente (ID_Cliente,Nombre,Telefono,Direccion,Correo,Contrasena) VALUES ('NULL','" + Crear_cuenta_cliente_NombreCompleto.getText() + "','" + datos + "','" + Crear_cuenta_cliente_Direccion.getText() + "','" + Crear_cuenta_cliente_CorreoElectronico.getText() + "','" + Crear_cuenta_cliente_Contraseña.getText() + "')");
                //pst.setString(2, Crear_cuenta_cliente_NombreCompleto.getText());
                //pst.setString(3, Crear_cuenta_cliente_ComboBox.toString());
                //pst.setString(4, Crear_cuenta_cliente_Direccion.getText());
                //pst.setString(5, Crear_cuenta_cliente_CorreoElectronico.getText());
                //pst.setString(6, Crear_cuenta_cliente_Contraseña.getText());
                //int registrar = pst.executeUpdate();
                /* if (registrar > 0) {
                    this.Crear_cuenta_cliente.setVisible(false);
                JOptionPane.showMessageDialog(null, "Cuenta creada exitosamente");
                this.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "La cuenta NO FUE REGISTRADA, FAVOR VER CODIGO");
                }*/
            } else {
                this.Crear_cuenta_cliente.setVisible(false);
                JOptionPane.showMessageDialog(null, "Cuenta modificada exitosamente");
                this.Menu.setVisible(true);
            }
        } catch (Exception e) {
            e.getMessage();
        }

    }//GEN-LAST:event_Crear_cuenta_cliente_BotonCrearActionPerformed

    private void Crear_cuenta_AsesorMecánico_ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crear_cuenta_AsesorMecánico_ContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Crear_cuenta_AsesorMecánico_ContraseñaActionPerformed

    private void Crear_cuenta_AsesorMecánico_BotonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crear_cuenta_AsesorMecánico_BotonCrearActionPerformed
        String datos = (String) Crear_cuenta_AsesorMecánico_Tipo.getSelectedItem();
                String insertar = "insert into empleado (ID_Empleado,Nombre,Telefono,Tipo,Contrasena) values (?,?,?,?,?)";
                try {
                    ps = (PreparedStatement) cn.prepareCall(insertar);
                    ps.setString(1, null);
                    ps.setString(2, Crear_cuenta_AsesorMecánico_NombreCompleto.getText());
                    ps.setString(3, Crear_cuenta_AsesorMecánico_NumeroTelefonoAsignado.getText());
                    ps.setString(4, datos);
                    ps.setString(5, Crear_cuenta_AsesorMecánico_Contraseña.getText());
                    
                    int registrar = ps.executeUpdate();
                    if (registrar > 0) {
                        this.Crear_cuenta_AsesorMecánico.setVisible(false);
                        JOptionPane.showMessageDialog(null, "Cuenta creada exitosamente");
                        this.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "La cuenta NO FUE REGISTRADA, FAVOR VER CODIGO");
                    }
                } catch (Exception e) {
                }
        
        /*try {
//            Connection miConexion;
//            miConexion = Conectar.GetConnetion();
            java.sql.PreparedStatement pst = cn.prepareStatement("INSERT INTO empleado (Nombre,Telefono,Tipo,Contrasena) VALUES (?,?,?,?)");
            pst.setString(1, Crear_cuenta_AsesorMecánico_NombreCompleto.getText());
            pst.setString(2, Crear_cuenta_AsesorMecánico_NumeroTelefonoAsignado.getText());
            pst.setString(3, Crear_cuenta_AsesorMecánico_Tipo.getSelectedItem().toString());
            pst.setString(4, Crear_cuenta_AsesorMecánico_Contraseña.getText());
            pst.executeUpdate();

        } catch (Exception e) {
        }*/
    }//GEN-LAST:event_Crear_cuenta_AsesorMecánico_BotonCrearActionPerformed

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        Crear_cuenta_cliente_BotonCrear.setText("Crear");
        this.setVisible(false);
        this.Crear_cuenta_cliente.pack();
        this.Crear_cuenta_cliente.setModal(true);
        this.Crear_cuenta_cliente.setLocationRelativeTo(this);
        this.Crear_cuenta_cliente.setVisible(true);
    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void login_botonEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_botonEntrarMouseClicked
        this.setVisible(false);
        this.Menu.pack();
        this.Menu.setModal(true);
        this.Menu.setLocationRelativeTo(this);
        this.Menu.setVisible(true);
    }//GEN-LAST:event_login_botonEntrarMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        //necesita el autocompletado
        this.Menu.setVisible(false);
        this.Crear_cuenta_cliente_BotonCrear.setText("Modificar");
        this.Crear_cuenta_cliente.pack();
        this.Crear_cuenta_cliente.setModal(true);
        this.Crear_cuenta_cliente.setLocationRelativeTo(this);
        this.Crear_cuenta_cliente.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void Crear_cuenta_cliente_BotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crear_cuenta_cliente_BotonAgregarActionPerformed
        numeros.add(this.Crear_cuenta_cliente_numeros.getText());
        DefaultComboBoxModel modelo=new DefaultComboBoxModel();
        for (int i = 0; i < numeros.size();i++) {
                modelo.addElement(numeros.get(i));
        }
        this.Crear_cuenta_cliente_ComboBox.setModel(modelo);
    }//GEN-LAST:event_Crear_cuenta_cliente_BotonAgregarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException {
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*Connection miConexion;
        miConexion = Conectar.GetConnetion();
        if (miConexion != null) {
            JOptionPane.showMessageDialog(null, "Conexion Realizada");
        }*/
 /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Agregar_Carro;
    private javax.swing.JButton Agregar_Carro_BotonListo;
    private javax.swing.JTextField Agregar_Carro_Modelo;
    private javax.swing.JTextField Agregar_Carro_NumeroMotor;
    private javax.swing.JTextField Agregar_Carro_Placa;
    private javax.swing.JDialog Crear_cita;
    private javax.swing.JComboBox<String> Crear_cita_Combobox;
    private javax.swing.JDialog Crear_cuenta_AsesorMecánico;
    private javax.swing.JButton Crear_cuenta_AsesorMecánico_BotonCrear;
    private javax.swing.JTextField Crear_cuenta_AsesorMecánico_Contraseña;
    private javax.swing.JTextField Crear_cuenta_AsesorMecánico_NombreCompleto;
    private javax.swing.JTextField Crear_cuenta_AsesorMecánico_NumeroTelefonoAsignado;
    private javax.swing.JComboBox<String> Crear_cuenta_AsesorMecánico_Tipo;
    private javax.swing.JDialog Crear_cuenta_cliente;
    private javax.swing.JButton Crear_cuenta_cliente_BotonAgregar;
    private javax.swing.JButton Crear_cuenta_cliente_BotonCrear;
    private javax.swing.JComboBox<String> Crear_cuenta_cliente_ComboBox;
    private javax.swing.JTextField Crear_cuenta_cliente_Contraseña;
    private javax.swing.JTextField Crear_cuenta_cliente_CorreoElectronico;
    private javax.swing.JTextField Crear_cuenta_cliente_Direccion;
    private javax.swing.JTextField Crear_cuenta_cliente_NombreCompleto;
    private javax.swing.JFormattedTextField Crear_cuenta_cliente_numeros;
    private javax.swing.JDialog Menu;
    private datechooser.beans.DateChooserPanel dateChooserPanel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton login_botonEntrar;
    private javax.swing.JPasswordField login_contraseña;
    private javax.swing.JTextField login_usuario;
    // End of variables declaration//GEN-END:variables

    Conectar cc = new Conectar();
    Connection cn = cc.conexion();
    ArrayList numeros=new ArrayList();
}

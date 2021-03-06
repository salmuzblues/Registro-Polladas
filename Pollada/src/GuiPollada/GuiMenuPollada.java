/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiPollada;

import clasesPolladas.Cliente;
import clasesPolladas.ExportarExcel;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import java.awt.AWTKeyStroke;
import java.awt.GridLayout;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author juan.carranza
 */
public class GuiMenuPollada extends javax.swing.JFrame {

    /**
     * Creates new form GuiMenuPollada
     */
    
    // declarando variables 
    public static  DefaultTableModel modelo;
    private JFileChooser FileChooser=new JFileChooser(); 
    Vector columna = new Vector(); 
    Vector filas = new  Vector();  
    static int tabla_ancho = 0; 
    static int tabla_alto = 0; 
   
    
    public GuiMenuPollada() {
      //  this.getContentPane().setBackground(new java.awt.Color(206, 246, 245));
        initComponents();
     
        //  para darle las dimensiones minimas que deses
        this.setMinimumSize( new Dimension(840,727));
        this.setResizable(false);
        btnAgregar.setMnemonic(KeyEvent.VK_A);
        this.btnEditar.setMnemonic(KeyEvent.VK_X);
        this.btnExportar.setMnemonic(KeyEvent.VK_E);
        this.btnImportar.setMnemonic(KeyEvent.VK_I);
        this.btnSalir.setMnemonic(KeyEvent.VK_S);
        this.btnbalanceTotal.setMnemonic(KeyEvent.VK_T);
        this.btnLimpiar.setMnemonic(KeyEvent.VK_L);
        this.btnEliminar.setMnemonic(KeyEvent.VK_C);
        this.JMenuInsumos.setMnemonic(KeyEvent.VK_F2);
        
        // focus 
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTReporte = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnExportar = new javax.swing.JButton();
        btnImportar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCantPollos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDeudaPollos = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPrecioPollada = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnbalanceTotal = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenuInsumos = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 204));
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 90, 110, 24);

        JTReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "PRECIO POLLADA", "CANT_POLLOS", "POLLOS CANCELADOS", "PAGO TOTAL", "DEBE  ", "TOTAL"
            }
        ));
        JTReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTReporteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTReporte);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 320, 800, 170);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Noteworthy", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 204));
        jLabel3.setText("REGISTRO POLLADA");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(240, 20, 390, 35);

        btnExportar.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        btnExportar.setForeground(new java.awt.Color(204, 0, 204));
        btnExportar.setText("EXPORTAR");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });
        getContentPane().add(btnExportar);
        btnExportar.setBounds(40, 610, 170, 39);

        btnImportar.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        btnImportar.setForeground(new java.awt.Color(204, 0, 204));
        btnImportar.setText("IMPORTAR");
        btnImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarActionPerformed(evt);
            }
        });
        getContentPane().add(btnImportar);
        btnImportar.setBounds(240, 610, 170, 39);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 204));
        jLabel7.setText("Cantidad Pollos:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 150, 150, 24);

        txtCantPollos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantPollosKeyPressed(evt);
            }
        });
        getContentPane().add(txtCantPollos);
        txtCantPollos.setBounds(210, 150, 50, 30);

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 204));
        jLabel8.setText("Cancelados: ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(330, 150, 120, 24);

        txtDeudaPollos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDeudaPollosKeyPressed(evt);
            }
        });
        getContentPane().add(txtDeudaPollos);
        txtDeudaPollos.setBounds(450, 150, 50, 30);

        btnEditar.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(204, 0, 204));
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar);
        btnEditar.setBounds(280, 250, 140, 40);

        btnAgregar.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(204, 0, 204));
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        btnAgregar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAgregarKeyPressed(evt);
            }
        });
        getContentPane().add(btnAgregar);
        btnAgregar.setBounds(80, 250, 160, 40);

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });
        getContentPane().add(txtNombre);
        txtNombre.setBounds(170, 90, 260, 30);

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 204));
        jLabel9.setText("Precio Pollada:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(560, 150, 132, 24);
        getContentPane().add(txtPrecioPollada);
        txtPrecioPollada.setBounds(700, 150, 50, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/Excel-icon.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 500, 100, 90);

        btnLimpiar.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(204, 0, 204));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(640, 250, 130, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/document-excel-icon.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(280, 510, 100, 100);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/out-icon.png"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(650, 500, 100, 100);

        btnSalir.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(204, 0, 204));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(630, 610, 160, 39);

        btnbalanceTotal.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        btnbalanceTotal.setForeground(new java.awt.Color(204, 0, 204));
        btnbalanceTotal.setText("TOTAL");
        btnbalanceTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbalanceTotalActionPerformed(evt);
            }
        });
        getContentPane().add(btnbalanceTotal);
        btnbalanceTotal.setBounds(440, 610, 170, 39);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/Cash-register-icon.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(470, 510, 100, 80);

        jLabel12.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel12.setText("Diseñado por: Ing. Juan Alexander Carranza Alarcón  Cell: 993938955");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(180, 210, 550, 19);

        btnEliminar.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(204, 0, 204));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(460, 250, 140, 39);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Pollada\\src\\fotos\\Colorful-lines-stripes-rays-color-rainbow_2560x1600.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 840, 730);

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(550, 660, 34, 14);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JMenuInsumos.setText("Materiales");
        JMenuInsumos.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jMenuItem1.setText("INSUMOS");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        JMenuInsumos.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jMenuItem2.setText("SALIR");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        JMenuInsumos.add(jMenuItem2);

        jMenuBar1.add(JMenuInsumos);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Cliente c = new Cliente(this.txtNombre.getText().toUpperCase(), Integer.parseInt(this.txtCantPollos.getText()), Integer.parseInt(this.txtDeudaPollos.getText()),
                Double.parseDouble(this.txtPrecioPollada.getText()));

    
//******************************************************
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) this.JTReporte.getModel();
   
     // mientras este sentencia sea verdadera el loop seguira 
        while (c.getIntDeudaCantPollo() > c.getIntCantPollosCliente()){
            
            c.setIntDeudaCantPollo( Integer.parseInt(JOptionPane.showInputDialog(null, "VALOR INCORRECTO 'POLLOS CANCELADOS'")));
        }
        
          double deuda;

            String cancelo = ""; 
        if (c.getIntDeudaCantPollo() == c.getIntCantPollosCliente()) {
            deuda = 0.0;
            cancelo = "SI";
        } else  {
            deuda = c.precioTotal()- (c.getIntDeudaCantPollo() * c.getDoubPrecioPolloda());
            cancelo = "NO";
        }
        
            
        Object[] fila = new Object[7];

        fila[0] = c.getStrNombre();
        fila[1] = String.valueOf(c.getDoubPrecioPolloda());
        fila[2] = String.valueOf(c.getIntCantPollosCliente());
        fila[3] = String.valueOf(c.getIntDeudaCantPollo());
        fila[4] = cancelo;
        fila[5] = String.valueOf(Math.abs(deuda));
        fila[6] = String.valueOf(c.precioTotal());

        modelo.addRow(fila);

        this.JTReporte.setModel(modelo);

        // borrado de los cajas boxes
        this.txtNombre.setText("");
        this.txtCantPollos.setText("");
        this.txtDeudaPollos.setText("");
        this.txtPrecioPollada.setText("");
        
       //this is to point out the first box
       this.txtNombre.requestFocus();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        if (this.JTReporte.getRowCount() > 0) {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
            chooser.setFileFilter(filter);

            chooser.setDialogTitle("Guardar archivo");
            chooser.setAcceptAllFileFilterUsed(false);
            if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                List<JTable> tb = new ArrayList<JTable>();
                List<String> nom = new ArrayList<String>();
                tb.add(this.JTReporte);
                nom.add("Registro de Actividad");
                String file = chooser.getSelectedFile().toString().concat(".xls");
                try {
                    ExportarExcel e = new ExportarExcel(new File(file), tb, nom);
                    if (e.export()) {
                        JOptionPane.showMessageDialog(null, "Los datos fueron exportados a excel en el directorio seleccionado", "Mensaje de Informacion", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Hubo un error " + e.getMessage(), " Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay datos para exportar", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }

        // borrando la jTable
        // getModel() = This method returns information on the current data model during the processing of a personalized reverse engineering.
        // The list of available data is described in the pPropertyName values table.
        DefaultTableModel dm = (DefaultTableModel) this.JTReporte.getModel();
        for (int i = dm.getRowCount() - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
    }//GEN-LAST:event_btnExportarActionPerformed

    private void JTReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTReporteMouseClicked
        int i = this.JTReporte.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) this.JTReporte.getModel();
        this.txtNombre.setText(model.getValueAt(i, 0).toString());
        this.txtPrecioPollada.setText(model.getValueAt(i, 1).toString());
        this.txtCantPollos.setText(model.getValueAt(i, 2).toString());
        this.txtDeudaPollos.setText(model.getValueAt(i, 3).toString());
        

    }//GEN-LAST:event_JTReporteMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int i = this.JTReporte.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) this.JTReporte.getModel();
        // la logica de la pollada 
        double prePolla = Double.parseDouble(this.txtPrecioPollada.getText());
        int cantPollo = Integer.parseInt(this.txtCantPollos.getText());
        int deudCantPollo = Integer.parseInt(this.txtDeudaPollos.getText());
        //precio total
        double precioTotal;
        precioTotal = prePolla * cantPollo;

        double deuda;

       if (deudCantPollo == cantPollo) {
            deuda = 0;
        } else {
            deuda = precioTotal - (deudCantPollo * prePolla);
         }
         // get value 
       String pagototal = model.getValueAt(i, 4).toString();
       
       String NewPagoTotal = JOptionPane.showInputDialog(null,"PAGO TOTAL ESCRIBA SI o NO",pagototal);
        if (i >= 0) {

            model.setValueAt(this.txtNombre.getText().toUpperCase(), i, 0);
            model.setValueAt(String.valueOf(prePolla), i, 1);
            model.setValueAt(this.txtCantPollos.getText(), i, 2);
            model.setValueAt(this.txtDeudaPollos.getText(), i, 3);
            model.setValueAt(NewPagoTotal.toUpperCase(),i, 4);
            model.setValueAt(String.valueOf(deuda), i, 5);
            model.setValueAt(String.valueOf(precioTotal), i, 6);

        } else {
            JOptionPane.showMessageDialog(null, "UPDATE ERROR");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        this.txtNombre.setText("");
        this.txtCantPollos.setText("");
        this.txtDeudaPollos.setText("");
        this.txtPrecioPollada.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        DefaultTableModel model = (DefaultTableModel) this.JTReporte.getModel();
        
        int i = this.JTReporte.getSelectedRow();
        
        if (i >= 0)
            model.removeRow(i);
        else 
            JOptionPane.showMessageDialog(null, " ELIMINACION ERROR");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarActionPerformed
          
          FileChooser.showDialog(null, "Importar Hoja ");
	  File file = FileChooser.getSelectedFile();
	  if(!file.getName().endsWith("xls")){
		  
		JOptionPane.showMessageDialog(null, "Seleccione un archivo excel...", "Error",JOptionPane.ERROR_MESSAGE); 
	  } 
	  else 
	  { 
            try {
                CrearTabla(file);
            } catch (IOException ex) {
                Logger.getLogger(GuiMenuPollada.class.getName()).log(Level.SEVERE, null, ex);
            }
              modelo = new DefaultTableModel(filas, columna);
              tabla_ancho = modelo.getColumnCount() * 125; 
              tabla_alto = modelo.getRowCount() * 200; 
	      JTReporte.setPreferredSize(new Dimension( tabla_ancho, tabla_alto));
	      JTReporte.setModel(modelo); 
      }
	
    }//GEN-LAST:event_btnImportarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    this.setVisible(false);
    GuiInsumos g = new GuiInsumos(null, rootPaneCheckingEnabled);
     g.setVisible(true);
      
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnbalanceTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbalanceTotalActionPerformed
        // to obtain all the values of total polladas:
        DefaultTableModel model = (DefaultTableModel) this.JTReporte.getModel();
        int rows = model.getRowCount();
        double  countTotal = 0.0;
        double  countDeuda = 0.0;
        for(int i = 0; i < rows; i++)
        {
            countTotal += Double.parseDouble((String) model.getValueAt(i, 6));
            countDeuda += Double.parseDouble((String) model.getValueAt(i, 5));
        }
         double total = countTotal - countDeuda;
      
        //print
        JOptionPane.showMessageDialog(null, "TOTAL DE POLLOS VENDIDOS " + "\n" +
                                           " " + "\n" +
                                         "TOTAL   : S/ " + total + "\n"+
                                         "A DEUDA : S/ " + countDeuda);
    }//GEN-LAST:event_btnbalanceTotalActionPerformed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        if ( evt.getKeyCode() == KeyEvent.VK_ENTER)
            txtCantPollos.requestFocus();
    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtCantPollosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantPollosKeyPressed
        // TODO add your handling code here:
           if ( evt.getKeyCode() == KeyEvent.VK_ENTER)
            txtDeudaPollos.requestFocus();
    }//GEN-LAST:event_txtCantPollosKeyPressed

    private void txtDeudaPollosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDeudaPollosKeyPressed
        // TODO add your handling code here:
         if ( evt.getKeyCode() == KeyEvent.VK_ENTER)
            txtPrecioPollada.requestFocus();
    }//GEN-LAST:event_txtDeudaPollosKeyPressed

    private void btnAgregarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAgregarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarKeyPressed
       
    /// metodo para crear tabla ... 
    public void CrearTabla(File file) throws IOException {
		
		Workbook workbook = null;
		
		try { 
                    workbook = Workbook.getWorkbook(file); 	
	      
	      Sheet sheet = workbook.getSheet(0); 
	      columna.clear(); 
	      
		   for (int i = 0; i < sheet.getColumns(); i++) { 
			     Cell cell1 = sheet.getCell(i, 0);
			     columna.add(cell1.getContents()); 
			} 
		   filas.clear(); 
     
		    for (int j = 1; j < sheet.getRows(); j++) {
		    	
		         Vector d = new Vector(); 
		         
			    for (int i = 0; i < sheet.getColumns(); i++) {
			    	
			            Cell cell = sheet.getCell(i, j); 
			            d.add(cell.getContents());
			     }
		          d.add("\n");
		          filas.add(d); 
             } 
    
    
     }

	  catch (BiffException e) { 
		e.printStackTrace(); 
	 }
  }
    

    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(GuiMenuPollada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiMenuPollada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiMenuPollada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiMenuPollada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiMenuPollada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMenuInsumos;
    private javax.swing.JTable JTReporte;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnImportar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnbalanceTotal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCantPollos;
    private javax.swing.JTextField txtDeudaPollos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecioPollada;
    // End of variables declaration//GEN-END:variables
}

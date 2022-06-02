/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Equipo;
import modelo.Jugador;
import vista.Vista;

/**
 *
 * @author Usuario
 */
public class Control  {

//    Vista vista = null;
//    private Controlador c;
////    Equipo equipo=new Equipo();
////    Jugador jug =new Jugador();
//
//    public Control(Vista v) {
//        super();
//        vista = v;
//        actionListener(this);
//    }
//    private void actionListener(ActionListener evt) {
//        System.out.println("workin'");
//        vista.btnActualizar.addActionListener(evt);
//        vista.btnEliminar.addActionListener(evt);
//        vista.btnGuardar.addActionListener(evt);
//        vista.btnGuardar2.addActionListener(evt);
//        vista.btnGuardar3.addActionListener(evt);
//        vista.btnLimpiar.addActionListener(evt);
//        vista.btnLimpiar2.addActionListener(evt);
//        vista.btnLimpiar3.addActionListener(evt);
//        vista.btnVerEqu.addActionListener(evt);
//        vista.btnVerJug.addActionListener(evt);
//        
//    }
//    
//
//    @Override
//    public void actionPerformed(ActionEvent evt) {
//        try {
//
//            if (evt.getActionCommand().contentEquals("GUARDAR JUGADOR")) {
//
//                Jugador j = new Jugador();
//                j.setId(Integer.parseInt(vista.txtId.getText()));
//                j.setNombre(vista.txtNombre.getText());
//                j.setDorsal(Integer.parseInt(vista.txtDorsal.getText()));
//                j.setPosicion(vista.combo1.getModel().getSelectedItem().toString());
//                j.setNombreEquipo(Integer.parseInt(vista.combo2.getModel().getSelectedItem().toString()));
//                c.registrar(j);
//
//            } else if (evt.getActionCommand().contentEquals("GUARDAR")) {
//
//                Equipo e = new Equipo();
//                e.setCodigo(Integer.parseInt(vista.txtCodigo.getText()));
//                e.setNombre(vista.txtNombreE.getText());
//                e.setCapitan(vista.txtCapitan.getText());
//                c.registrarEquipo(e);
//
//                vista.combo2.addItem(String.valueOf(e.getCodigo()));
//                vista.comboLocal.addItem(String.valueOf(e.getCodigo()));
//                vista.comboVis.addItem(String.valueOf(e.getCodigo()));
//
//            } else if (evt.getActionCommand().contentEquals(vista.btnGuardar3.getActionCommand())) {
//
//                c.partidoLocal(Integer.parseInt(vista.comboLocal.getModel().getSelectedItem().toString()), Integer.parseInt(vista.txtGolesL.getText()), Integer.parseInt(vista.txtGolesV.getText()), Integer.parseInt(vista.txtTarjetasAL.getText()), Integer.parseInt(vista.txtTarjetasRL.getText()));
//                c.partidoVisitante(Integer.parseInt(vista.comboVis.getModel().getSelectedItem().toString()), Integer.parseInt(vista.txtGolesV.getText()), Integer.parseInt(vista.txtGolesL.getText()), Integer.parseInt(vista.txtTarjetasAV.getText()), Integer.parseInt(vista.txtTarjetasRV.getText()));
//
//            } else if (evt.getActionCommand().contentEquals("VER JUGADORES")) {
//
//                vista.area.setText(c.printJugadores());
//
//            } else if (evt.getActionCommand().contentEquals("ELIMINAR")) {
//
//                c.eliminarJugador(vista.txtId.getText());
//
//            } else if (evt.getActionCommand().contentEquals(vista.btnLimpiar.getActionCommand())) {
//                vista.txtCodigo.setText("");
//                vista.txtNombre.setText("");
//                vista.txtCapitan.setText("");
//
//            } else if (evt.getActionCommand().contentEquals(vista.btnLimpiar2.getActionCommand())) {
//                vista.txtId.setText("");
//                vista.txtDorsal.setText("");
//                vista.txtNombreE.setText("");
//
//            } else if (evt.getActionCommand().contentEquals(vista.btnLimpiar3.getActionCommand())) {
//                vista.txtGolesL.setText("");
//                vista.txtGolesV.setText("");
//                vista.txtTarjetasRV.setText("");
//                vista.txtTarjetasRL.setText("");
//                vista.txtTarjetasAL.setText("");
//                vista.txtTarjetasAV.setText("");
//
//            } else if (evt.getActionCommand().contentEquals("ACTUALIZAR")) {
//
//                c.actualizarJugador(Integer.parseInt(vista.txtId.getText()), vista.txtNombre.getText(), Integer.parseInt(vista.txtDorsal.getText()), vista.combo1.getModel().getSelectedItem().toString(), Integer.parseInt(vista.combo1.getModel().getSelectedItem().toString()));
//                
//            } else if (evt.getActionCommand().contentEquals("BUSCAR")) {
//
//                Jugador j = c.buscarJugador(vista.txtId.getText());
//                vista.txtNombre.setText(j.getNombre());
//                vista.txtDorsal.setText(String.valueOf(j.getDorsal()));
//                vista.combo1.setSelectedItem(j.getPosicion());
//                vista.combo2.setSelectedItem(String.valueOf(j.getCodequipo()));
//                
//            } else if (evt.getActionCommand().contentEquals("VER EQUIPOS")) {
//
//                vista.area.setText(c.prinEquipos());
//
//            }
//
//        } catch (Exception e) {
//
//        }
//    }

}

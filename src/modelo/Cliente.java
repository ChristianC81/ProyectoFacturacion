/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author chris
 */
public class Cliente {
    private int id_cliente;
    private String nombre;
    private String apellido;
    private String dni;
    private String correo;
    private String celular;
    private Date fechanacimiento;
    private ArrayList<Factura> listaFactura;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String dni, String correo, String celular, Date fechanacimiento, ArrayList<Factura> listaFactura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.correo = correo;
        this.celular = celular;
        this.fechanacimiento = fechanacimiento;
        this.listaFactura = listaFactura;
    }

    public Cliente(int id_cliente, String nombre, String apellido, String dni, String correo, String celular, Date fechanacimiento, ArrayList<Factura> listaFactura) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.correo = correo;
        this.celular = celular;
        this.fechanacimiento = fechanacimiento;
        this.listaFactura = listaFactura;
    }

    

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public ArrayList<Factura> getListaFactura() {
        return listaFactura;
    }

    public void setListaFactura(ArrayList<Factura> listaFactura) {
        this.listaFactura = listaFactura;
    }

   
    public void buscarFacturas(String dni){
        String cedulaArray;
        for (Factura Encfactura : listaFactura) {
            if(id_cliente==Encfactura.id_factura){
                System.out.println(Encfactura.id_factura);
//                for (ItemFactura detalle : listaFactura) {
//                    
//                }
//                System.out.println(factura.listaItemFactura);
            }
        }
    }
}

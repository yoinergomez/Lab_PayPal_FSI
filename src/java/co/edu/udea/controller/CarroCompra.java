/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.controller;

import co.edu.udea.entity.Producto;
import co.edu.udea.modelo.ProductoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


/**
 *
 * @author Yoiner Esteban Gomez Ayala yoiner.gomez22@gmail.com
 */
@ManagedBean(name = "cc")
@SessionScoped
public class CarroCompra {

    private List<Producto> list = new ArrayList<Producto>();
    
    
    
    /**
     * Creates a new instance of ProductoController
     */
    public CarroCompra() {
    }

    public List<Producto> getList() {
        ProductoDAO dao = new ProductoDAO();
        return dao.getAll();
    }
    
    public void setList(List<Producto> lista) {
        this.list = lista;
    }
    
    
}

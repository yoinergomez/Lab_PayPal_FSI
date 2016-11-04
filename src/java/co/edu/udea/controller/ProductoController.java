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


/**
 *
 * @author Yoiner Esteban Gomez Ayala yoiner.gomez22@gmail.com
 */
@ManagedBean(name = "productoController")
public class ProductoController {

    private List<Producto> lista = new ArrayList<Producto>();
    
    
    
    /**
     * Creates a new instance of ProductoController
     */
    public ProductoController() {
    }

    public List<Producto> getLista() {
        ProductoDAO dao = new ProductoDAO();
        return dao.getAll();
    }
    
    public void setLista(List<Producto> lista) {
        this.lista = lista;
    }
    
    
}

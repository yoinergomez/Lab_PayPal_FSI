/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.modelo;

import co.edu.udea.entity.Producto;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Yoiner Esteban Gomez Ayala yoiner.gomez22@gmail.com
 */
public class ProductoDAO {
    
    public List<Producto> getAll(){
        Session session = null;
        List<Producto> lista = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from Producto");
            lista = (List<Producto>) query.list();
        } catch(HibernateException e){
            System.out.println(e.getMessage());
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return lista;
    }
}

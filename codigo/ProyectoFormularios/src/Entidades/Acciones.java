/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidades;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author sail3
 */
public class Acciones {
    private ArrayList<Clientes> lista = new ArrayList<Clientes>();
    
    public void insertar(Clientes cliente) {
        if (buscar(cliente) == null) {
             lista.add(cliente);
             System.out.println(lista.size());
        }
    }
    public void modificar(Clientes cliente) {
        Clientes cli = this.buscar(cliente);
        if(cli != null){
            lista.remove(cli);
            lista.add(cliente);
        }
        
    }
    public Clientes buscar(Clientes cliente){
        Iterator it = lista.iterator();
        while (it.hasNext()) {
            Clientes cli = (Clientes) it.next();
            if (cli.getCodigo().equals(cliente.getCodigo())) {
                return cli;
            }
        }
        return null;
    }
    public void eliminar(Clientes cliente) {
        lista.remove(cliente);
    }
    public ArrayList<Clientes> listarTodos() {
        return lista;
    }
}

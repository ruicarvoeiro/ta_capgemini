/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CLAISA
 */
public class CatalagoColaboradores {
    
    List<Colaborador> listaColaboradores = new ArrayList<Colaborador>();
    
    public void addColaborador(Colaborador c){
        listaColaboradores.add(c);
    }
    
    public List<Colaborador> getListaColaboradores(){
        return listaColaboradores;
    } 
}

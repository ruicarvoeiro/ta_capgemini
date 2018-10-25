/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;

import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author RCARVOEI
 */
public class Meeting extends Eventos {
    
    private List<Integer> listaParticipantes = new ArrayList<Integer>();

    public Meeting(int idEvento, String descricaoEvento, Date dataEvento, Time horaEvento, String local) {
        super(idEvento, descricaoEvento, dataEvento, horaEvento, local);
    }

    public void addParticipante(int par){
        listaParticipantes.add(par);
    }

    public List<Integer> getListaParticipantes(){
        return listaParticipantes;
    }
    public void eliminarParticipante(int par){
        int auxiliar = 0;
        for(int i = 0; i<listaParticipantes.size(); i++){
            if(listaParticipantes.get(i) == par){
                auxiliar = i;
            }          
        }
        listaParticipantes.remove(auxiliar);
    }
}

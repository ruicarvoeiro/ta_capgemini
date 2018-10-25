/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.util.Pair;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author CLAISA
 */
public class File {

    JSONParser jsonParser = new JSONParser();
    private static final String caminho = "D:\\Capgemini\\Projetos\\Mestrinhos em Java\\ta_capgemini\\ficheiroV4.json";
    List<Colaborador> listaColaboradores = new ArrayList<Colaborador>();  
    

    public void readJSONFile() {
        try (FileReader reader = new FileReader(caminho)) {
            JSONObject root = (JSONObject) jsonParser.parse(reader);
            System.out.println(root);
            JSONArray listaColaboradores = (JSONArray) root.get("listaColaboradores");
            for (int i = 0; i < listaColaboradores.size(); i++) {
                JSONObject lista = (JSONObject) listaColaboradores.get(i);
                criaColaborador(lista);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(File.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ParseException ex) {
            Logger.getLogger(File.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void criaColaborador(JSONObject colaborador) {
        JSONObject newC = (JSONObject) colaborador.get("colaborador");
        
        String strNumero = (String) newC.get("numero");
        int numero = Integer.parseInt(strNumero);
        String nome = (String) newC.get("nome");
        String apelido = (String) newC.get("apelido");
        String enderecoEmail = (String) newC.get("enderecoEmail");
        //CatalagoColaboradores catColaboradores = new CatalagoColaboradores();
        Colaborador criaC = new Colaborador(numero, nome, apelido, enderecoEmail);
       
        if (criaC == null) {
            System.out.println("Ta vazio");
        }
        listaColaboradores.add(criaC);

        JSONArray listaEventos = (JSONArray) newC.get("listaEventos");

        if (!listaEventos.isEmpty()) {
            listaEventos.forEach(ev -> {
                try {
                    criaEvento(criaC, (JSONObject) ev);
                } catch (java.text.ParseException ex) {
                    Logger.getLogger(File.class.getName()).log(Level.SEVERE, null, ex);
                }
            });

        } else {
            // System.out.println(criaC.getNomeColaborador() + " nao tem eventos");     
        }

    }

    private void criaEvento(Colaborador criaC, JSONObject evento) throws java.text.ParseException {    
        JSONObject appoint = (JSONObject) evento.get("appointement");
        JSONObject meeting = (JSONObject) evento.get("meeting");

        if (appoint != null) {
            String strIdEvento = (String) appoint.get("idEvento");
            int idEvento = Integer.parseInt(strIdEvento);
            String descricaoEvento = (String) appoint.get("descricaoEvento");

            String strDataEvento = (String) appoint.get("dataEvento");
            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            Date dataEvento = formatter.parse(strDataEvento);

            String strHoraEvento = (String) appoint.get("horaEvento");
            DateFormat format2 = new SimpleDateFormat("HH:mm", Locale.ENGLISH);
            Date h = format2.parse(strHoraEvento);
            Time horaEvento = new Time(h.getTime());

            String local = (String) appoint.get("local");

            Appointment app = new Appointment(idEvento, descricaoEvento, dataEvento, horaEvento, local);
            criaC.addA(app);

        }
        Meeting metee = null;

        if (meeting != null) {

            String strIdEvento = (String) meeting.get("idEvento");
            int idEvento = Integer.parseInt(strIdEvento);
            String descricaoEvento = (String) meeting.get("descricaoEvento");

            String strDataEvento = (String) meeting.get("dataEvento");

            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

            Date dataEvento = formatter.parse(strDataEvento);

            String strHoraEvento = (String) meeting.get("horaEvento");
            DateFormat format2 = new SimpleDateFormat("HH:mm", Locale.ENGLISH);
            Date h = format2.parse(strHoraEvento);
            Time horaEvento = new Time(h.getTime());

            String local = (String) meeting.get("local");

            metee = new Meeting(idEvento, descricaoEvento, dataEvento, horaEvento, local);
            criaC.addM(metee);
            
            //participantess
        JSONArray listPar = (JSONArray) meeting.get("participantes");
        for (int i = 0; i < listPar.size(); i++) {       
                JSONObject participantes = (JSONObject) listPar.get(i);          
                trataParticipantes(participantes, metee);
            }
        }
    }
    
    public void trataParticipantes(JSONObject part, Meeting meeting){
            
            JSONObject cadaParticipante = (JSONObject) part.get("participante");
          //System.out.println(cadaParticipante);
            //String strNumero = (String) cadaParticipante.get("numero");
            //int numero = Integer.parseInt(strNumero);
            
            //ir buscar o colaborador com o numero = numero
  
               // meeting.addParticipante(numero);
         
            
    }
}

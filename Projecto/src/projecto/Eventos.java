package projecto;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Eventos {

    private int idEvento;
    private String descricaoEvento;
    private Date dataEvento;
    private Time horaEvento;
    private String local;
    private List<Colaborador> participantes;
    
    public Eventos(int idEvento, String descricaoEvento,
            Date dataEvento, Time horaEvento, String local) {
        this.idEvento = idEvento;
        this.descricaoEvento = descricaoEvento;
        this.dataEvento = dataEvento;
        this.horaEvento = horaEvento;
        this.local = local; 
    }
    public int getIdEvento() {
        return idEvento;
    }
    public String getDescricaoEvento() {
        return descricaoEvento;
    }
    public void setDescricaoEvento(String descricaoEvento) {
        this.descricaoEvento = descricaoEvento;
    }
    public Date getDataEvento() {
        return dataEvento;
    }
    public void setDataEvento(Date dataEvento) {
        this.dataEvento = dataEvento;
    }
    public Time getHoraEvento() {
        return horaEvento;
    }
    public void setHoraEvento(Time horaEvento) {
        this.horaEvento = horaEvento;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public List<Colaborador> getParticipantes() {
        return participantes;
    }
    public void setParticipantes(List<Colaborador> participantes) {
        this.participantes = participantes;
    }

   
}

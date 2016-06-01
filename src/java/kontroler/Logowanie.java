/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import model.Klient;
import org.primefaces.context.RequestContext;
import db.BusRequest;
import java.io.Serializable;

/**
 *
 * @author SKM
 */
@ManagedBean
@SessionScoped
public class Logowanie implements Serializable {

    public static Klient klient;
    public static boolean zalogowany;
    @EJB
    private BusRequest br;

    @PostConstruct
    public void init() {
        klient = new Klient();
    }

    public boolean isZalogowany() {
        return zalogowany;
    }

    public void setZalogowany(boolean zalogowany) {
        Logowanie.zalogowany = zalogowany;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        Logowanie.klient = klient;
    }

    public Logowanie() {
    }

    public void zaloguj(ActionEvent event) {
        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage message = null;
        List<Klient> listaKlientow = br.getAllKlient();
        int i;
        for (i = 0; i < listaKlientow.size(); i++) {
            if (listaKlientow.get(i).getEmail().equals(klient.getEmail()) && listaKlientow.get(i).getHaslo().equals(klient.getHaslo())) {
                Logowanie.zalogowany = true;
                klient = br.findKlientByEmail(klient.getEmail());
                message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Witaj", listaKlientow.get(i).getImie());
                break;
            }
        }
        if (!zalogowany) {
            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Błąd logowania", "Złe dane");
        }
        FacesContext.getCurrentInstance().addMessage(null, message);
        context.addCallbackParam("loggedIn", zalogowany);
    }

    public void wyloguj(ActionEvent event) {
        zalogowany = false;
        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage message;
        message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Wylogowano", klient.getImie());
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    public void usunKonto(ActionEvent event) {
        if(zalogowany){
            zalogowany = false;
            this.br.deleteKlient(klient);
            RequestContext context = RequestContext.getCurrentInstance();
            FacesMessage message;
            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Usunięto", klient.getImie());
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
    }

}

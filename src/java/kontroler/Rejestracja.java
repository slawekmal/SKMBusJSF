/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import model.Klient;
import db.BusRequest;

/**
 *
 * @author SKM
 */
@ManagedBean
@SessionScoped
public class Rejestracja implements Serializable {

    private Klient klient;
    @EJB
    private BusRequest br;

    public Klient getKlient() {
        return klient;
    }

    @PostConstruct
    public void init() {
        klient = new Klient();
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public String zarejestruj() {
        if (this.klient != null) {
            br.createKlient(this.klient);
            return "index";
        }
        else
            return "rejestracja";
    }

    public Rejestracja() {
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Kurs;
import db.KlientService;
import db.KursService;

/**
 *
 * @author SKM
 */
@ManagedBean
@SessionScoped
public class Rezerwacja implements Serializable {

    @EJB
    private KursService kursService;
    @EJB
    private KlientService klientService;

    private List<Kurs> rozklad;
    private String wybranyKierunek;
    private Kurs wybranyKurs;
    private int miejsca;

    @PostConstruct
    public void init() {
        this.rozklad = kursService.listKurs();
    }

    public Rezerwacja() {
    }

    public String getWybranyKierunek() {
        return wybranyKierunek;
    }

    public void setWybranyKierunek(String wybranyKierunek) {
        this.wybranyKierunek = wybranyKierunek;
    }

    public Kurs getWybranyKurs() {
        return wybranyKurs;
    }

    public void setWybranyKurs(Kurs wybranyKurs) {
        this.wybranyKurs = wybranyKurs;
    }

    public int getMiejsca() {
        return miejsca;
    }

    public void setMiejsca(int miejsca) {
        this.miejsca = miejsca;
    }

    public List<Kurs> getRozklad() {
        return rozklad;
    }

    public void setRozklad(List<Kurs> rozklad) {
        this.rozklad = rozklad;
    }

    public String wybierzKurs(Kurs kurs) {
        this.wybranyKurs = new Kurs();
        this.wybranyKurs.setDzien(kurs.getDzien());
        this.wybranyKurs.setGodzina(kurs.getGodzina());
        this.wybranyKurs.setId(kurs.getId());
        this.wybranyKurs.setKierunek(kurs.getKierunek());
        this.wybranyKurs.setMiejsca(kurs.getMiejsca());
        return "rezerwacja?faces-redirect=true";
    }

    public String rezerwuj() {
        if (Logowanie.zalogowany) {
            if (wybranyKurs.getMiejsca() >= miejsca) {
                wybranyKurs.setMiejsca(wybranyKurs.getMiejsca() - miejsca);
                kursService.updateKurs(wybranyKurs);
                for (int i = 0; i < miejsca; i++) {
                    Logowanie.klient.getKursy().add(wybranyKurs);
                }
                klientService.updateKlient(Logowanie.klient);
                this.rozklad = kursService.listKurs();
                return "konto?faces-redirect=true";
            }
        }
        return "rezerwacja";
    }
    public String usun(Kurs kurs){
        if(Logowanie.zalogowany){
            Logowanie.klient.getKursy().remove(kurs);
            klientService.updateKlient(Logowanie.klient);
        }
        return "konto";
    }
    
    public String wybierzRozklad(){
        if(!this.wybranyKierunek.isEmpty() && !this.wybranyKierunek.equalsIgnoreCase("Wszystkie"))
            rozklad = kursService.findKursByKierunek(wybranyKierunek);
        else
            rozklad = kursService.listKurs();
        return "rozklad";
    }
}

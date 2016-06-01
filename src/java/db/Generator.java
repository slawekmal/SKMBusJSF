/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import model.Klient;
import model.Kurs;

/**
 *
 * @author SKM
 */
@Startup
@Singleton
public class Generator {

    @EJB
    private BusRequest br;

    @PostConstruct
    public void wrzucDane() {
        if (br.getAllKlient().isEmpty()) {

            Klient admin = new Klient("Admin", "Admin", "admin@admin.com", "admin");

            Calendar pon = new GregorianCalendar();
            pon.set(2016, 6, 6);
            Calendar wt = new GregorianCalendar();
            wt.set(2016, 6, 7);
            Calendar sr = new GregorianCalendar();
            sr.set(2016, 6, 8);
            Calendar cz = new GregorianCalendar();
            cz.set(2016, 6, 9);
            Calendar pt = new GregorianCalendar();
            pt.set(2016, 6, 10);
            Calendar sb = new GregorianCalendar();
            sb.set(2016, 6, 11);
            Calendar nd = new GregorianCalendar();
            nd.set(2016, 6, 12);

            Kurs pon1 = new Kurs(pon, "6:30", 18, "Hrubieszów - Lublin");
            Kurs pon2 = new Kurs(pon, "8:00", 18, "Hrubieszów - Lublin");
            Kurs pon3 = new Kurs(pon, "9:30", 18, "Hrubieszów - Lublin");
            Kurs pon4 = new Kurs(pon, "11:00", 18, "Hrubieszów - Lublin");
            Kurs pon5 = new Kurs(pon, "13:00", 18, "Hrubieszów - Lublin");
            Kurs pon6 = new Kurs(pon, "15:00", 18, "Hrubieszów - Lublin");
            Kurs pon7 = new Kurs(pon, "16:30", 18, "Hrubieszów - Lublin");
            Kurs pon8 = new Kurs(pon, "7:30", 18, "Lublin - Hrubieszów");
            Kurs pon9 = new Kurs(pon, "9:00", 18, "Lublin - Hrubieszów");
            Kurs pon10 = new Kurs(pon, "11:00", 18, "Lublin - Hrubieszów");
            Kurs pon11 = new Kurs(pon, "13:00", 18, "Lublin - Hrubieszów");
            Kurs pon12 = new Kurs(pon, "15:00", 18, "Lublin - Hrubieszów");
            Kurs pon13 = new Kurs(pon, "16:30", 18, "Lublin - Hrubieszów");
            Kurs pon14 = new Kurs(pon, "18:00", 18, "Lublin - Hrubieszów");

            Kurs wt1 = new Kurs(wt, "6:30", 18, "Hrubieszów - Lublin");
            Kurs wt2 = new Kurs(wt, "8:00", 18, "Hrubieszów - Lublin");
            Kurs wt3 = new Kurs(wt, "9:30", 18, "Hrubieszów - Lublin");
            Kurs wt4 = new Kurs(wt, "11:00", 18, "Hrubieszów - Lublin");
            Kurs wt5 = new Kurs(wt, "13:00", 18, "Hrubieszów - Lublin");
            Kurs wt6 = new Kurs(wt, "15:00", 18, "Hrubieszów - Lublin");
            Kurs wt7 = new Kurs(wt, "16:30", 18, "Hrubieszów - Lublin");
            Kurs wt8 = new Kurs(wt, "7:30", 18, "Lublin - Hrubieszów");
            Kurs wt9 = new Kurs(wt, "9:00", 18, "Lublin - Hrubieszów");
            Kurs wt10 = new Kurs(wt, "11:00", 18, "Lublin - Hrubieszów");
            Kurs wt11 = new Kurs(wt, "13:00", 18, "Lublin - Hrubieszów");
            Kurs wt12 = new Kurs(wt, "15:00", 18, "Lublin - Hrubieszów");
            Kurs wt13 = new Kurs(wt, "16:30", 18, "Lublin - Hrubieszów");
            Kurs wt14 = new Kurs(wt, "18:00", 18, "Lublin - Hrubieszów");

            Kurs sr1 = new Kurs(sr, "6:30", 18, "Hrubieszów - Lublin");
            Kurs sr2 = new Kurs(sr, "8:00", 18, "Hrubieszów - Lublin");
            Kurs sr3 = new Kurs(sr, "9:30", 18, "Hrubieszów - Lublin");
            Kurs sr4 = new Kurs(sr, "11:00", 18, "Hrubieszów - Lublin");
            Kurs sr5 = new Kurs(sr, "13:00", 18, "Hrubieszów - Lublin");
            Kurs sr6 = new Kurs(sr, "15:00", 18, "Hrubieszów - Lublin");
            Kurs sr7 = new Kurs(sr, "16:30", 18, "Hrubieszów - Lublin");
            Kurs sr8 = new Kurs(sr, "7:30", 18, "Lublin - Hrubieszów");
            Kurs sr9 = new Kurs(sr, "9:00", 18, "Lublin - Hrubieszów");
            Kurs sr10 = new Kurs(sr, "11:00", 18, "Lublin - Hrubieszów");
            Kurs sr11 = new Kurs(sr, "13:00", 18, "Lublin - Hrubieszów");
            Kurs sr12 = new Kurs(sr, "15:00", 18, "Lublin - Hrubieszów");
            Kurs sr13 = new Kurs(sr, "16:30", 18, "Lublin - Hrubieszów");
            Kurs sr14 = new Kurs(sr, "18:00", 18, "Lublin - Hrubieszów");

            Kurs cz1 = new Kurs(cz, "6:30", 18, "Hrubieszów - Lublin");
            Kurs cz2 = new Kurs(cz, "8:00", 18, "Hrubieszów - Lublin");
            Kurs cz3 = new Kurs(cz, "9:30", 18, "Hrubieszów - Lublin");
            Kurs cz4 = new Kurs(cz, "11:00", 18, "Hrubieszów - Lublin");
            Kurs cz5 = new Kurs(cz, "13:00", 18, "Hrubieszów - Lublin");
            Kurs cz6 = new Kurs(cz, "15:00", 18, "Hrubieszów - Lublin");
            Kurs cz7 = new Kurs(cz, "16:30", 18, "Hrubieszów - Lublin");
            Kurs cz8 = new Kurs(cz, "7:30", 18, "Lublin - Hrubieszów");
            Kurs cz9 = new Kurs(cz, "9:00", 18, "Lublin - Hrubieszów");
            Kurs cz10 = new Kurs(cz, "11:00", 18, "Lublin - Hrubieszów");
            Kurs cz11 = new Kurs(cz, "13:00", 18, "Lublin - Hrubieszów");
            Kurs cz12 = new Kurs(cz, "15:00", 18, "Lublin - Hrubieszów");
            Kurs cz13 = new Kurs(cz, "16:30", 18, "Lublin - Hrubieszów");
            Kurs cz14 = new Kurs(cz, "18:00", 18, "Lublin - Hrubieszów");

            Kurs pt1 = new Kurs(pt, "6:30", 18, "Hrubieszów - Lublin");
            Kurs pt2 = new Kurs(pt, "8:00", 18, "Hrubieszów - Lublin");
            Kurs pt3 = new Kurs(pt, "9:30", 18, "Hrubieszów - Lublin");
            Kurs pt4 = new Kurs(pt, "11:00", 18, "Hrubieszów - Lublin");
            Kurs pt5 = new Kurs(pt, "13:00", 18, "Hrubieszów - Lublin");
            Kurs pt6 = new Kurs(pt, "15:00", 18, "Hrubieszów - Lublin");
            Kurs pt7 = new Kurs(pt, "16:30", 18, "Hrubieszów - Lublin");
            Kurs pt8 = new Kurs(pt, "7:30", 18, "Lublin - Hrubieszów");
            Kurs pt9 = new Kurs(pt, "9:00", 18, "Lublin - Hrubieszów");
            Kurs pt10 = new Kurs(pt, "11:00", 18, "Lublin - Hrubieszów");
            Kurs pt11 = new Kurs(pt, "13:00", 18, "Lublin - Hrubieszów");
            Kurs pt12 = new Kurs(pt, "15:00", 18, "Lublin - Hrubieszów");
            Kurs pt13 = new Kurs(pt, "16:30", 18, "Lublin - Hrubieszów");
            Kurs pt14 = new Kurs(pt, "18:00", 18, "Lublin - Hrubieszów");

            Kurs sb1 = new Kurs(sb, "6:30", 18, "Hrubieszów - Lublin");
            Kurs sb2 = new Kurs(sb, "8:00", 18, "Hrubieszów - Lublin");
            Kurs sb3 = new Kurs(sb, "9:30", 18, "Hrubieszów - Lublin");
            Kurs sb4 = new Kurs(sb, "11:00", 18, "Hrubieszów - Lublin");
            Kurs sb5 = new Kurs(sb, "13:00", 18, "Hrubieszów - Lublin");
            Kurs sb6 = new Kurs(sb, "15:00", 18, "Hrubieszów - Lublin");
            Kurs sb7 = new Kurs(sb, "16:30", 18, "Hrubieszów - Lublin");
            Kurs sb8 = new Kurs(sb, "7:30", 18, "Lublin - Hrubieszów");
            Kurs sb9 = new Kurs(sb, "9:00", 18, "Lublin - Hrubieszów");
            Kurs sb10 = new Kurs(sb, "11:00", 18, "Lublin - Hrubieszów");
            Kurs sb11 = new Kurs(sb, "13:00", 18, "Lublin - Hrubieszów");
            Kurs sb12 = new Kurs(sb, "15:00", 18, "Lublin - Hrubieszów");
            Kurs sb13 = new Kurs(sb, "16:30", 18, "Lublin - Hrubieszów");
            Kurs sb14 = new Kurs(sb, "18:00", 18, "Lublin - Hrubieszów");

            Kurs nd1 = new Kurs(nd, "6:30", 18, "Hrubieszów - Lublin");
            Kurs nd2 = new Kurs(nd, "8:00", 18, "Hrubieszów - Lublin");
            Kurs nd3 = new Kurs(nd, "9:30", 18, "Hrubieszów - Lublin");
            Kurs nd4 = new Kurs(nd, "11:00", 18, "Hrubieszów - Lublin");
            Kurs nd5 = new Kurs(nd, "13:00", 18, "Hrubieszów - Lublin");
            Kurs nd6 = new Kurs(nd, "15:00", 18, "Hrubieszów - Lublin");
            Kurs nd7 = new Kurs(nd, "16:30", 18, "Hrubieszów - Lublin");
            Kurs nd8 = new Kurs(nd, "7:30", 18, "Lublin - Hrubieszów");
            Kurs nd9 = new Kurs(nd, "9:00", 18, "Lublin - Hrubieszów");
            Kurs nd10 = new Kurs(nd, "11:00", 18, "Lublin - Hrubieszów");
            Kurs nd11 = new Kurs(nd, "13:00", 18, "Lublin - Hrubieszów");
            Kurs nd12 = new Kurs(nd, "15:00", 18, "Lublin - Hrubieszów");
            Kurs nd13 = new Kurs(nd, "16:30", 18, "Lublin - Hrubieszów");
            Kurs nd14 = new Kurs(nd, "18:00", 18, "Lublin - Hrubieszów");

            br.createKlient(admin);
            br.createKurs(pon1);
            br.createKurs(pon2);
            br.createKurs(pon3);
            br.createKurs(pon4);
            br.createKurs(pon5);
            br.createKurs(pon6);
            br.createKurs(pon7);
            br.createKurs(pon8);
            br.createKurs(pon9);
            br.createKurs(pon10);
            br.createKurs(pon11);
            br.createKurs(pon12);
            br.createKurs(pon13);
            br.createKurs(pon14);
            br.createKurs(wt1);
            br.createKurs(wt2);
            br.createKurs(wt3);
            br.createKurs(wt4);
            br.createKurs(wt5);
            br.createKurs(wt6);
            br.createKurs(wt7);
            br.createKurs(wt8);
            br.createKurs(wt9);
            br.createKurs(wt10);
            br.createKurs(wt11);
            br.createKurs(wt12);
            br.createKurs(wt13);
            br.createKurs(wt14);
            br.createKurs(sr1);
            br.createKurs(sr2);
            br.createKurs(sr3);
            br.createKurs(sr4);
            br.createKurs(sr5);
            br.createKurs(sr6);
            br.createKurs(sr7);
            br.createKurs(sr8);
            br.createKurs(sr9);
            br.createKurs(sr10);
            br.createKurs(sr11);
            br.createKurs(sr12);
            br.createKurs(sr13);
            br.createKurs(sr14);
            br.createKurs(cz2);
            br.createKurs(cz3);
            br.createKurs(cz4);
            br.createKurs(cz5);
            br.createKurs(cz6);
            br.createKurs(cz7);
            br.createKurs(cz8);
            br.createKurs(cz9);
            br.createKurs(cz10);
            br.createKurs(cz11);
            br.createKurs(cz12);
            br.createKurs(cz13);
            br.createKurs(cz14);
            br.createKurs(pt1);
            br.createKurs(pt2);
            br.createKurs(pt3);
            br.createKurs(pt4);
            br.createKurs(pt5);
            br.createKurs(pt6);
            br.createKurs(pt7);
            br.createKurs(pt8);
            br.createKurs(pt9);
            br.createKurs(pt10);
            br.createKurs(pt11);
            br.createKurs(pt12);
            br.createKurs(pt13);
            br.createKurs(pt14);
            br.createKurs(sb1);
            br.createKurs(sb2);
            br.createKurs(sb3);
            br.createKurs(sb4);
            br.createKurs(sb5);
            br.createKurs(sb6);
            br.createKurs(sb7);
            br.createKurs(sb8);
            br.createKurs(sb9);
            br.createKurs(sb10);
            br.createKurs(sb11);
            br.createKurs(sb12);
            br.createKurs(sb13);
            br.createKurs(sb14);
            br.createKurs(nd1);
            br.createKurs(nd2);
            br.createKurs(nd3);
            br.createKurs(nd4);
            br.createKurs(nd5);
            br.createKurs(nd6);
            br.createKurs(nd7);
            br.createKurs(nd8);
            br.createKurs(nd9);
            br.createKurs(nd10);
            br.createKurs(nd11);
            br.createKurs(nd12);
            br.createKurs(nd13);
            br.createKurs(nd14);
        }
    }
}

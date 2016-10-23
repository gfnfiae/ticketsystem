package de.gfn.fiae.ticketsystem.model;

import java.time.LocalDate;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Stani
 */
public class Veranstalltung {

    private final StringProperty oper;
    private final ObjectProperty<LocalDate> datum;
    private final IntegerProperty platz;
    private final StringProperty aktion;

    public Veranstalltung(String oper, String aktion) {
        this.oper = new SimpleStringProperty(oper);
        this.aktion = new SimpleStringProperty(aktion);

        this.platz = new SimpleIntegerProperty(125);
        this.datum = new SimpleObjectProperty<>(LocalDate.of(2016, 12, 23));
    }
    
    public String getOper() {
        return oper.get();
    }
    
    public void setOper(String oper) {
        this.oper.set(oper);
    }
    
    public StringProperty operProperty() {
        return oper;
    }
    
    public LocalDate getDatum() {
        return datum.get();
    }
    
    public void setDatum(LocalDate datum) {
        this.datum.set(datum);
    }
    
    public ObjectProperty<LocalDate> datumProperty() {
        return datum;
    }
    
    public int getPlatz() {
        return platz.get();
    }
    
    public void setPlatz(int platz) {
        this.platz.set(platz);
    }
    
    public IntegerProperty platzProperty() {
        return platz;
    }
    
    public String getAktion() {
        return aktion.get();
    }
    
    public void setAktion(String aktion) {
        this.aktion.set(aktion);
    }
    
    public StringProperty aktionProperty() {
        return aktion;
    }

}

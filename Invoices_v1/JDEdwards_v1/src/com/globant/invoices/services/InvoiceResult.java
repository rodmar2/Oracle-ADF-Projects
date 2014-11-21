package com.globant.invoices.services;

public class InvoiceResult {
    
    private int id;
    private int idJdedwards;
    
    public InvoiceResult() {
        super();
    }

    public void setIdJdedwards(int idJdedwards) {
        this.idJdedwards = idJdedwards;
    }

    public int getIdJdedwards() {
        return idJdedwards;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(String.format("Invoice[id: %d, idJdedwards: %d]", id, idJdedwards));
        
        return s.toString();
    }
}

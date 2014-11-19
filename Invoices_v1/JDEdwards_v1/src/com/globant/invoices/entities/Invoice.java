package com.globant.invoices.entities;

import java.util.Date;

public class Invoice {
    
    private int id;
    private int idJdedwards;
    private Date date;
    private int status;
    private int idEmployee;


    public Invoice() {
        super();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdJdedwards() {
        return idJdedwards;
    }

    public void setIdJdedwards(int idJdedwards) {
        this.idJdedwards = idJdedwards;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(String.format("Invoice[id: %d, idJdedwards: %d, date: %s, status: %d, idEmployee: %d]", id, idJdedwards, date, status, idEmployee));
        
        return s.toString();
    }

}

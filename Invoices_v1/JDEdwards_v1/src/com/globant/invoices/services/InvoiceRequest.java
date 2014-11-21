package com.globant.invoices.services;

import java.util.Date;

public class InvoiceRequest {
    private int id;    
    private Date date;
    private int status;
    
    public InvoiceRequest() {
        super();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(String.format("Invoice[id: %d, date: %s, status: %d]", id, date, status));
        
        return s.toString();
    }
}

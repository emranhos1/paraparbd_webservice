package com.eh.paraparbd.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cu_transaction_table")
public class CuTransactionTable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "transaction_table_id")
    private int transactionTableId;
    @Column(name = "transac_id")
    private int transacId;
    @Column(name = "transaction_name")
    private String transactionName;
    @Column(name = "transaction_date")
    private Date transactionDate;

    public int getTransactionTableId() {
        return transactionTableId;
    }

    public void setTransactionTableId(int transactionTableId) {
        this.transactionTableId = transactionTableId;
    }

    public int getTransacId() {
        return transacId;
    }

    public void setTransacId(int transacId) {
        this.transacId = transacId;
    }

    public String getTransactionName() {
        return transactionName;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
}

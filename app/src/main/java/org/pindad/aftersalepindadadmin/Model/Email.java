package org.pindad.aftersalepindadadmin.Model;

/**
 * Created by WIDHIYANTO NUGROHO on 30/04/2018.
 */

public class Email {

    private String id_produk, issue, created_date, created_by, status, timeEmail;

    public Email() {
    }

    public Email(String id_produk, String issue, String created_date, String created_by, String status, String timeEmail) {
        this.id_produk = id_produk;
        this.issue = issue;
        this.created_date = created_date;
        this.created_by = created_by;
        this.status = status;
        this.timeEmail = timeEmail;
    }

    public String getId_produk() {
        return id_produk;
    }

    public void setId_produk(String id_produk) {
        this.id_produk = id_produk;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTimeEmail() {
        return timeEmail;
    }

    public void setTimeEmail(String timeEmail) {
        this.timeEmail = timeEmail;
    }
}

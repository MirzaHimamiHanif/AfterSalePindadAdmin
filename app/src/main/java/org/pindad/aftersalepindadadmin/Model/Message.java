package org.pindad.aftersalepindadadmin.Model;

/**
 * Created by WIDHIYANTO NUGROHO on 28/02/2018.
 */

public class Message {

    private int id_ticket;
    private String issue;
    private String created_date;
    private String created_by;
    private String status;
    private String timeEmail;

    private String image;
    private boolean isImportant;
    private boolean isRead;
    private int color = -1;

    public Message(String timestamp, String image, boolean isImportant, boolean isRead, int color, int id_ticket, String issue, String created_date, String created_by, String status, String timeEmail) {
        this.image = image;
        this.isImportant = isImportant;
        this.isRead = isRead;
        this.color = color;
        this.id_ticket = id_ticket;
        this.issue = issue;
        this.created_date = created_date;
        this.created_by = created_by;
        this.status = status;
        this.timeEmail = timeEmail;
    }

    public Message() {
    }

    public int getId_ticket() {
        return id_ticket;
    }

    public void setId_ticket(int id_ticket) {
        this.id_ticket = id_ticket;
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

    public boolean isImportant() {
        return isImportant;
    }

    public void setImportant(boolean important) {
        isImportant = important;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}

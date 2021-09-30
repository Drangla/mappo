package com.fhtechnikum.mappo;

public class AppointmentItem {
    private int imgCategory;
    private String appointment_title;
    private String appointment_text;

    public AppointmentItem(int imgCategory, String appointment_title, String appointment_text) {
        this.imgCategory = imgCategory;
        this.appointment_title = appointment_title;
        this.appointment_text = appointment_text;
    }

    public int getImgCategory() {
        return imgCategory;
    }

    public void setImgCategory(int imgCategory) {
        this.imgCategory = imgCategory;
    }

    public String getAppointment_title() {
        return appointment_title;
    }

    public void setAppointment_title(String appointment_title) {
        this.appointment_title = appointment_title;
    }

    public String getAppointment_text() {
        return appointment_text;
    }

    public void setAppointment_text(String appointment_text) {
        this.appointment_text = appointment_text;
    }
}

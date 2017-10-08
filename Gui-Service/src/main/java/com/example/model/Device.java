package org.example.model;

public class Device {

    private String id;

    private String number;

    private String description;

    public Device(String id, String number, String description) {
        this.id = id;
        this.number = number;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Device [id=" + id + ", number=" + number + ", description=" + description + "]";
    }

}

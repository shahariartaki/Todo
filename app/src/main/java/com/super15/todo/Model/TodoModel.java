package com.super15.todo.Model;

public class TodoModel {

    private Integer id;
    private Integer alarmId;
    private String priority;
    private String title;
    private String note;
    private String date;
    private String time;
    private boolean ring;
    private boolean vibration;
    private boolean status;

    public TodoModel(Integer id, Integer alarmId, String priority, String title, String note, String date, String time, boolean ring, boolean vibration, boolean status) {
        this.id = id;
        this.alarmId = alarmId;
        this.priority = priority;
        this.title = title;
        this.note = note;
        this.date = date;
        this.time = time;
        this.ring = ring;
        this.vibration = vibration;
        this.status = status;
    }

    public TodoModel(Integer alarmId, String priority, String title, String note, String date, String time, boolean ring, boolean vibration, boolean status) {
        this.alarmId = alarmId;
        this.priority = priority;
        this.title = title;
        this.note = note;
        this.date = date;
        this.time = time;
        this.ring = ring;
        this.vibration = vibration;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(Integer alarmId) {
        this.alarmId = alarmId;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isRing() {
        return ring;
    }

    public void setRing(boolean ring) {
        this.ring = ring;
    }

    public boolean isVibration() {
        return vibration;
    }

    public void setVibration(boolean vibration) {
        this.vibration = vibration;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

package main.java.memoranda;

import main.java.memoranda.date.CalendarDate;

public class SingleEvent {
    private int type;
    private CalendarDate startDate;
    private CalendarDate endDate;
    private int period;
    private int hh;
    private int mm;
    private String text;
    private boolean workDays;
 
    // TASK 2-1 SMELL WITHIN A CLASS
    // John M. Johnson Code Smell 29 APR 2018
    // Assign 7 Task 3, Step 1
    // Long Parameter List Fixed By extracting parameter list
    // Into this object.
    public SingleEvent(int type, CalendarDate startDate, CalendarDate endDate, int period, int hh, int mm, String text,
            boolean workDays) {
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.period = period;
        this.hh = hh;
        this.mm = mm;
        this.text = text;
        this.workDays = workDays;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public CalendarDate getStartDate() {
        return startDate;
    }

    public void setStartDate(CalendarDate startDate) {
        this.startDate = startDate;
    }

    public CalendarDate getEndDate() {
        return endDate;
    }

    public void setEndDate(CalendarDate endDate) {
        this.endDate = endDate;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public int getHh() {
        return hh;
    }

    public void setHh(int hh) {
        this.hh = hh;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isWorkDays() {
        return workDays;
    }

    public void setWorkDays(boolean workDays) {
        this.workDays = workDays;
    }
}
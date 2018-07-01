package com.greenfoxacademy.restbackend.models;

import java.util.List;

public class LogJson {

    private List<Log> entries;
    private int entry_count;

    public LogJson(List<Log> logList) {
        this.entries = logList;
        this.entry_count = logList.size();
    }

    public List<Log> getEntries() {
        return entries;
    }

    public void setEntries(List<Log> entries) {
        this.entries = entries;
    }

    public int getEntry_count() {
        return entry_count;
    }

    public void setEntry_count(int entry_count) {
        this.entry_count = entry_count;
    }
}

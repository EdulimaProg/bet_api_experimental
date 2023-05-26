package com.lagadoinc.bet_api.Model;

import java.util.ArrayList;

public class ConquestStatistics {
    Integer conquestNumber;
    Boolean isAcumulated;
    String data;
    ArrayList<String> dezenas;
    ArrayList<String> dezenasSecond;
    String extraBet;
    String dezenasScheme;

    public Boolean getIsAcumulated() {
        return isAcumulated;
    }

    public void setIsAcumulated(Boolean isAcumulated) {
        this.isAcumulated = isAcumulated;
    }

    public Integer getConquestNumber() {
        return conquestNumber;
    }

    public void setConquestNumber(Integer conquestNumber) {
        this.conquestNumber = conquestNumber;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ArrayList<String> getDezenas() {
        return dezenas;
    }

    public void setDezenas(ArrayList<String> dezenas) {
        this.dezenas = dezenas;
    }

    public String getDezenasScheme() {
        return dezenasScheme;
    }

    public void setDezenasScheme(String dezenasScheme) {
        this.dezenasScheme = dezenasScheme;
    }

    @Override
    public String toString() {
        return "ConquestStatistics \nconquestNumber : " + conquestNumber + "\nAcumulou :       "
                + isAcumulated + ",\ndata :           " + data
                + ",\ndezenas :        "
                + dezenas
                + ",\ndezenasScheme :  " + dezenasScheme;
    }

    public ArrayList<String> getDezenasSecond() {
        return dezenasSecond;
    }

    public void setDezenasSecond(ArrayList<String> dezenasSecond) {
        this.dezenasSecond = dezenasSecond;
    }

    public String getExtraBet() {
        return extraBet;
    }

    public void setExtraBet(String extraBet) {
        this.extraBet = extraBet;
    }
}

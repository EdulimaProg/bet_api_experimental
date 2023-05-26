package com.lagadoinc.bet_api.Model;

import java.util.ArrayList;
import java.util.List;

import com.lagadoinc.bet_api.Model.LoteirasModels.EstadosPremiado;
import com.lagadoinc.bet_api.Model.LoteirasModels.Premiacoes;

public class LatestResultsResponse {
    String loteria;
    int concurso;
    String data;
    List<String> dezenas;
    ArrayList<String> dezenasSecondAward;
    ArrayList<Premiacoes> premiacoes;
    ArrayList<EstadosPremiado> estadosPremiados;
    boolean acumulou;
    String acumuladaProxConcurso;
    String extraBet;

    public LatestResultsResponse(String loteria, int concurso, String data, ArrayList<String> dezenas,
            ArrayList<String> dezenasSecondAward, ArrayList<Premiacoes> premiacoes,
            ArrayList<EstadosPremiado> estadosPremiados, boolean acumulou, String acumuladaProxConcurso,
            String extraBet) {
        this.loteria = loteria;
        this.concurso = concurso;
        this.data = data;
        this.dezenas = dezenas;
        this.dezenasSecondAward = dezenasSecondAward;
        this.premiacoes = premiacoes;
        this.estadosPremiados = estadosPremiados;
        this.acumulou = acumulou;
        this.acumuladaProxConcurso = acumuladaProxConcurso;
        this.extraBet = extraBet;
    }

    public String getLoteria() {
        return loteria;
    }

    public void setLoteria(String loteria) {
        this.loteria = loteria;
    }

    public int getConcurso() {
        return concurso;
    }

    public void setConcurso(int concurso) {
        this.concurso = concurso;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<String> getDezenas() {
        return dezenas;
    }

    public void setDezenas(ArrayList<String> dezenas) {
        this.dezenas = dezenas;
    }

    public ArrayList<Premiacoes> getPremiacoes() {
        return premiacoes;
    }

    public void setPremiacoes(ArrayList<Premiacoes> premiacoes) {
        this.premiacoes = premiacoes;
    }

    public ArrayList<EstadosPremiado> getEstadosPremiados() {
        return estadosPremiados;
    }

    public void setEstadosPremiados(ArrayList<EstadosPremiado> estadosPremiados) {
        this.estadosPremiados = estadosPremiados;
    }

    public boolean isAcumulou() {
        return acumulou;
    }

    public void setAcumulou(boolean acumulou) {
        this.acumulou = acumulou;
    }

    public String getAcumuladaProxConcurso() {
        return acumuladaProxConcurso;
    }

    public void setAcumuladaProxConcurso(String acumuladaProxConcurso) {
        this.acumuladaProxConcurso = acumuladaProxConcurso;
    }

    public String getExtraBet() {
        return extraBet;
    }

    public void setExtraBet(String extraBet) {
        this.extraBet = extraBet;
    }

    public List<String> getDezenasSecondAward() {
        return dezenasSecondAward;
    }

    public void setDezenasSecondAward(ArrayList<String> dezenasSecondAward) {
        this.dezenasSecondAward = dezenasSecondAward;
    }

}

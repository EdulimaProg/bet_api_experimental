package com.lagadoinc.bet_api.Model;

import java.util.List;

import com.lagadoinc.bet_api.Model.LoteirasModels.Dezenas;

public class LotoStatiscsResponse {
    String loteryName;
    String lastUpdate;
    LatestResultsResponse lastResult;
    ConquestStatistics lastResultDetails;
    List<LatestResultsResponse> pastsResults;
    List<ConquestStatistics> pastsResultsDetails;
    List<Dezenas> rankingMostAward;
    List<String> rankingMostAwardOnlyNumbers;
    List<String> rankingExtraBet;

    public String getLoteryName() {
        return loteryName;
    }

    public void setLoteryName(String loteryName) {
        this.loteryName = loteryName;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public LatestResultsResponse getLastResult() {
        return lastResult;
    }

    public void setLastResult(LatestResultsResponse lastResult) {
        this.lastResult = lastResult;
    }

    public ConquestStatistics getLastResultDetails() {
        return lastResultDetails;
    }

    public void setLastResultDetails(ConquestStatistics lastResultDetails) {
        this.lastResultDetails = lastResultDetails;
    }

    public List<LatestResultsResponse> getPastsResults() {
        return pastsResults;
    }

    public void setPastsResults(List<LatestResultsResponse> pastsResults) {
        this.pastsResults = pastsResults;
    }

    public List<ConquestStatistics> getPastsResultsDetails() {
        return pastsResultsDetails;
    }

    public void setPastsResultsDetails(List<ConquestStatistics> pastsResultsDetails) {
        this.pastsResultsDetails = pastsResultsDetails;
    }

    public List<Dezenas> getRankingMostAward() {
        return rankingMostAward;
    }

    public void setRankingMostAward(List<Dezenas> rankingMostAward) {
        this.rankingMostAward = rankingMostAward;
    }

    public List<String> getRankingMostAwardOnlyNumbers() {
        return rankingMostAwardOnlyNumbers;
    }

    public void setRankingMostAwardOnlyNumbers(List<String> rankingMostAwardOnlyNumbers) {
        this.rankingMostAwardOnlyNumbers = rankingMostAwardOnlyNumbers;
    }

    public List<String> getRankingExtraBet() {
        return rankingExtraBet;
    }

    public void setRankingExtraBet(List<String> rankingExtraBet) {
        this.rankingExtraBet = rankingExtraBet;
    }
}

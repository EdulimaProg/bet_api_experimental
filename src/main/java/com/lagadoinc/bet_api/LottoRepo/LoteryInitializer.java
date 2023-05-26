package com.lagadoinc.bet_api.LottoRepo;

import java.util.HashMap;
import java.util.Map;

import com.lagadoinc.bet_api.Model.LotoType;
import com.lagadoinc.bet_api.Services.HttpConnection;
import com.lagadoinc.bet_api.Utils.Constants;

public class LoteryInitializer {
    private HttpConnection conn = new HttpConnection();
    Map<String, LotoType> map = new HashMap<String, LotoType>();

    public LoteryInitializer() {
        System.out.println("Create " + this.getClass().getSimpleName() + " BET");

    }

    public void lotto_init() {
        initializeMap();
        createArrayperLotery();
    }

    public void initializeMap() {
        map.put("mega-sena", Constants.megasena);
        map.put("lotofacil", Constants.lotofacil);
        map.put("quina", Constants.quina);
        map.put("lotomania", Constants.lotomania);
        map.put("timemania", Constants.timemania);
        map.put("dupla-sena", Constants.duplasena);
        map.put("dia-de-sorte", Constants.diaSorte);
    }

    public void createArrayperLotery() {
        for (String lotery_name : Constants.nameLoteryList) {
            System.out.println(lotery_name);
            // for (int i = 0; i < map.get(lotery_name).getConquestQTD(); i++) {

            // }
        }
    }
}

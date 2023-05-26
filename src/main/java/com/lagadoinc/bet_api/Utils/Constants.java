package com.lagadoinc.bet_api.Utils;

import com.lagadoinc.bet_api.Model.LotoType;

public interface Constants {
        String BASE_URL = "https://loteriascaixa-api.herokuapp.com/api/";

        String MEGASENA = "mega-sena";
        String LOTOFACIL = "lotofacil";
        String QUINA = "quina";
        String LOTOMANIA = "lotomania";
        String TIMEMANIA = "timemania";
        String DUPLASENA = "dupla-sena";
        String FEDERAL = "loteria-federal";
        String DIADESORTE = "dia-de-sorte";
        String SUPERSETE = "super-sete";

        int LOTOFACILQTD = 25;
        int LOTOMANIAQTD = 100;
        int MEGASENAQTD = 60;
        int QUINAQTD = 80;
        int TIMEMANIAQTD = 80;
        int DIADESORTEQTD = 31;
        int DUPLASENAQTD = 50;

        String[] allMonths = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
                        "Outubro", "Novembro", "Dezembro" };

        String[] shortAllMonth = { "JAN", "FEV", "MAR", "ABR", "MAI", "JUN", "JUL", "AGO", "SET",
                        "OUT", "NOV", "DEZ" };

        int[] tenNumbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        static LotoType diaSorte = new LotoType(DIADESORTE, 4, 10, 10, DIADESORTE, DIADESORTEQTD, 1);
        static LotoType duplasena = new LotoType(DUPLASENA, 5, 10, 10, DUPLASENA, DUPLASENAQTD, 1);
        static LotoType lotofacil = new LotoType(LOTOFACIL, 5, 5, 5, LOTOFACIL, LOTOFACILQTD, 1);
        static LotoType lotomania = new LotoType(LOTOMANIA, 10, 10, 10, LOTOMANIA, LOTOMANIAQTD, 1);
        static LotoType megasena = new LotoType(MEGASENA, 6, 10, 10, MEGASENA, MEGASENAQTD, 1);
        static LotoType quina = new LotoType(QUINA, 8, 10, 10, QUINA, QUINAQTD, 1);
        static LotoType timemania = new LotoType(TIMEMANIA, 8, 10, 10, TIMEMANIA, TIMEMANIAQTD, 1);
        // "mega-sena",
        // "lotofacil",
        // "quina",
        // "lotomania",
        // "timemania",
        // "dupla-sena",
        // "loteria-federal",
        // "dia-de-sorte",
        // "super-sete"

        static String[] nameLoteryList = {
                        "mega-sena",
                        "lotofacil",
                        "quina",
                        "lotomania",
                        "timemania",
                        "dupla-sena",
                        "loteria-federal",
                        "dia-de-sorte",
                        "super-sete"
        };

        // Object[][] loteryMap = {
        // { "mega-sena", megasena },
        // { "lotofacil", lotofacil },
        // { "quina", quina },
        // { "lotomania", lotomania },
        // { "timemania", timemania },
        // { "dupla-sena", duplasena },
        // { "dia-de-sorte", diaSorte },
        // };
        // static Map<Object, Object> loteryObjectList = Stream.of(new Object[][] {
        //

        // }).collect(Collectors.toMap(p -> (String) p[0], p -> (Integer) p[1]));;
}
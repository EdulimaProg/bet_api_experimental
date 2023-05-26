package com.lagadoinc.bet_api;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.RemoteEndpoint.Async;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lagadoinc.bet_api.LottoRepo.LoteryInitializer;
import com.lagadoinc.bet_api.Model.LoteryConquestType;
import com.lagadoinc.bet_api.Model.LotoType;
import com.lagadoinc.bet_api.Model.LottoConquestQuantity;
import com.lagadoinc.bet_api.Services.HttpConnection;
import com.lagadoinc.bet_api.Utils.LottoTypesList;

@SpringBootApplication
@RestController
public class BetApiApplication {

	static LottoTypesList lottoTypesList;
	static LotoType lotoType;
	static LottoConquestQuantity qtd;
	static LoteryConquestType loteryConquestType;
	LoteryInitializer lotto = new LoteryInitializer();
	private HttpConnection conn = new HttpConnection();
	static Timer timer;
	static int interval;
	private static ConfigurableApplicationContext context;
	// Teste
	static ArrayList<Integer> integerList = new ArrayList<>();
	static LoteryInitializer lotery = new LoteryInitializer();

	@RequestMapping("/home")
	@ResponseBody
	public String bemVindo() {
		return "API Betfacil";
	}

	public static void main(String[] args) {
		context = SpringApplication.run(BetApiApplication.class, args);
		lotery.lotto_init();
		update();
	}

	public static void update() {
		System.out.println("Iniciando Timer");
		int delay = 1000;
		int period = 1000;
		interval = 60;

		timer = new Timer();

		timer.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				setInterval();
				// System.out.println(setInterval());
			}
		}, delay, period);
		System.out.println("update");
	}

	private static final int setInterval() {
		if (interval == 1) {

		}
		return --interval;
	}

}

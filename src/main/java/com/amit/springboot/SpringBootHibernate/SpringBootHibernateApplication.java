package com.amit.springboot.SpringBootHibernate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.amit.springboot.SpringBootHibernate.service.SoccerService;

@SpringBootApplication
public class SpringBootHibernateApplication implements CommandLineRunner {
	
    @Autowired

    SoccerService soccerService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
        soccerService.addBarcelonaPlayer("Xavi Hernandez", "Midfielder", 6);

        List<String> players = soccerService.getAllTeamPlayers(1);

        for(String player : players)

        {

            System.out.println("Introducing Barca player => " + player);

        }
		
	}
}

package com.amit.springboot.SpringBootHibernate.repository;

import org.springframework.data.repository.CrudRepository;

import com.amit.springboot.SpringBootHibernate.entity.Team;

public interface TeamRepository extends CrudRepository<Team, Long> {

	Team findByPlayers(long playerId);

}

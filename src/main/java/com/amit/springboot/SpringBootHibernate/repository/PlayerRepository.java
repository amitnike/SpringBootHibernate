package com.amit.springboot.SpringBootHibernate.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.amit.springboot.SpringBootHibernate.entity.Player;

public interface PlayerRepository extends CrudRepository<Player, Long> {

	List<Player> findByTeamId(long teamId);

}

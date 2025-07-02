package br.com.fiap.playerservice.player;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}

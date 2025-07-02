package br.com.fiap.frontendservice.player;

public record PlayerForm(
        String name,
        PlayerClass playerClass,
        int intelligence,
        int strength,
        int dexterity
) {
}

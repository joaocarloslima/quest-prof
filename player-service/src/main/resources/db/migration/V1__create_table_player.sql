CREATE TABLE player
(
    id           int NOT NULL,
    name         VARCHAR(255),
    player_class VARCHAR(255),
    intelligence INT  NOT NULL,
    strength     INT  NOT NULL,
    dexterity    INT  NOT NULL,
    CONSTRAINT pk_player PRIMARY KEY (id)
);
package dev.saif.tictactoe.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "playerId")
public class Bot extends Player {
    private Integer player_rank;
}

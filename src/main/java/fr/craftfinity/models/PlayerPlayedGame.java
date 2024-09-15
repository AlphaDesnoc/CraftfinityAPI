package fr.craftfinity.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "playerplayedgame")
public final class PlayerPlayedGame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "infinityplayer.id")
    private int infinityplayer;
    @JoinColumn(name = "infinitygame.id")
    private int gameid;
    private int playerkill;
    private int playerdead;
    private boolean havewin;

}

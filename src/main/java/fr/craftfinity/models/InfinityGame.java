package fr.craftfinity.models;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "infinitygame")
public final class InfinityGame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String servername;
    private String mapname;
    @JoinColumn(name = "gametype.id")
    private int gametypeid;
    private Timestamp starttime;
    private Timestamp endtime;

}

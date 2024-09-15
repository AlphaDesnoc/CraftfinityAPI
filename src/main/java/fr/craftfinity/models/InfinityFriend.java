package fr.craftfinity.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "infinityfriend")
public final class InfinityFriend {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "infinityplayer.id")
    private int infinityplayer;
    @JoinColumn(name = "infinityplayer.id")
    private int friendid;

}

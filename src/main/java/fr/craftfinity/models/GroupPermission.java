package fr.craftfinity.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "grouppermission")
public final class GroupPermission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "infinitygroup.id")
    private int groupid;
    @JoinColumn(name = "infinitypermission.id")
    private int permissionid;

}

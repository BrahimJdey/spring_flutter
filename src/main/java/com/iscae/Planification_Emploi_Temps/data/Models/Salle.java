package com.iscae.Planification_Emploi_Temps.data.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Salle {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "numero", nullable = false)
    private int numero;
    @Basic
    @Column(name = "place", nullable = false)
    private int place;
    @JsonIgnore
    @OneToMany(mappedBy = "salleBySalle")
    private Collection<Cours> coursById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public Collection<Cours> getCoursById() {
        return coursById;
    }

    public void setCoursById(Collection<Cours> coursById) {
        this.coursById = coursById;
    }
}

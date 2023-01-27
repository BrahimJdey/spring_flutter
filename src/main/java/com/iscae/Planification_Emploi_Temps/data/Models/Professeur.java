package com.iscae.Planification_Emploi_Temps.data.Models;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Professeur {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "nom", nullable = false, length = 10)
    private String nom;
    @Basic
    @Column(name = "prenom", nullable = false, length = 10)
    private String prenom;
    @Basic
    @Column(name = "email", nullable = true, length = 50)
    private String email;
    @OneToMany(mappedBy = "professeurByProfesseur")
    private Collection<Heuretravailleparjour> heuretravailleparjoursById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Collection<Heuretravailleparjour> getHeuretravailleparjoursById() {
        return heuretravailleparjoursById;
    }

    public void setHeuretravailleparjoursById(Collection<Heuretravailleparjour> heuretravailleparjoursById) {
        this.heuretravailleparjoursById = heuretravailleparjoursById;
    }
}

package com.iscae.Planification_Emploi_Temps.data.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Collection;
@Entity
public class Matiere {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "nom", nullable = false, length = 50)
    private String nom;
    @Basic
    @Column(name = "heures", nullable = false)
    private int heures;
    @Basic
    @Column(name = "filiere", nullable = false)
    private int filiere;
    @OneToMany(mappedBy = "matiereByMatiere")
    private Collection<Cours> coursById;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "filiere", referencedColumnName = "id", nullable = false,updatable = false,insertable = false)
    private Filiere filiereByFiliere;

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

    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    public int getFiliere() {
        return filiere;
    }

    public void setFiliere(int filiere) {
        this.filiere = filiere;
    }

    public Collection<Cours> getCoursById() {
        return coursById;
    }

    public void setCoursById(Collection<Cours> coursById) {
        this.coursById = coursById;
    }

    public Filiere getFiliereByFiliere() {
        return filiereByFiliere;
    }

    public void setFiliereByFiliere(Filiere filiereByFiliere) {
        this.filiereByFiliere = filiereByFiliere;
    }
}

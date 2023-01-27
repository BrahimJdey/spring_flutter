package com.iscae.Planification_Emploi_Temps.data.Models;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Filiere {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "nom", nullable = false, length = 50)
    private String nom;
    @Basic
    @Column(name = "niveau", nullable = false, length = 10)
    private String niveau;
    @Basic
    @Column(name = "anne", nullable = false, length = 50)
    private String anne;
    @Basic
    @Column(name = "Semestre", nullable = true)
    private Byte semestre;
    @Basic
    @Column(name = "Semestre_Debit", nullable = true, length = 15)
    private String semestreDebit;
    @Basic
    @Column(name = "Semestre_Fin", nullable = true, length = 15)
    private String semestreFin;
    @OneToMany(mappedBy = "filiereByFiliere")
    private Collection<Matiere> matieresById;

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

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getAnne() {
        return anne;
    }

    public void setAnne(String anne) {
        this.anne = anne;
    }

    public Byte getSemestre() {
        return semestre;
    }

    public void setSemestre(Byte semestre) {
        this.semestre = semestre;
    }

    public String getSemestreDebit() {
        return semestreDebit;
    }

    public void setSemestreDebit(String semestreDebit) {
        this.semestreDebit = semestreDebit;
    }

    public String getSemestreFin() {
        return semestreFin;
    }

    public void setSemestreFin(String semestreFin) {
        this.semestreFin = semestreFin;
    }

    public Collection<Matiere> getMatieresById() {
        return matieresById;
    }

    public void setMatieresById(Collection<Matiere> matieresById) {
        this.matieresById = matieresById;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author benje
 */
public class EspritArrayList implements University {

    private List<Etudiant> ls;

    public EspritArrayList() {

        ls = new ArrayList<Etudiant>();
    }

    @Override
    public void ajouterEtudiant(Etudiant e) {
        ls.add(e);

    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return ls.contains(e);

    }

    @Override
    public boolean rechercherEtudiant(String nom) {

        
        for(int i =0; i<ls.size(); i++){
            if (ls.get(i).getNom().equals(nom)) return true;
        }
        return false;

    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        ls.remove(e);

    }

    @Override
    public void displayEtudiants() {
        for (Etudiant e : ls) {
            System.out.println(e.toString());
        }

        //System.out.println(ls);
    }

    @Override
    public void trierEtudiantsParId() {

        Collections.sort(ls);
    }

    @Override
    public void trierEtudiantsParNom() {

        Collections.sort(ls, new ComparerNom());

    }

}


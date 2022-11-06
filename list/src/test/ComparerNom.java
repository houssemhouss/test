/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Comparator;

/**
 *
 * @author benje
 */
public class ComparerNom implements Comparator<Etudiant> {

    @Override
    public int compare(Etudiant e1, Etudiant e2) {

        return e1.getNom().compareTo(e2.getNom());

    }

}

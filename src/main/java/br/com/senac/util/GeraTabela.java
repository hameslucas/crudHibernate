/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.util;

import javax.persistence.*;

/**
 *
 * @author Silvio
 */
public class GeraTabela {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("senac_pu");
        emf.close();
    }
}
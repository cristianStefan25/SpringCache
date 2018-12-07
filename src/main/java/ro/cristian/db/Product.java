/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.cristian.db;

import java.io.Serializable;

/**
 *
 * @author cnastase
 */
public class Product implements Serializable {

    private String serie;

    public Product() {
    }

    public Product(String serie) {
        this.serie = serie;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

}

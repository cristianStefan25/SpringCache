/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.cristian.dao;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import ro.cristian.db.Product;

/**
 *
 * @author cnastase
 */
@Repository
public class ProductDao {

    @Cacheable(value = "myCache", key = "#serie")
    public Product adaugaProduct(String serie) {
        Product p = new Product();
        p.setSerie(serie);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Se obtine produsul");
        return p;
    }

}

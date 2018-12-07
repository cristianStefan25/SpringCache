/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.cristian.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.cristian.dao.ProductDao;
import ro.cristian.db.Product;

/**
 *
 * @author cnastase
 */
@Service
public class ProductService {

    @Autowired
    private ProductDao dao;

    public void getProductThreeTimes() {
        Product p1 = dao.adaugaProduct("12345");
        Product p2 = dao.adaugaProduct("12345");
        Product p3 = dao.adaugaProduct("12345");
    }

}

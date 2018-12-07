/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.cristian.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.cristian.config.ProjectConfig;
import ro.cristian.service.ProductService;

/**
 *
 * @author cnastase
 */
public class Main {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            ProductService service = context.getBean(ProductService.class);

            long t1 = System.currentTimeMillis();
            service.getProductThreeTimes();
            long t2 = System.currentTimeMillis();
            System.out.println("Durata: " + (t2 - t1));
        }
    }
}

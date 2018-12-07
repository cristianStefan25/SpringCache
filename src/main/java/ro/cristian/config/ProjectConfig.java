/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.cristian.config;

import net.sf.ehcache.CacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;

/**
 *
 * @author cnastase
 */
@Configuration
@EnableCaching
@ComponentScan("ro.cristian.*")
public class ProjectConfig {

    @Bean
    public EhCacheManagerFactoryBean ehcache() {
        EhCacheManagerFactoryBean ehCacheManagerFactoryBean
                = new EhCacheManagerFactoryBean();
        ehCacheManagerFactoryBean.setConfigLocation(new FileSystemResource("C:\\Users\\cnastase\\Documents\\NetBeansProjects\\SpringCache\\src\\main\\java\\ro\\cristian\\config\\ehcache.xml"));
        return ehCacheManagerFactoryBean;
    }

    @Bean
    @Autowired
    public EhCacheCacheManager cacheManager(CacheManager cm) {
        return new EhCacheCacheManager(cm);
    }

}

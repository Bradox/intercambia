package org.socialnetwork.test.db.dao;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.socialnetwork.db.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.runners.BlockJUnit4ClassRunner;

	@RunWith(SpringJUnit4ClassRunner.class)
	@ContextConfiguration(locations = {
	    "classpath:intercambia-servlet-test.xml"
	})
	public class UserDaoTest {
	 
	     /** La anotacion Autowired inyecta automaticamente el bean de acuerdo a su tipo */
	     @Autowired
	     private UserDao invasorBo;
	 
	     /** Busca un invasor por su identificador unico */
	     @Test
	     public void buscar() {
	         System.out.println("testBuscar");
	    }
}

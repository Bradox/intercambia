package org.socialnetwork.test.db.dao;

import org.hibernate.SessionFactory;
import org.socialnetwork.db.beans.User;
import org.socialnetwork.db.dao.UserDao;
import org.socialnetwork.db.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import static org.junit.Assert.*;

	@RunWith(SpringJUnit4ClassRunner.class)
	@ContextConfiguration(locations = {
	    "classpath:intercambia-servlet-test.xml"
	})
	
public class UserDaoTest {
	 	 @Autowired
		 protected UserDao userDao;
	     /** Busca un invasor por su identificador unico */
	     @Test
	     public void buscar() {
	    	 User user = new User();
	    	 user.setId(new Long(1));
	    	 user.setName("Alejandro");
	    	 user.setLastName("Alves");
	    	 user.setNickName("puta");
	    	 userDao.create(user);
	    	 
	    	 User testUser=userDao.read(new Long(1));
	    	 assertEquals(testUser.getName(),user.getName());
	    	 userDao.delete(userDao.read(new Long(1)));
	    	 testUser=userDao.read(new Long(1));
	    	 assertNull(testUser);
	    	 System.out.println("testBuscar");
	    }
	     
	    public void setUserDao(UserDao userDao)
	    {
	    	this.userDao=userDao;
	    }
}

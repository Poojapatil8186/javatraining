package com.example.studentdemo;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import org.springframework.stereotype.Repository;


@Repository
public class MyRepository {
@PersistenceUnit
private EntityManagerFactory emf;
void getData(){
EntityManager em;
em=emf.createEntityManager();

// update
em.getTransaction().begin();
String jsql=" ";
jsql="update Student e set e.name='testing'"+" where e.id=01";
javax.persistence.Query q;
q= em.createQuery(jsql);
q.executeUpdate();
em.getTransaction().commit();
	
}

}

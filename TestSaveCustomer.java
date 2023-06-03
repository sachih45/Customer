package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveCustomer {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sachin");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Customer Customer=new Customer();
		Customer.setId(111);
		Customer.setName("sachin");
		Customer.setEmail("sach@gmail");
		Customer.setPhno(987654321l);
		Customer.setAddress("BENGALURU");
		
		
		Customer Customer1=new Customer();
		Customer1.setId(222);
		Customer1.setName("vaishu");
		Customer1.setEmail("vaishu@gmail");
		Customer1.setPhno(9876543521l);
		Customer1.setAddress("MYSURU");
		
		entityTransaction.begin();
		entityManager.persist(Customer);
		entityManager.persist(Customer1);
		entityTransaction.commit();
		
		
		
		

	}

}

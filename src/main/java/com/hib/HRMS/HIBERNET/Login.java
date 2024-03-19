package com.hib.HRMS.HIBERNET;

import javax.persistence.EntityManager;

public class Login {
    private EntityManager entityManager;

    public Login(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public boolean authenticateUser(String username, String password) {
        TypedQuery<Employee> query = entityManager.createQuery(
            "SELECT e FROM Employee e WHERE e.username = :username AND e.password = :password",
            Employee.class
        );
        query.setParameter("username", username);
        query.setParameter("password", password);
        try {
            Employee employee = query.getSingleResult();
            return employee != null;
        } catch (NoResultException ex) {
            return false;
        }
    }
}

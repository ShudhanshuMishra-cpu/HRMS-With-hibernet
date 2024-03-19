package com.hib.HRMS.HIBERNET;

public class Register {
    private EntityManager entityManager;

    public Register(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void registerEmployee(Employee employee) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(employee);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
}

package be.entity.repository;

import be.entity.model.Category;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CategoryRepository {

    private EntityManager em;
    private EntityManagerFactory emf;

    public CategoryRepository() {
        this.emf = Persistence.createEntityManagerFactory("database-configuration");
        this.em = emf.createEntityManager();
    }

    public Category findById(int id) {
        return em.find(Category.class, id);
    }
    public Category addCategory(Category category) {
        em.getTransaction().begin();
        em.merge(category);
        em.getTransaction().commit();
        return category;
    }
    public Category updateCategory(Category category) {
        em.getTransaction().begin();
        em.merge(category);
        em.getTransaction().commit();
        return category;
    }
    public void deleteCategory(Category category) {
        em.getTransaction().begin();
        em.remove(category);
        em.getTransaction().commit();
    }
    public void close() {
        em.close();
        emf.close();
    }
}

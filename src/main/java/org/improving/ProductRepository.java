package org.improving;

import org.improving.database.JPAUtility;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class ProductRepository {
    private final List<Product> products = getProductList();

    public static List<Product> getProductList() {
        EntityManager em = JPAUtility.getEntityManager();
        String query = "select p from Product as p where p.id is not null";
        TypedQuery<Product> tq = em.createQuery(query, Product.class);
        List<Product> products;
        try {
            products = tq.getResultList();
            return products;
        } catch (NoResultException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public Product getProduct(int id) {
        EntityManager em = JPAUtility.getEntityManager();
        // :productId is a paramaterized query
        String query = "select p from Product p where p.id = :Id";

        TypedQuery<Product> tq = em.createQuery(query, Product.class);
        tq.setParameter("Id", id);
        Product product;
        try {
            product = tq.getSingleResult();
            return product;
        } catch (NoResultException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public List<Product> getProducts() {
        return products;
    }
}

package aplicativo;

import dominio.Pessoa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;

public class Programa {
    public static void main(String[] args) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        Pessoa p = em.find(Pessoa.class, 2);
        System.out.println(p);

        System.out.println("Pronto!");
        em.close();
        emf.close();


    }
}

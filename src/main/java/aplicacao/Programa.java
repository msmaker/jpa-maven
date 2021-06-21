package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(null, "Marco", "marco@gmail.com");
		Pessoa p2 = new Pessoa(null, "Dayana", "Daya@gmail.com");
		Pessoa p3 = new Pessoa(null, "Alexandre", "aLe@gmail.com");
		Pessoa p4 = new Pessoa(null, "Aline", "aline@gmail.com");

		// gerando a comunica��o com o banco de dados
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		// necessario iniciar uma transa��o
		em.getTransaction().begin();

		// persistindo ou salvando informa��o no banco de dados
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);

		// efetuando a transa��o
		em.getTransaction().commit();
		System.out.println("Pronto");

	}

}

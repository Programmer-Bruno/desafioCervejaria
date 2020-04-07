package com.qintess.desafio.cervejaria.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.qintess.desafio.cervejaria.modelo.Cerveja;
import com.qintess.desafio.cervejaria.modelo.Cidade;
import com.qintess.desafio.cervejaria.modelo.Cliente;
import com.qintess.desafio.cervejaria.modelo.Estado;
import com.qintess.desafio.cervejaria.modelo.Estilo;
import com.qintess.desafio.cervejaria.modelo.Grupo;
import com.qintess.desafio.cervejaria.modelo.ItemVenda;
import com.qintess.desafio.cervejaria.modelo.Permissao;
import com.qintess.desafio.cervejaria.modelo.Usuario;
import com.qintess.desafio.cervejaria.modelo.Venda;

public class HibernateConfig {

	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		
		if (sessionFactory == null) {
			
			try{
				
				Configuration configuration = new Configuration();
				Properties prop = new Properties();
				prop.put(Environment.DRIVER, "org.h2.Driver");
				prop.put(Environment.URL, "jdbc:h2:~/db_desafio_cervejaria");
				prop.put(Environment.USER, "sa");
				prop.put(Environment.PASS, "");
				prop.put(Environment.DIALECT, "org.hibernate.dialect.H2Dialect");
				
				prop.put(Environment.SHOW_SQL, "true");
				prop.put(Environment.HBM2DDL_AUTO, "create-drop");
				
				configuration.setProperties(prop);
				
				configuration.addAnnotatedClass(Cerveja.class);
				configuration.addAnnotatedClass(Cidade.class);
				configuration.addAnnotatedClass(Cliente.class);
				configuration.addAnnotatedClass(Estado.class);
				configuration.addAnnotatedClass(Estilo.class);
				configuration.addAnnotatedClass(Grupo.class);
				configuration.addAnnotatedClass(ItemVenda.class);
				configuration.addAnnotatedClass(Permissao.class);
				configuration.addAnnotatedClass(Usuario.class);
				configuration.addAnnotatedClass(Venda.class);
				
				StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties())
						.build();

				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}
}

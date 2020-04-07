package com.qintess.desafio.cervejaria.executa;

import com.qintess.desafio.cervejaria.dao.DAO;
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

public class Principal 
{
    public static void main( String[] args )
    {
    	DAO<Cerveja> cervejaDAO = new DAO<Cerveja>();
        DAO<Cidade> cidadeDAO = new DAO<Cidade>();
    	DAO<Cliente> clienteDAO = new DAO<Cliente>();
        DAO<Estado> estadoDAO = new DAO<Estado>();
    	DAO<Estilo> estiloDAO = new DAO<Estilo>();
    	DAO<Grupo> grupoDAO = new DAO<Grupo>();
    	DAO<ItemVenda> itemVendaDAO = new DAO<ItemVenda>();
    	DAO<Permissao> permissaoDAO = new DAO<Permissao>();
    	DAO<Usuario> usuarioDAO = new DAO<Usuario>();
    	DAO<Venda> vendaDAO = new DAO<Venda>();

    	
        Estado saoPaulo = new Estado("São Paulo", "SP");
        estadoDAO.insere(saoPaulo);
        
        Cidade carapicuiba = new Cidade("CARAPICUIBA", saoPaulo);
        cidadeDAO.insere(carapicuiba);
        
        Cliente jose = new Cliente("José", "Física", "234.321.456-65", 
        		"11-98767-6742", "jose@gmail.com", "Ariston", "62", 
        		"AP 33", "06453-190", carapicuiba);
        clienteDAO.insere(jose);

        Estilo americanLager = new Estilo("American Lager");
        estiloDAO.insere(americanLager);
        
        Cerveja heineken = new Cerveja("AB12CD", "Heineken", "Brinde do bem", 
        	     8.00, 32.00, 0.50, "Tradicional", "Amsterdã, Países Baixos", 
        	     americanLager, 1000);
        cervejaDAO.insere(heineken);
        
        Permissao permissao = new Permissao("Permissão 01");
        
        
        Grupo grupo = new Grupo("Grupo 01");
        permissao.getGrupos().add(grupo);
        grupo.getPermissoes().add(permissao);
        
        Usuario userJosafa = new Usuario("Josafa", "josafa@gmail.com", "jofa123", 1, "12-10-1983");
        userJosafa.getGrupos().add(grupo);
        grupo.getUsuarios().add(userJosafa);
        
        permissaoDAO.insere(permissao);
        usuarioDAO.insere(userJosafa);
        grupoDAO.insere(grupo);
        
        Venda venda = new Venda(10.00, 10.00, "Realizada", 
        		"Sem observação", "08-04-2020 12:30", jose, userJosafa);
        
        ItemVenda itemVenda = new ItemVenda(2, heineken, venda);
        venda.setVenda(itemVenda);
        
        vendaDAO.insere(venda);
        itemVendaDAO.insere(itemVenda);
        
    }
}

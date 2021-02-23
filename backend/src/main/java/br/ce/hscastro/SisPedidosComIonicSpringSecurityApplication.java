package br.ce.hscastro;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.ce.hscastro.domain.Categoria;
import br.ce.hscastro.domain.Endereco;
import br.ce.hscastro.domain.Pedido;
import br.ce.hscastro.domain.Produto;
import br.ce.hscastro.repositories.CategoriaRepository;
import br.ce.hscastro.repositories.ProdutoRepository;

@SpringBootApplication
public class SisPedidosComIonicSpringSecurityApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public void initializer() {
		System.out.println("test application");
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		Categoria cat3 = new Categoria(null, "Cama, mesa e banho");
//		Categoria cat4 = new Categoria(null, "Eletrônicos");
//		Categoria cat5 = new Categoria(null, "Jardinagem");
//		Categoria cat6 = new Categoria(null, "Decoração");
//		Categoria cat7 = new Categoria(null, "Perfumaria");		
		
		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 1200.00);
		Produto p3 = new Produto(null, "Mouse", 22.00);
//		Produto p4 = new Produto(null, "Mesa de escritório", 300.00);
//		Produto p5 = new Produto(null, "Papel ofício", 23.00);
//		Produto p6 = new Produto(null, "Toalha", 29.99);
//		Produto p7 = new Produto(null, "Pendente", 128.00);
//		Produto p8 = new Produto(null, "Shampoo", 16.90);
//		Produto p9 = new Produto(null, "TV true color", 1600.00);
//		Produto p10 = new Produto(null, "Abajour",60.00);
//		Produto p11 = new Produto(null, "Ventilador", 120.00);	
//		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat1.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));		
		
		
		categoriaRepository.save(cat1);
		categoriaRepository.save(cat2);
		categoriaRepository.save(cat3);
		produtoRepository.save(p1);
		produtoRepository.save(p2);
		produtoRepository.save(p3);	
		
		Endereco e1 = new Endereco();
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		 
		//Pedido ped1 = new Pedido(null, sdf.parse("22/02/2021 22:10"), cat1, e1);
		
		//ItemPedido ip1 = new ItemPedido();
		
	}

	public static void main(String[] args) {
		SpringApplication.run(SisPedidosComIonicSpringSecurityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		initializer();		
	}

}

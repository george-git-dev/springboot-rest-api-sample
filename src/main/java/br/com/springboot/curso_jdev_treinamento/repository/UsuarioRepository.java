package br.com.springboot.curso_jdev_treinamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.springboot.curso_jdev_treinamento.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{ //interface que herda do JPA, passando como parametro a tabela usuario e o tipo da primary key

}

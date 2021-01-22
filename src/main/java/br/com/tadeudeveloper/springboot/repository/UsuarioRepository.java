package br.com.tadeudeveloper.springboot.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.tadeudeveloper.springboot.model.Usuario;

@Repository
@Transactional
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
	
	@Query("select u from Usuario u where u.login = ?1")
	public Usuario findByLogin(String login);

}

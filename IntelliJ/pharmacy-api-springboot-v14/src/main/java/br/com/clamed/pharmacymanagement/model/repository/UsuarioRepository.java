package br.com.clamed.pharmacymanagement.model.repository;

import br.com.clamed.pharmacymanagement.model.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
    @Query(value="select * from usuario where login like %?1%", nativeQuery = true)
    ArrayList<UsuarioEntity> getUsuarioEntityByEmail(String login);

    @Query("select u from UsuarioEntity u where u.login = ?1")
    UsuarioEntity findUserByLogin(String login);
}

package com.compras.simulador.repository;

import com.compras.simulador.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}

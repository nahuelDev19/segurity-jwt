package com.nahuel.seguridad.segurityjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nahuel.seguridad.segurityjwt.entitys.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

    

}

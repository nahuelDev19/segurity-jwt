package com.nahuel.seguridad.segurityjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nahuel.seguridad.segurityjwt.entitys.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long>{

    


}

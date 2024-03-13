package com.nahuel.seguridad.segurityjwt.entitys;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;
    //el FetchTyoe genera que cuando llamamos al usuario nos retorne todos sus roles
    //el cascadeType.all permite que cuando se borre un usuario se borre toda su informacion
    //JoinTable asignamos el nombre de la tecera tabla donde se asignan los id de role y user
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "usuario_roles", joinColumns = @JoinColumn(name="user_id", referencedColumnName = "id")
    , inverseJoinColumns = @JoinColumn(name= "role_id", referencedColumnName = "id") )
    private List<Role> roles= new ArrayList<>();

}

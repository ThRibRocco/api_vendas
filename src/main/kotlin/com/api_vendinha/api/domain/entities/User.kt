package com.api_vendinha.api.domain.entities

import jakarta.persistence.*

// Marca a classe como uma entidade JPA que será mapeada para uma tabela no banco de dados.
// Define que a entidade é associada à tabela "users".
@Table(name = "users")
@Entity
data class User (
    // Marca o campo id como a chave primária da entidade.
    // A geração automática do valor do id é gerenciada pelo banco de dados.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    val id: Long? = null, // O id pode ser nulo inicialmente antes de ser atribuído pelo banco de dados.

    // Define a coluna "name" na tabela, onde será armazenado o nome do usuário.
    @Column(name = "name")
    var name: String, // O nome do usuário é uma string não nula.

    @Column(name = "email")
    var email:String,

    @Column(name = "password")
    var password:String,

    @Column(name = "cpf_cnpj")
    var cpf_cnpj:String,

    @Column(name = "is_active")
    var is_active: Boolean,

    @OneToMany(mappedBy = "user")
    var produtos: List<Produto>? = arrayListOf()
)

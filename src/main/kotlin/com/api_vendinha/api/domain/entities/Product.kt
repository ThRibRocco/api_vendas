package com.api_vendinha.api.domain.entities
import jakarta.persistence.*


@Table(name = "produtos")
@Entity
data class Produto (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    val id: Long? = null, // O id pode ser nulo inicialmente antes de ser atribuído pelo banco de dados.

    // Define a coluna "name" na tabela, onde será armazenado o nome do usuário.
    @Column(name = "preco")
    var preco: Float, // O nome do usuário é uma string não nula.

    @Column(name = "quantidade")
    var quantidade: Int,

    @ManyToOne
    @JoinColumn(name = "user_id")
    var user: User? = null,
)
package com.api_vendinha.api.domain.entities;
import jakarta.persistence.*;

@Table(name = "Vendas")
@Entity
data class Venda(
    // Marca o campo id como a chave primária da entidade.
    // A geração automática do valor do id é gerenciada pelo banco de dados.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    val id: Long? = null,

    @Column(name = "total_compra")
    var total_compra: Float,

    @ManyToOne
    @JoinColumn(name = "user_id")
    var user: User? = null,

    @ManyToOne
    @JoinColumn(name = "produto_id")
    var produto: Produto? = null


)
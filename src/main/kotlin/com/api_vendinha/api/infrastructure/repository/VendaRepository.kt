package com.api_vendinha.api.infrastructure.repository

import com.api_vendinha.api.domain.entities.Venda
import org.springframework.data.repository.CrudRepository

// Define um repositório para a entidade User, estendendo a interface CrudRepository do Spring Data JPA.
// O repositório fornece operações CRUD (Create, Read, Update, Delete) para a entidade User.
interface VendaRepository : CrudRepository<Venda, Long>
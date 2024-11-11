package com.api_vendinha.api.domain.dtos.response

// Define um DTO (Data Transfer Object) que é usado para transportar dados de resposta relacionados a um usuário.
data class UserResponseDto(
    // Propriedade que armazena o ID do usuário. Pode ser nulo (Long?).
    val id: Long?,
    // Propriedade que armazena o nome do usuário. É uma string não nula.
    val name: String,
    val email: String,
    val password: String,
    val cpf_cnpj: String,
    val is_active: Boolean
)
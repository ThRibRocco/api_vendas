package com.api_vendinha.api.domain.dtos.response

import com.api_vendinha.api.domain.entities.User

data class ProdutoResponseDto(

    val id: Long?,
    val preco: Float,
    val quantidade: Int,
    val user: UserResponseDto,
)
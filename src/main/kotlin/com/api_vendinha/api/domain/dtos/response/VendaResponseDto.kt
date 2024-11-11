package com.api_vendinha.api.domain.dtos.response;

data class VendaResponseDto (
    val id: Long?,
    val total_compra: Float,
    val user: UserResponseDto,
    val produto: ProdutoResponseDto,
)

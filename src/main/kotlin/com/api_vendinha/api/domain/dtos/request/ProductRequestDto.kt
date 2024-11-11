package com.api_vendinha.api.domain.dtos.request

data class PodutoRequestDto(
    val preco: Float,
    val quantidade: Int,
    val user: Long,
)
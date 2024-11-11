package com.api_vendinha.api.domain.dtos.request;

data class VendaRequestDto (
    val total_compra: Float,
    val user: Long,
    val produto: Long,
)
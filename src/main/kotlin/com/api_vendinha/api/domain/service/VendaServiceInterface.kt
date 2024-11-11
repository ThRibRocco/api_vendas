package com.api_vendinha.api.domain.service

import com.api_vendinha.api.domain.dtos.request.VendaRequestDto
import com.api_vendinha.api.domain.dtos.response.VendaResponseDto

interface VendaServiceInterface {
    fun save(vendaRequestDto: VendaRequestDto): VendaResponseDto

}
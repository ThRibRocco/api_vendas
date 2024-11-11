package com.api_vendinha.api.domain.service

import com.api_vendinha.api.domain.dtos.request.PodutoRequestDto
import com.api_vendinha.api.domain.dtos.request.UserRequestDto
import com.api_vendinha.api.domain.dtos.response.ProdutoResponseDto
import com.api_vendinha.api.domain.dtos.response.UserResponseDto

interface ProdutoServiceInterface {
    fun save(podutoRequestDto: PodutoRequestDto): ProdutoResponseDto

}
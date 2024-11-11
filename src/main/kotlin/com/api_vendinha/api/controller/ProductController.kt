package com.api_vendinha.api.controller

import com.api_vendinha.api.domain.dtos.request.PodutoRequestDto
import com.api_vendinha.api.domain.dtos.request.UserRequestDto
import com.api_vendinha.api.domain.dtos.response.ProdutoResponseDto
import com.api_vendinha.api.domain.dtos.response.UserResponseDto
import com.api_vendinha.api.domain.service.ProdutoServiceInterface
import com.api_vendinha.api.domain.service.UserServiceInterface
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/prodtudo")
class ProdutoController (
    val produtoServiceInterface: ProdutoServiceInterface
) {

    @PostMapping("/save")
    fun save(@RequestBody podutoRequestDto: PodutoRequestDto) : ProdutoResponseDto {
        return produtoServiceInterface.save(podutoRequestDto)
    }

}
package com.api_vendinha.api.controller

import com.api_vendinha.api.domain.dtos.request.PodutoRequestDto
import com.api_vendinha.api.domain.dtos.request.VendaRequestDto
import com.api_vendinha.api.domain.dtos.response.ProdutoResponseDto
import com.api_vendinha.api.domain.dtos.response.VendaResponseDto
import com.api_vendinha.api.domain.service.VendaServiceInterface
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/venda")
class VendaController (
    val vendaServiceInterface: VendaServiceInterface
) {

    @PostMapping("/save")
    fun save(@RequestBody vendaRequestDto: VendaRequestDto) : VendaResponseDto {
        return vendaServiceInterface.save(vendaRequestDto)
    }

}
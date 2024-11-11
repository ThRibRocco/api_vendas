package com.api_vendinha.api.domain.service

import com.api_vendinha.api.domain.dtos.request.PodutoRequestDto
import com.api_vendinha.api.domain.dtos.request.UserRequestDto
import com.api_vendinha.api.domain.dtos.response.ProdutoResponseDto
import com.api_vendinha.api.domain.dtos.response.UserResponseDto
import com.api_vendinha.api.domain.entities.Produto
import com.api_vendinha.api.domain.entities.User
import com.api_vendinha.api.infrastructure.repository.ProdutoRepository
import com.api_vendinha.api.infrastructure.repository.UserRepository
import org.springframework.stereotype.Service

// Marca a classe como um componente de serviço do Spring, o que permite que o Spring a gerencie e a injete em outros componentes.
@Service
class ProdutoServiceImpl (
    // Injeção de dependência do repositório de usuários. O repositório é usado para acessar e manipular dados no banco de dados.
    private val produtoRepository: ProdutoRepository,
    private val userRepository: UserRepository
): ProdutoServiceInterface {
    override fun save(podutoRequestDto: PodutoRequestDto): ProdutoResponseDto {

        var user = userRepository.findById(podutoRequestDto.user).orElseThrow();

        val  produto = produtoRepository.save(
            Produto(
                preco = podutoRequestDto.preco,
                quantidade = podutoRequestDto.quantidade,
                user = user
            )
        )

        return  ProdutoResponseDto(
            id = produto.id,
            preco = produto.preco,
            quantidade = produto.quantidade,
            user = UserResponseDto(
                id = user.id,
                name = user.name,
                email = user.email,
                password = user.password,
                cpf_cnpj = user.cpf_cnpj,
                is_active = user.is_active
            )
        )
    }
}
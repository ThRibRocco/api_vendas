package com.api_vendinha.api.controller

import com.api_vendinha.api.domain.dtos.request.UserRequestDto
import com.api_vendinha.api.domain.dtos.response.UserResponseDto
import com.api_vendinha.api.domain.service.UserServiceInterface
import com.api_vendinha.api.infrastructure.repository.UserRepository
import org.springframework.web.bind.annotation.*

// Marca a classe como um controlador REST do Spring, que irá lidar com requisições HTTP e retornar respostas diretamente no corpo da resposta.
@CrossOrigin("*")
@RestController
// Define o caminho base para todos os endpoints dentro deste controlador. Neste caso, todos os endpoints começam com "/user".
@RequestMapping("/user")
class UserController (
    // Injeção de dependência do serviço de usuário. O controlador usa este serviço para processar dados relacionados a usuários.
    val userService: UserServiceInterface,
    val userRepository: UserRepository
) {
    // Mapeia este método para responder a requisições POST no caminho "/user/save".
    @PostMapping("/save")
    // O método recebe um objeto `UserRequestDto` no corpo da requisição, e retorna um objeto `UserResponseDto` após chamar o serviço para salvar o usuário.
    fun save(@RequestBody userRequestDto: UserRequestDto) : UserResponseDto {
        // Chama o método `save` do serviço de usuário passando o DTO recebido e retorna o resultado.
        return userService.save(userRequestDto)
    }
    //função de atualizar os dados do seu usuário
    @PutMapping("/{id}")
    fun update(
        @PathVariable id: Long,
        @RequestBody userRequestDto: UserRequestDto
    ):UserResponseDto{
        return userService.update(id, userRequestDto)
    }

    @GetMapping("/{id}")
    fun findUser(@PathVariable id: Long):UserResponseDto{
        return userService.findUser(id)
    }

    @PutMapping("/{id}/status/{status}")
    fun changeStatus(
        @PathVariable id: Long,
        @PathVariable status:Boolean
    ):UserResponseDto{
        return userService.changeStatus(id, status)
    }

    @GetMapping("/list")
    fun getAllUser():List<UserResponseDto>{
        val users = userRepository.findAll()

        return users.map {
            UserResponseDto(
                id = it.id,
                name = it.name,
                email = it.email,
                password = it.password,
                cpf_cnpj = it.cpf_cnpj,
                is_active = it.is_active
            )
        }
    }
}
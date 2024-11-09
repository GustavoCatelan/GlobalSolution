package br.com.fiap.GlobalSolution.dto.response;

public record UsersResponse(

        Long id,
        String username,
        String email,
        String password
) {
}

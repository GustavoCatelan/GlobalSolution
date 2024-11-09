package br.com.fiap.GlobalSolution.dto.response;

public record DeviceResponse(

        Long id,
        String type,
        String name,
        String status,
        UsersResponse users
) {
}

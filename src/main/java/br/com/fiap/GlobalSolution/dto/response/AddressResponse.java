package br.com.fiap.GlobalSolution.dto.response;


public record AddressResponse(

        Long id,
        String cep,
        String street,
        String number,
        String complement,
        String neighborhood,
        String city,
        String state,
        UsersResponse users
) {
}

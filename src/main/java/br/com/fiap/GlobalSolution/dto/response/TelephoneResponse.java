package br.com.fiap.GlobalSolution.dto.response;

public record TelephoneResponse(

        Long id,
        String ddi,
        String ddd,
        String number,
        UsersResponse users
) {
}

package br.com.fiap.GlobalSolution.dto.response;

import java.time.LocalDate;

public record IncentiveScoreResponse(

        Long id,
        Integer point,
        Integer target,
        LocalDate date,
        UsersResponse users
) {
}

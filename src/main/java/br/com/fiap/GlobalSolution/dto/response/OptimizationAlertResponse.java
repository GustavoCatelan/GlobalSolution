package br.com.fiap.GlobalSolution.dto.response;

import java.time.LocalDate;

public record OptimizationAlertResponse(

        Long id,
        String type,
        LocalDate date,
        String description,
        TelephoneResponse telephone
) {
}

package br.com.fiap.GlobalSolution.dto.response;

import java.time.LocalDate;
import java.util.Collection;

public record EnergyReadingResponse(

        Long id,
        LocalDate date,
        String consumption,
        String production,
        Collection<DeviceResponse> device
) {
}

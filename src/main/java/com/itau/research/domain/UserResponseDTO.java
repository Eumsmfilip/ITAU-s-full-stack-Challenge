package com.itau.research.domain;

import java.util.UUID;

public record UserResponseDTO(
        UUID id,
        String name,
        String lastName,
        double userParticipation) {
}

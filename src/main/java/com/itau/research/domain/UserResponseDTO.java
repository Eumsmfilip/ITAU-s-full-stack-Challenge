package com.itau.research.domain;

import org.antlr.v4.runtime.misc.NotNull;

import java.util.UUID;

public record UserResponseDTO(
        @NotNull
        UUID id,
        String name,
        String lastName,
        double userParticipation) {
}

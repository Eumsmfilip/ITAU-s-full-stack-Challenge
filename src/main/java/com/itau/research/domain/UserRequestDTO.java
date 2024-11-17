package com.itau.research.domain;


public record UserRequestDTO(String name, String lastName, double userParticipation, boolean active) {
}

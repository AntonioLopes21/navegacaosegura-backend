package br.com.naveguard.naveguardBackend.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record TutorialDTO(
         Long id,
         @NotBlank(message = "O título não pode ser vazio.")
         @Size(min = 1, max = 100)
         String title,
         @NotBlank(message = "O conteúdo não pode ser vazio.")
         @Size(min = 250)
         String content
) {
}

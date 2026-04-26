package com.netbook.bff.models.request;

import lombok.Data;
import jakarta.validation.constraints.NotBlank;

@Data
public class AgregarUsuario {

    @NotBlank(message = "El RUT no puede estar vacío")
    private String rut;

    @NotBlank(message = "El nombre no puede estar vacío")
    private String nombres;

    @NotBlank(message = "El apellido paterno no puede estar vacío")
    private String apellidoPaterno;

    @NotBlank(message = "El apellido materno no puede estar vacío")
    private String apellidoMaterno;

    @NotBlank(message = "El correo institucional no puede estar vacío")
    private String correoInstitucional;
}
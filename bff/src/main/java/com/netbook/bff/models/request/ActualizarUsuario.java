package com.netbook.bff.models.request;

import lombok.Data;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Data
public class ActualizarUsuario {

    @NotNull(message = "El ID no puede estar vacío")
    private Integer idUsuario;

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
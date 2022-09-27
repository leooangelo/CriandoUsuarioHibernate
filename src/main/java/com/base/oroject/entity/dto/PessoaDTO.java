package com.base.oroject.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PessoaDTO {

    @JsonProperty("id_pessoa")
    private String idPessoa;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("idade")
    private Integer idade;

    @JsonProperty("cpf")
    private String cpf;
}

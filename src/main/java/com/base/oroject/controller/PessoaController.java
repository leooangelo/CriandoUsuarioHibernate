package com.base.oroject.controller;

import com.base.oroject.entity.EnvelopDataJson;
import com.base.oroject.entity.Pessoa;
import com.base.oroject.entity.dto.PessoaDTO;
import com.base.oroject.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping
    public EnvelopDataJson<PessoaDTO> createPessoa(@Valid @RequestBody Pessoa pessoa){

        var response = pessoaService.createPessoa(pessoa);

        return new EnvelopDataJson<PessoaDTO>(response);
    }
}

package com.base.oroject.service;

import com.base.oroject.entity.Pessoa;
import com.base.oroject.entity.database.PessoaDataBase;
import com.base.oroject.entity.dto.PessoaDTO;
import com.base.oroject.respository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public PessoaDTO createPessoa(Pessoa pessoa) {

        PessoaDataBase pessoaDataBase = mappToDataBase(pessoa);

        var responseDatabase = pessoaRepository.save(pessoaDataBase);

        var response = mappToResponse(responseDatabase);

        return response;
    }

    private PessoaDTO mappToResponse(PessoaDataBase pessoaDataBase) {
        PessoaDTO pessoaDTO = new PessoaDTO();
        pessoaDTO.setCpf(pessoaDataBase.getCpf());
        pessoaDTO.setNome(pessoaDataBase.getNome());
        pessoaDTO.setIdade(pessoaDataBase.getIdade());
        pessoaDTO.setIdPessoa(pessoaDataBase.getIdPessoa());

        return pessoaDTO;
    }

    private PessoaDataBase mappToDataBase(Pessoa pessoa){
        PessoaDataBase pessoaDataBase= new PessoaDataBase();
        pessoaDataBase.setIdPessoa(UUID.randomUUID().toString());
        pessoaDataBase.setNome(pessoa.getNome());
        pessoaDataBase.setIdade(pessoa.getIdade());
        pessoaDataBase.setCpf(pessoa.getCpf());

        return pessoaDataBase;
    }
}

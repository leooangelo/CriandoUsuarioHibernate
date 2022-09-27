package com.base.oroject.respository;

import com.base.oroject.entity.Pessoa;
import com.base.oroject.entity.database.PessoaDataBase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaDataBase, String> {
}

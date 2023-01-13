package io.gft.mscliente.service;

import io.gft.mscliente.domain.Cliente;
import io.gft.mscliente.infra.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository repository;


    @Transactional
    public Cliente save (Cliente cliente){
        return repository.save(cliente);
    }


    public Optional<Cliente> getByCPF(String cpf){
        return repository.findByCpf(cpf);
    }


}

package voll.med.api.domain.medico;

import voll.med.api.domain.endereco.Endereco;

public record DadosDetalhamentoMedo(Long id, String nome, String email, String crm, Especialidade especialidade, Endereco endereco) {

    public DadosDetalhamentoMedo(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade(), medico.getEndereco());
    }
}

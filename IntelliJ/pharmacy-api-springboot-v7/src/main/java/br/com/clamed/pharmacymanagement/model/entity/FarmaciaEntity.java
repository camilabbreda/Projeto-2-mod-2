package br.com.clamed.pharmacymanagement.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="farmacia")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FarmaciaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @NotNull
    @Column
    private String razaoSocial;

    @NotNull
    @Column
    private String cnpj;
    @NotNull
    @Column
    private String nomeFantasia;

    @NotNull
    @Column
    private String email;
    @Column
    private String telefone;
    @NotNull
    @Column
    private String celular;
    @JoinColumn(name = "fk_id_endereco")
    @OneToOne
    @NotNull
    private EnderecoEntity enderecoEntity;

}

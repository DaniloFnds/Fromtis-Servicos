package br.com.fromtis.cadastros.fundo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TB_FUNDO")
@AttributeOverride(name = "id", column = @Column(name = "ID_FUNDO"))
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Fundo extends AbstractPersistable<Integer> {

    @Column(name = "NM_FUNDO")
    private String nome;
}

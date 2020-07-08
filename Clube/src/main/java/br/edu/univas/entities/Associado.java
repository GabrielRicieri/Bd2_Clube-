package br.edu.univas.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Associado")
public class Associado implements Serializable {
	@Id
	@GeneratedValue
	@Column(name = "associado_id")
	private Integer AssociadoID;

	@Column(name = "associado_nome")
	private String AssociadoNome;

	@Column(name = "associado_cpf")
	private Integer AssociadoCpf;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "clube_id")
	private Clube ClubeId;

	@Column(name = "associado_date")
	@Temporal(TemporalType.DATE)
	private Date associadoDate;
	
	@Override
	public String toString() {
	return "associado [associado_id=" + AssociadoID + ", associado_nome=" + AssociadoNome + ", associado_cpf=" + AssociadoCpf + ",associado_date=" +associadoDate +",clube_id="+ClubeId+"]";
	}

	public Date getAssociadoDate() {
		return associadoDate;
	}

	public void setAssociadoDate(Date associadoDate) {
		this.associadoDate = associadoDate;
	}

	public Integer getAssociadoID() {
		return AssociadoID;
	}

	public void setAssociadoID(Integer associadoID) {
		AssociadoID = associadoID;
	}

	public String getAssociadoNome() {
		return AssociadoNome;
	}

	public void setAssociadoNome(String assiciadoNome) {
		AssociadoNome = assiciadoNome;
	}

	public Integer getAssociadoCpf() {
		return AssociadoCpf;
	}

	public void setAssociadoCpf(Integer associadoCpf) {
		AssociadoCpf = associadoCpf;
	}

	public Clube getClubeId() {
		return ClubeId;
	}

	public void setClubeId(Clube clubeId) {
		ClubeId = clubeId;
	}

}

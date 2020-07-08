package br.edu.univas.entities;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Clube")
public class Clube implements Serializable {

	@Id
    @GeneratedValue
    @Column(name = "clube_id")
	
	private Integer clubeId;
	
	@Column(name="clube_nome")
	private String clubeNome;
	
	@Column(name="clube_cnpj")
	private Integer clubeCnpj;
	
	@Column(name="clube_cidade")
	private String clubeCidade;

	public Integer getClubeId() {
		return clubeId;
	}
	@Override
	public String toString() {
		String clubecpnj;
		return "clube [clubeId=" + clubeId + ", clubeNome=" + clubeNome + ", clubeCnpj=" + clubeCnpj + ",clubeCidade=" +clubeCidade +"]";
	}

	public void setClubeId(Integer clubeId) {
		this.clubeId = clubeId;
	}

	public String getClubeNome() {
		return clubeNome;
	}

	public void setClubeNome(String clubeNome) {
		this.clubeNome = clubeNome;
	}

	public Integer getClubeCnpj() {
		return clubeCnpj;
	}

	public void setClubeCnpj(Integer clubeCnpj) {
		this.clubeCnpj = clubeCnpj;
	}

	public String getClubeCidade() {
		return clubeCidade;
	}

	public void setClubeCidade(String clubeCidade) {
		this.clubeCidade = clubeCidade;
	}
	
}

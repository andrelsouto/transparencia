package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.opencsv.bean.CsvBindByPosition;

@Entity
public class Transferencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@CsvBindByPosition(position = 0)
	private String mesAno;
	@CsvBindByPosition(position = 1)
	private String tipoTransferencia;
	@CsvBindByPosition(position = 2)
	private String tipoFavorecido;
	@CsvBindByPosition(position = 3)
	private String uf;
	@CsvBindByPosition(position = 4)
	private String codSiaf;
	@CsvBindByPosition(position = 5)
	private String nomeMunicipio;
	@CsvBindByPosition(position = 6)
	private String codFunc;
	@CsvBindByPosition(position = 7)
	private String nomeFunc;
	@CsvBindByPosition(position = 8)
	private String codSubFunc;
	@CsvBindByPosition(position = 9)
	private String nomeSubFunv;
	@CsvBindByPosition(position = 10)
	private String codPrograma;
	@CsvBindByPosition(position = 11)
	private String nomePrograma;
	@CsvBindByPosition(position = 12)
	private String codAcao;
	@CsvBindByPosition(position = 13)
	private String nomeAcao;
	@CsvBindByPosition(position = 14)
	private String linguagemCid;
	@CsvBindByPosition(position = 15)
	private String codFavorecido;
	@CsvBindByPosition(position = 16)
	private String nomeFavorecido;
	@CsvBindByPosition(position = 17)
	private String valorTransferido;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLinguagemCid() {
		return linguagemCid;
	}
	public void setLinguagemCid(String linguagemCid) {
		this.linguagemCid = linguagemCid;
	}
	public String getMesAno() {
		return mesAno;
	}
	public void setMesAno(String mesAno) {
		this.mesAno = mesAno;
	}
	public String getTipoTransferencia() {
		return tipoTransferencia;
	}
	public void setTipoTransferencia(String tipoTransferencia) {
		this.tipoTransferencia = tipoTransferencia;
	}
	public String getTipoFavorecido() {
		return tipoFavorecido;
	}
	public void setTipoFavorecido(String tipoFavorecido) {
		this.tipoFavorecido = tipoFavorecido;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCodSiaf() {
		return codSiaf;
	}
	public void setCodSiaf(String codSiaf) {
		this.codSiaf = codSiaf;
	}
	public String getNomeMunicipio() {
		return nomeMunicipio;
	}
	public void setNomeMunicipio(String nomeMunicipio) {
		this.nomeMunicipio = nomeMunicipio;
	}
	public String getCodFunc() {
		return codFunc;
	}
	public void setCodFunc(String codFunc) {
		this.codFunc = codFunc;
	}
	public String getNomeFunc() {
		return nomeFunc;
	}
	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}
	public String getCodSubFunc() {
		return codSubFunc;
	}
	public void setCodSubFunc(String codSubFunc) {
		this.codSubFunc = codSubFunc;
	}
	public String getNomeSubFunv() {
		return nomeSubFunv;
	}
	public void setNomeSubFunv(String nomeSubFunv) {
		this.nomeSubFunv = nomeSubFunv;
	}
	public String getCodPrograma() {
		return codPrograma;
	}
	public void setCodPrograma(String codPrograma) {
		this.codPrograma = codPrograma;
	}
	public String getNomePrograma() {
		return nomePrograma;
	}
	public void setNomePrograma(String nomePrograma) {
		this.nomePrograma = nomePrograma;
	}
	public String getCodAcao() {
		return codAcao;
	}
	public void setCodAcao(String codAcao) {
		this.codAcao = codAcao;
	}
	public String getNomeAcao() {
		return nomeAcao;
	}
	public void setNomeAcao(String nomeAcao) {
		this.nomeAcao = nomeAcao;
	}
	public String getCodFavorecido() {
		return codFavorecido;
	}
	public void setCodFavorecido(String codFavorecido) {
		this.codFavorecido = codFavorecido;
	}
	public String getNomeFavorecido() {
		return nomeFavorecido;
	}
	public void setNomeFavorecido(String nomeFavorecido) {
		this.nomeFavorecido = nomeFavorecido;
	}
	public String getValorTransferido() {
		return valorTransferido;
	}
	public void setValorTransferido(String valorTransferido) {
		this.valorTransferido = valorTransferido;
	}

}

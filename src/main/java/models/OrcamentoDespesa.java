package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.opencsv.bean.CsvBindByPosition;

@Entity
public class OrcamentoDespesa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@CsvBindByPosition(position = 0)
	private String exercicio;
	@CsvBindByPosition(position = 1)
	private int codOrgaoSup;
	@CsvBindByPosition(position = 2)
	private String nomeOrgaoSup;
	@CsvBindByPosition(position = 3)
	private int codOrgaoSub;
	@CsvBindByPosition(position = 4)
	private String nomeOrgaoSub;
	@CsvBindByPosition(position = 5)
	private int codUnidadeOrc;
	@CsvBindByPosition(position = 6)
	private String nomeUnidadeOrc;
	@CsvBindByPosition(position = 7)
	private int codFuncao;
	@CsvBindByPosition(position = 8)
	private String nomeFuncao;
	@CsvBindByPosition(position = 9)
	private int codSubFuncao;
	@CsvBindByPosition(position = 10)
	private String nomeSubFuncao;
	@CsvBindByPosition(position = 11)
	private int codProgramaOrc;
	@CsvBindByPosition(position = 12)
	private String nomeProgramaOrc;
	@CsvBindByPosition(position = 13)
	private int codAcao;
	@CsvBindByPosition(position = 14)
	private String nomeAcao;
	@CsvBindByPosition(position = 15)
	private String categoriaEconomica;
	@CsvBindByPosition(position = 16)
	private int codGrupoDespesa;
	@CsvBindByPosition(position = 17)
	private String nomeGrupoDespesa;
	@CsvBindByPosition(position = 18)
	private int codElementoDespesa;
	@CsvBindByPosition(position = 19)
	private String nomeElementoDespesa;
	@CsvBindByPosition(position = 20)
	private double orcamentoInicial;
	@CsvBindByPosition(position = 21)
	private double orcamentoAtualizado;
	@CsvBindByPosition(position = 22)
	private double orcamentoRealizado;
	@CsvBindByPosition(position = 23)
	private double realizado;
	
}

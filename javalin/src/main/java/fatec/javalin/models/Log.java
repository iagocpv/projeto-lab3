package fatec.javalin.models;

import java.time.LocalDateTime;

public class Log {
	
	private Integer id;
	private String nomeArquivo;
	private String sourcecode;
	private String status;
	private LocalDateTime dataHoraExecucao;
	
	public Log(Integer id, String nomeArquivo, String sourcecode, String status, LocalDateTime dataHoraExecucao) {
		super();
		this.id = id;
		this.nomeArquivo = nomeArquivo;
		this.sourcecode = sourcecode;
		this.status = status;
		this.dataHoraExecucao = dataHoraExecucao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	public String getSourcecode() {
		return sourcecode;
	}

	public void setSourcecode(String sourcecode) {
		this.sourcecode = sourcecode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getDataHoraExecucao() {
		return dataHoraExecucao;
	}

	public void setDataHoraExecucao(LocalDateTime dataHoraExecucao) {
		this.dataHoraExecucao = dataHoraExecucao;
	}

}

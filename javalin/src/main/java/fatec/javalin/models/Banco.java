package fatec.javalin.models;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	public static Arquivo arquivo;		
	public static Retorno retorno;
	public static List<Log> logs = new ArrayList<Log>();
	public static Integer logCount = 1;
	
	public static void addLog(Log log) {
		Banco.logs.add(log);
		logCount++;		
	}
	public void salvaLog(Arquivo arquivo) {
//		if( rodaArquivo() ) {
//			Banco.addLog(new Log(logCount, arquivo.getFilename(), arquivo.getSourcecode(), "SUCCESS", LocalDateTime.now()));
//		} else {
//			Banco.addLog(new Log(logCount, arquivo.getFilename(), arquivo.getSourcecode(), "FAIL", LocalDateTime.now()));
//		}
	}
	public Log findById(Integer id) {
		for (Log log : logs) {
			if( log.getId() == id){
				return log;
			} 
		}
		return null;
	}
	public static Retorno getRetorno() {
		Retorno aux = retorno;
		retorno = null;
		return aux;
	}
	
	public List<Log> findByStatus(String status) {
		List<Log> logsEncontrados = new ArrayList<>();
		for (Log log : logs) {
			if( log.getStatus() == status ) {
				logsEncontrados.add(log);
			} 
		}
		return logsEncontrados;
	}
	public List<Log> findByPeriodo(LocalDateTime ldt) {
		List<Log> logsEncontrados = new ArrayList<>();
		for (Log log : logs) {
			if( ChronoUnit.HOURS.between(log.getDataHoraExecucao(), ldt) == 0 ) {
				logsEncontrados.add(log);
			} 
		}
		return logsEncontrados;
	}
	
	public static void rodaArquivo() {
//		 if(arquivoRoda) {
//			return true;
//		} else {
//			return false;
//		} 
	}
	
}

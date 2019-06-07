package fatec.javalin;

import fatec.javalin.models.Arquivo;
import fatec.javalin.models.Banco;
import io.javalin.Javalin;

public class App {
	public static void main(String[] args) {

		Javalin app = Javalin.create().start(7000);
		app.get("/maratona/id=:id", ctx -> {
			String id = ctx.pathParam("id");
			Integer idInt = Integer.parseInt(id);
			ctx.json(null);
		});
		app.get("/maratona/periodo=:periodo", ctx -> {
			ctx.json(null);
		});
		app.get("/maratona/status=:status", ctx -> {
			ctx.json(null);
		});
		app.post("/maratona", ctx -> {
			Banco.arquivo = ctx.bodyAsClass(Arquivo.class);	
			
			Banco.rodaArquivo();
			
			
			ctx.json(Banco.getRetorno());
		});
	}

	
}
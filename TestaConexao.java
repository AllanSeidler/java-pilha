
public class TestaConexao {

	public static void main(String[] args) {
		
		
		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexao");
		}
		
		
		
		
		
		// ---------------------------
		
//		Conexao con = null; 
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch(IllegalStateException ex) {
//			System.out.println("Deu erro na conexao");
//		} finally {
//			System.out.println("finnaly");
//			if(con != null) {
//				con.fecha();
//			}
//		}
		
	}
	
}

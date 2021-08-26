package faculdadeUniderp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Cliente cliente = new Cliente("Lucas" , "Rua x");
		Cliente cliente2 = new Cliente();
		
		cliente.setNome("Lucas");
		
		System.out.println(cliente);
		System.out.println(cliente2);
		System.out.println(cliente.getNome());
		System.out.println("Lucas");
		

	}

}

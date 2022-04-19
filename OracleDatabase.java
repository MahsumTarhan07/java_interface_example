package interface_exp;

public class OracleDatabase  implements IDatabase{
	@Override
	public void login() {
		System.out.println("Oracle veritaban�n�na ba�lan�ld�");
		
	}

	@Override
	public void add() {
		System.out.println("Verilerin ��elemeler Oracle veritaban�n�na Eklendi");
	}

	@Override
	public void delete() {
		System.out.println("Verilen ��lemler Oracle veritaban�n�na Silindi");
		
	}

	@Override
	public void get() {
		System.out.println("�stenilen i�lemler Oracle veritaban�nda getirildi");
		
	}

	@Override
	public void update() {
		 System.out.println("-> �stenilen ��lemler Oracle Veritaban� �zerinde G�ncellendi.");		
	}
	

}

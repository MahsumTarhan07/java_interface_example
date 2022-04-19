package interface_exp;

public class MysqlDatabase implements IDatabase {

	@Override
	public void login() {
		System.out.println("Mysl veritaban�n�na ba�lan�ld�");
		
	}

	@Override
	public void add() {
		System.out.println("Verilerin ��elemeler Mysql veritaban�n�na Eklendi");
	}

	@Override
	public void delete() {
		System.out.println("Verilen ��lemler Mysl veritaban�n�na Silindi");
		
	}

	@Override
	public void get() {
		System.out.println("�stenilen i�lemler mysql veritaban�nda getirildi");
		
	}

	@Override
	public void update() {
		 System.out.println("-> �stenilen ��lemler Mysql Veritaban� �zerinde G�ncellendi.");		
	}
	

}

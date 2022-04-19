package interface_exp;

public class OracleDatabase  implements IDatabase{
	@Override
	public void login() {
		System.out.println("Oracle veritabanýnýna baðlanýldý");
		
	}

	@Override
	public void add() {
		System.out.println("Verilerin Ýþelemeler Oracle veritabanýnýna Eklendi");
	}

	@Override
	public void delete() {
		System.out.println("Verilen Ýþlemler Oracle veritabanýnýna Silindi");
		
	}

	@Override
	public void get() {
		System.out.println("Ýstenilen iþlemler Oracle veritabanýnda getirildi");
		
	}

	@Override
	public void update() {
		 System.out.println("-> Ýstenilen Ýþlemler Oracle Veritabaný Üzerinde Güncellendi.");		
	}
	

}

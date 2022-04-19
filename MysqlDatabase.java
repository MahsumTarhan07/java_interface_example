package interface_exp;

public class MysqlDatabase implements IDatabase {

	@Override
	public void login() {
		System.out.println("Mysl veritabanýnýna baðlanýldý");
		
	}

	@Override
	public void add() {
		System.out.println("Verilerin Ýþelemeler Mysql veritabanýnýna Eklendi");
	}

	@Override
	public void delete() {
		System.out.println("Verilen Ýþlemler Mysl veritabanýnýna Silindi");
		
	}

	@Override
	public void get() {
		System.out.println("Ýstenilen iþlemler mysql veritabanýnda getirildi");
		
	}

	@Override
	public void update() {
		 System.out.println("-> Ýstenilen Ýþlemler Mysql Veritabaný Üzerinde Güncellendi.");		
	}
	

}

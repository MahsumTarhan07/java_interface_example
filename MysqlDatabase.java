package interface_exp;

public class MysqlDatabase implements IDatabase {

	@Override
	public void login() {
		System.out.println("Mysl veritabanınına bağlanıldı");
		
	}

	@Override
	public void add() {
		System.out.println("Verilerin İşelemeler Mysql veritabanınına Eklendi");
	}

	@Override
	public void delete() {
		System.out.println("Verilen İşlemler Mysl veritabanınına Silindi");
		
	}

	@Override
	public void get() {
		System.out.println("İstenilen işlemler mysql veritabanında getirildi");
		
	}

	@Override
	public void update() {
		 System.out.println("-> İstenilen İşlemler Mysql Veritabanı Üzerinde Güncellendi.");		
	}
	

}

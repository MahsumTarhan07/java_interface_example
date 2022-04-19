package interface_exp;

public class OracleDatabase  implements IDatabase{
	@Override
	public void login() {
		System.out.println("Oracle veritabanınına bağlanıldı");
		
	}

	@Override
	public void add() {
		System.out.println("Verilerin İşelemeler Oracle veritabanınına Eklendi");
	}

	@Override
	public void delete() {
		System.out.println("Verilen İşlemler Oracle veritabanınına Silindi");
		
	}

	@Override
	public void get() {
		System.out.println("İstenilen işlemler Oracle veritabanında getirildi");
		
	}

	@Override
	public void update() {
		 System.out.println("-> İstenilen İşlemler Oracle Veritabanı Üzerinde Güncellendi.");		
	}
	

}

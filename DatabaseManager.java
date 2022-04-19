package interface_exp;

import java.util.Scanner;

public class DatabaseManager {
	 private IDatabase database;
	    DatabaseManager(IDatabase database){
	        this.database = database;
	    }
	    public void loginDatabase(){
	        database.login();
	    }
	    public void addDatabase(){
	        database.add();
	    }
	    public void deleteDatabase(){
	        database.delete();
	    }
	    public void getDatabase(){
	        database.get();
	    }
	    public void updateDatabase(){
	        database.update();
	    }
	    public void selectMenu(){
	        int kararVer;
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("< Gerçekleştirilecek İşlemler >\n-----------------\n[1] - Veri Ekle\n[2] - Veri Sil\n[3] - Veri Getir\n[4] - Veri Güncelle\n-----------------\n-> Kararınız:");
	        kararVer = scanner.nextInt();
	        switch(kararVer){
	            case 1:
	                System.out.println("-----------------");
	                addDatabase();
	                System.out.println("-----------------");
	                break;
	            case 2:
	                System.out.println("-----------------");
	                deleteDatabase();
	                System.out.println("-----------------");
	                break;
	            case 3:
	                System.out.println("-----------------");
	                getDatabase();
	                System.out.println("-----------------");
	                break;
	            case 4:
	                System.out.println("-----------------");
	                updateDatabase();
	                System.out.println("-----------------");
	                break;
	            default:
	                System.out.println("-----------------\n-> Tanımsız Bir Değer Girdiniz.\n-----------------");
	                break;
	        }
	    }
	}
package interface_exp;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		DatabaseManager databaseManager;
		// Değişken Tanımlanması;
		int karar;
		Scanner scanner = new Scanner(System.in);
		System.out.println("--- INTERFACE KULLANIMI--- ");
		 System.out.print("[1] - MysqlDatabase Bağlan\n[2]"
		 + " - OracleDatabase Bağlan\n-----------------\n-> Kararınız:");	
		 
		 karar = scanner.nextInt();
		 
		 switch(karar){
		 case 1:
			 databaseManager = new DatabaseManager(new MysqlDatabase());
			 System.out.println("------------");
			 databaseManager.loginDatabase();
			 System.out.println("---------");
			 databaseManager.selectMenu();
		 case 2:
			 databaseManager = new DatabaseManager(new OracleDatabase());
			 System.out.println("---------");
			 databaseManager.loginDatabase();
			 System.out.println("---------");
			 databaseManager.selectMenu();
			 break;
		 default:
			 System.out.println("---Girdiğiniz Değer Tanımsız---");
			 break;

		 }
		 
	}

}

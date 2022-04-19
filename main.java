package interface_exp;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		DatabaseManager databaseManager;
		// De�i�ken Tan�mlanmas�;
		int karar;
		Scanner scanner = new Scanner(System.in);
		System.out.println("--- INTERFACE KULLANIMI--- ");
		 System.out.print("[1] - MysqlDatabase Ba�lan\n[2]"
		 + " - OracleDatabase Ba�lan\n-----------------\n-> Karar�n�z:");	
		 
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
			 System.out.println("---Girdi�iniz De�er Tan�ms�z---");
			 break;

		 }
		 
	}

}

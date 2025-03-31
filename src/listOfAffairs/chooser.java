package listOfAffairs;

import java.util.Scanner;

public class chooser {
	public void chooseVariant() {
		System.out.println("Выберите пункт: ");
		System.out.println("1. Создать запись");
		System.out.println("2. Посмотреть/редактировать запись");
		System.out.println("3. Удалить запись");
		System.out.println("4. Выход");
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();
		switch(value)
		{
			case 1:
				createFile create = new createFile();
				create.createFile("tasks.txt");
				System.out.println("Вводите записи. Для выхода введите Exit или exit.");
				scan.reset();
				scan.nextLine();
				writeToFile write = new writeToFile();
				write.writeToFile("tasks.txt", scan);
				break;
			case 2:
				System.out.println("Чтение/редактирование файла. Для выхода введите Exit или exit");
				scan.reset();
				scan.nextLine();
				checkOrEditFile checkFile = new checkOrEditFile();
				checkFile.checkOrEditFile("tasks.txt", scan);
				break;
			case 3:
				deleteFile deleteThis = new deleteFile();
				deleteThis.deleteFile("tasks.txt");
				break;
			case 4:
				System.exit(0);
		}
	}
}

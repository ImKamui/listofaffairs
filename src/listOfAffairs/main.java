package listOfAffairs;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// 1. Создать запись
		// 	p.s. При выборе этого пункта консоль стирается и в неё можно вписывать что-то. Программа автоматически создаёт файл
		// и добавляет в него запись, нумеруя её при нажатии на Enter
		// 2. Посмотреть запись
		// p.s. Программа очищает консоль и показывает информацию из текстового файла
		// 3. Удалить запись
		// p.s. Программа удаляет файл с записями
		// 4. Выход
		// p.s. Консоль заканчивает свою работу
		// Интерфейсы - create, write, check, delete.
		// Classes - createFile, writeToFile, checkFile, deleteFile.
		
		chooser choose = new chooser();
		choose.chooseVariant();
	}

}

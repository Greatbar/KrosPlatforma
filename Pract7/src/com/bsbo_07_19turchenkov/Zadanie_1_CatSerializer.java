package com.bsbo_07_19turchenkov;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Zadanie_1_CatSerializer {
    public static void Task1() {
        String filename = "CatsFamily.dat";
        ArrayList<Cat> CatsList = new ArrayList<>();
        Cat Mama = new Cat("Сиамский", 4, "Отец Сева");
        Cat Papa = new Cat("Дворовый", 5, "Мать Лера");
        Cat Son = new Cat("Двороский", 2, "Сын кот ", Papa, Mama);
        CatsList.add(Mama);
        CatsList.add(Papa);
        CatsList.add(Son);

        // сериализация в новый список
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(CatsList);
            System.out.println("Сериализация прошла успешно");
        } catch (Exception ex) {

            System.out.println(ex.getMessage() + " Сериализация не выполнилась");
        }

        // десериализация в новый список
        ArrayList<Cat> newCatsList = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {

            newCatsList = (ArrayList<Cat>) ois.readObject();
            System.out.println("Десириализация в новый список прошла успешно");
        } catch (Exception ex) {

            System.out.println(ex.getMessage() + " Десериализация не выполнилась");
        }

        for (Cat p : newCatsList)
            p.showPedigree();
    }
}
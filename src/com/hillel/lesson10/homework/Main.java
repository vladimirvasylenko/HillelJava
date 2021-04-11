package com.hillel.lesson10.homework;

public class Main {
    /*Имея представления об обычных классах, абстрактных классах и интерфейсах
    необходимо создать следующие реализации:

    Создайте  2 цепочки классов(из примера в  классе: “Animal <- Cat <- Persian” / “People <- Employee <- FireMan”),
    только придумать свои классы. Условия:
    а). Всего классов для каждой цепочки должно быть 5;
    б). Один главный класс, второй -  наследуется от главного, и еще 3 класса, которые наследуются от второго;
    в). Главный класс и второй класс наследник должен быть “без возможности
    создавать экземпляр  класса”(подумайте какимиименно должны быть классы?)
    г). В каждом класса должно быть минимум по 2 характеристики и по 1методу(дополнительному);
    д). Для каждого класса реализуйте все необходимые методы для работы, зная пройденные принципы ООП;
    е). Финальные 3 класса-наследника в каждой цепочке должны быть “ненаследуемые”;

    ·Создайте 5 интерфейсов со следующими условиями:
    а). Должно быть 2 пары, один интерфейс наследуется от другого и 1 отдельный интерфейс;
    б). У каждого из 5 интерфейсов определите 2 заданных метода;
    в). Одна цепочка классов должна имплементировать одну связку интерфейсов,
    а вторая цепочка классов должна имплементировать другую связку интерфейсов и  оставшийся отдельный интерфейс;

    ·В классе Main создайте экземпляры всех классов и интерфейсов, запишите
    значения характеристик там где возможно и вызовите все реализованные дополнительные методы в них.*/

    public static void main(String[] args) {
        Iphone iphone = new Iphone("apple", 2021, "iOS", "white", "12", 128);
        System.out.println(iphone);
        iphone.call();
        iphone.goingToInternet();
        iphone.callingFaceTime();



    }


}

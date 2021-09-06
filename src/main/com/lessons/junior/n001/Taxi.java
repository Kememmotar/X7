package com.lessons.junior.n001;

public class Taxi {

    /*У нас есть станция такси с различным траспортом и мы как владельцы станции храним о них след инфу:
    Макс скорость, бренд, потребление топлива, уникальный айдишник.
    И у нас всего 3 вида транспортных средств - это автомобили, автобусы, грузовики.
    Автомобили и автобусы - это пассажирские перевозки и мы они дожны знать количество мест, на которые можно посадить людей.
    Грузовики - это грузовые перевозки и нам важно знать о них сколько кг груза они могут перевезти.
    Так же машина обладают Сегментами это эконом, комфорт или ультима( как я яндексе)), а автобусы типами перевозок,
    которыми они занимаются - это частные перевозки или туристические.
    Так вот какое задание - у нас будет ручками заполняться наша станций такси различными машинками и потом выводить в консоль:
    1) все транспортные средства скорость которых больше заданной
    2) вывести список всех машин в отсортированном порядке по их потребляемому топливу*/

    public static void main(String[] args) {
        Autopark autopark = new Autopark();
        autopark.addTransport(new Automobile(220, "Nissan", 8, "QWER001", 5, SegmentTaxi.COMFORT));
        autopark.addTransport(new Bus(160, "VolksWagen", 16, "QWER002", 18, TypeOfTransportation.INDIVIDUAL));
        autopark.addTransport(new Track(170, "Volvo", 24, "QWER003", 18000));

        ReportMaxSpeed reportMaxSpeed = new ReportMaxSpeed(165);
        reportMaxSpeed.report(autopark.getTransports());
        System.out.println("-----------------------");
        ReportSortSpeed reportSortSpeed = new ReportSortSpeed();
        reportSortSpeed.report(autopark.getTransports());

    }

}

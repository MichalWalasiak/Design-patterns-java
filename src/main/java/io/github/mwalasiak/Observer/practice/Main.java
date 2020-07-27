package io.github.mwalasiak.Observer.practice;

public class Main {

    public static void main(String[] args) {
        WeatherForecast weatherForecast = new WeatherForecast(22, 1080);

        TvNews tvNews = new TvNews();
        RadioNews radioNews = new RadioNews();
        InternetNews internetNews = new InternetNews();

        weatherForecast.registerObserver(tvNews);
        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(internetNews);

        weatherForecast.notifyObservers();
        System.out.println("-------------------");
        weatherForecast.unregisterObserver(tvNews);

        weatherForecast.notifyObservers();


    }
}

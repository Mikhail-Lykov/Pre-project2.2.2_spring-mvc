package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService{
    @Override
    public List<Car> listCar() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("VAZ", "2106", "Yellow"));
        cars.add(new Car("UAZ", "Patriot", "Black"));
        cars.add(new Car("PAZ", "3206", "White"));
        return cars;
    }
}

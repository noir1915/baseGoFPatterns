package net.noir1915.basepatterns.creational.builder.builders;

import net.noir1915.basepatterns.creational.builder.builders.Builder;
import net.noir1915.basepatterns.creational.builder.cars.Car;
import net.noir1915.basepatterns.creational.builder.cars.CarType;
import net.noir1915.basepatterns.creational.builder.components.Engine;
import net.noir1915.basepatterns.creational.builder.components.GPSNavigator;
import net.noir1915.basepatterns.creational.builder.components.Transmission;
import net.noir1915.basepatterns.creational.builder.components.TripComputer;

public class CarBuilder implements Builder {

    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }

}

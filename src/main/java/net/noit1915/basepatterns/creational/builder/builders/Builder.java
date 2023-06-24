package net.noit1915.basepatterns.creational.builder.builders;

import net.noit1915.basepatterns.creational.builder.cars.CarType;
import net.noit1915.basepatterns.creational.builder.components.Engine;
import net.noit1915.basepatterns.creational.builder.components.GPSNavigator;
import net.noit1915.basepatterns.creational.builder.components.Transmission;
import net.noit1915.basepatterns.creational.builder.components.TripComputer;

/**
 * Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);

}

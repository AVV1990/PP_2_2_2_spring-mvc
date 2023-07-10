package web.repository;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

    List<Car> cars = List.of(
            new Car("model1", "color1", 100),
            new Car("model2", "color2", 200),
            new Car("model3", "color3", 300),
            new Car("model4", "color4", 400),
            new Car("model5", "color5", 500)
    );

    @Override
    public List<Car> getAll() {
        return cars;
    }
}

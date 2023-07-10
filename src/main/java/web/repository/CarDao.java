package web.repository;

import web.model.Car;
import java.util.List;

public interface CarDao {
    List<Car> getAll();
}

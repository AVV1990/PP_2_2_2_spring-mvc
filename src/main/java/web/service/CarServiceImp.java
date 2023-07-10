package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;
import web.repository.CarDao;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {
    private CarDao carDao;

    @Autowired
    public void setCarDao(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCarsByLimit(int limit) {
        if (limit >= 5) {
            return carDao.getAll();
        } else {
            return carDao.getAll().stream().limit(limit).collect(Collectors.toList());
        }

    }
}

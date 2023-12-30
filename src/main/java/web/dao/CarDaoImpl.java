package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{
    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("model1", 1999, "series1"));
        cars.add(new Car("model2", 1969, "series2"));
        cars.add(new Car("model3", 1995, "series3"));
        cars.add(new Car("model4", 1991, "series4"));
        cars.add(new Car("model5", 1993, "series5"));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    };
}

package service.impl;

import colors.Color;
import service.ShapesService;
import shape.Shape;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShapeServiceImpl implements ShapesService {
    @Override
    public double getSquares(List<Shape> shapeList) {
        double sum = 0;
        for(Shape shape : shapeList){
            sum+=shape.getSquare();
        }
        return sum;
    }

    @Override
    public double getMaxPerimeters(List<Shape> shapeList) {
        double maxPerimeters = shapeList.get(0).getPerimeter();
        for(Shape shape : shapeList){
            if(shape.getPerimeter() > maxPerimeters){
                maxPerimeters = shape.getPerimeter();
            }
        }
        return maxPerimeters;
    }

    @Override
    public Set<Color> getColors(List<Shape> shapeList) {
        Set<Color> set = new HashSet<>();
        for(Shape shape: shapeList){
            set.add(shape.getColor());
        }
        return set;
    }
}

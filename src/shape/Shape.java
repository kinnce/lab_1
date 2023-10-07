package shape;

import colors.Color;

public abstract class Shape {
    private Color color = Color.TRANSPARENT;


    public void move(double moveX, double moveY){}
    public double getSquare(){
        return 0.0;
    }
    public double getPerimeter(){
        return 0.0;
    }
    public void draw(){}
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}


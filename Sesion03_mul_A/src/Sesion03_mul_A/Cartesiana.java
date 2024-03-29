package Sesion03_mul_A;

public class Cartesiana {
    private float x;
    private float y;

    public Cartesiana(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    public Cartesiana() {
    }

    public Cartesiana polar_cartesiano(float radio, float angulo) {
        float x = radio * (float)Math.cos(angulo);
        float y = radio * (float)Math.sin(angulo);
        return new Cartesiana(x, y);
    }
    
    public Polar cartesiano_polar(float x, float y) {
        float radio =(float) math.sqrt((math.pow(x,2))+(math.pow(y,2)));
        float angulo =(float) math.atan(y/x);
        return new Polar(radio, angulo);
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

}

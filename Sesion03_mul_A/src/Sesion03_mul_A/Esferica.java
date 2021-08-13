package Sesion03_mul_A;

public class Esferica {
	private float r, alpha, Ta;

    public Esferica(float r, float alpha, float Ta) {
        this.r = r;//Distancia desde el origen al punto p
        this.alpha = alpha;//Angulo entre z y el punto p ó angulo del vector formado por el punto y el origen con respecto al eje z 
        this.Ta = Ta;//Angulo respecto X de la proyección del punto sobre el plano XY
    }

    public Esferica() {

    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public float getAlpha() {
        return alpha;
    }

    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }

    public float getTa() {
        return Ta;
    }

    public void setTa(float Ta) {
        this.Ta = Ta;
    }

}

public class Luna extends CuerpoCeleste{

private String nombreluna;
private double periodoorbitalluna;


    public Luna(String nombre, double periodoorbital, TipoCuerpoCeleste tipocuerpo, String nombreluna, double periodoorbitalluna) {
        super(nombre, periodoorbital, tipocuerpo);
        this.nombreluna = nombreluna;
        this.periodoorbitalluna = periodoorbitalluna;
    }

    public String getNombreluna() {
        return nombreluna;
    }

    public double getPeriodoorbitalluna() {
        return periodoorbitalluna;
    }

    @Override
    public String toString() {
        return "Luna{" +
                "nombreluna='" + nombreluna + '\'' +
                ", periodoorbitalluna=" + periodoorbitalluna +
                '}';
    }
}

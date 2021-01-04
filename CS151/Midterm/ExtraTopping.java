package midterm1;

public class ExtraTopping implements PokeBowl {

    public ExtraTopping(PokeBowl bowl, String topping) {
        this.bowl = bowl;
        this.topping = topping;
    }

    @Override
    public double getPrice() {
        return bowl.getPrice() + 2.50;
    }

    @Override
    public String getDescription() {
        return bowl.getDescription() + " + extra " + topping;
    }

    private PokeBowl bowl;
    private String topping;
}

public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        this.fullOfCreativity = fullOfCreativity;
    }

    public Ravenclaw(String name,int witchcraft,int transgress,int smart, int wise, int witty, int fullOfCreativity) {
        super(name, witchcraft, transgress);
        if (smart < 0 || smart > 100){
            throw new RuntimeException("неверно указаны данные cunning");
        }
        if (wise < 0 || wise > 100){
            throw new RuntimeException("неверно указаны данные determination");
        }
        if (witty < 0 || witty > 100){
            throw new RuntimeException("неверно указаны данные ambition");
        }
        if (fullOfCreativity<0 || fullOfCreativity>100){
            throw new RuntimeException("неверно указаны данные resourcefulness");
        }
        this.name = name;
        this.witchcraft = witchcraft;
        this.transgress = transgress;
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }
    public void compareStudents(Ravenclaw studentSecond, Slytherin ronWeasley) {
        int powerOne = this.smart + this.wise + this.witty + this.fullOfCreativity;
        int powerTwo = studentSecond.smart + studentSecond.wise+studentSecond.witty+studentSecond.fullOfCreativity;
        if (powerOne > powerTwo) {
            System.out.println(this + " сильнее чем " + studentSecond);
        } else if (powerTwo > powerOne) {
            System.out.println(studentSecond + " сильнее чем " + this);
        } else {
            System.out.println(this + " равен по силе с " + studentSecond);
        }
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", fullOfCreativity=" + fullOfCreativity +
                '}';
    }
}

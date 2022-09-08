public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int faithful;
    private int honest;

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getFaithful() {
        return faithful;
    }

    public void setFaithful(int faithful) {
        this.faithful = faithful;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public Hufflepuff(String name,int witchcraft,int transgress,int industriousness, int faithful, int honest) {
        super(name, witchcraft, transgress);
        if (industriousness < 0 || industriousness > 100){
            throw new RuntimeException("неверно указаны данные cunning");
        }
        if (faithful < 0 || faithful > 100){
            throw new RuntimeException("неверно указаны данные determination");
        }
        if (honest < 0 || honest > 100){
            throw new RuntimeException("неверно указаны данные ambition");
        }
        this.name = name;
        this.witchcraft = witchcraft;
        this.transgress = transgress;
        this.industriousness = industriousness;
        this.faithful = faithful;
        this.honest = honest;
    }


    public void compareStudents(Hufflepuff studentSecond){
        int powerOne = this.industriousness+this.faithful+this.honest;
        int powerTwo = studentSecond.industriousness + studentSecond.faithful+studentSecond.honest;
        if (powerOne>powerTwo){
            System.out.println(this + " сильнее чем " + studentSecond);
        }else if (powerTwo>powerOne){
            System.out.println(studentSecond + " сильнее чем " + this);
        }else {
            System.out.println(this + " равен по силе с " + studentSecond);
        }
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "industriousness=" + industriousness +
                ", faithful=" + faithful +
                ", honest=" + honest +
                '}';
    }
}

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public Slytherin(String name,int witchcraft,int transgress,int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, witchcraft, transgress);
        if (cunning < 0 || cunning > 100){
            throw new RuntimeException("неверно указаны данные cunning");
        }
        if (determination < 0 || determination > 100){
            throw new RuntimeException("неверно указаны данные determination");
        }
        if (ambition < 0 || ambition > 100){
            throw new RuntimeException("неверно указаны данные ambition");
        }
        if (resourcefulness<0 || resourcefulness>100){
            throw new RuntimeException("неверно указаны данные resourcefulness");
        }
        if (lustForPower<0 || lustForPower > 100){
            throw new RuntimeException("неверно указаны данные resourcefulness");
        }
        this.name = name;
        this.witchcraft = witchcraft;
        this.transgress = transgress;
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }
    public void compareStudents(Slytherin studentSecond) {
        int powerOne = this.cunning + this.determination + this.ambition + this.resourcefulness+ this.lustForPower;
        int powerTwo = studentSecond.cunning + studentSecond.determination+studentSecond.ambition+studentSecond.resourcefulness+studentSecond.lustForPower;
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
        return "Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                '}';
    }
}

public class Gryffindor extends Hogwarts {
    private int nobility;

    private int honour;

    private int bravery;


    public void compareStudents(Gryffindor studentSecond, Slytherin dracoMalfoy){
        int powerOne = this.nobility+this.honour+this.bravery;
        int powerTwo = studentSecond.nobility+studentSecond.honour+studentSecond.bravery ;
        if (powerOne>powerTwo){
            System.out.println(this + " сильнее чем " + studentSecond);
        }else if (powerTwo>powerOne){
            System.out.println(studentSecond + " сильнее чем " + this);
        }else {
            System.out.println(this + " равен по силе с " + studentSecond);
        }
    }

    public Gryffindor(String name,int witchcraft,int transgress,int nobility, int honour, int bravery) {
        super(name,witchcraft,transgress);

        if (nobility < 0 || nobility > 100){
            throw new RuntimeException("неверно указаны данные nobility");
        }
        if (honour < 0 || honour > 100){
            throw new RuntimeException("неверно указаны данные honour");
        }
        if (bravery < 0 || bravery > 100){
            throw new RuntimeException("неверно указаны данные bravery");
        }
        this.name = name;
        this.witchcraft = witchcraft;
        this.transgress = transgress;
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonour() {
        return honour;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "nobility=" + nobility +
                ", honour=" + honour +
                ", bravery=" + bravery +
                '}';
    }
}

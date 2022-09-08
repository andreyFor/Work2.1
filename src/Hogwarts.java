public class Hogwarts {
    protected int faithful;
    protected int honest;
    protected int cunning;
    protected int determination;
    protected int ambition;
    protected int resourcefulness;
    protected int lustForPower;
    protected int smart;
    protected int wise;
    protected int witty;
    protected int fullOfCreativity;
    protected int industriousness;
    String name;
     int witchcraft;
     int transgress;

    public void compareStudents(Hogwarts studentSecond){
      int powerOne = this.witchcraft+this.transgress;
      int powerTwo = studentSecond.witchcraft+studentSecond.transgress;
      if (powerOne>powerTwo){
          System.out.println(this + " сильнее чем " + studentSecond);
      }else if (powerTwo>powerOne){
          System.out.println(studentSecond + " сильнее чем " + this);
      }else {
          System.out.println(this + " равен по силе с " + studentSecond);
      }
    }

    public Hogwarts(String name, int witchcraft, int transgress) {
        this.name = this.name;
        this.witchcraft = this.witchcraft;
        this.transgress = this.transgress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public void setWitchcraft(int witchcraft) {
        if (witchcraft<0 || witchcraft > 100 ){
            throw new RuntimeException("Введено неверное значение");
        }
        this.witchcraft = witchcraft;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        if (transgress<0 || transgress > 100 ){
            throw new RuntimeException("Введено неверное значение");
        }
        this.transgress = transgress;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", witchcraft=" + witchcraft +
                ", transgress=" + transgress +
                '}';
    }
}

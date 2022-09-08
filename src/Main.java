public class Main {
    public static void main(String[] args) {
       Gryffindor harryPotter = new Gryffindor("Harry Potter",10,15,15,20,36);
       Gryffindor hermioneGranger = new Gryffindor("Hermione Granger",52,45,22,31,39);
       Gryffindor ronWeasley = new Gryffindor("Ron Weasley",11,9,22,15,21);
       Slytherin dracoMalfoy = new Slytherin("Draco Malfoy",22,41,55,65,24,65,76);
       Slytherin grahamMontague = new Slytherin("Graham Montague",42,18,55,15,54,35,26);
       Slytherin gregoryGoyle = new Slytherin("Gregory Goyle",32,11,25,25,14,35,16);
       Hufflepuff zachariahSmith = new Hufflepuff("Zachariah Smith",21,42,42,32,21);
       Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory",11,22,37,49,31);
       Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley",11,22,52,72,11);
       Ravenclaw zhouChang = new Ravenclaw("Zhou Chang",82,91,11,12,31,21);
       Ravenclaw padmaPatil = new Ravenclaw("Padma Patil",12,18,19,22,41,12);
       Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby",62,11,11,19,21,14);


       harryPotter.compareStudents(dracoMalfoy);
       marcusBelby.compareStudents(ronWeasley);


    }
}
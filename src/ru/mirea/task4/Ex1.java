package ru.mirea.task4;
import java.util.Objects;
import java.util.Scanner;

public class Ex1 {
    public enum fav{
        WINTER("W", -12),
        SPRING("SP", 4),
        SUMMER("S", 20) {
            public String getDescription() {
                return "тёплое время года";
            }
        },
        OUTUMN("O", -2);
        private String favCode;
        private Integer favTemp;

        fav(String favCode,Integer favTemp) {
            this.favCode = favCode;
            this.favTemp = favTemp;
        }
        public String getCode () {
            return this.favCode;
        }
        public Integer getTemp () {
            return this.favTemp;
        }
        public String getDescription(){
            return "холодное время года";
        }

    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите время года ");
        String time = in.nextLine();
        String favoriteTime = fav.SUMMER.getCode();
        if(Objects.equals(time, favoriteTime)) {
            System.out.println("Это мое любимое время года");
        }
        switch (time){
            case "W": GetEnum(fav.WINTER);
                Integer temperature1 = fav.WINTER.getTemp();
                System.out.println("средняя температура зимой равна: "+ temperature1);
                break;
            case "SP":GetEnum(fav.SPRING);
                Integer temperature2 = fav.SPRING.getTemp();
                System.out.println("средняя температура весной равна: "+ temperature2);
                break;
            case "S": GetEnum(fav.SUMMER);
                Integer temperature3 = fav.SUMMER.getTemp();
                System.out.println("средняя температура летом равна: "+ temperature3);
                break;
            case "O": GetEnum(fav.OUTUMN);
                Integer temperature4 = fav.OUTUMN.getTemp();
                System.out.println("средняя температура осенью равна: "+ temperature4);
                break;
        }
        printAllSeasons();
    }
    public static void GetEnum(fav favv){
        switch (favv){
            case WINTER: System.out.println("я люблю зиму");
            break;
            case SPRING: System.out.println("я люблю весну");
            break;
            case SUMMER: System.out.println("я люблю лето");
            break;
            case OUTUMN: System.out.println("я люблю осень");
            break;
        }
    }
    public static void printAllSeasons(){
        for (fav s: fav.values()){
            System.out.println(s + " Средняя температура:" + s.getTemp() + " Это " + s.getDescription());
        }
    }
}

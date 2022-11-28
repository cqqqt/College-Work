import AborigenArmy.AborigenAbstractFactory;
import ProfesionaleArmy.ProfesionalyAbstractFabryc;
import RookieArmy.RokieAbstractFactory;
import Interface.*;



public class ArmyAbstractFctory {
    public static void main(String[] args) {
        String armyType="aborigen";
        String armyType1="profesionaly";
        String armyType2="rokie";

        IAbstractFactory factory=null;
        IAbstractFactory factory1=null;
        IAbstractFactory factory2=null;

        if(armyType.equals("aborigen")){
            factory=new AborigenAbstractFactory();

        }
        else if(armyType.equals("profesionaly"))
        {
            factory=new ProfesionalyAbstractFabryc();

        }
        else if(armyType.equals("rokie"))
        {
            factory=new RokieAbstractFactory();

        }
        else {
            System.out.println("Тип такой армии не найден!");
        }



        if(armyType1.equals("aborigen")){

            factory1=new AborigenAbstractFactory();

        }
        else if(armyType1.equals("profesionaly"))
        {

            factory1=new ProfesionalyAbstractFabryc();
            //factory2=new ProfesionalyAbstractFabryc();
        }
        else if(armyType1.equals("rokie"))
        {
            //factory=new RokieAbstractFactory();
            factory1=new ProfesionalyAbstractFabryc();
            //factory2=new RokieAbstractFactory();
        }
        else {
            System.out.println("Тип такой армии не найден!");
        }



        if(armyType2.equals("aborigen")){

            factory2=new RokieAbstractFactory();

        }
        else if(armyType2.equals("profesionaly"))
        {

            factory2=new RokieAbstractFactory();
            //factory2=new ProfesionalyAbstractFabryc();
        }
        else if(armyType2.equals("rokie"))
        {
            //factory=new RokieAbstractFactory();
            factory2=new RokieAbstractFactory();
            //factory2=new RokieAbstractFactory();
        }
        else {
            System.out.println("Тип такой армии не найден!");
        }
        //////////Туземцы
        FootArmy footArmy=factory.getFootArmy();
        System.out.println(footArmy.getFootArmyType());
        TankArmy tankArmy=factory.getTankArmy();
        System.out.println(tankArmy.getTankArmyType());
        HorseArmy horseArmy=factory.getHorseArmy();
        System.out.println(horseArmy.getHorseArmyType());


///////////////////////Профеессионал
        FootArmy footArmy1=factory1.getFootArmy();
        System.out.println(footArmy1.getFootArmyType());
        TankArmy tankArmy1=factory1.getTankArmy();
        System.out.println(tankArmy1.getTankArmyType());
        HorseArmy horseArmy1=factory1.getHorseArmy();
        System.out.println(horseArmy1.getHorseArmyType());
//////////////////////////////////Новобранцы
        FootArmy footArmy2=factory2.getFootArmy();
        System.out.println(footArmy2.getFootArmyType());
        TankArmy tankArmy2=factory2.getTankArmy();
        System.out.println(tankArmy2.getTankArmyType());
        HorseArmy horseArmy2=factory2.getHorseArmy();
        System.out.println(horseArmy2.getHorseArmyType());
    }
}

package AborigenArmy;

import Interface.TankArmy;
import Interface.HorseArmy;
import Interface.IAbstractFactory;
import Interface.FootArmy;


public class AborigenAbstractFactory implements IAbstractFactory{


    @Override
    public FootArmy getFootArmy(){return new AborigenFootArmy(); }
    @Override
    public   HorseArmy getHorseArmy() {return new AborigenHorseArmy(); };
    @Override
    public TankArmy getTankArmy() { return new AborigenTankArmy(); }




}

package RookieArmy;

import Interface.TankArmy;
import Interface.HorseArmy;
import Interface.IAbstractFactory;
import Interface.FootArmy;


public class RokieAbstractFactory implements IAbstractFactory {
    @Override
    public FootArmy getFootArmy(){return new RookieFootArmy(); }
    @Override
    public   HorseArmy getHorseArmy() {return new RookieHorseArmy(); };
    @Override
    public TankArmy getTankArmy() { return new RookieTankArmy(); }
}

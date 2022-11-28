package ProfesionaleArmy;


import Interface.TankArmy;
import Interface.HorseArmy;
import Interface.IAbstractFactory;
import Interface.FootArmy;



public class ProfesionalyAbstractFabryc implements IAbstractFactory{


    @Override
    public FootArmy getFootArmy(){return new ProfessionalyFootArmy(); }
    @Override
    public   HorseArmy getHorseArmy() {return new ProfessionalyHorseArmy(); };
    @Override
    public TankArmy getTankArmy() { return new ProffessionalyTankArmy(); }
}

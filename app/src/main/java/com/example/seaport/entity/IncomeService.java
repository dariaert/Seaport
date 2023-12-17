package com.example.seaport.entity;

public class IncomeService extends Income{

    private int ships;
    private float costPerShip;

    public IncomeService(int id, String nameIncome, int ships, float costPerShip){
        super(id, nameIncome);
        this.ships = ships;
        this.costPerShip = costPerShip;
    }

    @Override
    public float allIncome(){
        return ships * costPerShip;
    }

}

package com.example.seaport.entity;

public class IncomeRent extends Income{

    private float allIncomeRent;

    public  IncomeRent(int id, String nameIncome, float allIncomeRent){
        super(id, nameIncome);
        this.allIncomeRent = allIncomeRent;
    }

    @Override
    public float allIncome(){
        return allIncomeRent;
    }

}

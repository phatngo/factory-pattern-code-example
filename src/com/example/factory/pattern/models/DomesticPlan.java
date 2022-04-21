package com.example.factory.pattern.models;

import com.example.factory.pattern.enums.PlanType;

public class DomesticPlan extends Plan{
    @Override
    public void getRate() {
        rate = 5;
    }

    @Override
    public void getName() {
        System.out.println(PlanType.DOMESTIC_PLAN);
    }
}

package com.example.factory.pattern.models;

import com.example.factory.pattern.enums.PlanType;

public class CommercialPlan extends Plan{
    @Override
    public void getRate() {
        rate = 6;
    }

    @Override
    public void getName() {
        System.out.println(PlanType.COMMERCIAL_PLAN);
    }
}

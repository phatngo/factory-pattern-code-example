package com.example.factory.pattern.models;

import com.example.factory.pattern.enums.PlanType;

public class InstitutionalPlan extends Plan{
    @Override
    public void getRate() {
        rate = 7;
    }

    @Override
    public void getName() {
        System.out.println(PlanType.INSTITUTIONAL_PLAN);
    }
}

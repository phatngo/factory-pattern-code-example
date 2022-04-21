package com.example.factory.pattern.test;

import com.example.factory.pattern.enums.PlanType;
import com.example.factory.pattern.factory.PlanFactory;
import com.example.factory.pattern.models.Plan;

public class PlanBillGenerator {
    public static void main(String[] args){
        PlanFactory planFactory = new PlanFactory();

        Plan domesticPlan = planFactory.getPlan(String.valueOf(PlanType.DOMESTIC_PLAN));
        domesticPlan.getName();
        domesticPlan.getRate();
        domesticPlan.calculateBill(5);

        Plan commercialPlan = planFactory.getPlan(String.valueOf(PlanType.COMMERCIAL_PLAN));
        commercialPlan.getName();
        commercialPlan.getRate();
        commercialPlan.calculateBill(5);

        Plan institutionalPlan = planFactory.getPlan(String.valueOf(PlanType.INSTITUTIONAL_PLAN));
        institutionalPlan.getName();
        institutionalPlan.getRate();
        institutionalPlan.calculateBill(5);
    }
}

package com.example.factory.pattern.factory;

import com.example.factory.pattern.enums.PlanType;
import com.example.factory.pattern.models.CommercialPlan;
import com.example.factory.pattern.models.DomesticPlan;
import com.example.factory.pattern.models.InstitutionalPlan;
import com.example.factory.pattern.models.Plan;

import static com.example.factory.pattern.enums.PlanType.DOMESTIC_PLAN;

public class PlanFactory {
    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        if (planType.equalsIgnoreCase(String.valueOf(DOMESTIC_PLAN))) {
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase(String.valueOf(PlanType.COMMERCIAL_PLAN))) {
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase(String.valueOf(PlanType.INSTITUTIONAL_PLAN))) {
            return new InstitutionalPlan();
        }

        return null;
    }
}

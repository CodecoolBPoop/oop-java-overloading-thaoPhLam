package com.codecool.uml.overloading;

import java.util.Date;

public class FeaturedProductCategory extends ProductCategory{
    private Date startDate;
    private Date endDate;

    public FeaturedProductCategory(String name, String department, String description) {
        super(name, department, description);
    }

    public void schedule(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        String originalString = super.toString();

        return String.format(
                "[FeaturedProductCategory:%s, startDate:%tD, endDate:%td]",
                originalString,
                this.startDate,
                this.endDate
        );
    }
}

package com.pack1.day25;

public interface PricingStrategy 
{
    public abstract double calculatePrice(double totalAmount,boolean isFrequentShopper);
}

package com.fontys.softwarecraftsmanship;

import com.fontys.softwarecraftsmanship.states.computer.ComputerState;
import com.fontys.softwarecraftsmanship.states.computer.NotReadyState;
import com.fontys.softwarecraftsmanship.states.computer.ReadyState;

public class Computer {
    PartList parts = new PartList();
    public ComputerState state = new NotReadyState();
    
    public int NumberOfParts() {
        return parts.size();
    }
    
    public void AddPart(Part part) {
        if (part != null) parts.add(part);
    }
    
    public double GetPrice() {
        double price = 0.0;
        for (int index = 0; index < NumberOfParts(); index = index + 1) {price = price + parts.GetPriceOfPart(index);}
        return price;
    }
    
    public boolean IsComplete() {
        state = new NotReadyState();
        if (parts.hasListOfParts(new String[]{"Casing", "Motherboard", "Processor", "Memory"})){state = new ReadyState();}
        return state.isRead();
    }
}

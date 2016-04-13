package com.fontys.softwarecraftsmanship;

import com.fontys.softwarecraftsmanship.states.computer.ComputerState;

public class Main {

    public static void main(String[] args) {
        
        Computer computer = new Computer();
        
        computer.AddPart(new Part("Casing", "Cooler Master Centurion 6", 49.50, "Midi tower"));
        computer.AddPart(new Part("Processor", "Intel i7-4790", 295.0, 3.6));
        computer.AddPart(new Part("Memory", "G.SKILL Ripjaws X Series", 99.99, "DDR3", 16));
        computer.AddPart(new Part("Motherboard", "MSI H97 PC MATE - Socket 1150 - ATX", 89.0));

        ComputerState currentState = computer.state;
        currentState.printPrice(computer);
    }
}

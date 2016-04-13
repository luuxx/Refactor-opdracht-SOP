package com.fontys.softwarecraftsmanship.states.computer;

import com.fontys.softwarecraftsmanship.Computer;

import static java.lang.System.*;

/**
 * Created by Luxiam on 4/7/2016.
 */
public class NotReadyState implements ComputerState {
    @Override
    public void printPrice(Computer c) {
        out.println("Your computer is not ready yet...");
    }

    @Override
    public boolean isRead() {
        return false;
    }
}

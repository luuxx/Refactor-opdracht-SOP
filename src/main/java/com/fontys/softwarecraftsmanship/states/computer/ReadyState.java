package com.fontys.softwarecraftsmanship.states.computer;

import com.fontys.softwarecraftsmanship.Computer;

import static java.lang.System.*;

/**
 * Created by Luxiam on 4/7/2016.
 */
public class ReadyState implements ComputerState {
    @Override
    public void printPrice(Computer c) {
        String message = "Total price is EUR " + c.GetPrice();
        out.println(message);
    }

    @Override
    public boolean isRead() {
        return true;
    }
}

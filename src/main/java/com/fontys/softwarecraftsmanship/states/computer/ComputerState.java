package com.fontys.softwarecraftsmanship.states.computer;

import com.fontys.softwarecraftsmanship.Computer;

/**
 * Created by Luxiam on 4/7/2016.
 */
public interface ComputerState {
    void printPrice(Computer c);
    boolean isRead();
}

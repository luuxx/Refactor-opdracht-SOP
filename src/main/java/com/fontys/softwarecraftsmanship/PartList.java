package com.fontys.softwarecraftsmanship;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Luxiam on 4/7/2016.
 */
public class PartList {
    List<Part> partList = new ArrayList<>();

    public PartList() { }

    public Part GetPartFromList(int index) { return partList.get(index); }

    public boolean PartListContainsPartType(String typeToTest) {
        for (Part part : partList) { if (part.isOfType(typeToTest)) return true; }
        return false;
    }

    public int size() { return partList.size(); }

    public void add(Part newPart) { partList.add(newPart); }

    public boolean hasListOfParts(String[] listOfParts){
        List<String> listToTest = Arrays.asList(listOfParts);
        int numberOfParts = listOfParts.length;

        if(partList.size() == 0) return false;
        if(partList.size() < numberOfParts) return false;
        for (Part part : partList) {String type = part.type; if(!listToTest.contains(type)) return false;}

        return true;
    }

    public double GetPriceOfPart(int index) {
        return GetPartFromList(index).price;
    }
}

package com.hillel.shevchenko.HomeWork4;

public class WarInChina {
    public static void main(String[] args) {

        int numbOfUnitsLin = 860;

        int warriorAttackLi = 13;
        int archerAttackLi = 24;
        int riderAttackLi = 46;

        int strengthLi = warriorAttackLi * numbOfUnitsLin + archerAttackLi * numbOfUnitsLin + riderAttackLi * numbOfUnitsLin;

        System.out.println("Power army Li" + " = " + strengthLi);

        double numberMin = 1.5;
        double numberSoldiersMin = numbOfUnitsLin * numberMin;

        int warriorAttackMin = 9;
        int archerAttackMin = 35;
        int riderAttackMin = 12;

        double strenghtMin = warriorAttackMin * numberSoldiersMin + archerAttackMin * numberSoldiersMin + riderAttackMin * numberSoldiersMin;

        System.out.println("Power army Min = " + (int)strenghtMin);
   }
}

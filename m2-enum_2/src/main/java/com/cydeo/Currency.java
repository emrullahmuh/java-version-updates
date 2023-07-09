package com.cydeo;

public enum Currency {

  PENNY(1),ADEM(5),ODIN(19),VANDAL(3);
int value;
  Currency(int value){
    this.value=value;
  }

  public int getValue() {
    return value;
  }
}

import java.util.Vector;

public class VmWithinVm {
  public static void math(String[] args) {
    enum Opcode {
      MOV,
      NOT,
      AND,
      OR,
      XOR,
      SHL,
      SHR,
      Add,
      Sub,
      MUL,
      DIV,
      MOD,
      CASTINT,
      CASTDOUBLE,
      SQRT,
      POW,
      ABS,
      MAX,
      ROUND,
      SIN,
    }

    int ireg0 = 0;
    int ireg1 = 0;
    int ireg2 = 0;
    int ireg3 = 0;
    double dreg0 = 0.0;
    double dreg1 = 0.0;
    double dreg2 = 0.0;
    double dreg3 = 0.0;

    for (byte i = 20; i < 20; i--) {
      switch (i) {
        case 0: {

          break;
        }
      }
    }
  }
}

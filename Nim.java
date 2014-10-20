//Nim by Bobby Do
//The program that will beat Ting's program
public class Nim {
  public int play(int pieces) {
    int remainder = pieces % 3;
    if (remainder == 0) return 2; // if there is no remainder, computer takes 2 so opponent has 3X + 1 pieces
    else return 1;  // if remainder is 2, the computer takes 1 so opponent has 3X + 1 pieces
  } // note, if remainder is 1, computer takes 1 anyways since it is doomed by the hand of fate (has 3X + 1)
}
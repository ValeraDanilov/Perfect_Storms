package perfect.storms.lesson12;

import perfect.storms.lesson12.black.*;
import perfect.storms.lesson12.white.*;

public class Play {

    private static Logic logic = new Logic();

    public static void main(String[] args) {

    }

    private void whenAddFigureBlack() {
        logic.add(new RookBlack(Cell.A1));
        logic.add(new RookBlack(Cell.H1));
        logic.add(new HorseBlack(Cell.B1));
        logic.add(new HorseBlack(Cell.G1));
        logic.add(new ElephantBlack(Cell.C1));
        logic.add(new ElephantBlack(Cell.F1));
        logic.add(new QueenBlack(Cell.D1));
        logic.add(new KingBlack(Cell.E1));
        logic.add(new PawnBlack(Cell.A2));
        logic.add(new PawnBlack(Cell.B2));
        logic.add(new PawnBlack(Cell.C2));
        logic.add(new PawnBlack(Cell.D2));
        logic.add(new PawnBlack(Cell.E2));
        logic.add(new PawnBlack(Cell.F2));
        logic.add(new PawnBlack(Cell.G2));
        logic.add(new PawnBlack(Cell.H2));
    }

    private void whenAddFigureWhite() {
        logic.add(new RookWhite(Cell.A8));
        logic.add(new RookWhite(Cell.H8));
        logic.add(new HorseWhite(Cell.B8));
        logic.add(new HorseWhite(Cell.G8));
        logic.add(new ElephantWhite(Cell.C8));
        logic.add(new ElephantWhite(Cell.F8));
        logic.add(new QueenWhite(Cell.D8));
        logic.add(new KingWhite(Cell.E8));
        logic.add(new PawnWhite(Cell.A7));
        logic.add(new PawnWhite(Cell.B7));
        logic.add(new PawnWhite(Cell.C7));
        logic.add(new PawnWhite(Cell.D7));
        logic.add(new PawnWhite(Cell.E7));
        logic.add(new PawnWhite(Cell.F7));
        logic.add(new PawnWhite(Cell.G7));
        logic.add(new PawnWhite(Cell.H7));
    }

    @Override
    public String toString() {
        return "Play{}";
    }
}

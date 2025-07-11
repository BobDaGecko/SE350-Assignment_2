// @formatter:off
////////////////////////////////////////////////////////////////////////////
//                         Kellen Siczka - 2082880                        //
//                        DePaul University - 24/25                       //
//              SE350 - Object-Oriented Software Development              //
//                ksiczka@depaul.edu | edu@kellensiczka.com               //
//         Eclipse Adoptium JRE 21.0.5.11 - Win11/WSL2 - MS VSCode        //
//           Completed by Kellen Siczka unless otherwise noted            //
//        Note: Docstrings and explanations may be generated by AI        //
////////////////////////////////////////////////////////////////////////////
//                         Week 7 - Spring Quarter                        //
//                          Lab 8 - Due 05-12-2025                        //
//                File Info: #1/17 | Game.java | Java Main                //
////////////////////////////////////////////////////////////////////////////
// @formatter:on

package dpu.se350.assignment2;

public class Game {
    public static void main(String[] args) {
        // initialize some chambers
        Chamber[] chambers = new Chamber[] {new Chamber(), new Chamber(new Axe()),
                new Chamber(new Shield()), new Chamber(), new Chamber()};

        // connect the chambers with doors
        Door.connect(chambers[0], chambers[1]);
        Door.connect(chambers[1], chambers[2], new Monster("Goblin", 1, 0, 3));
        Door.connect(chambers[2], chambers[3], new Monster("Spider", 3, 0, 5));
        Door.connect(chambers[3], chambers[4]);

        Character player = new Wizard("Gandalf");

        // initialize the dungeon with player, entry chamber, and goal chamber
        Dungeon d = new Dungeon(player, chambers[0], chambers[4]);

        TextUI ui = new TextUI();
        ui.play(d);
    }
}

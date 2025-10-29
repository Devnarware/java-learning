import java.util.*;

public class TowerOfHanoiGame {
    static final int NUM_DISKS = 3
    ;
    static Map<String, Stack<Integer>> pegs = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        pegs.put("A", new Stack<>());
        pegs.put("B", new Stack<>());
        pegs.put("C", new Stack<>());

        // Initialize source peg
        for (int i = NUM_DISKS; i >= 1; i--) {
            pegs.get("A").push(i);
        }

        while (true) {
            clearScreen();
            drawTowers();

            if (pegs.get("C").size() == NUM_DISKS || pegs.get("B").size() == NUM_DISKS) {
                System.out.println(" Congratulations! You've solved the puzzle.");
                break;
            }

            System.out.print("Enter move (e.g., A C): ");
            String from = scanner.next().toUpperCase();
            String to = scanner.next().toUpperCase();

            if (!pegs.containsKey(from) || !pegs.containsKey(to)) {
                System.out.println(" Invalid peg. Use A, B, or C.");
                pause();
                continue;
            }

            if (pegs.get(from).isEmpty()) {
                System.out.println("Cannot move from empty peg.");
                pause();
                continue;
            }

            int disk = pegs.get(from).peek();
            if (!pegs.get(to).isEmpty() && pegs.get(to).peek() < disk) {
                System.out.println("Invalid move. Cannot place larger disk on smaller one.");
                pause();
                continue;
            }

            pegs.get(to).push(pegs.get(from).pop());
        }
    }

    static void drawTowers() {
        int height = NUM_DISKS;

        for (int level = height - 1; level >= 0; level--) {
            for (String peg : List.of("A", "B", "C")) {
                Stack<Integer> stack = pegs.get(peg);
                if (stack.size() > level) {
                    int diskSize = stack.get(level);
                    printDisk(diskSize);
                } else {
                    printRod();
                }
                System.out.print("\t");
            }
            System.out.println();
        }

        System.out.println("-----------\t-----------\t-----------");
        System.out.println("    A       \t    B     \t    C     ");
    }

    static void printDisk(int size) {
        int pad = NUM_DISKS - size;
        String disk = "[" + "-".repeat(size * 2 - 1) + "]";
        System.out.print(" ".repeat(pad) + disk + " ".repeat(pad));
    }

    static void printRod() {
        System.out.print(" ".repeat(NUM_DISKS) + "|" + " ".repeat(NUM_DISKS));
    }

    static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                System.out.print("\033[H\033[2J");
        } catch (Exception e) {
            System.out.println("\n".repeat(20));
        }
    }

    static void pause() {
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
        scanner.nextLine(); // Consume newline
    }
}


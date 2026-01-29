package Liam.season2;

public class java_methods {
    static void main(String[] args) {
        // ** METHODS **

        // Vars with different types to encourage casting
        int[] agentStats = new int[5];
        agentStats[0] = 100;
        agentStats[1] = 88;
        agentStats[2] = 87;
        agentStats[3] = 6767;
        agentStats[4] = -48;

        // agent array
        String[] agents = new String[5];
        agents[0] = "Vivian Banshee";
        agents[1] = "Ye shungang";
        agents[2] = "Hoshimi Miyabi";
        agents[3] = "Ben nigger";
        agents[4] = "koleda's father";

        // status
        String[] status = new String[5];
        status[0] = "ready to mingle <3";
        status[1] = "ready for battle";
        status[2] = "broke her left ear";
        status[3] = "ready for battle";
        status[4] = "not ready";

        tacticalSelectionDisplay(agents, agentStats, status);

        //methods are much like functions in other programming languagues
        // we write them outside the curly brackets
    }

    private static void tacticalSelectionDisplay(String[] agents, int[] agentStats, String[] status) {
        // print on screen
        for (int i = 0; i < agents.length; i++) {
            System.out.println("Agent name: " + agents[i] + "\nPower level: " + agentStats[i] + "\nStatus: " + status[i] + "\n======");
        }
    }

    // ---> here we start writing methods!
    // first we define the scope and the var type it will return
    public static int sumOfTwoNumbers(int x, int y) {
        // inside the method body, we return something
        return x + y;
    }
}

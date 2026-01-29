package Liam.season2.projects;

public class Tactical_Selection_Sys {
    static void main(String[] args){
        /* ==========================
        *  Create a program that takes an array of soldier names, processes their names, determines their "power level"
        * and uses a ternary operator to decide if they are ready for the mission
        * ============================
        * */

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

        // print on screen
        for (int i = 0; i < agents.length; i++) {
            System.out.println("Agent name: " + agents[i] + "\nPower level: " + agentStats[i] + "\nStatus: " + status[i] + "\n======");
        }

    }
}

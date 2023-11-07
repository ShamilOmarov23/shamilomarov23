
package Task_1_2_6;
public class MonitorsCounter {
    public static void main(String[] args) {
        int result = drawisMonitorsCounter(100, 70);
        System.out.println("result = " + result);
    }
    public static int drawisMonitorsCounter(int monitors, int programmers) {
        int remainMonitors = monitors-programmers;
        return remainMonitors;
    }
}


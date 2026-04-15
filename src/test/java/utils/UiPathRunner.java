package utils;

public class UiPathRunner {

    public static void runBot() {
        try {

            String uipathPath = "C:\\Program Files\\UiPathPlatform\\Studio\\26.0.190-cloud.22531\\UiRobot.exe";

            ProcessBuilder builder = new ProcessBuilder(
                    uipathPath,
                    "execute",
                    "--process",
                    "loginkptcl"
            );

            builder.inheritIO();
            Process process = builder.start();
            process.waitFor();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
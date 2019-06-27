package DesignPrinciples.src.StopWatch;

class Running implements IStopWatch {

    @Override
    public void start() {
        try {
            System.out.println("Error Cannot start");
        } catch (Exception e) {
        }
    }

    @Override
    public void stop() {
        System.out.println("Stopwatch stopped");
    }

    @Override
    public void pause() {
        System.out.println("Stopwatch paused");
    }

    @Override
    public void resume() {
        try {
            System.out.println("Error Cannot resume");
        } catch (Exception e) {
        }
    }
}
package DesignPrinciples.src.StopWatch;

class Main {

    IStopWatch ref;

    public void startStopwatch() {
        ref = new Idle();
        ref.start();
        ref = new Running();
    }

    public void pauseStopWatch() {
        ref.pause();
        ref = new Suspended();
    }

    public void resumeStopWatch() {
        ref.resume();
        ref = new Running();
    }

    public void stopStopWatch() {
        ref.stop();
        ref = new Idle();
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.startStopwatch();
        obj.pauseStopWatch();
        obj.resumeStopWatch();
        obj.stopStopWatch();
    }
}
package DesignPrinciples.src.StopWatch;

class Idle implements IStopWatch {

    @Override
    public void start() {
        System.out.println("Started");
    }

    @Override
    public void stop() {
        try {
            System.out.println("Error Cannot stop");
        } catch (Exception e) {
        }
    }

    @Override
    public void pause() {
        try {
            System.out.println("Error Cannot pause");
        } catch (Exception e) {
        }
    }

    @Override
    public void resume() {
        try {
            System.out.println("Error Cannot resume");
        } catch (Exception e) {
        }
    }
}
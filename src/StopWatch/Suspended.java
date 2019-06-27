package DesignPrinciples.src.StopWatch;

class Suspended implements IStopWatch {

    @Override
    public void start() {
        try {
            System.out.println("Error Cannot Start");
        } catch (Exception e) {
        }
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
        System.out.println("Resumed");
    }
}
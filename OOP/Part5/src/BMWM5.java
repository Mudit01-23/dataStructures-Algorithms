public class BMWM5 {
    private Engine engine ;
    //private Media player = new CDPlayer();
    private Media player;


    //

    public BMWM5(){
        engine = new GasolineEngine();
        player = new CDPlayer();

    }

//
//    public BMWM5(){
//        engine = new ElectricEngine();
//        player = new CDPlayer();
//    }





    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }

    public void stopMusic(){
        player.stop();
    }

    public void upgradeEngine(Engine engine){
        this.engine = engine;
    }





    public static void main(String[] args) {
        BMWM5 m5 = new BMWM5();
        m5.start();
        m5.stop();
        m5.startMusic();
        m5.stopMusic();


        m5.upgradeEngine(new ElectricEngine());
        m5.start();
        m5.stop();
    }
}

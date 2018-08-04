package singh.rahul.example.com.myapplication28;

public abstract class Computer {
    private final String name;
    private final String screen;
    private final String keyboard;
    public Computer(String name, String screen, String keyboard)
    {
        this.name=name;
        this.screen=screen;
        this.keyboard=keyboard;

    }

    public String getScreen() {
        return screen;
    }

    public String getName() {
        return name;
    }

    public String getKeyboard() {
        return keyboard;
    }

    @Override
    public String toString() {
        return  String.format("%s%n %s%n %s" , getName() , getScreen(), getKeyboard());

    }
    public abstract  double evaulatePerformance();

    public static class TableComputer extends SmartPhoneComputer {


    private int screenSize;

    public TableComputer(String name,String screen,String keyboard,
                         String operatingSystem,double cpuPower, double ram,int screenSize){
        super(name,screen,keyboard,operatingSystem,cpuPower,ram);

        if(screenSize<=0)
        {
            throw  new IllegalArgumentException("the screen size must be greater the 0");
        }
    this.screenSize=screenSize;
    }

        public int getScreenSize() {
            return screenSize;
        }

        public void setScreenSize(int screenSize) {
            this.screenSize = screenSize;
        }

        @Override
        public String toString() {
            return String.format("%s%n%s: %s",super.toString(),"Screen Size" , getScreenSize());
        }
    }
}

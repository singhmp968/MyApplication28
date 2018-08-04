package singh.rahul.example.com.myapplication28;

import singh.rahul.example.com.myapplication28.Computer;

public class SmartPhoneComputer extends Computer {

private  String operatingSystem;
private  double cpuPower;
private  double ram;

public  SmartPhoneComputer(String name,String screen,String keyboard,
                           String operatingSystem,double cpuPower, double ram)
{
    super(name,screen,keyboard);
if (cpuPower<=0)
{
    throw  new IllegalArgumentException("The value of cpu must be greater the 0");

}
if (ram<=0)
{
    throw new IllegalArgumentException("The value of cpu must be greater the 0");

}
this.operatingSystem=operatingSystem;
this.cpuPower=cpuPower;
this.ram=ram;

}

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getCpuPower() {
        return cpuPower;
    }

    public void setCpuPower(double cpuPower) {
    if(cpuPower<=0){
        throw new IllegalArgumentException("Value must be greater the 0");

    }
        this.cpuPower = cpuPower;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
    if (ram<=0){
        throw new IllegalArgumentException("Value must be greater the 0");
    }

        this.ram = ram;
    }

    @Override
    public double evaulatePerformance() {
        return cpuPower*ram;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s: %f%n%s: %f", super.toString(),"Cpu Power", getCpuPower(),"Ram",getRam() );
    }
}

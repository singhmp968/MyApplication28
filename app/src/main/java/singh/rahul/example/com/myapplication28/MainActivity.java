package singh.rahul.example.com.myapplication28;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        TextView txtDeskTopComputer = (TextView) findViewById(R.id.txtDeskTopomputer);
        TextView txtLaptopComputer = (TextView) findViewById(R.id.txtlatopComputer);
        TextView txtSmartPhoneComp = (TextView) findViewById(R.id.txtSmartPhoneComputer);
        TextView txtTabletComputer = (TextView) findViewById(R.id.txtTabletCom);
        TextView txtDesktopperformance = (TextView) findViewById(R.id.txtdeskyopComputerPerformance);
        TextView txtLaptopComputerPerformance = (TextView) findViewById(R.id.txtLaptopComputerPerformance);
        TextView txtSmartPhoneComputer = (TextView) findViewById(R.id.txtSmartPhoneComPerformance);
        TextView txtTabletComputerPerformance = (TextView) findViewById(R.id.txtSmartPhoneComPerformance);

        DesktopComputer desktopComputers = new DesktopComputer("iMac" , "High Quality Screen " , "physical keyboard","physical Mouse" ,2000,100 );
        LaptopComputers laptopComputer = new LaptopComputers("MacNookPro", "highQualityScreen" , "Physical Keyboard","phiysicl Mouse",500,400);
        SmartPhoneComputer smartPhoneComputer = new SmartPhonecomputer("iphone", "Reiana Screen", "Virtual Screen","Ios",500,400);
        TabletComputer tabletComputer = new TabletComputer("ipad","Retina Screen","Virtual Screen", "virtual KeyBoard",800,700,10);
txtDeskTopComputer.setText("performnce" + desktopComputers.evaluatePerformance());
txtLaptopComputer.setText("performance" + laptopComputer.evaluatePerformance());
txtSmartPhoneComp.setText("perfo" + SmartPhoneComp.evaluatePerformance());
txtTabletComputer.setText("Performance" +TabletComputer.evaluatePerformance() );

    Computer [] computers= new Computer[4];
        computers[0] = desktopComputers;
        computers[1] = LaptopComputers;
        computers[2] = smartPhoneComputer;
        computers[3] = TabletComputer;

        for(Computer computer : computers)
        {
            if(Computer instanceof  DesktopComputer)
            {
                DesktopComputer currentDesktopComputer = (DesktopComputer) computer;
                txtDeskTopComputer.setText(currentDesktopComputer.toString());
            }

            if(Computer instanceof  LaptopComputer)
            {
                LaptopComputer currentDesktopComputer = (LaptopComputer) computer;
                txtDeskTopComputer.setText(currentLaptopComputer.toString());


            }

            if(Computer instanceof  SmartPhoneComputer)
            {
                smartPhoneComputer Computer currentDesktopComputer = (SmartPhoneComputer) computer;
                txtDeskTopComputer.setText(currentSmartPhoneComputer.toString());


            }


}

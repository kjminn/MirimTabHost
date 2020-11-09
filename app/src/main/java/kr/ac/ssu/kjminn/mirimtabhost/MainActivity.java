package kr.ac.ssu.kjminn.mirimtabhost;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabSpecPark= tabHost.newTabSpec("Park").setIndicator("박세리");
        tabSpecPark.setContent(R.id.linear_park);
        tabHost.addTab(tabSpecPark);

        TabHost.TabSpec tabSpecSon= tabHost.newTabSpec("Son").setIndicator("손예진");
        tabSpecSon.setContent(R.id.linear_son);
        tabHost.addTab(tabSpecSon);

        TabHost.TabSpec tabSpecAhn= tabHost.newTabSpec("Ahn").setIndicator("안현모");
        tabSpecAhn.setContent(R.id.linear_ahn);
        tabHost.addTab(tabSpecAhn);

        tabHost.setCurrentTab(0);
    }
}
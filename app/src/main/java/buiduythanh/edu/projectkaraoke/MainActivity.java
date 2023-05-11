package buiduythanh.edu.projectkaraoke;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;

import java.util.ArrayList;

import buiduythanh.edu.adapterdsbaihat.adapterdsbaihat;
import buiduythanh.edu.model.BaiHat;

public class MainActivity extends AppCompatActivity {
    ListView lvDanhSachBaiHat;
    ArrayList<BaiHat> dsBaiHat;
    adapterdsbaihat adapterDsBaiHat;
    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {

    }

    private void addControls() {
        tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec tab1 = tabHost.newTabSpec("t1");
        tab1.setIndicator("1.Danh sách bài hát");
        tab1.setContent(R.id.tab1);
        tabHost.addTab(tab1);

        lvDanhSachBaiHat = (ListView) findViewById(R.id.lvDanhSachBaiHat);
        dsBaiHat = new ArrayList<>();
        dsBaiHat.add(new BaiHat(1,"Tha cho em đi","Đỗ Đình Mạnh"));
        adapterDsBaiHat = new adapterdsbaihat(this,R.layout.item,dsBaiHat);
        lvDanhSachBaiHat.setAdapter(adapterDsBaiHat);
    }
}
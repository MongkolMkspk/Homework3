package th.ac.su.cp.homework3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import th.ac.su.cp.homework3.model.WordItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //สร้าง Layout manager
        LinearLayoutManager lm =new LinearLayoutManager(MainActivity.this);
        //สร้าง adapter object
        MyAdapter adapter = new MyAdapter();

        //เข้าถึง RecycleView ใน Layout
        RecyclerView rv = findViewById(R.id.word_list_recycle_view);
        rv.setLayoutManager(lm);//อยากให้มี list แบบไหน->กำหนด layout manager ให้กับ recycleView
        rv.setAdapter(adapter);//อยากให้แสดงข้อมูลแบบไหน->กำหนด adapter ให้กับ recycleView

    }


}
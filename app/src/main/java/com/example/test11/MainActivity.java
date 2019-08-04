
package com.example.test11;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //a List of type hero for holding list items
    List<Hero> heroList;
    //the listview
    ListView listView;
    private EditText bil1;
    private EditText bil2;
    private EditText jumlah;
    private Button btnhasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
       // initUI();
       // initEvent();
        setListView();
    }
    public void setListView(){
        //initializing objects
        heroList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.listView);
//adding some values to our list
        heroList.add(new Hero(R.drawable.spiderman, "Spiderman",
                "Avengers"));
        heroList.add(new Hero(R.drawable.joker, "Joker", "Injustice Gang"));

        heroList.add(new Hero(R.drawable.ironman, "Iron Man",
                "Avengers"));
        heroList.add(new Hero(R.drawable.doctorstrange, "Doctor Strange", "Avengers"));
        heroList.add(new Hero(R.drawable.captainamerica, "Captain America", "Avengers"));
        heroList.add(new Hero(R.drawable.batman, "Batman", "Justice League"));
//creating the adapter
        MyListAdapter adapter = new MyListAdapter(this,
                R.layout.my_custom_list, heroList);
//attaching adapter to the listview
        listView.setAdapter(adapter);
    }

    private void initUI(){
        bil1 = (EditText) findViewById(R.id.Text1);
        bil2 = (EditText) findViewById(R.id.Text2);
        jumlah = (EditText) findViewById(R.id.Text3);
        btnhasil = (Button) findViewById(R.id.imageButton);
    }
    private void initEvent(){
        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitungjumlah();
            }
        });
    }
    private void hitungjumlah(){
        int angka1 = Integer.parseInt(bil1.getText().toString());
        int angka2 = Integer.parseInt(bil2.getText().toString());
        int Total = angka1 +angka2;
        jumlah.setText(Total+"");
    }
}

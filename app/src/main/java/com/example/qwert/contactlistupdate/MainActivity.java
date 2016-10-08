package com.example.qwert.contactlistupdate;

import android.content.Intent;
import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView contacts = (ListView) findViewById(R.id.listView);

        final String[] names = {"Money", "Alina", "Krendel", "Jack", "Obama", "Detective P.M.",
                "Trevor", "Bro", "Alena", "Denis"};
        final String[] emails = {"bigboss@gmail.com", "alina_karataeva@gmail.com", "sweet_man@gmail.com",
                "capt.jacksparrov@gmail.com", "president@whitehouse.gov",
                "intrige_murder_investigation@gmail.com", "gta5@gmail.com", "broAndrei@mail.ru",
                "alena_like_kh@gmail.com", "denis_tuchkov@gmail.com"};
        final String[] address = {"Unknown LOL", "Kiev", "Sweet Country", "In search of treasure",
                "White House", "House of detective", "Washington", "In a drinking bout",
                "Of course, Kharkov", "In Ukraine"};
        int imageIcon = R.mipmap.ic_icon;

        ArrayList<HashMap<String, Object>> myArrayList = new ArrayList<HashMap<String, Object>>(names.length);
        HashMap<String, Object> map;

        for (int i = 0; i < names.length; i++) {
            map = new HashMap<String, Object>();
            map.put("Name", names[i]);
            map.put("Email", emails[i]);
            map.put("Address", address[i]);
            map.put("Icon", imageIcon);
            myArrayList.add(map);
        }

        String[] from = {"Name", "Email", "icon"};
        int[] to = {R.id.name, R.id.email, R.id.icon};

        ListAdapter adapter = new SimpleAdapter(this, myArrayList, R.layout.hard_marking, from, to);
        contacts.setAdapter(adapter);

        final Intent intent = new Intent(this, NewActivity.class);

        contacts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                intent.putExtra("Name", names[position]);
                intent.putExtra("Email", emails[position]);
                intent.putExtra("Address", address[position]);
                startActivity(intent);
            }
        });

//        ArrayList<HashMap<String, String>> myArrayList = new ArrayList<HashMap<String, String>>();
//        HashMap<String, String> map;
//
//        map = new HashMap<String, String>();
//        map.put("Name", "Money");
//        map.put("Email", "bigboss@gmail.com");
//        map.put("Address", "Unknown LOL");
//        myArrayList.add(map);
//
//        map = new HashMap<String, String>();
//        map.put("Name", "Alina");
//        map.put("Email", "alina_karataeva@gmail.com");
//        map.put("Address", "Kiev");
//        myArrayList.add(map);
//
//        map = new HashMap<String, String>();
//        map.put("Name", "Krendel");
//        map.put("Email", "sweet_man@gmail.com");
//        map.put("Address", "Sweet Country");
//        myArrayList.add(map);
//
//        map = new HashMap<String, String>();
//        map.put("Name", "Jack");
//        map.put("Email", "capt.jacksparrov@gmail.com");
//        map.put("Address", "In search of treasure");
//        myArrayList.add(map);
//
//        map = new HashMap<String, String>();
//        map.put("Name", "Obama");
//        map.put("Email", "president@whitehouse.gov");
//        map.put("Address", "White House");
//        myArrayList.add(map);
//
//        map = new HashMap<String, String>();
//        map.put("Name", "Detective P.M.");
//        map.put("Email", "intrige_murder_investigation@gmail.com");
//        map.put("Address", "House of detective");
//        myArrayList.add(map);
//
//        map = new HashMap<String, String>();
//        map.put("Name", "Trevor");
//        map.put("Email", "gta5@gmail.com");
//        map.put("Address", "Washington");
//        myArrayList.add(map);
//
//        map = new HashMap<String, String>();
//        map.put("Name", "Bro");
//        map.put("Email", "broAndrei@mail.ru");
//        map.put("Address", "In a drinking bout");
//        myArrayList.add(map);
//
//        map = new HashMap<String, String>();
//        map.put("Name", "Alena");
//        map.put("Email", "alena_like_kh@gmail.com");
//        map.put("Address", "Of course, Kharkov");
//        myArrayList.add(map);
//
//        map = new HashMap<String, String>();
//        map.put("Name", "Denis");
//        map.put("Email", "denis_tuchkov@gmail.com");
//        map.put("Address", "In Ukraine");
//        myArrayList.add(map);
//
//        ListAdapter adapter = new SimpleAdapter(this, myArrayList, R.layout.hard_marking,
//                new String[] {"Name", "Email", "Address"},
//                new int[] {R.id.name, R.id.email});
//        contacts.setAdapter(adapter);
    }
}

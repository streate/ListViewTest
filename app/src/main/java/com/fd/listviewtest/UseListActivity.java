package com.fd.listviewtest;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class UseListActivity extends ListActivity {
    String[] animal = {"Duck", "Pig", "Panda", "Fish", "Tiger", "Cat", "Dog", "Bird"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listView = getListView();
        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, animal));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Toast.makeText(this, "你选择了：" + animal[position], Toast.LENGTH_SHORT).show();
    }
}

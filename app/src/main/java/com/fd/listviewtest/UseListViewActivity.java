package com.fd.listviewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class UseListViewActivity extends AppCompatActivity {
    String[] animal = {"Duck", "Pig", "Panda", "Fish", "Tiger", "Cat", "Dog", "Bird"};
    private List<Animal> animalLists = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_use_list_view);

        InitAnimals();

        ListView listView = (ListView) findViewById(R.id.lv);

        //ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, animal);
        AnimalAdapter adapter = new AnimalAdapter(UseListViewActivity.this, R.layout.animal_item, animalLists);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Animal animal = animalLists.get(position);
                Toast.makeText(UseListViewActivity.this, animal.getName(), Toast.LENGTH_SHORT).show();
                //Toast.makeText(UseListViewActivity.this, animal[position], Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void InitAnimals() {
        for (int i = 0; i < 2; i++) {
            Animal duck = new Animal("Duck", R.mipmap.duck);
            animalLists.add(duck);
            Animal pig = new Animal("Pig", R.mipmap.pig);
            animalLists.add(pig);
            Animal panda = new Animal("Panda", R.mipmap.panda);
            animalLists.add(panda);
            Animal fish = new Animal("Fish", R.mipmap.fish);
            animalLists.add(fish);
            Animal tiger = new Animal("Pear", R.mipmap.tiger);
            animalLists.add(tiger);
            Animal cat = new Animal("Grape", R.mipmap.cat);
            animalLists.add(cat);
            Animal dog = new Animal("Pineapple", R.mipmap.dog);
            animalLists.add(dog);
            Animal bird = new Animal("Strawberry", R.mipmap.bird);
            animalLists.add(bird);
        }
    }
}

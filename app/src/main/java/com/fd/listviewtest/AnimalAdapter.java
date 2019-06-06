package com.fd.listviewtest;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class AnimalAdapter extends ArrayAdapter<Animal> {
    private int resourceId;
    private String radioText="选中";
    public AnimalAdapter(Context context, int resource, List<Animal> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Animal animal = getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.ll_view = view.findViewById(R.id.ll_view);
            viewHolder.imageView = view.findViewById(R.id.iv_image);
            viewHolder.textView = view.findViewById(R.id.tv_text);
            viewHolder.rg_group = view.findViewById(R.id.rg_group);
            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.rg_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId){
                    case R.id.rb_select:
                        radioText = "选中";
                        break;
                    case R.id.rb_deselect:
                        radioText = "取消";
                        break;                }
            }
        });
        viewHolder.ll_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "你点击了第" + position + "项" + " ,你选择：" + radioText, Toast.LENGTH_SHORT).show();
            }
        });
        viewHolder.imageView.setImageResource(animal.getImageId());
        viewHolder.textView.setText(animal.getName());
        return view;
    }


    /*@NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Animal animal = getItem(position);
        View view;
        view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        LinearLayout ll_view = view.findViewById(R.id.ll_view);
        ImageView imageView = view.findViewById(R.id.iv_image);
        TextView  textView = view.findViewById(R.id.tv_text);
        RadioGroup rg_group = view.findViewById(R.id.rg_group);

        rg_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId){
                    case R.id.rb_select:
                        radioText = "选中";
                        break;
                    case R.id.rb_deselect:
                        radioText = "取消";
                        break;                }
            }
        });
        ll_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "你点击了第" + position + "项" + " ,你选择：" + radioText, Toast.LENGTH_SHORT).show();
            }
        });
        imageView.setImageResource(animal.getImageId());
        textView.setText(animal.getName());
        return view;
    }*/

    /*@NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Animal animal = getItem(position);
        View view;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        }else{
            view = convertView;
        }
        LinearLayout ll_view = view.findViewById(R.id.ll_view);
        ImageView imageView = view.findViewById(R.id.iv_image);
        TextView  textView = view.findViewById(R.id.tv_text);
        RadioGroup rg_group = view.findViewById(R.id.rg_group);

        rg_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId){
                    case R.id.rb_select:
                        radioText = "选中";
                        break;
                    case R.id.rb_deselect:
                        radioText = "取消";
                        break;                }
            }
        });
        ll_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "你点击了第" + position + "项" + " ,你选择：" + radioText, Toast.LENGTH_SHORT).show();
            }
        });
        imageView.setImageResource(animal.getImageId());
        textView.setText(animal.getName());
        return view;
    }
*/

    class ViewHolder {
        LinearLayout ll_view;
        ImageView imageView;
        TextView textView;
        RadioGroup rg_group;
    }
}

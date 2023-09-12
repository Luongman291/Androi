package com.example.btl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import me.zhanghai.android.materialratingbar.MaterialRatingBar;

public class DongDiaDiemAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<DiaDiem> diaDiemList;

    public DongDiaDiemAdapter(Context context, int layout, List<DiaDiem> diaDiemList) {
        this.context = context;
        this.layout = layout;
        this.diaDiemList = diaDiemList;
    }

    @Override
    public int getCount() {
        return diaDiemList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        ImageView imageView;
        TextView tenDiaDiem,diaChiDiaDiem;
        MaterialRatingBar rate;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder viewHolder;

        if (view == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            viewHolder.imageView = (ImageView) view.findViewById(R.id.imageViewDiaDiem);
            viewHolder.tenDiaDiem = (TextView) view.findViewById(R.id.TenDiaDiem);
            viewHolder.diaChiDiaDiem = (TextView) view.findViewById(R.id.DiaChiCuThe);
            viewHolder.rate = (MaterialRatingBar) view.findViewById(R.id.rate);

            view.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) view.getTag();
        }

        DiaDiem diaDiem = diaDiemList.get(i);
        viewHolder.tenDiaDiem.setText(diaDiem.getTenDiaDiem());
        viewHolder.diaChiDiaDiem.setText(diaDiem.getDiaChiCuThe());
        viewHolder.rate.setRating(diaDiem.getRate());


        return view;
    }
}

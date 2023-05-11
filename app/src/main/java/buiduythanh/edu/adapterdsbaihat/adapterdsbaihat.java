package buiduythanh.edu.adapterdsbaihat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import buiduythanh.edu.model.BaiHat;
import buiduythanh.edu.projectkaraoke.R;

public class adapterdsbaihat extends ArrayAdapter<BaiHat> {
    Context context;
    int resource;
    @NonNull List<BaiHat> objects;
    public adapterdsbaihat(@NonNull Context context, int resource, @NonNull List<BaiHat> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(this.resource,null);
        TextView txtMaBaiHat = (TextView) row.findViewById(R.id.txtMaBaiHat);
        TextView txtBaiHat = (TextView) row.findViewById(R.id.txtBaiHat);
        TextView txtCaSi = (TextView) row.findViewById(R.id.txtCaSi);
        BaiHat baiHat= this.objects.get(position);
        txtMaBaiHat.setText(baiHat.getMa());
        txtBaiHat.setText(baiHat.getTen());
        txtCaSi.setText(baiHat.getCaSi());

        return row;
    }
}

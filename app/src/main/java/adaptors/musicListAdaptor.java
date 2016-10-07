package adaptors;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import datamodels.Song;
import krudeboy.dancehallking.R;

/**
 * Created by Kory on 10/7/2016.
 */
public class musicListAdaptor extends BaseAdapter{

    ArrayList<Song> songList;
    Context context;

    public musicListAdaptor(Context context, int resource, ArrayList<Song> objects) {
        songList = objects;
        this.context = context;
    }

    @Override
    public int getCount() {
        return songList.size();
    }

    @Override
    public Object getItem(int position) {
        return songList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflator = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View row = inflator.inflate(R.layout.music_item_row, null, true);

        placeHolder holder = new placeHolder();

        holder.menuS = (Spinner) row.findViewById(R.id.music_menu_S);

        ArrayAdapter<CharSequence> adaptor = ArrayAdapter.createFromResource(context, R.array.music_menu_items, android.R.layout.simple_spinner_item);
        adaptor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        holder.menuS.setAdapter(adaptor);

        holder.menuS.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(),
                        "OnItemSelectedListener : " + parent.getItemAtPosition(position).toString(),
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        return row;
    }


    private class placeHolder{
        Spinner menuS;
        TextView title;
        TextView artist;
    }
}

/*

public class MainListAdaptor extends ArrayAdapter<PostDataSet>{

    ArrayList<PostDataSet> list;
    Context context;

    public MainListAdaptor(Context context, int resource, ArrayList<PostDataSet> list) {

        super(context, resource);
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflator = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View row = inflator.inflate(R.layout.post_layout, null, true);
//        list.get(position).setMainImage((ImageView) convertView.findViewById(R.id.postimage));
//        list.get(position).setRating((TextView) convertView.findViewById(R.id.overallrating));
//        list.get(position).setRatingBar((RatingBar) convertView.findViewById(R.id.postrating));

        return row;
    }
}
 */
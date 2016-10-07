package krudeboy.dancehallking;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

import adaptors.musicListAdaptor;
import datamodels.Song;

/**
 * Created by Kory on 10/6/2016.
 */
public class HomeFragment extends Fragment {
    private ListView lv;
    private EditText filter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment_layout, container, false);

        lv = (ListView) view.findViewById(R.id.home_lv);
        filter = (EditText) view.findViewById(R.id.home_filter);

        ArrayList<Song> list = new ArrayList<Song>();

        for (int i = 0; i < 20; i++){
            list.add(new Song("",""));
        }

        lv.setAdapter(new musicListAdaptor(getContext(),R.layout.music_item_row,list));

        return view;
    }
}


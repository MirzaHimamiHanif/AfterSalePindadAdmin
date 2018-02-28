package org.pindad.aftersalepindadadmin.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.pindad.aftersalepindadadmin.R;

public class OutboxFragment extends Fragment {
    public View empty;
    public TextView emptyTextView;

    public OutboxFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_outbox, container, false);
        initilizeView(rootView);
        return rootView;
    }

    public void initilizeView(View rootView){
        empty = rootView.findViewById(R.id.empty_view);
        emptyTextView = (TextView) rootView.findViewById(R.id.empty_view);
    }
}

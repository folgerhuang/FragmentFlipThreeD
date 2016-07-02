package com.jkxy.fragmentflipthreed;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {


    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_second, container, false);
        inflate.findViewById(R.id.btnBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager()
                        .beginTransaction()
                        .setCustomAnimations(
                                R.animator.card_flip_right_in,
                                R.animator.card_flip_right_out,
                                R.animator.card_flip_left_in,
                                R.animator.card_flip_left_out)
                        .addToBackStack(null)
                        .replace(R.id.container, new FirstFragment())
                        .commit();
            }
        });
        return inflate;
    }

}

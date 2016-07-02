package com.jkxy.fragmentflipthreed;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {


    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_first, container, false);
        inflate.findViewById(R.id.btnGoToNext).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager()
                        .beginTransaction()
                        .setCustomAnimations(
                                R.animator.card_flip_left_in,
                                R.animator.card_flip_left_out,
                                R.animator.card_flip_right_in,
                                R.animator.card_flip_right_out)
                        .addToBackStack(null)
                        .replace(R.id.container, new SecondFragment())
                        .commit();
            }
        });
        return inflate;
    }


}

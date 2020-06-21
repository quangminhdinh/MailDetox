package com.codebrush.maildetox;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 *
 */
public class UsersFragment extends Fragment {



    public UsersFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View userView = inflater.inflate(R.layout.fragment_users, container, false);
        ImageButton but = (ImageButton) userView.findViewById(R.id.but);
        but.setBackgroundResource(R.drawable.add);
        but.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
//                        Toast.makeText(getContext(), "Clicked!", Toast.LENGTH_SHORT).show();
//                        signIn();

                        ((MainActivity) getActivity()).signIn();
                    }
                });
        return userView;
    }
}
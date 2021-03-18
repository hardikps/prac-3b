package com.example.prac3b;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentLife#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentLife extends Fragment {
    String tag = "Lifecycle";

    public FragmentLife() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_life, container, false);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d(tag, "In the onAttach event");
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(tag, "In the onViewCreated() event");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(tag, "In the onStart() event");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(tag, "In the onResume() event");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(tag, "In the onPause() event");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(tag, "In the onStop() event");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(tag, "In the onDestroyView() event");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(tag, "In the onDestroy() event");
    }
}

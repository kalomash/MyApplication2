package com.example.admin.durban_tour_guild_app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.firebase.client.Firebase;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;

import java.util.ArrayList;
import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by Admin on 7/28/2017.
 */

public class MuseumFragment extends Fragment {
    private ListView mDurbansListView;
    private  DurbanAdapter mDurbanAdapter;
    private DatabaseReference mDatabaseReference;
    private FirebaseDatabase tFirebaseDatabase;
    private ChildEventListener mChildEventListener;
   FirebaseStorage tFirebaseStorage;


    private Firebase myRef;
    private String value;

    private ArrayList<String> list = new ArrayList<>();
    private ListView sListView;

    ArrayAdapter<String> adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View rootView = inflater.inflate(R.layout.list ,container ,false);

        tFirebaseDatabase = FirebaseDatabase.getInstance();
        tFirebaseStorage = FirebaseStorage.getInstance();
        mDatabaseReference =tFirebaseDatabase.getReference()

                .child("mndeni");
        mDurbansListView=rootView.findViewById(R.id.mlist);
        List<Durban> durban = new ArrayList<>();
        mDurbanAdapter = new DurbanAdapter(getActivity(),R.layout.durban_items,durban);
        mDurbansListView.setAdapter(mDurbanAdapter);

        mChildEventListener = new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                Durban value = dataSnapshot.getValue(Durban.class);
                mDurbanAdapter.add(value);

            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        };

        mDatabaseReference.addChildEventListener(mChildEventListener);
        return rootView;
    }

}

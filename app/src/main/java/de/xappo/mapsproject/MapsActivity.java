package de.xappo.mapsproject;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.GoogleMap;

public class MapsActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener {

    private static final String TAG = "MapsActivity";
    private GoogleMap mMap;
    private Fragment mFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        if (savedInstanceState == null) {
            mFragment = new BlankFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, mFragment);
            ft.commit();
        }


    }

    @Override
    public void onFragmentInteraction(final Uri uri) {

    }
}

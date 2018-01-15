package com.example.nurcahyadiperdana.banyumas;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import android.content.Intent;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import org.w3c.dom.Text;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import pl.aprilapps.easyphotopicker.DefaultCallback;
import pl.aprilapps.easyphotopicker.EasyImage;


public class deskripsi_timeline extends Fragment {
    private ListView ls;
    private Button ambil;
    private static final int GALERY_PICK =2;
    private static final int CAMERA =1;
    Button a ;
    TextView af, ag;
    ImageView ah;
    private FirebaseAuth mFirebaseAuth;
    private StorageReference mImageStorage;
    private DatabaseReference mUserDatabase;
    private static final String TAG = deskripsi_timeline.class.getSimpleName();
    private static final int CAMERA_REQUEST_CODE = 1888;

    private ProgressDialog mProgressDialog;
    protected ListAdapter Adapter;
    SimpleAdapter adapter;
    HashMap<String,String> map;
    ArrayList<HashMap<String,String>> mList;
    String [] Gbr;
    public deskripsi_timeline() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_deskripsi_timeline, container, false);

        a = (Button) view.findViewById(R.id.submit);
        ah = (ImageView) view.findViewById(R.id.gambar);
        af = (TextView) view.findViewById(R.id.deskripsi);
        ag = (TextView) view.findViewById(R.id.lokasi);


        Intent intent = getActivity().getIntent();
        String aj = intent.getStringExtra("data");
        String ak = intent.getStringExtra("data1");
//        if(intent.hasExtra("byteArray")) {
//            ImageView test= new ImageView(getActivity());
//            Bitmap bitmap = BitmapFactory.decodeByteArray(
//                    intent.getByteArrayExtra("byteArray"), 0, intent.getByteArrayExtra("byteArray").length);
//            test.setImageBitmap(bitmap);
//
//            ah.setImageBitmap(bitmap);
//        }

        af.setText("Deskripsi : " + aj);

        ag.setText("Lokasi :" + ak);



     //   ah.setImageResource(Integer.parseInt(getActivity().getIntent().getStringExtra("data2")));

        Gbr = new String[]{
                Integer.toString(R.drawable.test),
                 Integer.toString(R.drawable.test)
        };

        mList = new ArrayList<HashMap<String,String>>();

        for (int i = 0; i<Gbr.length;i++){
            map= new HashMap<String, String>();
            map.put("gbr", Gbr[i]);
            mList.add(map);
        }

//        Adapter = new SimpleAdapter(this,mList,R.layout.activity_item_listview,new String[]{"gbr"}, new int[]{R.id.gbr});
//        ls.setAdapter(Adapter);
//        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
//
//            }
//        });
//
        mFirebaseAuth =FirebaseAuth.getInstance();

        mImageStorage = FirebaseStorage.getInstance().getReference();
//        mUserDatabase = FirebaseDatabase.getInstance().getReference().child("foto").child(random);
//        mUserDatabase.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                String foto = dataSnapshot.child("pict").getValue().toString();
//
//
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });


        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getActivity(),detail_timeline.class);
                startActivity(a);
            }
        });

        return view;
    }


}

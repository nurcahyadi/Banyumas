package com.example.nurcahyadiperdana.banyumas;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import org.w3c.dom.Text;

import java.io.ByteArrayOutputStream;
import java.io.File;

import pl.aprilapps.easyphotopicker.DefaultCallback;
import pl.aprilapps.easyphotopicker.EasyImage;

public class detail_timeline extends AppCompatActivity {

    private TextInputLayout ae, bc ;
    public static final int REQUEST_CODE_CAMERA = 0012;
    public static final int REQUEST_CODE_GALLERY = 0013;
    private String [] items = {"Camera","Gallery"};
    private FloatingActionButton fab;
   private  ImageView ab;
    private Button mb ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_timeline);

        ae = (TextInputLayout) findViewById(R.id.desc);
        bc= (TextInputLayout) findViewById(R.id.loc);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        ab = (ImageView) findViewById(R.id.gambar);
        //ad = (Button) findViewById(R.id.hey) ;
        mb = (Button) findViewById(R.id.tombol);

        Toolbar toolbar = (Toolbar) findViewById(R.id.appbardetail);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Pariwisata");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openimage();
            }
        });

//        ad.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//               // String test = ae.getText().toString();
//               // String test1 = bc.getText().toString();
//                Intent an = new Intent(detail_timeline.this,deskripsi_timeline.class);
//                startActivity(an);
//              //  a.putExtra("data", String.valueOf(test));
//              //  a.putExtra("data1", String.valueOf(test1));
//             //   a.putExtra("data2", ab.toString());
//            }
//        });

        mb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String test = ae.getEditText().getText().toString();
                String test1 = bc.getEditText().getText().toString();
//                Bitmap bitmap = BitmapFactory.decodeResource
//                        (getResources(), R.id.gambar); // your bitmap
//                ByteArrayOutputStream bs = new ByteArrayOutputStream();
//                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, bs);

                Intent haha = new Intent(detail_timeline.this,pilihmenuwisata.class);
                haha.putExtra("data", String.valueOf(test));
                haha.putExtra("data1", String.valueOf(test1));
               // haha.putExtra("byteArray", bs.toByteArray());


                startActivity(haha);
            }
        });

    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode == CAMERA_REQUEST_CODE && resultCode == Activity.RESULT_OK){
//            Bitmap bitmap = (Bitmap) data.getExtras().get("data");
//
//        }
        if (requestCode == REQUEST_CODE_GALLERY && resultCode == Activity.RESULT_OK){


        }
        EasyImage.handleActivityResult(requestCode, resultCode, data, this, new DefaultCallback(){
            @Override
            public void onImagePicked(File imageFile, EasyImage.ImageSource source, int type) {
                switch (type){
                    case REQUEST_CODE_CAMERA:
                        Glide.with(detail_timeline.this)
                                .load(imageFile)
                                .centerCrop()
                                .diskCacheStrategy(DiskCacheStrategy.ALL)
                                .into(ab);
                        break;
                    case REQUEST_CODE_GALLERY:
                        Glide.with(detail_timeline.this)
                                .load(imageFile)
                                .centerCrop()
                                .diskCacheStrategy(DiskCacheStrategy.ALL)
                                .into(ab);

                        break;
                }
            }
        });
    }
    private void openimage() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Options");
        builder.setItems(items, new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if(items[i].equals("Camera")){
                    EasyImage.openCamera(detail_timeline.this,REQUEST_CODE_CAMERA);

                }else if(items[i].equals("Gallery")){
                    EasyImage.openGallery(detail_timeline.this, REQUEST_CODE_GALLERY);
                }
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}

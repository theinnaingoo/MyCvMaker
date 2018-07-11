package skylark.intern.demon.mycvmaker.Fragment;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.io.File;
import java.util.List;

import skylark.intern.demon.mycvmaker.DataResult;
import skylark.intern.demon.mycvmaker.R;


public class Profile extends Fragment {

    EditText name,father,birthday,nrc,city,phone,email;
    String gender_status,rs_status,dbdir;
    Button profile_save;
    RadioGroup gender,maritial_status;
    SQLiteDatabase db;
    String dbname= "test.db";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_profile, container, false);
        gender = v.findViewById(R.id.gender_status);
        maritial_status = v.findViewById(R.id.maritial_status);

        name = v.findViewById(R.id.name);
        father = v.findViewById(R.id.fathername);
        birthday = v.findViewById(R.id.birthday);
        nrc = v.findViewById(R.id.nrc);
        city =v.findViewById(R.id.city);
        phone = v.findViewById(R.id.phone);
        email = v.findViewById(R.id.email);
        profile_save = v.findViewById(R.id.profile_save);

        dbdir = "/data/data/"+getActivity().getPackageName()+"/databases/";
        File dir = new File(dbdir);

        if(!dir.exists()){
            dir.mkdir();
        }
        String  dbpath = dbdir+dbname;
        File dbfile = new File(dbpath);
        if(!dbfile.exists()){
            db = SQLiteDatabase.openOrCreateDatabase(dbdir+dbname,null);

            String query = "CREATE TABLE profile (id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT,father TEXT, birthday TEXT,nrc TEXT,city TEXT,phone TEXT,email TEXT);";

            db.execSQL(query);
            Toast.makeText(getActivity(),"Created database",Toast.LENGTH_LONG).show();


        }else {
            db = SQLiteDatabase.openDatabase(dbdir+dbname,null,SQLiteDatabase.OPEN_READWRITE);
            Toast.makeText(getActivity(),"Already created database"+ dbdir+dbname,Toast.LENGTH_LONG).show();

        }


        profile_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ContentValues cv = new ContentValues();
                cv.put("name",name.getText().toString());
                cv.put("father",father.getText().toString());
                cv.put("birthday",birthday.getText().toString());
                cv.put("nrc",nrc.getText().toString());
                cv.put("city",city.getText().toString());
                cv.put("phone",phone.getText().toString());
                cv.put("email",email.getText().toString());

                db.insert("profile",null,cv);

                Toast.makeText(getActivity(),"Saved",Toast.LENGTH_LONG).show();

                Intent in= new Intent(getActivity(), DataResult.class);
                startActivity(in);





            }
        });

        gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {

                    case R.id.male:
                            gender_status = "Male";
                        Toast.makeText(getActivity(),gender_status,Toast.LENGTH_LONG).show();


                        break;
                    case R.id.female:
                        gender_status = "Female";
                        Toast.makeText(getActivity(),gender_status,Toast.LENGTH_LONG).show();
                        break;
            }}
        });


        maritial_status.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {

                    case R.id.single:
                        rs_status= "Single";
                        Toast.makeText(getActivity(),rs_status,Toast.LENGTH_LONG).show();
                        break;


                    case R.id.married:
                        rs_status= "Married";
                        Toast.makeText(getActivity(),rs_status,Toast.LENGTH_LONG).show();
                        break;
            }}
        });

        return  v;
    }
}

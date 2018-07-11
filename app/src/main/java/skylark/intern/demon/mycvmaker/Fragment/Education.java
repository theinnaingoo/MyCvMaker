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
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.File;
import java.util.List;

import skylark.intern.demon.mycvmaker.CustomOnItemSelectedListener;
import skylark.intern.demon.mycvmaker.DataResult;
import skylark.intern.demon.mycvmaker.R;


public class Education extends Fragment {
    private Spinner degree;
    private Button edu_save;
    EditText degree_level,major,university,graduated_year,other_qualification;
    SQLiteDatabase db;
    String dbname= "test.db",dbdir;
    private LinearLayout is_graduated;
    private RadioGroup edu_group;
    Boolean graduated = false;
    static String level="";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_education, container, false);
        degree = v.findViewById(R.id.degree);
        edu_save = v.findViewById(R.id.edu_save);
        is_graduated = v.findViewById(R.id.is_graduated);
        edu_group = v.findViewById(R.id.edu_group);

//        degree_level = v.findViewById(R.id.degree);
        major = v.findViewById(R.id.major);
        university = v.findViewById(R.id.university);
        graduated_year = v.findViewById(R.id.graduated_year);
        other_qualification = v.findViewById(R.id.other_qualification);
        //addListenerOnSpinnerItemSelection();


//        dbdir = "/data/data/"+getActivity().getPackageName()+"/databases/";
//        File dir = new File(dbdir);
//
//        if(!dir.exists()){
//            dir.mkdir();
//        }
//        String  dbpath = dbdir+dbname;
//        File dbfile = new File(dbpath);
//        if(!dbfile.exists()){
//            db = SQLiteDatabase.openOrCreateDatabase(dbdir+dbname,null);
//
//            String query = "CREATE TABLE education (id INTEGER PRIMARY KEY,level TEXT,major TEXT,university TEXT, graduated_year TEXT,other_qualification TEXT);";
//
//            db.execSQL(query);
//            Toast.makeText(getActivity(),"Created ",Toast.LENGTH_LONG).show();
//
//
//        }else {
//            db = SQLiteDatabase.openDatabase(dbdir+dbname,null,SQLiteDatabase.OPEN_READWRITE);
//            Toast.makeText(getActivity()," created database"+ dbdir+dbname,Toast.LENGTH_LONG).show();
//
//        }




        edu_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.ungraducated:
                        // switch to fragment 1
                        is_graduated.setVisibility(View.GONE);

                        break;
                    case R.id.graduated:
                        graduated = true;
                        is_graduated.setVisibility(View.VISIBLE);
                        break;
                }
            }
        });



        edu_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (graduated==true){
                    degree.setOnItemSelectedListener(new CustomOnItemSelectedListener());

                    level =  String.valueOf(degree.getSelectedItem());
//                    Toast.makeText(getActivity(),
//                           level,
////                            Toast.LENGTH_SHORT).show();
//
//                    ContentValues cv = new ContentValues();
//                    cv.put("level",level);
//                    cv.put("major",major.getText().toString());
//                    cv.put("university",university.getText().toString());
//                    cv.put("graduated_year",graduated_year.getText().toString());
//                    cv.put("other_qualification",other_qualification.getText().toString());
//
//
//                    db.insert("education",null,cv);
//
//                    Toast.makeText(getActivity(),
//                           "Saved edu",
//                        Toast.LENGTH_SHORT).show();
//                    Intent in= new Intent(getActivity(), DataResult.class);
//                    startActivity(in);

                }else{


                }

                //to get spinneer value

            }
        });




        return  v;
    }
    public void addListenerOnSpinnerItemSelection() {

        degree.setOnItemSelectedListener(new CustomOnItemSelectedListener());

        level =  String.valueOf(degree.getSelectedItem());


    }



}

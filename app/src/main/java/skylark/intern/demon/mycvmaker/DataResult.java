package skylark.intern.demon.mycvmaker;

import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class DataResult extends AppCompatActivity {

    TextView tv,tv_edu;
    SQLiteDatabase db;
    String dbdir;
    String dbname="test.db";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_result);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tv=findViewById(R.id.textView);
        tv_edu = findViewById(R.id.tv_edu);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dbdir="/data/data/"+getPackageName()+"/databases/";

                db=SQLiteDatabase.openDatabase(dbdir+dbname,null,
                        SQLiteDatabase.OPEN_READONLY);

                String query="SELECT * FROM profile;";


                String edu_query = "SELECT * FROM education;";



//                Cursor edu_cursor =db.rawQuery(edu_query,null);
                Cursor cursor=db.rawQuery(query,null);
try {


                if(cursor.moveToFirst()){
                    String output="";
                    for(int i=0;i<cursor.getCount();i++){
                        cursor.move(i);

                        output +=cursor.getInt(0)+"\n";
                        output +=cursor.getString(1)+"\n";
                        output +=cursor.getString(2)+"\n";
                        output +=cursor.getString(3)+"\n";
                        output +=cursor.getString(4)+"\n";
                        output +=cursor.getString(5)+"\n";
                        output +=cursor.getString(6)+"\n========\n";
                        cursor.moveToNext();
                    }

                    tv.setText(output);
                    cursor.close();
                    db.close();
                }else{
                    tv.setText("No result.");
                }
}catch (CursorIndexOutOfBoundsException e){
    tv_edu.setText(e.toString());

}
//
//                if(edu_cursor.moveToFirst()){
//                    String output="";
//                    for(int i=0;i<edu_cursor.getCount();i++){
//                        edu_cursor.move(i);
//
//                        output +=edu_cursor.getInt(0)+"\n";
//                        output +=edu_cursor.getString(1)+"\n";
//                        output +=edu_cursor.getString(2)+"\n";
//                        output +=edu_cursor.getString(3)+"\n";
//                        output +=edu_cursor.getString(4)+"\n";
//
//                        output +=edu_cursor.getString(5)+"\n========\n";
//                       // edu_cursor.moveToNext();
//                    }
//
//                    tv_edu.setText(output);
//                }else{
//                    tv_edu.setText("No result.");
//                }


                }
        });
    }

}

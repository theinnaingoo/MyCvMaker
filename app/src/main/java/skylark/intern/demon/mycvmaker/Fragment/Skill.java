package skylark.intern.demon.mycvmaker.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import skylark.intern.demon.mycvmaker.CustomOnItemSelectedListener;
import skylark.intern.demon.mycvmaker.R;


public class Skill extends Fragment {

    private Spinner language_level;
    private EditText other_skill,language;
     Button save_skill;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_skill, container, false);

        language_level = v.findViewById(R.id.language_level);
        save_skill = v.findViewById(R.id.save_skill);

        other_skill = v.findViewById(R.id.other_skill);
        language = v.findViewById(R.id.language);

        save_skill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),
                        String.valueOf(language_level.getSelectedItem()) ,
                        Toast.LENGTH_SHORT).show();
            }
        });

        addListenerOnSpinnerItemSelection();
        return  v;
    }

    public void addListenerOnSpinnerItemSelection() {

        language_level.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    }
}

package skylark.intern.demon.mycvmaker.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

import skylark.intern.demon.mycvmaker.R;


public class Experience extends Fragment {

     RadioGroup rdo_exp;
     LinearLayout have_exp;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_experience, container, false);
        rdo_exp = v.findViewById(R.id.exp_group);
        have_exp = v.findViewById(R.id.have_exp);


        rdo_exp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.no:
                        // switch to fragment 1
                        have_exp.setVisibility(View.GONE);
                        break;
                    case R.id.yes:
                        have_exp.setVisibility(View.VISIBLE);
                        break;
                }
            }
        });

        return  v;
    }
}

package skylark.intern.demon.mycvmaker.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import skylark.intern.demon.mycvmaker.R;


public class Home extends Fragment {
    FragmentManager fManager;
    FragmentTransaction fTransaction;
    TextView userEmail,userPhone;
    CardView create_card,my_card,his_card,tem_card;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        create_card = view.findViewById(R.id.createcv);
        my_card = view.findViewById(R.id.mycv_card);
        his_card = view.findViewById(R.id.his_card);
        tem_card = view.findViewById(R.id.temp_card);

        create_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fTransaction.replace(R.id.frame_layout,new CV_create()).commit();
            }
        });

        my_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fTransaction.replace(R.id.frame_layout,new MY_CV()).commit();
            }
        });

        his_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"This is History.",Toast.LENGTH_LONG).show();

            }
        });

        tem_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"This is Template.",Toast.LENGTH_LONG).show();

            }
        });

        return view;
    }
}

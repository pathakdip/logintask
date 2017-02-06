package pathak.com.login;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by HP on 2/6/2017.
 */

public class Signin extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        container= (ViewGroup) inflater.inflate(R.layout.signin, container, false);
        final EditText ed=(EditText)container.findViewById(R.id.Signin_ETone);
        final String emp="pathak@gmail.com";
        final String dp=ed.getText().toString();
        if (!dp.matches("pathak"))
        {
            ed.setError("Please enter value");
        }


        Button bt=(Button)container.findViewById(R.id.Signin_BTone);
        final TextView tw=(TextView)container.findViewById(R.id.Singin_Tone);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (dp.matches(emp)) {
                    ed.setError("Please enter valid email");
                }
            }
        });

        return container;
    }
}

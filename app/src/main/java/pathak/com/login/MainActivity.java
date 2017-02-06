package pathak.com.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button B1,B2;
    Signup sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            B1=(Button)findViewById(R.id.Signin);
            B2=(Button)findViewById(R.id.Signup);

            B1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Signin si= new Signin();
                    android.support.v4.app.FragmentManager fm=getSupportFragmentManager();
                    android.support.v4.app.FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.fragLoc,si);

                    ft.commit();

                }
            });
            B2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    sp=new Signup();
                    // sp=new Fragment();
                    android.support.v4.app.FragmentManager fm=getSupportFragmentManager();
                    android.support.v4.app.FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.fragLoc,sp);
                    // ft.add(headlines_fragment,sp);
                    // ft.add(R.id.headlines_fragment,sp);
                    ft.addToBackStack(null);
                    ft.commit();
                }
            });
        }
    }


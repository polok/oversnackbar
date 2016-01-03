package pl.polak.oversnackbar.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;

import pl.polak.oversnackbar.OverSnackBar;

public class MainActivity extends AppCompatActivity {

    private OverSnackBar snackBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_example_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (snackBar != null && snackBar.isShown()) {
                    snackBar.dismiss();
                } else {
                    final ViewGroup viewGroup = (ViewGroup) findViewById(android.R.id.content).getRootView();
                    snackBar = OverSnackBar.make(viewGroup, "Loading...", OverSnackBar.LENGTH_INDEFINITE, OverSnackBar.APPEAR_FROM_TOP_TO_DOWN);
                    snackBar.show();
                }
            }
        });
    }
}

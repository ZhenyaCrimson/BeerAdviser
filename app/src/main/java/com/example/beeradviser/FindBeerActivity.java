package com.example.beeradviser;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Adapter;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.Spinner;
        import android.widget.TextView;
        import android.widget.Toast;


        import androidx.appcompat.app.AppCompatActivity;

public class FindBeerActivity extends AppCompatActivity {


    //private BeerExpert expert


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_my_view);
        final Spinner color = (Spinner) findViewById(R.id.color);
        final TextView brands = (TextView) findViewById(R.id.brands);

        color.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent,
                                       View itemSelected, int selectedItemPosition, long selectedId) {
                Button  button1 = (Button) findViewById(R.id.button1);
                final String beerType = String.valueOf(color.getSelectedItem());
                final BeerExpert obj1 = new BeerExpert(beerType);

                View.OnClickListener btn = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        brands.setText(obj1.getBrands());
                    }
                };
                button1.setOnClickListener(btn);
            }
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });




    }



}

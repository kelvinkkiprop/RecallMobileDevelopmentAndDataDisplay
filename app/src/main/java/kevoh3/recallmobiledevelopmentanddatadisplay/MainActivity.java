package kevoh3.recallmobiledevelopmentanddatadisplay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    //Declare variables
    ListView lvStudents;
    ArrayList<HashMap<String,String>> alStudents;
    HashMap<String,String> hmStudents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize variables
        lvStudents = findViewById(R.id.listViewStudents);
        alStudents = new ArrayList<>();

        //Add values
        hmStudents = new HashMap<>();
        hmStudents.put("name", "Joe Doe");
        hmStudents.put("class", "1MPSE");
        hmStudents.put("image", String.valueOf(R.drawable.ic_baseline_person_72));
        alStudents.add(hmStudents);

        hmStudents = new HashMap<>();
        hmStudents.put("name", "Jane Doe");
        hmStudents.put("class", "2MPSE");
        hmStudents.put("image", String.valueOf(R.drawable.ic_baseline_person_72));
        alStudents.add(hmStudents);

        //Add to adapter
        SimpleAdapter simpleAdapter = new SimpleAdapter(MainActivity.this,
                alStudents, R.layout.student_item, new String[]{"name","class","image"},
                new int[]{R.id.textViewName, R.id.textViewClass, R.id.imageViewImage});

        //adapter
        lvStudents.setAdapter(simpleAdapter);

    }
}
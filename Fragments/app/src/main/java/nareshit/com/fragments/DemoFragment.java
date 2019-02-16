package nareshit.com.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * Created by nareshit on 6/11/2017.
 */

public class DemoFragment extends Fragment {

    private EditText etName;
    private Button button;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_demo, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        etName = (EditText) view.findViewById(R.id.editText);
        button = (Button) view.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString();
                Toast.makeText(getActivity(), name, Toast.LENGTH_SHORT).show();
            }
        });

        super.onViewCreated(view, savedInstanceState);
    }
}

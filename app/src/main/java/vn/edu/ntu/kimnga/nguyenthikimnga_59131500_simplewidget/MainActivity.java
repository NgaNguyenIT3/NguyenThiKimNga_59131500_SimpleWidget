package vn.edu.ntu.kimnga.nguyenthikimnga_59131500_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edtTen, edtNgaySinh, edtSoThich;
    RadioGroup rdgGT;
    RadioButton radioButton;
    CheckBox cb1, cb2, cb3, cb4, cb5;
    Button btXacNhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addViews();
        addEvents();
    }
    private void addViews() {

        edtTen = findViewById(R.id.edtTen);
        edtNgaySinh = findViewById(R.id.edtNgaySinh);
        rdgGT = findViewById(R.id.rdgGT);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
        cb5 = findViewById(R.id.cb5);
        edtSoThich = findViewById(R.id.edtSoThich);
        btXacNhan = findViewById(R.id.btXacNhan);
    }
    private void addEvents() {

        btXacNhan.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        String a = "";

        if(cb1.isChecked()) {
            a+="Xem phim; ";
        }
        if(cb2.isChecked()) {
            a+="Nghe nhạc; ";
        }
        if(cb3.isChecked()) {
            a+="Đi cafe với bạn bè; ";
        }
        if(cb4.isChecked()) {
            a+="Ở nhà một mình; ";
        }
        if(cb5.isChecked()) {
            a+="Vào bếp nấu ăn; ";
        }

        Toast.makeText(this, edtTen.getText().toString() + "\n" +
                    "Ngày sinh: " + edtNgaySinh.getText().toString() + "\n" +
                    "Giới tính: " + radioButton.getText().toString() + "\n" +
                    "Sở thích: " + a + edtSoThich.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    public void checkButton(View v) {
        int radioId = rdgGT.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
    }
}

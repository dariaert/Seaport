package com.example.seaport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.seaport.entity.Income;
import com.example.seaport.entity.IncomeRent;
import com.example.seaport.entity.IncomeService;

public class MainActivity extends AppCompatActivity {

    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = findViewById(R.id.output);

        Income rent = new IncomeRent(1,"Аренда площадей порта", 170_000);
        Income service = new IncomeService(2, "Обслуживание морских судов", 125, 3_500);

        float totalCost = rent.allIncome() + service.allIncome();

        output.setText("Доход за месяц составляет " + totalCost + " монет");

    }
}
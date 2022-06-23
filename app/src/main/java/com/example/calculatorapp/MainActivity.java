package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

import com.example.calculatorapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    int temp = 0;
    boolean operation = false;
    String op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ini Binding
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.textView.setText(binding.textView.getText() + "1");
                binding.textView2.setText("");

            }

        });
        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.textView.setText(binding.textView.getText() + "2");
                binding.textView2.setText("");
            }

        });
        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.textView.setText(binding.textView.getText() + "3");
                binding.textView2.setText("");
            }

        });
        binding.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.textView.setText(binding.textView.getText() + "4");
                binding.textView2.setText("");
            }

        });
        binding.button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.textView.setText(binding.textView.getText() + "5");
                binding.textView2.setText("");
            }

        });
        binding.button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.textView.setText(binding.textView.getText() + "6");
                binding.textView2.setText("");
            }

        });
        binding.button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.textView.setText(binding.textView.getText() + "7");
                binding.textView2.setText("");
            }

        });
        binding.button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.textView.setText(binding.textView.getText() + "8");
                binding.textView2.setText("");
            }

        });
        binding.button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.textView.setText(binding.textView.getText() + "9");
                binding.textView2.setText("");
            }

        });
        binding.button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.textView.setText(binding.textView.getText() + "0");
                binding.textView2.setText("");
            }

        });
        binding.button00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.textView.setText(binding.textView.getText() + "00");
                binding.textView2.setText("");
            }

        });
        binding.dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.textView.setText(binding.textView.getText() + ".");
                binding.textView2.setText("");
            }

        });
        binding.multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operation == false){
                    String num = String.valueOf(binding.textView.getText());
                    temp = Integer.parseInt(num);
                    binding.textView.setText("");
                    op = "*";
                    operation = true;
                }
                else{
                    String num = String.valueOf(binding.textView.getText());
                    int num1 = Integer.parseInt(num);
                    String total = String.valueOf(num1 * temp);
                    binding.textView2.setText(total);
                    binding.textView.setText("");
                    operation = false;
                }
            }
        });
        binding.divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operation == false){
                    String num = String.valueOf(binding.textView.getText());
                    temp = Integer.parseInt(num);
                    binding.textView.setText("");
                    op = "/";
                    operation = true;
                }
                else{
                    String num = String.valueOf(binding.textView.getText());
                    int num1 = Integer.parseInt(num);
                    String total = String.valueOf(num1 / temp);
                    binding.textView2.setText(total);
                    binding.textView.setText("");
                    operation = false;
                }
            }
        });
        binding.plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operation == false){
                    String num = String.valueOf(binding.textView.getText());
                    temp = Integer.parseInt(num);
                    binding.textView.setText("");
                    op = "+";
                    operation = true;
                }
                else{
                    String num = String.valueOf(binding.textView.getText());
                    int num1 = Integer.parseInt(num);
                    String total = String.valueOf(num1 + temp);
                    binding.textView2.setText(total);
                    binding.textView.setText("");
                    operation = false;
                }
            }
        });
        binding.subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operation == false){
                    String num = String.valueOf(binding.textView.getText());
                    temp = Integer.parseInt(num);
                    binding.textView.setText("");
                    op = "-";
                    operation = true;
                }
                else{
                    String num = String.valueOf(binding.textView.getText());
                    int num1 = Integer.parseInt(num);
                    String total = String.valueOf(num1 - temp);
                    binding.textView2.setText(total);
                    binding.textView.setText("");
                    operation = false;
                }
            }
        });
        binding.percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operation == false){
                    String num = String.valueOf(binding.textView.getText());
                    temp = Integer.parseInt(num);
                    binding.textView.setText("");
                    op = "%";
                    operation = true;
                }
                else{
                    String num = String.valueOf(binding.textView.getText());
                    int num1 = Integer.parseInt(num);
                    String total = String.valueOf(num1 % temp);
                    binding.textView2.setText(total);
                    binding.textView.setText("");
                    operation = false;
                }
            }
        });
        binding.convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.textView.setText("-" + binding.textView.getText());
            }
        });
        binding.clera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.textView.setText("");
                binding.textView2.setText("");
                operation = false;
                temp = 0;
            }
        });
        binding.Answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    switch (op) {
                        case "": {
                            binding.textView.setText(binding.textView.getText());
                            break;
                        }
                        case "*": {
                            String num = String.valueOf(binding.textView.getText());
                            int num1 = Integer.parseInt(num);
                            String total = String.valueOf(temp * num1);
                            binding.textView2.setText(total);
                            binding.textView.setText("");
                            operation = false;
                            break;
                        }
                        case "+": {
                            String num = String.valueOf(binding.textView.getText());
                            int num1 = Integer.parseInt(num);
                            String total = String.valueOf(temp + num1);
                            binding.textView2.setText(total);
                            binding.textView.setText("");
                            operation = false;
                            break;
                        }
                        case "-": {
                            String num = String.valueOf(binding.textView.getText());
                            int num1 = Integer.parseInt(num);
                            String total = String.valueOf(temp - num1);
                            binding.textView2.setText(total);
                            binding.textView.setText("");
                            operation = false;
                            break;
                        }
                        case "/": {
                            String num = String.valueOf(binding.textView.getText());
                            int num1 = Integer.parseInt(num);
                            String total = String.valueOf(temp / num1);
                            binding.textView2.setText(total);
                            binding.textView.setText("");
                            operation = false;
                            break;
                        }
                        case "%": {
                            String num = String.valueOf(binding.textView.getText());
                            int num1 = Integer.parseInt(num);
                            String total = String.valueOf(temp % num1);
                            binding.textView2.setText(total);
                            binding.textView.setText("");
                            operation = false;
                            break;
                        }
                    }
                } catch (NumberFormatException | NullPointerException e) {
                    Toast.makeText(MainActivity.this, "Invalid" , Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
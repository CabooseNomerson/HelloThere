/**
 * IMPORTANT: Make sure you are using the correct package name. 
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.android.justjava;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity = 0;
    int price = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view)
    {
        TextView orderText = (TextView) findViewById(R.id.thanks_for_ordering);

        if (quantity == 0)
        {
            orderText.setText("There's nothing in your cart to order.\n( Try adding some cups of coffee ;] )");
        }

        else {
        orderText.setText("Thanks for ordering!\n\nYour total is:\n" + NumberFormat.getCurrencyInstance().format(quantity * price) + " for " + quantity + " cups of coffee.");
        }
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayPrice(int number)
    {
        TextView priceViewText = (TextView) findViewById(R.id.price_text_view);
        priceViewText.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    public void Increment(View view)
    {
        quantity++;
        display(quantity);
        displayPrice(quantity * price);

    }

    public void Decrement(View view)
    {
        quantity --;
        display(quantity);
        displayPrice(quantity * price);
    }

}


















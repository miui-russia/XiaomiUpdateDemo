package xiaomiupdatedemo.pczhu.com.xiaomiupdatedemo;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.flyco.roundview.RoundTextView;
import com.wang.avi.AVLoadingIndicatorView;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import xiaomiupdatedemo.pczhu.com.xiaomiupdatedemo.view.MyViewController;

public class MainActivity extends Activity {
    @ViewInject(R.id.rv)
    RoundTextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m);
        x.view().inject(this);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.isSelected())
                    textView.setSelected(false);
                else
                    textView.setSelected(true);
            }
        });

    }

}

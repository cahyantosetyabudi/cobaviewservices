package unikom.codelabs.or.id.cobaviewservices;

import android.app.ActivityManager;
import android.app.ListActivity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class ViewRunningApps extends AppCompatActivity {
    Context context = new Context() {
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_running_apps);

        PackageManager packageManager = context.getPackageManager();
    }
}

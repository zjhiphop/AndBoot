package cn.cloudtea.andboot;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by jade on 15/08/2017.
 */

public class BootBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.v("TAG", "开机自动服务自动启动.....");

        if(intent.getAction().equals(intent.ACTION_BOOT_COMPLETED)) {
            Toast.makeText(context, "开机自动服务自动启动！！", Toast.LENGTH_SHORT).show();

            Intent mainActivityIntent = new Intent(context, MainActivity.class);

            mainActivityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(mainActivityIntent);
        }
    }
}

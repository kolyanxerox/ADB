package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.OooOo;
import android.support.customtabs.OooOo00;

/* loaded from: classes.dex */
public class PostMessageService extends Service {
    private OooOo00 mBinder = new OooOo00() { // from class: androidx.browser.customtabs.PostMessageService.1
        {
            attachInterface(this, OooOo.f15154OooO0o0);
        }

        @Override // android.support.customtabs.OooOo
        public void onMessageChannelReady(android.support.customtabs.OooO0OO oooO0OO, Bundle bundle) throws RemoteException {
            oooO0OO.onMessageChannelReady(bundle);
        }

        @Override // android.support.customtabs.OooOo
        public void onPostMessage(android.support.customtabs.OooO0OO oooO0OO, String str, Bundle bundle) throws RemoteException {
            oooO0OO.onPostMessage(str, bundle);
        }
    };

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.mBinder;
    }
}

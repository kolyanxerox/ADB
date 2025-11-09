package androidx.browser.trusted;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.trusted.OooO0OO;

/* loaded from: classes.dex */
public class TrustedWebActivityCallbackRemote {
    private final OooO0OO mCallbackBinder;

    private TrustedWebActivityCallbackRemote(OooO0OO oooO0OO) {
        this.mCallbackBinder = oooO0OO;
    }

    public static TrustedWebActivityCallbackRemote fromBinder(IBinder iBinder) {
        OooO0OO oooO0OOAsInterface = iBinder == null ? null : android.support.customtabs.trusted.OooO0O0.asInterface(iBinder);
        if (oooO0OOAsInterface == null) {
            return null;
        }
        return new TrustedWebActivityCallbackRemote(oooO0OOAsInterface);
    }

    public void runExtraCallback(String str, Bundle bundle) throws RemoteException {
        this.mCallbackBinder.onExtraCallback(str, bundle);
    }
}

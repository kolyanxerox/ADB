package o000000O;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes2.dex */
public final class OooO00o implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            throw androidx.datastore.preferences.protobuf.OooO00o.OooO0o0(message.obj);
        }
        if (i != 1) {
            return false;
        }
        throw androidx.datastore.preferences.protobuf.OooO00o.OooO0o0(message.obj);
    }
}

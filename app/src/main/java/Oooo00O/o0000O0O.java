package Oooo00O;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* loaded from: classes2.dex */
public final class o0000O0O implements Handler.Callback {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ o000OO f13804OooOo0O;

    public /* synthetic */ o0000O0O(o000OO o000oo2) {
        this.f13804OooOo0O = o000oo2;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f13804OooOo0O.f13814OooO00o) {
                try {
                    o0000oo o0000ooVar = (o0000oo) message.obj;
                    o0000O0 o0000o02 = (o0000O0) this.f13804OooOo0O.f13814OooO00o.get(o0000ooVar);
                    if (o0000o02 != null && o0000o02.f13794OooOo0O.isEmpty()) {
                        if (o0000o02.f13793OooOo) {
                            o0000o02.f13799OooOoo0.f13816OooO0OO.removeMessages(1, o0000o02.f13796OooOoO);
                            o000OO o000oo2 = o0000o02.f13799OooOoo0;
                            o000oo2.f13817OooO0Oo.OooO0O0(o000oo2.f13815OooO0O0, o0000o02);
                            o0000o02.f13793OooOo = false;
                            o0000o02.f13795OooOo0o = 2;
                        }
                        this.f13804OooOo0O.f13814OooO00o.remove(o0000ooVar);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        synchronized (this.f13804OooOo0O.f13814OooO00o) {
            try {
                o0000oo o0000ooVar2 = (o0000oo) message.obj;
                o0000O0 o0000o03 = (o0000O0) this.f13804OooOo0O.f13814OooO00o.get(o0000ooVar2);
                if (o0000o03 != null && o0000o03.f13795OooOo0o == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(o0000ooVar2)), new Exception());
                    ComponentName componentName = o0000o03.f13798OooOoOO;
                    if (componentName == null) {
                        o0000ooVar2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = o0000ooVar2.f13809OooO0O0;
                        o000000O.OooO0oo(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    o0000o03.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}

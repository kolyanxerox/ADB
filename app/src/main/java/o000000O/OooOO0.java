package o000000O;

import OooOOoo.o0000OO0;
import android.os.Handler;
import android.os.Message;

/* loaded from: classes2.dex */
public final class OooOO0 implements Handler.Callback {

    /* renamed from: OooOo0O */
    public final /* synthetic */ o0000OO0 f29141OooOo0O;

    public OooOO0(o0000OO0 o0000oo02) {
        this.f29141OooOo0O = o0000oo02;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        o0000OO0 o0000oo02 = this.f29141OooOo0O;
        if (message.obj != null) {
            throw new ClassCastException();
        }
        synchronized (o0000oo02.f13531OooOo0o) {
            throw null;
        }
    }
}

package androidx.datastore.core;

import androidx.datastore.core.Message;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Oooo000;
import o00O0Oo.o00O0O;
import o00O0oOo.o00000;
import o00O0oOo.o00000O0;
import o00O0oOo.o0000Ooo;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class DataStoreImpl$writeActor$2 extends Oooo000 implements o00O0O {
    public static final DataStoreImpl$writeActor$2 INSTANCE = new DataStoreImpl$writeActor$2();

    public DataStoreImpl$writeActor$2() {
        super(2);
    }

    @Override // o00O0Oo.o00O0O
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        invoke((Message.Update) obj, (Throwable) obj2);
        return OooOo.f33195OooO00o;
    }

    public final void invoke(Message.Update<T> msg, Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        kotlin.jvm.internal.OooOo.OooO0o0(msg, "msg");
        o00000 ack = msg.getAck();
        if (th == null) {
            th = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        o00000O0 o00000o02 = (o00000O0) ack;
        o00000o02.getClass();
        o00000o02.Oooo0oO(new o0000Ooo(false, th));
    }
}

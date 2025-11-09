package androidx.privacysandbox.ads.adservices.java.internal;

import OooOo.OooOO0;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import kotlin.jvm.internal.OooOo;
import o00000oO.OooOOO;
import o00O0oOo.o000O0o;
import o00O0oOo.o00O;

/* loaded from: classes.dex */
public final class CoroutineAdapterKt {
    public static final <T> OooOOO asListenableFuture(o000O0o o000o0o2, Object obj) {
        OooOo.OooO0o0(o000o0o2, "<this>");
        OooOOO future = CallbackToFutureAdapter.getFuture(new OooOO0(3, o000o0o2, obj));
        OooOo.OooO0Oo(future, "getFuture { completer ->…      }\n        tag\n    }");
        return future;
    }

    public static /* synthetic */ OooOOO asListenableFuture$default(o000O0o o000o0o2, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return asListenableFuture(o000o0o2, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object asListenableFuture$lambda$0(o000O0o this_asListenableFuture, Object obj, CallbackToFutureAdapter.Completer completer) {
        OooOo.OooO0o0(this_asListenableFuture, "$this_asListenableFuture");
        OooOo.OooO0o0(completer, "completer");
        ((o00O) this_asListenableFuture).OooO0oo(new CoroutineAdapterKt$asListenableFuture$1$1(completer, this_asListenableFuture));
        return obj;
    }
}

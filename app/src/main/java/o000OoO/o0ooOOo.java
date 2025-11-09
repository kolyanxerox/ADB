package o000Ooo;

import android.os.Bundle;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class o0ooOOo implements Callable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ long f30521OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o0OOO0o f30522OooOo0o;

    public o0ooOOo(o0OOO0o o0ooo0o, long j) {
        this.f30522OooOo0o = o0ooo0o;
        this.f30521OooOo0O = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt(Constants.FATAL, 1);
        bundle.putLong("timestamp", this.f30521OooOo0O);
        this.f30522OooOo0o.f30507OooOO0O.OooO0o0(bundle);
        return null;
    }
}

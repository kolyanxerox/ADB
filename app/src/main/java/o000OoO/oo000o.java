package o000Ooo;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import o000O0Oo.OooO0o;
import o000Oo0.OooO0OO;
import o000Oo0O.OooOo00;

/* loaded from: classes2.dex */
public final class oo000o implements Callable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Thread f30523OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ long f30524OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Throwable f30525OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ boolean f30526OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooOOOo.o0ooOOo f30527OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ o0OOO0o f30528OooOoOO;

    public oo000o(o0OOO0o o0ooo0o, long j, Throwable th, Thread thread, OooOOOo.o0ooOOo o0ooooo, boolean z) {
        this.f30528OooOoOO = o0ooo0o;
        this.f30524OooOo0O = j;
        this.f30525OooOo0o = th;
        this.f30523OooOo = thread;
        this.f30527OooOoO0 = o0ooooo;
        this.f30526OooOoO = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        OooO0o oooO0o;
        String str;
        long j = this.f30524OooOo0O;
        long j2 = j / 1000;
        o0OOO0o o0ooo0o = this.f30528OooOoOO;
        String strOooO0o0 = o0ooo0o.OooO0o0();
        if (strOooO0o0 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        o0ooo0o.f30500OooO0OO.OooO0OO();
        OooO0o oooO0o2 = o0ooo0o.f30509OooOOO0;
        oooO0o2.getClass();
        String strConcat = "Persisting fatal event for session ".concat(strOooO0o0);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        oooO0o2.OooOOo0(this.f30525OooOo0o, this.f30523OooOo, "crash", new OooO0OO(o00O0.o00oO0o.f31247OooOo0O, j2, strOooO0o0), true);
        try {
            oooO0o = o0ooo0o.f30504OooO0oO;
            str = ".ae" + j;
            oooO0o.getClass();
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e);
        }
        if (!new File((File) oooO0o.f30140OooOoO0, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        OooOOOo.o0ooOOo o0ooooo = this.f30527OooOoO0;
        o0ooo0o.OooO0O0(false, o0ooooo, false);
        o0ooo0o.OooO0OO(new o000oOoO().f30477OooO00o, Boolean.valueOf(this.f30526OooOoO));
        return !o0ooo0o.f30499OooO0O0.OooO0O0() ? Tasks.forResult(null) : ((TaskCompletionSource) ((AtomicReference) o0ooooo.f13429OooO).get()).getTask().onSuccessTask(o0ooo0o.f30503OooO0o0.f30099OooO00o, new OooOo00(this, false, strOooO0o0, 2));
    }
}

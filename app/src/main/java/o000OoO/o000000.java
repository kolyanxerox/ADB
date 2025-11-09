package o000Ooo;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import o000.OooO00o;
import o000O0O.OooO;
import o000O0Oo.OooO0o;
import o000Oo0O.OooOo00;
import o000Ooo0.OooOO0;

/* loaded from: classes2.dex */
public final class o000000 {

    /* renamed from: OooO, reason: collision with root package name */
    public final o0000Ooo f30432OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f30433OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o00000O0 f30434OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final OooOo00 f30435OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final long f30436OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public OooOo00 f30437OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public OooOo00 f30438OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public boolean f30439OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public o0OOO0o f30440OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final OooO0o f30441OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final OooO00o f30442OooOO0O;
    public final OooO00o OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public final o000O000.OooO00o f30443OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public final o00Ooo f30444OooOOO0;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public final OooOO0 f30445OooOOOO;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public final OooO f30446OooOOOo;

    public o000000(o0000o0.Oooo0 oooo0, o0000Ooo o0000ooo, o000O000.OooO00o oooO00o, o00000O0 o00000o02, OooO00o oooO00o2, OooO00o oooO00o3, OooO0o oooO0o, o00Ooo o00ooo2, OooOO0 oooOO0, OooO oooO) {
        this.f30434OooO0O0 = o00000o02;
        oooo0.OooO00o();
        this.f30433OooO00o = oooo0.f29588OooO00o;
        this.f30432OooO = o0000ooo;
        this.f30443OooOOO = oooO00o;
        this.f30442OooOO0O = oooO00o2;
        this.OooOO0o = oooO00o3;
        this.f30441OooOO0 = oooO0o;
        this.f30444OooOOO0 = o00ooo2;
        this.f30445OooOOOO = oooOO0;
        this.f30446OooOOOo = oooO;
        this.f30436OooO0Oo = System.currentTimeMillis();
        this.f30435OooO0OO = new OooOo00(5);
    }

    public final void OooO00o(OooOOOo.o0ooOOo o0ooooo) {
        OooO.OooO00o();
        OooO.OooO00o();
        this.f30438OooO0o0.OooO0OO();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.f30442OooOO0O.OooO0O0(new o000OOo(this));
                this.f30440OooO0oo.OooO0oo();
                if (!o0ooooo.OooO0O0().f30120OooO0O0.f21958OooO00o) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.f30440OooO0oo.OooO0Oo(o0ooooo)) {
                    Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                }
                this.f30440OooO0oo.OooOO0(((TaskCompletionSource) ((AtomicReference) o0ooooo.f13429OooO).get()).getTask());
                OooO0OO();
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                OooO0OO();
            }
        } catch (Throwable th) {
            OooO0OO();
            throw th;
        }
    }

    public final void OooO0O0(OooOOOo.o0ooOOo o0ooooo) {
        Future<?> futureSubmit = this.f30446OooOOOo.f30099OooO00o.f30104OooOo0O.submit(new o0Oo0oo(this, o0ooooo, 1));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e3);
        }
    }

    public final void OooO0OO() {
        OooO.OooO00o();
        try {
            OooOo00 oooOo00 = this.f30438OooO0o0;
            String str = (String) oooOo00.f30372OooOo0o;
            OooO0o oooO0o = (OooO0o) oooOo00.f30370OooOo;
            oooO0o.getClass();
            if (new File((File) oooO0o.f30140OooOoO0, str).delete()) {
                return;
            }
            Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
        }
    }
}

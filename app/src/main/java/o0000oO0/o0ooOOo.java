package o0000oo0;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import o0000ooO.o0O00OOO;
import o0000ooO.o0oO0O0o;
import o000Oo00.OooOOO;

/* loaded from: classes2.dex */
public final /* synthetic */ class o0ooOOo implements OooOOO {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f29690OooO00o;

    public /* synthetic */ o0ooOOo(int i) {
        this.f29690OooO00o = i;
    }

    @Override // o000Oo00.OooOOO
    public final Object get() {
        switch (this.f29690OooO00o) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return null;
            case 2:
                return new o0oO0O0o(Executors.newFixedThreadPool(4, new o0O00OOO("Firebase Background", 10, ExecutorsRegistrar.OooO00o())), (ScheduledExecutorService) ExecutorsRegistrar.f28142OooO0Oo.get());
            case 3:
                o000000O o000000o2 = ExecutorsRegistrar.f28139OooO00o;
                return new o0oO0O0o(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new o0O00OOO("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f28142OooO0Oo.get());
            case 4:
                o000000O o000000o3 = ExecutorsRegistrar.f28139OooO00o;
                return new o0oO0O0o(Executors.newCachedThreadPool(new o0O00OOO("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f28142OooO0Oo.get());
            case 5:
                o000000O o000000o4 = ExecutorsRegistrar.f28139OooO00o;
                return Executors.newSingleThreadScheduledExecutor(new o0O00OOO("Firebase Scheduler", 0, null));
            default:
                Random random = o000OooO.o0OO00O.f30556OooOO0;
                return null;
        }
    }
}

package o0000ooO;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class o0O0OOO0 implements Executor {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ o0O0OOO0[] f29723OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final o0O0OOO0 f29724OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final Handler f29725OooOo0o;

    static {
        o0O0OOO0 o0o0ooo0 = new o0O0OOO0("INSTANCE", 0);
        f29724OooOo0O = o0o0ooo0;
        f29723OooOo = new o0O0OOO0[]{o0o0ooo0};
        f29725OooOo0o = new Handler(Looper.getMainLooper());
    }

    public static o0O0OOO0 valueOf(String str) {
        return (o0O0OOO0) Enum.valueOf(o0O0OOO0.class, str);
    }

    public static o0O0OOO0[] values() {
        return (o0O0OOO0[]) f29723OooOo.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f29725OooOo0o.post(runnable);
    }
}

package o0000ooO;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class o0O0O0o0 implements Executor {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final o0O0O0o0 f29715OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ o0O0O0o0[] f29716OooOo0o;

    static {
        o0O0O0o0 o0o0o0o0 = new o0O0O0o0("INSTANCE", 0);
        f29715OooOo0O = o0o0o0o0;
        f29716OooOo0o = new o0O0O0o0[]{o0o0o0o0};
    }

    public static o0O0O0o0 valueOf(String str) {
        return (o0O0O0o0) Enum.valueOf(o0O0O0o0.class, str);
    }

    public static o0O0O0o0[] values() {
        return (o0O0O0o0[]) f29716OooOo0o.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
